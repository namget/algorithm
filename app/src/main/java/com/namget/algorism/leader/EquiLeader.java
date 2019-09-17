package com.namget.algorism.leader;

import java.util.Arrays;
import java.util.Stack;

public class EquiLeader {


    public int solution(int[] A) {
        // write your code in Java SE 8
        int[] B = A.clone();
        Arrays.sort(A);
        int length = A.length;
        int count = 0;
        //반이 넘는것이기 때문에 중앙은 항상 최고 값이다.
        int candidate = A[length / 2];
        for (int a : A) {
            if (a == candidate) {
                count++;
            }
        }
        int[] candidateIndex = new int[count];
        int idx = 0;
        //clone 한곳에서 찾는다.
        for (int i = 0; i < B.length; i++) {
            if (B[i] == candidate) {
                candidateIndex[idx] = i;
                idx++;
            }
        }
        boolean isFirstOk = false;
        boolean isSecondOk = false;
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < candidateIndex.length; i++) {
            for (int j = 0; i <= candidateIndex[i]; j++) {
                if (B[i] == candidate) {
                    stack.push(B[i]);
                } else if (!stack.isEmpty() && stack.peek() == candidate && B[i] != candidate) {
                    stack.pop();
                }
            }
            if (!stack.isEmpty()) {
                isFirstOk = true;
            }
            stack.clear();

            for (int j = candidateIndex[i] + 1; i <= candidateIndex[i + 1]; j++) {
                if (B[i] == candidate) {
                    stack.push(B[i]);
                } else if (!stack.isEmpty() && stack.peek() == candidate && B[i] != candidate) {
                    stack.pop();
                }
            }
            if (!stack.isEmpty()) {
                isSecondOk = true;
            }
            if(isFirstOk && isSecondOk){
                result++;
            }

            stack.clear();
            isFirstOk = false;
            isSecondOk = false;

        }

        return result;
    }
}
