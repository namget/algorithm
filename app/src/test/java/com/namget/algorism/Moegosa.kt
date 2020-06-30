package com.namget.algorism

import org.junit.Test

class Moegosa {
    @Test
    fun test() {
        solution(intArrayOf(1,2,3,4,5))
    }

    fun solution(answers: IntArray): IntArray {
        var person1 = intArrayOf(1, 2, 3, 4, 5)
        var person2 = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        var person3 = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        var count1 = 0;
        var count2 = 0;
        var count3 = 0;
        var index = 0;


        for (answer in answers) {
            if (answer == person1[index % person1.size]) count1++
            if (answer == person2[index % person2.size]) count2++
            if (answer == person3[index % person3.size]) count3++
            index++;
        }
        var answer = intArrayOf()

        val max = intArrayOf(count1,count2,count3).max()
        val list = mutableListOf<Int>()
        if(count1 == max){
            list.add(1)
        }
        if(count2 == max){
            list.add(2)
        }
        if(count3 == max){
            list.add(3)
        }

        return list.toIntArray()
    }


}