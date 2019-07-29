package com.namget.algorism.binary;

public class Binary {

    public int solution(int N) {
        String binary = Integer.toBinaryString(N);
        int result = 0;
        int temp = 0;
        //1001 = 2
        for (char b : binary.toCharArray()) {
            //b == '1'
            if (b == '1') {
                if (temp >= result) {
                    result = temp;
                }
                temp = 0;
            }
            //b == '0'
            else {
                temp++;
            }
        }
        return result;
    }
}
