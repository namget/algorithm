package com.namget.algorism.timecomplex;

import android.util.Log;

public class FrogJump {
    public static int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int offset = 0;
        if ((Y - X) % D > 0) {
            offset = 1;
        }
        return (Y == X) ? 0 : (((Y - X) / D) + offset);

    }
}
