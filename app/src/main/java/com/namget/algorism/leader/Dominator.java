package com.namget.algorism.leader;

import java.util.Arrays;

public class Dominator {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int[] B = A.clone();
        Arrays.sort(A);
        int length = A.length;
        if(length == 0){
            return -1;
        }
        int count = 0;
        //반이 넘는것이기 때문에 중앙은 항상 최고 값이다.
        int cadidate = A[length / 2];
        for (int a : A) {
            if (a == cadidate) {
                count++;
            }
        }
        //반이상이 안넘으면 대표leader가 없다
        if (count < (length / 2) + 1) {
            return -1;
        }
        //clone 한곳에서 찾는다.
        for (int i = 0; i < B.length; i++) {
            if (B[i] == cadidate) {
                return i;
            }
        }
        return 0;
    }

}
