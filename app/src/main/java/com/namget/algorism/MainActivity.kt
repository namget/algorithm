package com.namget.algorism

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.namget.algorism.hash.solution

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(FizzBuzz(15).toString())

    }
}
