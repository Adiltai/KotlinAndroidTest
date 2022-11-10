package com.example.library

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.roundToInt

//var color_Background_green: Int = R.color.green
//var color_Background_red: Int = R.color.red
//var color_Background_yellow: Int = R.color.yellow
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val secondimage=findViewById<ImageView>(R.id.imageView3)
        //val firstimage=findViewById<ImageView>(R.id.imageView4)
        val textView = findViewById<TextView>(R.id.textView)
        val layout =findViewById<LinearLayout>(R.id.linearL)
        //secondimage.setOnClickListener {
        //    textView.setText("Dog");
        //}

        //firstimage.setOnClickListener {
        //    textView.setText("Kat");
        //}
        val btngreen=findViewById<Button>(R.id.btn_green)
        btngreen.setOnClickListener {
            Toast.makeText(this, getString(R.string.btn_name1), Toast.LENGTH_LONG).show()
            textView.setText("green");
            layout.setBackgroundColor(Color.parseColor("#4CAF50"));
        }
        val btnred=findViewById<Button>(R.id.btn_red)
        btnred.setOnClickListener {
            Toast.makeText(this, getString(R.string.btn_name2), Toast.LENGTH_LONG).show()
            textView.setText("red");
            //layout.setBackgroundColor(color_Background_red)
            layout.setBackgroundColor(Color.parseColor("#FFB71616"));
        }
        val btnyellow=findViewById<Button>(R.id.btn_yellow)
        btnyellow.setOnClickListener {
            Toast.makeText(this, getString(R.string.btn_name3), Toast.LENGTH_LONG).show()
            textView.setText("yellow");
            layout.setBackgroundColor(Color.parseColor("#D5273E"));
        }
    }
}


