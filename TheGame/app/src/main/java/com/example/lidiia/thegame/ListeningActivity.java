package com.example.lidiia.thegame;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class ListeningActivity extends AppCompatActivity {

    public static final String ANIMALS_TITLE = "Тварини"; // змінні для заголовку вкладок
    private static final String VEHICLE_TITLE = "Транспорт";
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Toolbar toolbar;

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
//        додавання вкладки з певним заголовком
        myPagerAdapter.addMyFragment(new AnimalsFragment(), ANIMALS_TITLE);
        myPagerAdapter.addMyFragment(new VehicleFragment(), VEHICLE_TITLE);

        viewPager.setAdapter(myPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

}
