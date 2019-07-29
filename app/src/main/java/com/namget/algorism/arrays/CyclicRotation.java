package com.namget.algorism.arrays;

import java.util.ArrayList;
import java.util.List;

public class CyclicRotation {

    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8

        if(A.length == 0 || K == A.length || K == 0){
            return A;
        }

        if(K > A.length){
            K %= A.length;
        }

        int[] result = new int[A.length];

        int idx = 0;


        for (int i = A.length - 1; i > A.length - K - 1; i--) {
            result[K- idx -1] = A[i];
            idx++;
        }
        int d = idx;
        for (int i = 0; i < A.length - d; i++) {
            result[idx] = (A[i]);
            idx ++;
        }
        return result;
    }
}
