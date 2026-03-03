package com.example.vialactea1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PlanetasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planetas)

        val btnLunas = findViewById<Button>(R.id.btnLunas)

        btnLunas.setOnClickListener {
            val intent = Intent(this, LunasActivity::class.java)
            startActivity(intent)
        }
    }
}