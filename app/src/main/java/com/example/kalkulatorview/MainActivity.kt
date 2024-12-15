package com.example.kalkulatorview

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
            var tulisan = findViewById<TextView>(R.id.luas)
            val tombol = findViewById<Button>(R.id.tombol)

            var sisi = findViewById<TextInputEditText>(R.id.masukan)

        tombol.setOnClickListener() {
            var sisiString = sisi.text.toString()

            if (sisiString.isNotEmpty()) {
                val sisiInt = sisiString.toDouble()
                val area = sisiInt*sisiInt

                tulisan.text = "Luas Persegi : "+area
            }

            else {
                tulisan.text = "Pastikan input benar"
            }

        }
    }
}
