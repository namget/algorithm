package com.namget.algorism.primeandcomposite;

import java.util.*;

public class CountFactors {
    public int solution(int N) {
        // write your code in Java SE 8
        int result = 1;
        Map<Integer, Integer> hashMap = new HashMap<>();
        int count = 0;
        int beforeDiv = 2;
        int div = 2;
        while (N > 1) {
            if (N % div == 0) {
                N /= div;
                hashMap.put(div, hashMap.getOrDefault(div, 0) + 1);
                //다시 초기화 할필요가 없다
                count ++;
//                div = 2;
            } else {
                if(count > 0){
                    result *= (count +1);
                    count = 0;
                }
                div++;
            }
        }
        if(count > 0){
            result *= (count +1);
        }

        return result;
    }
}
