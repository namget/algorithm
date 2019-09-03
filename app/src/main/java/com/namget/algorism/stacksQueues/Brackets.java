package com.namget.algorism.stacksQueues;

import java.util.Stack;

public class Brackets {
    public static int solution(String S) {
        // write your code in Java SE 8
        if (S.length() % 2 == 1) {
            return 0;
        } else if (S.isEmpty()) {
            return 1;
        }

        char[] array = S.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == '{' || array[i] == '[' || array[i] == '(') {
                stack.push(array[i]);
            } else if (array[i] == '}') {
                if (stack.empty() || stack.pop() != '{') {
                    return 0;
                }
            } else if (array[i] == ']') {
                if (stack.empty() || stack.pop() != '[') {
                    return 0;
                }
            } else if (array[i] == ')') {
                if (stack.empty() || stack.pop() != '(') {
                    return 0;
                }
            }
        }
        if(!stack.empty()){
            return 0;
        }
        return 1;
    }

}
