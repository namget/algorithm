package com.namget.algorism.prefixsum;

public class CountDiv {


/*    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        int result = 0;
        int mock = (A > K) ? (A / K) : 0;
        int namugi = A % K;
        if (namugi > 0) {
            mock += 1;
        }
        for (int i = (K * mock); i <= B; i += K) {
            result++;
        }
        return result;
    }*/

    public int solution(int A, int B, int K) {
        // write your code in Java SE 8

        if (K == 1 || (A == B && B == K)){
            return B - A + 1;
        }

        int result = 0;
        int mock = (A > K) ? (A / K) : 0;
        int namugi = A % K;


        if (namugi > 0 && B < K) {
            mock += 1;
        }
        result = (B >= K) ? ((B - (K * mock)) / K) : 0;

        if (namugi == 0) {
            result++;
        }
        return result;
    }


}
