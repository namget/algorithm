package com.namget.algorism.prefixsum;

import java.util.ArrayList;
import java.util.List;

public class MinAvgTwoSlice {

    //가장 작은수의 시작에서의 평균
    public int solution(int[] A) {
        // write your code in Java SE 8
        List<Integer> minList = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int a : A) {
            if (a < min) {
                minList.clear();
                min = a;
                minList.add(index);
            } else if (a == min) {
                minList.add(index);
            }
            index++;
        }
        //4 1 2 3

        int result = Integer.MAX_VALUE;
        for (int i = 0; i < minList.size(); i++) {
            if (i + 1 < A.length && A[i] + A[i + 1] < result) {
                result = A[i] + A[i + 1] / 2;
            }
        }

        return result;
    }
}
