package com.example.plantapp

class User(
    var email: String,
    var senha: String

){

    fun validarEmail(): Boolean {
    return  email != ""
}
    fun validarSenha(): Boolean {
    return senha!= "senha"

    }
}