package com.example.simplecounterandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.simplecounterandroid.R.id.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(button)
        val textView = findViewById<TextView>(textView)
        val upgradeBtn = findViewById<Button>(upgradeBtn)

        button.setOnClickListener {
            //Toast.makeText(it.context, "Clicked Button!", Toast.LENGTH_SHORT).show()
            ++counter
            textView.text = counter.toString()
            if(counter >= 10)
            {
                upgradeBtn.visibility = View.VISIBLE
                button.text = "Add 2"
            }
        }

        upgradeBtn.setOnClickListener{
            button.setOnClickListener{
                counter += 2
                textView.text = counter.toString()
            }
            upgradeBtn.visibility = View.INVISIBLE
        }
    }

    var counter = 0

}