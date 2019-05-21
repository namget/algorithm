package com.namget.algorism

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        FindTwoNumber(arrayOf(2, 7, 13, 15), 9)
        FindTwoNumber(arrayOf(2, 4, 6, 7, 10, 13, 15), 6)
        FindTwoNumber(arrayOf(2, 4, 6, 7, 10, 13, 15), 14)
        FindTwoNumber(arrayOf(2, 4, 6, 7, 10, 13, 15), 18)

        FindTwoNumber(arrayOf(2, 3, 4, 6, 7, 10, 13, 15), 13)

    }
}
