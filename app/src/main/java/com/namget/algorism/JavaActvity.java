package com.namget.algorism;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.namget.algorism.maximumSliceProblem.MaxSliceSum;
import com.namget.algorism.primeandcomposite.Peak;

public class JavaActvity extends AppCompatActivity {

    int a[] = {1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};
    int b[] = {1, 3, 2, 1};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Peak.solution(b);
    }
}
