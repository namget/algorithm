package com.namget.algorism

fun FizzBuzz(input: Int): Array<String?> {
    val array: Array<String?> = arrayOfNulls(input)

    for (i in 0 until input) {
        if ((i % 3 == 0) and (i % 5 == 0)) {
            array[i] = "FizzBuzz"
        } else if (i % 3 == 0) {
            array[i] = "Fizz"
        } else if (i % 5 == 0) {
            array[i] = "Buzz"
        } else {
            array[i] = i.toString()
        }
    }
    return array
}