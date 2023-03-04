package com.cyberwalker.fashionstore.login


import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cyberwalker.fashionstore.data.AuthRepository
import com.cyberwalker.fashionstore.utils.Resource
import com.google.firebase.auth.FirebaseAuth
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

private lateinit var mAuth: FirebaseAuth


@HiltViewModel
class LoginViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val repository: AuthRepository
) : ViewModel() {

    val _signInState = Channel<SignInState>()
    val signInState = _signInState.receiveAsFlow()

    fun loginUser(email: String, password: String) = viewModelScope.launch {
        repository.loginUser(email, password).collect{result ->
            when(result){
                is Resource.Success -> {
                    _signInState.send(SignInState(isSuccess = "Sign In Success"))
                    LoginScreenActions.LoadHome
                }
                is Resource.Loading -> {
                    _signInState.send(SignInState(isLoading = true))
                }
                is Resource.Error -> {
                    _signInState.send(SignInState(isError = result.message))
                }
            }
        }
    }


    var uiState by mutableStateOf(LoginUiState())
        private set

//    private val email
//        get() = uiState.email
//
//    private val password
//        get() = uiState.password

    fun login(userName: String, password: String): Boolean {
        //code to call repo and check if username/password is valid
        runBlocking{
            //accountService.authenticate(userName, password)
        }
        return true
    }
}

data class LoginUiState(
    val loadComplete: Boolean = false,
    val email: String = "",
    val password: String = ""
)