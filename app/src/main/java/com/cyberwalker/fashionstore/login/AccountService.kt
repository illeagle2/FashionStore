package com.cyberwalker.fashionstore.login

interface AccountService {

    suspend fun authenticate(email: String, password: String)
}