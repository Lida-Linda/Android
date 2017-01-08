package com.example.lidiia.thegame;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class ListeningActivity extends AppCompatActivity {

    public static final String ANIMALS_TITLE = "Тварини";
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Toolbar toolbar;
    private List<ListeningImageContent> listeningImageContents = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listening);

        toolbar = (Toolbar) findViewById(R.id.toolbar_id);
        setSupportActionBar(toolbar);

        tabLayout = (TabLayout) findViewById(R.id.tabs_id);

        tabLayout.addTab(tabLayout.newTab());
        tabLayout.addTab(tabLayout.newTab());

        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        MyPagerAdapter myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        myPagerAdapter.addMyFragment(new AnimalsFragment(), ANIMALS_TITLE);
        myPagerAdapter.addMyFragment(new AnimalsFragment(), "Транспорт");
        viewPager.setAdapter(myPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }


}
