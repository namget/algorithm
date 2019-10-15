package com.namget.algorism.sieve;

public class CountSemiprimes {

    public int[] solution(int N, int[] P, int[] Q) {

        int[] result = new int[P.length];
        // 0으로 초기화
        int[] primeArray = new int[N + 1];

        int[] addedList = new int[N + 1];


        //0 = 소수
        //2이상 = 노소수

        System.out.println(primeArray[3]);

        primeArray[0] = 1;
        primeArray[1] = 1;
        int i = 2;
        //소수 구하기
        while (i * i <= N) {
//            System.out.println("i : " + i);
            if (primeArray[i] == 0) {
                int k = i * i;
                while (k <= N) {
                    if (primeArray[k] == 0) {
                        primeArray[k] = i;
                    }
                    k += i;
                }
//                System.out.println(i);
            }
            i++;
        }

        //1 ~ 100
        // 4 / 2 == prime ==0
        //

        // 나누는 수가 소수이고 나눈수도 소수일경우
        i = 2;
        while (i * i <= N) {
            if (primeArray[i] == 0) {
                int k = i * i;
                //primeArray[i] 는 무조건 소수일꺼고
                // 소수들은 subPrime이 될 수 없음
                while (k <= N) {
                    if (primeArray[k / i] == 0) {
                        primeArray[k] = -1;
                    }
                    k += i;
                }
            }
            i++;
        }

//        System.out.println("index = " + k + " isPrime = " + primeArray[k]);
        //갯수구하기
//        for (int a = 0; a < P.length; a++) {
//            int count = 0;
//            for (int k = P[a]; k <= Q[a]; k++) {
//                if(primeArray[k] == -1){
//                    count ++;
//                }
//            }
//            result[a] = count;
//        }

        int count = 0;
        for (int a = 2; a < N; a++) {
            if(primeArray[a] == -1){
                count++;
            }
            addedList[a] = count;
        }

        for(int k = 0; k < result.length; k++) {
            result[k] = addedList[Q[k]] - addedList[P[k] - 1];
            System.out.println("index = " + k + " isPrime = " + result[k]);
        }

        return result;
    }
}
