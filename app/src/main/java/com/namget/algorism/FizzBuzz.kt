package com.namget.algorism

import android.util.Log

//input = [2,7,13,15] num = 9 => input[0],input[1]
//arrayOf(2, 4, 6, 7, 10, 13, 15), 6 = 0,1
//arrayOf(2, 4, 6, 7, 10, 13, 15), 14 = 1,4
//arrayOf(2, 4, 6, 7, 10, 13, 15), 18 = not found return null
//arrayOf(2, 3, 4, 6, 7, 10, 13, 15), 13) = 1,5 and 3,4
fun FindTwoNumber(input: Array<Int>, num: Int): ArrayList<String>? {
    val result = arrayListOf<String>()

    if (input.min()!!.compareTo(num) > 0) {
        Log.e("FindTwoNumber", "not Found return")
        return null
    }
    val filtered  = input.filter { it < num }
    for (i in 0 until filtered.size)
        Log.e("FindTwoNumber", "" + filtered[i])

    var index = 0
    for (i in 0 until filtered.size) {
        for (j in i until filtered.size) {
            if (i == j) {
                continue
            }
            if ((filtered[i] + filtered[j]) == num) {
                result.add("$i,$j")
                index++
                Log.e("FindTwoNumber", "input[i] = ${filtered[i]} input[j] = ${filtered[j]}")
                Log.e("FindTwoNumber", "input[i] + input[j] => ${filtered[i]} + ${filtered[j]} = $num")
            }
        }
    }

    if (result.isEmpty()) {
        Log.e("FindTwoNumber", "not Found return")
        return null
    }

    return result
}

fun FizzBuzz(input: Int): Array<String?> {
    val array: Array<String?> = arrayOfNulls(input)

    for (i in 0 until array.size) {
        val index = i + 1

        if ((index % 3 == 0) and (index % 5 == 0)) {
            array[i] = "FizzBuzz"
        } else if (index % 3 == 0) {
            array[i] = "Fizz"
        } else if (index % 5 == 0) {
            array[i] = "Buzz"
        } else {
            array[i] = index.toString()
        }
        Log.e("FizzBuzz", "index : $index  array = ${array[i]}")
    }

    return array
}