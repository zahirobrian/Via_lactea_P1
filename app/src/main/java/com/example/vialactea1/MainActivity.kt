package com.example.vialactea1


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSistemaSolar = findViewById<Button>(R.id.btnSistemaSolar)

        btnSistemaSolar.setOnClickListener {
            val intent = Intent(this, SistemaSolarActivity::class.java)
            startActivity(intent)
        }
    }
}