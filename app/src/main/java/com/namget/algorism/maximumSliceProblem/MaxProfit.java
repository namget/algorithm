package com.namget.algorism.maximumSliceProblem;

import java.util.Arrays;

public class MaxProfit {

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int[] copy = A.clone();
        Arrays.sort(A);
        int left = A.length;
        int right = 0;
        int strIdx = 0;
        int endIdx = A.length - 1;
        while (left > right && (strIdx != endIdx)) {
            for (int i = 0; i < A.length; i++) {
                if (copy[i] == A[strIdx]) {
                    left = i;
                }
                if (copy[i] == A[endIdx]) {
                    right = i;
                }
            }
            if (A[strIdx + 1] - A[strIdx] <= A[endIdx] - A[endIdx - 1]) {
                strIdx++;
            } else {
                endIdx--;
            }
        }
        return copy[right] - copy[left];
    }
}
