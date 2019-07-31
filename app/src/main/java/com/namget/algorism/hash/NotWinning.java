package com.namget.algorism.hash;

import android.util.Log;

import java.util.HashMap;

public class NotWinning {

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hash = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            int in = 1;
            if (hash.containsKey(participant[i])) {
                in = hash.get(participant[i]) + 1;
            }
            hash.put(participant[i], in);
        }
        for (int i = 0; i < completion.length; i++) {
            int in = hash.get(completion[i]).intValue() - 1;
            hash.put(completion[i], in);
            Log.e("test2", "participant[i]" + completion[i] + " in : " + in);
        }
        for (int i = 0; i < participant.length; i++) {
            Log.e("test3", "participant[i]" + participant[i]);
            if (hash.get(participant[i]).intValue() != 0) {
                answer = participant[i];
            }
        }

        return answer;
    }
}
