package com.namget.algorism

import org.junit.Test
import java.lang.Math.pow
import kotlin.math.pow

class Sosu {

    @Test
    fun main() {
        sosu(3)
    }

    fun sosu(size: Int) {
        val size = 10.0.pow(size.toDouble()).toInt() - 1
        val array = BooleanArray(size) { true }

        array[0] = false
        array[1] = false

        for (i in 2 until size) {
            if (i * i < size) {
                for (j in (i * i) until size step i) {
                    if (i * i < size) {
                        array[j] = false
                    } else {
                        continue
                    }
                }
            } else {
                continue
            }
        }
        array.forEach {
            println(it)
        }

    }
}