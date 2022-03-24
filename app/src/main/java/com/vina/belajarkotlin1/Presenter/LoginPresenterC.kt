package com.vina.belajarkotlin1.Presenter

import com.vina.belajarkotlin1.Model.UserC
import com.vina.belajarkotlin1.View.LoginView

class LoginPresenterC (internal var LoginView:LoginView):LoginPresenter {
    override fun onLogin(email: String, password: String) {
        val user = UserC(email,password)
        val loginCode = user.isDataValid()
        if(loginCode == 0)
            LoginView.onLoginError("Email Must Not be Empty")
        else if(loginCode == 1)
            LoginView.onLoginError("Wrong Email Address")
        else if(loginCode == 2)
            LoginView.onLoginError("Password is Too Short")
        else
            LoginView.onLoginSuccess("Login Success")
    }
}