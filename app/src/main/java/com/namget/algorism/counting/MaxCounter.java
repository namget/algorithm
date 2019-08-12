package com.namget.algorism.counting;

import android.util.Log;

import java.util.HashMap;
import java.util.Map;

public class MaxCounter {


    public static int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] result = new int[N];
        int lastMaxValueIdx = -1;
        int maxValue = 0;
        int maxTempValue = 0;
        int idx = 0;

        for (int a : A) {
            if (a > N) {
                lastMaxValueIdx = idx;
                maxValue = maxTempValue;
            } else {
                if (result[a - 1] < maxValue) {
                    result[a - 1] = maxValue + 1;
                } else {
                    result[a - 1]++;
                }
                maxTempValue = Math.max(maxTempValue, result[a - 1]);
            }
            idx++;
        }

        for (int i = 0; i < result.length; i++) {
            result[i] = maxValue;
        }

        for (int i = lastMaxValueIdx + 1; i < A.length; i++) {
            ++result[A[i] - 1];
        }

        return result;
    }

/*    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] result = new int[N];

        int maxValue = 0;
        for (int a : A) {
            if (a > N) {
                setMaxValue(maxValue, result);
            }else{
                if(maxValue < ++result[a-1]){
                    maxValue = result[a-1];
                }
            }
        }
        return result;
    }

    private void setMaxValue(int value, int[] result) {
        for (int i = 0; i < result.length; i++) {
            result[i] = value;
        }
    }*/

}
