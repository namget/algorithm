package com.namget.algorism;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    String a[] = {"a","b","c","d"};
    String b[] = {"a","b","c"};


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        NotWinning.solution(a,b);
    }
}
