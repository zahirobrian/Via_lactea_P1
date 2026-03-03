package com.example.vialactea1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class LunasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lunas)
    }

    fun volverInicio(view: android.view.View) {
        finishAffinity()
    }
}