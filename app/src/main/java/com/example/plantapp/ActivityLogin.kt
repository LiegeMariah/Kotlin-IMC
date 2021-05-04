package com.example.plantapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class ActivityLogin : AppCompatActivity() {

    private val SENHA = "12345";
    lateinit var btnLogin: Button
    lateinit var btnCadastrar: Button

    //esse e o metodfo
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setando o nom,e da tala
        setContentView(R.layout.activity_main)


        buscarComponentesPeloId();

        //terminar esse projeto

        //botão Login
        btnLogin.setOnClickListener() {
            println("clicou no botão")
            var idSenha =  findViewById<EditText>(R.id.et_senha)
            var senha = idSenha.getText().toString();

            //Reconhecer senha
            if(SENHA.equals(senha)) {
                val intent = Intent(this, PrincipalActivity::class.java)
                startActivity(intent)
            }else{
                Snackbar.make(it, "senha inválida", Snackbar.LENGTH_SHORT).show()
            }
        }

        //botão cadastrar
        btnCadastrar.setOnClickListener() {
            val intent = Intent(this, ActivityMainCadastro::class.java)
            startActivity(intent)
        }

    }

    fun buscarComponentesPeloId(){
       btnLogin = findViewById<Button>(R.id.botaoLogin)
       btnCadastrar = findViewById<Button>(R.id.botaoCadastrar)
       //testeEmail = findViewById<TextView>(R.id.et_email)
    }
}
