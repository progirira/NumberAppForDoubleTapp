package com.example.numberapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    private var number: Int = -1
    private val tag: String = "MainActivityLifeCycle"


    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i(tag, "Started method 'onCreate()'")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        val numberTextview: TextView = findViewById(R.id.number_textview)
        if (savedInstanceState != null)
            number = savedInstanceState.getFloat("STATE_NUMBER_TEXTVIEW").toInt()

        numberTextview.text = number.toString()

        val next_activity_button: Button = findViewById(R.id.next_activity_button)
        next_activity_button.setOnClickListener{
            val intent = Intent(this, SquareNumberActivity::class.java)
                .apply { putExtra("STATE_NUMBER_TEXTVIEW", number.toFloat()) }
            startActivity(intent)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putFloat("STATE_NUMBER_TEXTVIEW", number.toFloat())
        super.onSaveInstanceState(outState)
    }

    override fun onStart(){
        Log.i(tag, "Started method 'onStart()'")
        super.onStart()
        number += 1
    }

    override fun onResume(){
        Log.i(tag, "Started method 'onResume()'")
        super.onResume()
        val numberTextview: TextView = findViewById(R.id.number_textview)
        numberTextview.text = number.toString()
    }
    override fun onStop(){
        Log.i(tag, "Started method 'onStop()'")
        super.onStop()
    }

    override fun onDestroy() {
        Log.i(tag, "Started method 'onDestroy()'")
        super.onDestroy()
    }

    override fun onRestart() {
        Log.i(tag, "Started method 'onRestart()'")
        super.onRestart()
    }

}
