package com.namget.algorism.arrays;

import android.util.SparseBooleanArray;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {

    /*// 홀수개 찾기// android
    public int solution(int[] A) {
        // write your code in Java SE 8
        SparseBooleanArray sparseArray = new SparseBooleanArray();
        for (int idx = 0; idx < A.length; idx++) {
            //홀수 true , 짝수 false
           sparseArray.append(idx, !sparseArray.get(idx,false));
        }
        return sparseArray.indexOfValue(true);
    }*/

    // 홀수 찾기
    public int solution(int[] A) {
        // write your code in Java SE 8
        int a = 0;
        Map<Integer, Boolean> hashMap = new HashMap<>();
        for (int idx = 0; idx < A.length; idx++) {
            //홀수 true , 짝수 false
            hashMap.put(A[idx], !hashMap.getOrDefault(A[idx], false));
        }
        for (Integer result : hashMap.keySet()) {
            if (hashMap.get(result)) {
                return result;
            }
        }
        return a;
    }


}
