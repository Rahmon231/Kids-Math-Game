package com.lemzeeyyy.kidsmathsgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(),View.OnClickListener {
    lateinit var addition : Button
    lateinit var subtraction : Button
    lateinit var multi : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeWidgets()

        addition.setOnClickListener(this)
        subtraction.setOnClickListener(this)
        multi.setOnClickListener(this)
    }
    private fun initializeWidgets() {
        addition = findViewById(R.id.buttonAdd)
        subtraction = findViewById(R.id.buttonSub)
        multi = findViewById(R.id.buttonMulti)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.buttonAdd){
            val intent = Intent(this@MainActivity,AdditionActivity::class.java)
            startActivity(intent)
        }else if (v?.id == R.id.buttonSub){
            val intent = Intent(this@MainActivity,SubtractionActivity::class.java)
            startActivity(intent)
        }else if(v?.id == R.id.buttonMulti){
            val intent = Intent(this@MainActivity,MultiplicationActivity::class.java)
            startActivity(intent)
        }
    }
}