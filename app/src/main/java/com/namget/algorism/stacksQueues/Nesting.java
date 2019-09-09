package com.namget.algorism.stacksQueues;

import java.util.Stack;

public class Nesting {

    public int solution(String S) {
        // write your code in Java SE 8
        Stack<Character> stack = new Stack<>();
        char[] chars = S.toCharArray();

        for (char c : chars) {
            if (c == '(') {
                stack.push(c);
            } else if ((stack.empty() && c == ')') || (!stack.empty() && stack.pop() != '(')) {
                return 0;
            }
        }
        if(!stack.empty()){
            return 0;
        }

        return 1;
    }
}
