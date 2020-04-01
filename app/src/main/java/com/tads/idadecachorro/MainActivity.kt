package com.tads.idadecachorro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_idade.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_descubra.setOnClickListener {
            val intent = Intent(applicationContext, IdadeActivity::class.java)

            //passando Dados

            intent.putExtra("idade", idadeCachorro.text.toString())

            startActivity(intent);
        }
    }
}