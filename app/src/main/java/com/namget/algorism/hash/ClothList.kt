package com.namget.algorism.hash

fun solution(clothes: Array<Array<String>>): Int {
    var answer = 1
    val hash = HashMap<String, Int>()
    for (i in 0 until clothes.size) {
        hash.put(clothes[i][1], hash.getOrDefault(clothes[i][1], 0) + 1)
    }
    for(i in hash.keys){
        answer *= (hash.get(i)!!.plus(1))
    }
    answer -= 1
    return answer
}