package com.example.rshackthonia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CategoriasActivity : AppCompatActivity() {

    lateinit var btnHamburguer: Button
    lateinit var btnSobremesas: Button
    lateinit var btnBebida: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_categorias)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnHamburguer = findViewById(R.id.btnHamburguer)
        btnSobremesas = findViewById(R.id.btnSobremesas)
        btnBebida = findViewById(R.id.btnBebida)

        btnHamburguer.setOnClickListener { irParaHamburguer() }
        btnSobremesas.setOnClickListener { irParaSobremesas() }
        btnBebida.setOnClickListener { irParaBebidas() }
    }

    fun irParaHamburguer(){
        val irHamburguer = Intent(this, burguers::class.java)
        startActivity((irHamburguer))
    }
    fun irParaSobremesas(){
        val irSobremesas = Intent(this, sobremesas::class.java)
        startActivity((irSobremesas))
    }
    fun irParaBebidas(){
        val irBebidas = Intent(this, bebidas::class.java)
        startActivity((irBebidas))

    }
}