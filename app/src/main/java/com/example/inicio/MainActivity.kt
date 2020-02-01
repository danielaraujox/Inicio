package com.example.inicio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //vamos a quitar la barra inicio

        supportActionBar?.hide()
        //invocamos al boton por medio del Id
        ingresar.setOnClickListener {  }

        //aqui dentro generamos la navegacion
        var i= Intent (this, LoginActivity ::class.java)
        startActivity(i)
    }
}
