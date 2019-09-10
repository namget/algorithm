package com.namget.algorism;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.namget.algorism.stacksQueues.Brackets;
import com.namget.algorism.stacksQueues.Fish;
import com.namget.algorism.stacksQueues.StoneWall;

public class JavaActvity extends AppCompatActivity {

    int a[] = {1};
    int b[] = {8,8,5,7,9,8,7,4,8};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StoneWall.solution(b);
    }
}
