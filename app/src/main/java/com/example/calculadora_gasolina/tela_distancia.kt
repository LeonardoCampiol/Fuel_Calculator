package com.example.calculadora_gasolina

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class tela_distancia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela_distancia)


        val edtDistancia = findViewById<EditText>(R.id.edtDistancia)
        val Distancia_Destino = edtDistancia.text

        val Btnproximo3 = findViewById<Button>(R.id.btn_proximo_3)

        Btnproximo3.setOnClickListener {
            val distanciaStr: String = edtDistancia.text.toString()

            if (distanciaStr == "") {
                Snackbar.make(
                    edtDistancia,
                    "Preencha todos os campos!",
                    Snackbar.LENGTH_LONG
                )
                    .show()
            } else {
                val intent_tela4 = Intent(this, tela_resultado::class.java)
                startActivity(intent_tela4)
            }
        }
    }
}