package com.vina.belajarkotlin1.View

interface LoginView {
    fun onLoginSuccess(message:String)
    fun onLoginError(message: String)
}