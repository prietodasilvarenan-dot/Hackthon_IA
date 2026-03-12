package com.example.rshackthonia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PedidoActivity : AppCompatActivity() {

    lateinit var btnIa: Button
    lateinit var btnNormal: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pedido)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnIa = findViewById(R.id.btnIa)
        btnNormal = findViewById(R.id.btnNormal)

        btnIa.setOnClickListener{
            IrParaTelaPreferencias()
        }
        btnNormal.setOnClickListener{
            IrParaTelaCategorias()
        }
    }

    fun IrParaTelaPreferencias(){
        val irParaPreferencias = Intent(this, PreferenciasActivity::class.java)
        startActivity((irParaPreferencias))
    }

    fun IrParaTelaCategorias(){
        val irParaCategoria = Intent(this, CategoriasActivity::class.java)
        startActivity((irParaCategoria))
    }



}