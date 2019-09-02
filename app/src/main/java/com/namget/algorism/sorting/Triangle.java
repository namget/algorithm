package com.namget.algorism.sorting;

import java.util.Arrays;

public class Triangle {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int result = 0;

        Arrays.sort(A);
        for (int i = 0; i < A.length - 2; i++) {
            for (int j = i + 2; j < A.length; j++) {
                if ((A[i] > 0 && A[i + 1] == Integer.MAX_VALUE) || (A[i] + A[i + 1] > A[j])){
                    return 1;
                } else{
                    break;
                }
            }
        }

        return result;
    }
}
