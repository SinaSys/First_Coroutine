package com.example.first_coroutine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch {
            delay(3000)
            Log.d(TAG, "Coroutines says Hello from Thread ${Thread.currentThread().name}")
        }

        Log.d(TAG, "Hello from Thread${Thread.currentThread().name}")

    }



}
