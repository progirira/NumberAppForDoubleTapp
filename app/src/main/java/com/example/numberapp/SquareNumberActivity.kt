package com.example.numberapp

import kotlin.math.pow


import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.ComponentActivity

class SquareNumberActivity : ComponentActivity() {
    val TAG: String = "SquareNumberActivityLifeCycle"
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i(TAG, "Started method 'onCreate()'")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.square_number_activity)
        val square_number: TextView = findViewById(R.id.square_number_textview)
        square_number.text = this.intent.extras?.getFloat("STATE_TEXTVIEW")?.pow(2)?.toInt().toString()
    }

    override fun onStart(){
        Log.i(TAG, "Started method 'onStart()'")
        super.onStart()
    }

    override fun onResume(){
        Log.i(TAG, "Started method 'onResume()'")
        super.onResume()

    }
    override fun onStop(){
        Log.i(TAG, "Started method 'onStop()'")
        super.onStop()
    }

    override fun onDestroy() {
        Log.i(TAG, "Started method 'onDestroy()'")
        super.onDestroy()
    }

    override fun onRestart() {
        Log.i(TAG, "Started method 'onRestart()'")
        super.onRestart()
    }

}
