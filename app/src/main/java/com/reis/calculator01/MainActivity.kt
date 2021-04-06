package com.reis.calculator01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {

            textResult.text = "Result " + (editNum1.text.toString().toInt()+editNum2.text.toString().toInt()).toString()
            Toast.makeText(this, "Result " + textResult.text, Toast.LENGTH_LONG).show()

        }
    }
}