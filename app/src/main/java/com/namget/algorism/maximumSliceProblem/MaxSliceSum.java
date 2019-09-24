package com.namget.algorism.maximumSliceProblem;

public class MaxSliceSum {

    public static long solution(int[] A) {
        // write your code in Java SE 8
        long maxEnding = 0;
        long maxSlice = Integer.MIN_VALUE;
        long maxValue = Integer.MIN_VALUE;
        for (int a : A) {
            // a> 0이면서 maxEnding or maxSlice 0보다 작다는건 음수값에서 양수값인 값이 나왔을때
            if ((maxEnding < 0 || maxSlice < 0) && a > 0) {
                maxValue = maxSlice;
                maxSlice = 0;
                maxEnding = 0;

            }
            maxEnding = Math.max(Integer.MIN_VALUE, maxEnding + a);
            maxSlice = Math.max(maxSlice, maxEnding);
            if (a > maxValue) {
                maxValue = a;
            }
            if (maxSlice > maxValue) {
                maxValue = maxSlice;
            }
        }
        return (maxValue > maxSlice) ? maxValue : maxSlice;
    }
}
