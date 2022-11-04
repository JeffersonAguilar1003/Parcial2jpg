package com.example.parcial2jpg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Primer_Animal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primer_animal)
    }
    fun siguente (vista: View){
        val ventana: Intent = Intent(applicationContext,Segundo_Animal::class.java)
        startActivity(ventana)
    }
    fun previo (Vista: View){
        val ventana: Intent = Intent(applicationContext,MainActivity::class.java)
        startActivity(ventana)
    }

}