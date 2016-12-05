package com.example.lidiia.myfragmentsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    FragmentB fragmentB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        fragmentB = (FragmentB) getSupportFragmentManager().findFragmentById(R.id.fragment_b);
        int id = getIntent().getIntExtra("qwerty", 0);
        fragmentB.update(id);
    }
}
