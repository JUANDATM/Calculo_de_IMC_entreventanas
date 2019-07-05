package com.example.calcularimcentrevnetanas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_verde25.*

class MainActivityVerde25 : AppCompatActivity() {
    companion object {
        val EXTRA_IMC = "extraImc"
        private val DEFAULT_IMC: Double = 1.0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_verde25)

        val intent = intent
        if (intent != null && intent.hasExtra(EXTRA_IMC)) {
            var imc: Double = intent.getDoubleExtra(EXTRA_IMC, DEFAULT_IMC)
            etIMC.setText(imc.toString())
        }
    }

}