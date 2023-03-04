package com.cyberwalker.fashionstore.login

import com.google.firebase.auth.FirebaseAuth
import javax.inject.Inject
import kotlinx.coroutines.tasks.await


class AccountServiceImpl @Inject constructor(private val auth: FirebaseAuth):AccountService {

    override suspend fun authenticate(email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password).await()
    }
}