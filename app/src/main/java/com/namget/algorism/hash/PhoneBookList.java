package com.namget.algorism.hash;

import android.util.Log;

import java.util.HashMap;
import java.util.Map;

public class PhoneBookList {

    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        for (int i = 0; i < phone_book.length; i++) {
            for (int j = (i + 1); j < phone_book.length; j++) {
//                Log.e("a", "i :" + i + " " + phone_book[i] + " / " + "j :" + j + " " + phone_book[j]);
//                Log.e("a", "" + phone_book.length);
                if (phone_book[i].startsWith(phone_book[j]) || phone_book[j].startsWith(phone_book[i])) {
                    return false;
                }
            }
        }

        return answer;
    }
}
