package com.namget.algorism;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.namget.algorism.hash.PhoneBookList;

public class JavaActvity extends AppCompatActivity {

    String a[] = {"119","97674221","1195524421"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PhoneBookList.solution(a);
    }
}
