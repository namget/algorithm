package com.namget.algorism;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.namget.algorism.maximumSliceProblem.MaxProfit;
import com.namget.algorism.stacksQueues.Brackets;
import com.namget.algorism.stacksQueues.Fish;
import com.namget.algorism.stacksQueues.StoneWall;

public class JavaActvity extends AppCompatActivity {

    int b[] = {23171,21011,21123,21366,21013,21367};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MaxProfit.solution(b);
    }
}
