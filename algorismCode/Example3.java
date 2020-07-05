package com.estsoft.myapplication;

import org.junit.Test;

import java.util.Arrays;

public class Example3 {

    //세팀으로 나눌때의 최소 총합

    @Test
    public void solution() {
        int[] scores = {1, 2, 12, 14, 15};
        int k = 2;
        int answer = 0;

        int[] div = div(scores);
        Arrays.sort(div);
        for (int i : div) {
            System.out.println(i);
        }
        for (int i = div.length - 1; k != 1; i--) {
            div[i] = 0;
            k--;
        }
        System.out.println("================");
        for (int i : div) {
            answer += i;
            System.out.println(i);
        }

        System.out.println(answer);
    }

    public int[] div(int[] scores) {
        int[] result = new int[scores.length - 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = scores[i + 1] - scores[i];
        }
        return result;
    }
}
