package com.example.numberapp

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    var number: Int = 0
    val TAG: String = "MainActivityLifeCycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i(TAG, "Started method 'onCreate()'")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        val number_textview: TextView = findViewById(R.id.number_textview)
        if (savedInstanceState != null)
            number = savedInstanceState.getFloat("STATE_NUMBER_TEXTVIEW").toInt()

        number_textview.text = number.toString()

        findViewById<Button>(R.id.next_activity_button)
            .setOnClickListener {
                Log.d("BUTTONS", "User tapped the next_activity button")
                val sendIntent = Intent(this, SquareNumberActivity::class.java
                ).apply { putExtra("STATE_NUMBER_TEXTVIEW", number.toFloat()) }
                startActivity(sendIntent)
            }
    }


    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        number += 1
        Log.d(TAG, "Configuration changed, so number = $number")
        var number_textview: TextView = findViewById(R.id.number_textview)
        number_textview.text = number.toString()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putFloat("STATE_NUMBER_TEXTVIEW", number.toFloat())
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        number = savedInstanceState.getFloat("STATE_NUMBER_TEXTVIEW").toInt()
        var number_textview: TextView = findViewById(R.id.number_textview)
        number_textview.text = number.toString()
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
