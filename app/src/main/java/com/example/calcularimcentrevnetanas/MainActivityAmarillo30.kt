package com.example.calcularimcentrevnetanas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_verde25.*

class MainActivityAmarillo30 : AppCompatActivity() {

    companion object {
        val EXTRA_IMC30 = "extraImc"
        private val DEFAULT_IMC30: Double = 1.0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_amarillo30)

        val intent = intent
        if (intent != null && intent.hasExtra(EXTRA_IMC30)) {
            var imc: Double = intent.getDoubleExtra(EXTRA_IMC30, DEFAULT_IMC30)
            etIMC.setText(imc.toString())
        }
    }
}

