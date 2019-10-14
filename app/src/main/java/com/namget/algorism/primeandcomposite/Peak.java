package com.namget.algorism.primeandcomposite;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Peak {

    public static int solution(int[] A) {
        List<Integer> divList = getDivideSize(A.length);
        List<Integer> peakList = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            if (i >= 1 && i < A.length - 1 && A[i] > A[i - 1] && A[i] > A[i + 1]) {
                peakList.add(i);
            }
        }
        if (peakList.size() <= 1) {
            return peakList.size();
        }

        // 1 2 3 4 6 12
        for (int div : divList) {
            int result = 1;
            for (int j = 0; j < peakList.size() - 1; j++) {
                if (div * (j + 1) >= peakList.get(j) && div * (j + 1) < peakList.get(j + 1)) {
                    result++;
                } else {
                    break;
                }
                if (div * result == A.length) {
                    return result;
                }
            }
        }

        return 0;
    }

    public static List<Integer> getDivideSize(int N) {
        // write your code in Java SE 8
        List<Integer> divList = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                divList.add(i);
            }
        }
        return divList;
    }

/*    static public int solution(int[] A) {
        // write your code in Java SE 8
        List<Integer> intervalList = new ArrayList<>();

        //A의 소인수중에 번호간의 간격과 같거나 큰수보다 큰 소인수분해값들 개수
        int maxInterval = 0;

        int result = 0;
        int lastIndex = 0;
        for (int i = 0; i < A.length; i++) {
            if (i >= 2 && i < A.length - 2 && A[i] > A[i - 1] && A[i] > A[i + 1]) {
                result++;
                intervalList.add(result);
                maxInterval = Math.max(maxInterval, result);
                result = 0;
                lastIndex = i;
            } else if (i == 0) {
                result++;
            }
            else if (i == 1) {
                result++;
            }
            else if(i == A.length - 2){

            } else if (i == A.length - 1){
                maxInterval = Math.max((A.length - lastIndex) , maxInterval);
            } else{
                result ++;
            }
        }

        if (maxInterval == 0 || maxInterval == A.length) {
            return 0;
        }

        return getDivideSize(A.length, maxInterval);
    }

    static public int getDivideSize(int N, int maxInterval) {
        // write your code in Java SE 8
        //1..2..3..4..6..8..12..24
        //즉 제곱근까지의 반까지 나눠지는 갯수 x 2 = 총 개수
        double sqrt = Math.sqrt(N);
        int result = 1;
        for (int i = 1; i < N; i++) {
            if (N % i == 0) {
                if (i > maxInterval) {
                    result = i;
                    break;
                }
            }
        }
        return N / result;
    }*/

}
