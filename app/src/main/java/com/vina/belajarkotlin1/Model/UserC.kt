package com.vina.belajarkotlin1.Model

import android.text.TextUtils
import android.util.Patterns

class UserC (override val email:String, override val password:String):User{
    override fun isDataValid(): Int {
        if(TextUtils.isEmpty(email))
            return 0 // error code (email empty)
        else if(!Patterns.EMAIL_ADDRESS.matcher(email).matches())
            return 1 // error code (wrong pattern)
        else if(password.length <= 6)
            return 2 // error code (password longer than 6)
        else
            return -1 // success code
    }

}