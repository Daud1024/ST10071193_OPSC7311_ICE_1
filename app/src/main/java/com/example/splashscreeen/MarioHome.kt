package com.example.splashscreeen

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MarioHome : AppCompatActivity() {

    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mario_home)

        textView = findViewById(R.id.textView)

        val buttonEnglish = findViewById<Button>(R.id.buttonEnglish)
        buttonEnglish.setOnClickListener {
            textView.text = "Hello World"
        }

        val buttonAfrikaans = findViewById<Button>(R.id.buttonAfrikaans)
        buttonAfrikaans.setOnClickListener {
            textView.text = "Hallo Wêreld"
        }

        val buttonZulu = findViewById<Button>(R.id.buttonZulu)
        buttonZulu.setOnClickListener {
            textView.text = "Sawubona Mhlaba"
        }

        val buttonBaguette = findViewById<Button>(R.id.buttonBaguette)
        buttonBaguette.setOnClickListener {
            textView.text = "Bonjour dijne"
        }

        val buttonMotherland = findViewById<Button>(R.id.buttonMotherland)
        buttonMotherland.setOnClickListener {
            textView.text = "Привет, мир"
        }

        val buttonSpainWithoutTheS = findViewById<Button>(R.id.buttonSpainWithoutTheS)
        buttonSpainWithoutTheS.setOnClickListener {
            textView.text ="Hola Mundo"
        }
    }
}