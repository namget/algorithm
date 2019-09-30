package com.namget.algorism.primeandcomposite;

public class MinPerimeterRectangle {

    //https://app.codility.com/demo/results/trainingDZGSAY-WQP/
    public int solution(int N) {
        // write your code in Java SE 8
        //즉 제곱근까지의 반까지 나눠지는 갯수 x 2 = 총 개수
        double sqrt = Math.sqrt(N);
        int first = 1;
        for (int i = 1; i <= sqrt; i++) {
            if (N % i == 0) {
                first = i;
            }
        }
        int last = N / first;


        return 2 * (first + last);
    }
}
