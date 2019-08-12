package com.namget.algorism.counting;


import java.util.*;

public class MissingInteger {

    public int solution(int[] A) {
        // write your code in Java SE 8

        int result = 1;

        Map<Integer, Boolean> map = new HashMap<>();
        for (int a : A) {
            if (a > 0)
                map.put(a, true);
        }

        for(int i = 0; i < map.keySet().size(); i++){
            if(!map.containsKey(result)){
                return result;
            }
            result ++;
        }
        return result;
    }
}
