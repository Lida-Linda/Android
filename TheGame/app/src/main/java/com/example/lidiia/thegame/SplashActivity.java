package com.example.lidiia.thegame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        при відкритті відображається емблема додатку (drawable/my_splash.xml)
//        доки не завантажиться весь додаток
//        після завантаження одразу відкриється MainActivity

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

}
