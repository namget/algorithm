package com.namget.algorism.primeandcomposite;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Peak {

    public int solution(int[] A) {
        // write your code in Java SE 8
        List<Integer> indexList = new ArrayList<>();

        //최고값들의 index를 구하는 작업
        int max = 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == max) {
                indexList.add(i);
            } else if (A[i] > max) {
                max = A[i];
                indexList.clear();
                indexList.add(i);
            }
        }

        // 0~1 or last-1 ~ last  index간의 최대 간격 or 인덱스간의 최대간격으로 예상


    }
}
