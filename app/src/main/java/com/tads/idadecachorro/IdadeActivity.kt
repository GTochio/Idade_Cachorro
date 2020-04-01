package com.tads.idadecachorro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_idade.*

class IdadeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_idade)

        val dados: Bundle? = intent.extras

        val idade = dados?.getString("idade")



        calcularIdade(idade.toString())
        //text_idade.setText(teste)

    }





    fun calcularIdade(idade: String){



        val valorIdade = idade.toInt()



            val soma = valorIdade * 7
            text_idade.setText("A idade de Seu PET é "+ soma.toString()+" Anos")
        }
    }









