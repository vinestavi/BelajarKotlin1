package com.vina.belajarkotlin1.Model

interface User {
    val email:String
    val password:String
    fun isDataValid():Int
}