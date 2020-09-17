package com.example.dm12020hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_tela2.*

class Tela2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        // Casting
        val p = intent.getSerializableExtra("pessoa") as Pessoa

        txtBoasVindas.text = "Olá "+ p.nome + ", seja bem vindo!"

        txtCurso.text = p.curso

        btnVoltar.setOnClickListener {
            finish()
        }
    }

    override fun onBackPressed() {
        Toast.makeText(this, "Utilize o botão da tela para voltar", Toast.LENGTH_LONG).show()
    }
}
