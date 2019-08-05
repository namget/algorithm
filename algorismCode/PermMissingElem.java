package com.namget.algorism.timecomplex;

import android.util.Log;

public class PermMissingElem {

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int total = 0;
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            total += (i + 1);
            result += A[i];
        }
        total += A.length + 1;
        return total - result;
    }
}
