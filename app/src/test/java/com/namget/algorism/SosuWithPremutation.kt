package com.namget.algorism

import org.junit.Test
import kotlin.math.pow

class SosuWithPremutation {

    @Test
    fun main() {
        solution("123")
//        val array = sosu(3)
    }

    fun solution(numbers: String) {
        var answer = 0
        val arr = numbers.toCharArray()
        premutation(arr, 0, arr.size - 1, arr.size)
    }

    fun print(arr: CharArray, r: Int) {
        for (i in 0 until r) print(arr[i] + " ")
        println()
    }

    fun premutation(arr: CharArray, depth: Int, n: Int, r: Int) {
        if (depth == r) {
            print(arr, r)
            return
        }
        for (i in depth..n) {
            swap(arr, depth, i)
            premutation(arr, depth + 1, n, r)
            swap(arr, depth, i)
        }
    }

    fun swap(arr: CharArray, depth: Int, i: Int) {
        val temp = arr[depth]
        arr[depth] = arr[i]
        arr[i] = temp
    }


    fun sosu(size: Int): BooleanArray {
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
        return array
    }
}