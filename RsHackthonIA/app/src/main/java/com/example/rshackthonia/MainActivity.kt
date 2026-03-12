package com.example.rshackthonia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var btnLocal: Button
    lateinit var btnViagem: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnLocal = findViewById(R.id.btnLocal)
        btnViagem = findViewById(R.id.btnViagem)

        btnLocal.setOnClickListener{
            IrParaTelaPedido()
        }
        btnViagem.setOnClickListener{
            IrParaTelaPedido()
        }
    }


    private fun IrParaTelaPedido() {
        val segundaTela = Intent(this, PedidoActivity::class.java)
        startActivity(segundaTela)
    }
}