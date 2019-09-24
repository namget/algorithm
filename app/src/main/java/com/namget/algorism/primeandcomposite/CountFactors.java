package com.namget.algorism.primeandcomposite;

public class CountFactors {
    public int solution(int N) {
        // write your code in Java SE 8
        int result = 0;
        //1..2..3..4..6..8..12..24
        //즉 제곱근까지의 반까지 나눠지는 갯수 x 2 = 총 개수
        for(int i = 1; i <= Math.sqrt(N); i++){
            if(N % i == 0){
                result++;
            }
        }
        return result * 2;
    }
}
