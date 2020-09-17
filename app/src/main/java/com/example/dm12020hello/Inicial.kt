package com.example.dm12020hello

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_inicial.*
import java.text.SimpleDateFormat
import java.util.*

class Inicial : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicial)

        btnFoguete.setOnClickListener {

            val dt = Date()

            val simpleDateFormat = SimpleDateFormat("dd/MM/yyyy HH:mm:ss")

            val dataHora = simpleDateFormat.format(dt)

            Toast.makeText(this, dataHora, Toast.LENGTH_LONG).show()

            val i = Intent(this, MainActivity::class.java)
            startActivity(i)

            finish()
        }

    }
}
