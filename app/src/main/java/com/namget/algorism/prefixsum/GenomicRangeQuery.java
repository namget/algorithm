package com.namget.algorism.prefixsum;


import java.util.ArrayList;
import java.util.List;

public class GenomicRangeQuery {
    public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        int[] result = new int[P.length];
        char[] s = S.toCharArray();

        List<Integer> aList = new ArrayList<>();
        List<Integer> cList = new ArrayList<>();
        List<Integer> gList = new ArrayList<>();
        List<Integer> tList = new ArrayList<>();

        for (int i = 0; i < s.length; i++) {
            if(s[i] == 'A'){
                aList.add(i);
            }
            if(s[i] == 'C'){
                cList.add(i);
            }
            if(s[i] == 'G'){
                gList.add(i);
            }
            if(s[i] == 'T'){
                tList.add(i);
            }
        }

        for (int i = 0; i < P.length; i++) {
//            aList.containsAll()

        }

        return result;
    }
}
