package com.example.rshackthonia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PreferenciasActivity : AppCompatActivity() {

    lateinit var btnProx: Button
    lateinit var btnVoltar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_preferencias)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnProx = findViewById(R.id.btnProx)
        btnVoltar = findViewById(R.id.btnVoltar)

        btnProx.setOnClickListener { irParaTelaEvitar() }
        btnVoltar.setOnClickListener { voltarParaTelaAnterior() }

    }

    fun irParaTelaEvitar(){
        val irEvitar = Intent(this, EvitarActivity::class.java)
        startActivity((irEvitar))
    }

    fun voltarParaTelaAnterior(){
        val telaAnterior = Intent(this, PedidoActivity::class.java)
        startActivity((telaAnterior))
    }
}