package com.example.calcularimcentrevnetanas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_mas30.*

class MainActivityMas30 : AppCompatActivity() {

    companion object {
        val EXTRA_IMCMAS30 = "extraImc"
        private val DEFAULT_IMCMAS30: Double = 1.0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_mas30)

        val intent = intent
        if (intent != null && intent.hasExtra(EXTRA_IMCMAS30)) {
            var imc: Double = intent.getDoubleExtra(EXTRA_IMCMAS30, DEFAULT_IMCMAS30)
            etIMC.setText(imc.toString())
        }
    }
}
