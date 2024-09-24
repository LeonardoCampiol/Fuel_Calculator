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

class tela_preco_combustivel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela_preco_combustivel)

        val edtPreco_Combustivel = findViewById<EditText>(R.id.preco_combustivel)
        val Preco_Combustivel = edtPreco_Combustivel.text

        val Btnproximo = findViewById<Button>(R.id.btn_proximo)

        Btnproximo.setOnClickListener {
            val preco_combustivelStr: String = edtPreco_Combustivel.text.toString()

            if (preco_combustivelStr == "") {
                Snackbar.make(
                    edtPreco_Combustivel,
                    "Preencha todos os campos!",
                    Snackbar.LENGTH_LONG
                )
                    .show()
            } else {
                val intent_tela2 = Intent(this, tela_consumo_carro::class.java)
                startActivity(intent_tela2)
            }
        }
    }
}