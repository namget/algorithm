package com.namget.algorism.euclidean;

import java.util.BitSet;

public class ChocolatesByNumbers {

    public int solution(int N, int M) {
        // write your code in Java SE 8
        //유클리드 호제법을 통해 최대 공약수를 구함.
        int temp = N;
        int R = N / M;
        if(M * R == N){
            return R;
        }
        while (N % M != 0) {
            R = N % M;
            N = M;
            M = R;
        }
        return M * R == N ? R : temp / R;


//        System.out.println("M / R : " + (M / R));
//
//        System.out.println(M * R == N ? R : temp / R );

        //
//        BitSet bitSet = new BitSet();
//        int index = 0;
//        int count = 0;
//
//        while (!bitSet.get(index)) {
//            bitSet.set(index);
//            count++;
//
//            if (index + M > N - 1) {
//                index = (index + M) % N;
//            } else {
//                index += M;
//            }
//        }
//        return count;

//        https://app.codility.com/demo/results/trainingX2JTBZ-8SA/



//        boolean[] isEmpty = new boolean[N];
//        int index = 0;
//        int count = 0;
//
//        while (!isEmpty[index]) {
//            isEmpty[index] = true;
//            count++;
//
//            if (index + M > N - 1) {
//                index = (index + M) % N;
//            }else{
//                index += M;
//            }
//        }
//        return count;
    }
}
