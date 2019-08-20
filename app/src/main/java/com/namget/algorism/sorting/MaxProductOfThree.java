package com.namget.algorism.sorting;

import java.util.Arrays;

public class MaxProductOfThree {

    //음수 두개의 곱 * 양수의곱
    // or 양수 세개의 곱
    public int solution(int[] A) {
        Arrays.sort(A);
        int result = Integer.MIN_VALUE;

        if (result < A[0] * A[1] * A[2]) {
            result = A[0] * A[1] * A[2];
        }

        if (result < A[A.length - 1] * A[A.length - 2] * A[A.length - 3]) {
            result = A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
        }

        if (result < A[0] * A[1] * A[A.length - 1]){
            result = A[0] * A[1] * A[A.length - 1];
        }

        return result;
    }
}
