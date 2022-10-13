package com.example.kotlin_less1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import com.example.kotlin_less1.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<AppCompatButton>(R.id.button1).setOnClickListener(object:View.OnClickListener{
            override fun onClick(v: View?) {
            }
        } )


    }
}