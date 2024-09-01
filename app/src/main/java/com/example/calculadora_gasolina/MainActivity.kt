package com.example.calculadora_gasolina

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val comecar = findViewById<Button>(R.id.button)

        comecar.setOnClickListener{
            val intent = Intent(this, tela_preco_combustivel::class.java)
            startActivity(intent)
        }
    }
}