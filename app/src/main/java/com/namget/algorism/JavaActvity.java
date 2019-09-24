package com.namget.algorism;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.namget.algorism.maximumSliceProblem.MaxSliceSum;

public class JavaActvity extends AppCompatActivity {

    int a[] = {1, 3, -5, 3, 7, 14, 29};
    int b[] = {1, 3, -5, 3, 7, 14, 29};
    int c[] = {Integer.MIN_VALUE, Integer.MIN_VALUE, -5, 3, 7, 14, 29};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MaxSliceSum.solution(b);
    }
}
