package com.example.lidiia.myfragmentsapp;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentA.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getResources().getBoolean(R.bool.isTablet)){
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        } else {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }
    }


    @Override
    public void onFragmentInteraction(int id) {
        if(getResources().getBoolean(R.bool.isTablet)){
            FragmentB fragmentB = (FragmentB) getSupportFragmentManager().findFragmentById(R.id.fragment_b);
            fragmentB.update(id);
        } else {
            Intent intent = new Intent(this, Main2Activity.class);
            intent.putExtra("qwerty", id);
            startActivity(intent);
        }
    }
}
