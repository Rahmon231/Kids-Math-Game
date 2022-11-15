package com.lemzeeyyy.kidsmathsgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBar

class MultiplicationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multiplication)

        val actionBar : ActionBar = supportActionBar as ActionBar
        actionBar.title = "Multiplication"
        actionBar.setDisplayHomeAsUpEnabled(true)



    }


override fun onOptionsItemSelected(item: MenuItem): Boolean {
    if (item.itemId == android.R.id.home){
        this.finish()
        return true
    }
    return super.onOptionsItemSelected(item)
}
}