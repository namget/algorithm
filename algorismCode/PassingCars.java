package com.namget.algorism.prefixsum;

public class PassingCars {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int max = 1000000000;
        int oneCount = 0;
        int result = 0;
        for (int a : A) {
            if (a == 1) {
                oneCount++;
            }
        }
        //01011
        for (int i : A) {
            if (i == 0) {
                result += oneCount;
                if (result > max) {
                    return -1;
                }
            } else if (i == 1) {
                oneCount--;
            }
        }
        return result;
    }

}
