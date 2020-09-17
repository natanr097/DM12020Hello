package com.example.dm12020hello

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var lista = ArrayList<String>()

        lista.add("Escolha seu curso...")
        lista.add("GTI")
        lista.add("ADS")

        val adp = ArrayAdapter(this, android.R.layout.simple_spinner_item, lista)

        spnCurso.adapter = adp

        btnOk.setOnClickListener {

            val nome = edtNome.text.toString()
            val curso = spnCurso.selectedItem.toString()

            if(nome.isEmpty() || curso.equals("Escolha seu curso...")) {
                Toast.makeText(this, "Por favor, preencha todos os campos...", Toast.LENGTH_SHORT).show()
            } else {
                val i = Intent(this, Tela2::class.java)

                val p = Pessoa(nome, curso)

                i.putExtra("pessoa", p)

                startActivity(i)
            }
        }
    }

    override fun onResume() {
        super.onResume()

        edtNome.text.clear()
        spnCurso.setSelection(0)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu_principal, menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if(item.itemId == R.id.menClique) {
            Toast.makeText(this, "Parabéns, "+edtNome.text.toString()+"!!!", Toast.LENGTH_SHORT).show()
        }

        if(item.itemId == R.id.menNaoClique) {
            Toast.makeText(this, "Você ERROU, "+edtNome.text.toString()+"!!!", Toast.LENGTH_LONG).show()
        }

        return super.onOptionsItemSelected(item)
    }

}