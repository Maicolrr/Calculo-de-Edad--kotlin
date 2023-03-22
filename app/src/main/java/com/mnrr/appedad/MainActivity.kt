package com.mnrr.appedad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.E

class MainActivity : AppCompatActivity() {

    var CampoNombre:EditText? = null
    var CampoDireccion:EditText? = null
    var CampoEmail:EditText? = null
    var CampoDocumento:EditText? = null
    var CampoEdad:EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CampoNombre= findViewById(R.id.Name)
        CampoDireccion= findViewById(R.id.address)
        CampoEmail= findViewById(R.id.Email)
        CampoDocumento= findViewById(R.id.document)
        CampoEdad= findViewById(R.id.age)

        val btnSend:Button= findViewById(R.id.Send)
        btnSend.setOnClickListener{process( 1)}
    }

    private fun process(press: Int) {

        when(press){
            1->{
                val intent = Intent(this,MainActivity2::class.java)
                val miBundle:Bundle=Bundle()
                miBundle.putString("Nombre",CampoNombre!!.text.toString())
                miBundle.putString("Direccion", CampoDireccion!!.text.toString())
                miBundle.putString("Email", CampoEmail!!.text.toString())
                miBundle.putString("Documento", CampoDocumento!!.text.toString())
                miBundle.putString("Edad", CampoEdad!!.text.toString())

                intent.putExtras(miBundle)

                startActivity(intent)
            }
        }

    }
}