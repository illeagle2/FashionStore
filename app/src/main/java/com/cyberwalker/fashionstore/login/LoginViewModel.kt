package com.cyberwalker.fashionstore.login


import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.google.firebase.auth.FirebaseAuth
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

private lateinit var mAuth: FirebaseAuth


@HiltViewModel
class LoginViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    //private val accountService: AccountService
) : ViewModel() {


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