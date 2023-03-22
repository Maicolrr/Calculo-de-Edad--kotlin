package com.mnrr.appedad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val mNombre= findViewById<TextView>(R.id.rNombre)
        val mDireccion= findViewById<TextView>(R.id.rDireccion)
        val mEmail= findViewById<TextView>(R.id.rEmail)
        val mDocumento= findViewById<TextView>(R.id.rDocumento)
        val mEdad= findViewById<TextView>(R.id.rEdad)

        val miBundle: Bundle?= this.intent.extras

        if (miBundle!=null){

            mNombre.text="Nombre: "+miBundle.getString("Nombre")
            mDireccion.text="Direccion: "+miBundle.getString("Direccion")
            mEmail.text="Email: "+miBundle.getString("Email")
            mDocumento.text="Documento: "+miBundle.getString("Documento")

            var Edad = miBundle.getString("Edad")!!.toInt()

            if (Edad >0 && Edad<15){
                mEdad.text="Eres Infante"
            }else if (Edad >=15 && Edad<18){
                mEdad.text="Eres Adolescente"
            }else if (Edad >=18 && Edad<65){
                mEdad.text="Eres Adulto"
            }else {
                mEdad.text="Eres Adulto Mayor"
            }
        }



        val btnSalir:Button = findViewById(R.id.BtnAtras)
        btnSalir.setOnClickListener{salir()}
    }




    private fun salir() {
        finish()
    }

}