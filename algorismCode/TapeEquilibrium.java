package com.namget.algorism.timecomplex;

public class TapeEquilibrium {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int start =0;
        int reverse = 0;
        int min = Integer.MAX_VALUE;

        for(int sum : A){
            reverse += sum;
        }

        for(int i = 0; i < A.length-1; i++){
            start += A[i];
            reverse -= A[i];
            if(Math.abs(start - reverse) < min) {
                min =  Math.abs(start - reverse);
            }
        }
        return min;
    }
}
