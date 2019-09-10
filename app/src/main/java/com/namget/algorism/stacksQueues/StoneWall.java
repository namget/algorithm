package com.namget.algorism.stacksQueues;

import java.util.Stack;

public class StoneWall {
    public static int solution(int[] H) {
        // write your code in Java SE 8
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(H[0]);
        result ++;
        for (int i = 0; i < H.length; i++) {
            if (H[i] > stack.peek()) {
                stack.push(H[i]);
                result++;
            } else if (H[i] < stack.peek()) {
                while (!stack.empty() && H[i] < stack.peek()) {
                    stack.pop();
                }
                if(!stack.empty() && stack.peek() == H[i]){

                }else{
                    result++;
                }
                stack.push(H[i]);
            }
        }

        return result;
    }
}
