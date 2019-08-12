package com.namget.algorism;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.namget.algorism.counting.MaxCounter;
import com.namget.algorism.hash.PhoneBookList;
import com.namget.algorism.timecomplex.FrogJump;
import com.namget.algorism.timecomplex.PermMissingElem;

public class JavaActvity extends AppCompatActivity {

    int a[] = {3,4,4,6,1,4,4};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MaxCounter.solution(5,a);
    }
}
