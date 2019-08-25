package com.namget.algorism.prefixsum;

import java.util.ArrayList;
import java.util.List;

public class MinAvgTwoSlice {

    //가장 작은수의 시작에서의 평균
    public int solution(int[] A) {
        // write your code in Java SE 8
        List<Integer> minList = new ArrayList<>();
        int max = Integer.MAX_VALUE;
        int index = 0;
        for(int a : A) {
            if(a < max){
                max = a;
            }else if(a == max){

            }
            index++;
        }


        return 0;
    }
}
