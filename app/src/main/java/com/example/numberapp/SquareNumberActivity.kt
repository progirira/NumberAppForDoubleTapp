package com.example.numberapp

import kotlin.math.pow


import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.ComponentActivity

class SquareNumberActivity : ComponentActivity() {
    private val tag: String = "SquareNumberActivityLifeCycle"
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i(tag, "Started method 'onCreate()'")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.square_number_activity)
        val squareNumber: TextView = findViewById(R.id.square_number_textview)
        squareNumber.text = this.intent.extras?.getFloat("STATE_TEXTVIEW")?.pow(2)?.toInt().toString()
    }

    override fun onStart(){
        Log.i(tag, "Started method 'onStart()'")
        super.onStart()
    }

    override fun onResume(){
        Log.i(tag, "Started method 'onResume()'")
        super.onResume()

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
