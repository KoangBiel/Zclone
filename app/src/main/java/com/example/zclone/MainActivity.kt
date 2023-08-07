package com.example.zclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


           val phonenum= findViewById<EditText>(R.id.editTextPhone)
           phonenum.text.toString().trim()
           val btn = findViewById<Button>(R.id.btn1)
           btn.setOnClickListener{
               if(phonenum.length()==10)
               {
                   Toast.makeText(this,"Login Successful!!",Toast.LENGTH_SHORT).show()
                   val intent = Intent(this,Homepage::class.java)
                   startActivity(intent)
               }else{
                   return@setOnClickListener
               }


           }

    }
}