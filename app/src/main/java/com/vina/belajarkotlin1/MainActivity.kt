package com.vina.belajarkotlin1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.vina.belajarkotlin1.Presenter.LoginPresenter
import com.vina.belajarkotlin1.Presenter.LoginPresenterC
import com.vina.belajarkotlin1.View.LoginView
import es.dmoral.toasty.Toasty

class MainActivity : AppCompatActivity(),LoginView {
    override fun onLoginSuccess(message: String) {
        Toasty.success(this,message,Toast.LENGTH_SHORT).show()
    }

    override fun onLoginError(message: String) {
        Toasty.error(this,message,Toast.LENGTH_SHORT).show()
    }

    internal lateinit var loginPresenter: LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginPresenter = LoginPresenterC(this)

        val login_btn = findViewById<Button>(R.id.login_btn)
        val email = findViewById<TextView>(R.id.email)
        val password = findViewById<TextView>(R.id.password)

        login_btn.setOnClickListener {
            loginPresenter.onLogin(email.text.toString(),password.text.toString())
        }
    }

}