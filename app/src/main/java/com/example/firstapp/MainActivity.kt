package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var editText: TextInputEditText
    lateinit var buttonOut: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText= this.findViewById(R.id.editText)
        buttonOut = this.findViewById(R.id.buttonOut)
        buttonOut.setOnClickListener {
            if(!editText.text.isNullOrEmpty()){
            Toast.makeText(this, editText.text, Toast.LENGTH_SHORT).show()
}else{
    Toast.makeText(this, "El texto está vacío", Toast.LENGTH_SHORT).show()
            }
        }
    }
}