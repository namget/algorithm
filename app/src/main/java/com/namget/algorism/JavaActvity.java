package com.namget.algorism;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.namget.algorism.maximumSliceProblem.MaxProfit;
import com.namget.algorism.maximumSliceProblem.MaxSliceSum;
import com.namget.algorism.stacksQueues.Brackets;
import com.namget.algorism.stacksQueues.Fish;
import com.namget.algorism.stacksQueues.StoneWall;

public class JavaActvity extends AppCompatActivity {

    int b[] = {1, 3, -5, 3, 7, 14, 29};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MaxSliceSum.solution(b);
    }
}
