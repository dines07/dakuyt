package com.mple.dies.gitpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("THIS IS CONTAINED IN MY SECOND COMMIT")
        println("LOCAL CHANGE")
        println("change 4")
        println("will be merged")
        println("Hello from your friend")
    }

}