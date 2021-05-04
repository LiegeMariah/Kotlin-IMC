package com.example.plantapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class PrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        //usa o método findViewByd pra pegar o ID do campo
        val btnVoltar = findViewById<Button>(R.id.botaoVoltar)

        //nesse evento vc joga no onclick do botao, os valores
        btnVoltar.setOnClickListener() {
            val intent = Intent(this, ActivityLogin::class.java)
            startActivity(intent)
        }
    }
}