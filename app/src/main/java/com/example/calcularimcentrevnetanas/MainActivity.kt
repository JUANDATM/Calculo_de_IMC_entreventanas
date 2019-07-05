package com.example.calcularimcentrevnetanas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var pes: Int = 0
    var alt: Double = 0.0
    var imc: Double = 0.0

    fun CalcularIMC(v : View) {

        if (etPeso.text.isEmpty()) {
            Toast.makeText(this, "Falta El PESO EN KG", Toast.LENGTH_LONG).show()
            etPeso.requestFocus()
        } else if (etAltura.text.isEmpty()) {
            Toast.makeText(this, "Falta ALTURA EN MT", Toast.LENGTH_LONG).show()
            etPeso.requestFocus()
        } else {
            pes = etPeso.text.toString().toInt()
            alt = etAltura.text.toString().toDouble()
            imc = pes / (alt * alt)
            when {
                imc < 25 -> {
                    val  intent = Intent(this,MainActivityVerde25::class.java)
                    intent.putExtra(MainActivityVerde25.EXTRA_IMC,imc)
                    startActivity(intent)

                }
                imc > 25 && imc < 30 -> {
                    val intent = Intent(this,MainActivityAmarillo30::class.java)
                    intent.putExtra(MainActivityAmarillo30.EXTRA_IMC30,imc)
                    startActivity(intent)
                }
                imc > 30 && imc <40 ->{
                    val intent = Intent(this,MainActivityMas30::class.java)
                    intent.putExtra(MainActivityMas30.EXTRA_IMCMAS30,imc)
                    startActivity(intent)
                }
            }
        }


    }

}
