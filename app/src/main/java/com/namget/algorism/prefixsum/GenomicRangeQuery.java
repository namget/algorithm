package com.namget.algorism.prefixsum;


public class GenomicRangeQuery {
    public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        int[] result = new int[P.length];

        char[] s = S.toCharArray();
        for(char a : s){

        }

        S.replaceAll("A", "1");
        S.replaceAll("C", "2");
        S.replaceAll("G", "3");
        S.replaceAll("T", "4");
        int length = S.length();
        int number = Integer.valueOf(S);

        for (int i = 0; i < P.length; i++) {
            result[i] = (int) ((number % Math.pow(10, length - P[i])) / Math.pow(10, length - Q[i]));
        }

        for (int i = 0; i < result.length; i++) {
            int intResult = 0;
            int n = result[i];
            while (n != 0) {
                intResult = (result[i] % 10);
                n /= 10;
            }
            result[i] = intResult;
        }

        return result;
    }

}
