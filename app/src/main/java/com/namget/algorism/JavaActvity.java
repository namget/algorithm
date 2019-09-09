package com.namget.algorism;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.namget.algorism.stacksQueues.Brackets;
import com.namget.algorism.stacksQueues.Fish;

public class JavaActvity extends AppCompatActivity {

    int a[] = {4, 3, 2, 1, 5};
    int b[] = {0, 1, 0, 0, 0};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fish.solution(a, b);
    }
}
