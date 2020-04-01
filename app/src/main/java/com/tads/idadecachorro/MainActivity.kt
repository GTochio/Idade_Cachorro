package com.tads.idadecachorro

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

    fun btCalcula(view: View) {

        val valor_idade = idadeCachorro.text.toString()


        if (valor_idade == null || valor_idade.equals("")) {
            Toast.makeText(this, "Por favor informe a idade !", Toast.LENGTH_LONG).show();
        } else {
            button_descubra.setOnClickListener(){
                val intent = Intent(applicationContext, IdadeActivity::class.java)


                //passando Dados

                intent.putExtra("idade", idadeCachorro.text.toString())

                startActivity(intent);


            }
        }


    }
}

