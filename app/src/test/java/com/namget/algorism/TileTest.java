package com.namget.algorism;

import org.junit.Test;

class TileTest {

    @Test
    public void test() {
        solution(10);
    }


    public void solution(int N) {

        int[] list = new int[N];
        if (N == 0) {
            System.out.println(0);
//            return 0;
        }
        list[0] = 1;
        int index = 1;
        fibo(list, index);
        for(int i : list){
            System.out.println(list[i]);
        }


//        return answer;
    }

    public void fibo(int[] list, int index) {
        if (index <= 1) {
            list[index] = 1;
            fibo(list, index);
        } else {
            list[index] = list[index - 1] + list[index - 2];
            fibo(list, ++index);
        }
    }
}
