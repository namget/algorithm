package com.namget.algorism;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.namget.algorism.stacksQueues.Brackets;

public class JavaActvity extends AppCompatActivity {

    int a[] = {0};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Brackets.solution("{[()()]}");
    }
}
