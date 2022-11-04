package com.example.parcial2jpg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun siguente (vista:View){
        val ventana:Intent = Intent(applicationContext,Primer_Animal::class.java)
        startActivity(ventana)
    }
    fun previo (Vista: View){
        val ventana: Intent = Intent(applicationContext,Tercer_Animal::class.java)
        startActivity(ventana)
        }

}