package com.example.nevoishcalc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var opn_button:Button ?=null
    var intent_button:Button ?=null
    var button3:Button ?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        opn_button=findViewById(R.id.opn_button)
        intent_button=findViewById(R.id.intent_button)
        button3=findViewById(R.id.button3)

        opn_button!!.setOnClickListener {
            val Intent=Intent(this,calc_main::class.java)
            startActivity(Intent)

        }
       intent_button!!.setOnClickListener {
           val Intent=Intent(this,com.example.nevoishcalc.intent::class.java)
           startActivity(Intent)
       }

        button3!!.setOnClickListener {
            val Intent=Intent(this,web::class.java)
            startActivity(Intent)
        }
    }
}