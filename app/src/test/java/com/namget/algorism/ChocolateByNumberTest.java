package com.namget.algorism;

import org.junit.Test;

public class ChocolateByNumberTest {

    @Test
    public void solution() {

        int N = 30;
        int M = 7;
        // write your code in Java SE 8

        boolean[] isEmpty = new boolean[N];
        int index = 0;
        int count = 0;

        while (!isEmpty[index]) {
            isEmpty[index] = true;
            count++;

            System.out.println("index : " + index);
//            System.out.println("index + M : " + (index + M));
            System.out.println("N - 1 : " + (N - 1));
            System.out.println("index + M > N - 1 " + (index + M > N - 1));
            if (index + M > N - 1) {
                index = (index + M) % N;
            } else {
                index += M;
            }
            System.out.println("index left : " + index);

        }
        System.out.println(count);
//        return count;
    }

    @Test
    public void solution2() {
        int N = 10;
        int temp = N;
        int M = 4;

        int R = N / M;

        while (N % M != 0) {
            System.out.println("N % M == 0 : " + (N % M != 0));
            R = N % M;
            N = M;
            M = R;
            System.out.println("R : " + (R));
            System.out.println("N : " + (N));
            System.out.println("M : " + (M));
        }
        System.out.println("M / R : " + (M / R));

        System.out.println(temp / R );

    }

}
