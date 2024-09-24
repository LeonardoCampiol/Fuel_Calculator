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

class tela_consumo_carro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_tela_consumo_carro)

        val edtConsumo_Carro = findViewById<EditText>(R.id.edtConsumo_carro)
        val consumo_carro = edtConsumo_Carro.text

        val proximo_2 = findViewById<Button>(R.id.btn_proximo_2)

        proximo_2.setOnClickListener {

            val consumo_carroStr: String = consumo_carro.toString()

            if (consumo_carroStr == "") {
                Snackbar.make(
                    edtConsumo_Carro,
                    "Preencha todos os campos!",
                    Snackbar.LENGTH_LONG
                )
                    .show()}

            else {
                val intent_tela3 = Intent(this, tela_distancia::class.java)
                startActivity(intent_tela3)
            }
        }
    }
}