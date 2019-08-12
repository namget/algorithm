package com.namget.algorism.counting;

import java.util.HashMap;
import java.util.Map;

public class FrogRiverOne {

    public static int solution(int X, int[] A) {
        int sum = ((X) * (X + 1)) / 2;
        int result = -1;
        Map<Integer, Boolean> map = new HashMap<>();
        if(A.length == 0){
            return -1;
        }
        int i = 0;
        for (int a : A) {
            if (!map.containsKey(a)) {
                map.put(a, true);
                sum -= a;
            }

            if (sum == 0) {
                return i;
            }
            i++;
        }
        return result;
    }
}
