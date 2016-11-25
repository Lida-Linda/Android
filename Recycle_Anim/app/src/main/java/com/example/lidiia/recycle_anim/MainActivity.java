package com.example.lidiia.recycle_anim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Content> contentListMain = new ArrayList<>();
    private RecyclerView recyclerViewMain;
    private MyAdapter myAdapterMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewMain = (RecyclerView) findViewById(R.id.rv_id);
        myAdapterMain = new MyAdapter(contentListMain);
        RecyclerView.LayoutManager myLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewMain.setLayoutManager(myLayoutManager);
        recyclerViewMain.setAdapter(myAdapterMain);
        data();
    }
    private void data() {
        contentListMain.add(new Content(R.drawable.dog, "Собака Барабака", "ананас"));
        contentListMain.add(new Content(R.drawable.harley, "Harley Quinn", "Suicide Squad"));
        contentListMain.add(new Content(R.drawable.owl, "Pretty Owl", "Just owl"));
        contentListMain.add(new Content(R.drawable.dog, "Собака Барабака", "ананас"));
        contentListMain.add(new Content(R.drawable.harley, "Harley Quinn", "Suicide Squad"));
        contentListMain.add(new Content(R.drawable.owl, "Pretty Owl", "Just owl"));
        contentListMain.add(new Content(R.drawable.dog, "Собака Барабака", "ананас"));
        contentListMain.add(new Content(R.drawable.harley, "Harley Quinn", "Suicide Squad"));
        contentListMain.add(new Content(R.drawable.owl, "Pretty Owl", "Just owl"));
        contentListMain.add(new Content(R.drawable.dog, "Собака Барабака", "ананас"));
        contentListMain.add(new Content(R.drawable.harley, "Harley Quinn", "Suicide Squad"));
        contentListMain.add(new Content(R.drawable.owl, "Pretty Owl", "Just owl"));
        contentListMain.add(new Content(R.drawable.dog, "Собака Барабака", "ананас"));
        contentListMain.add(new Content(R.drawable.harley, "Harley Quinn", "Suicide Squad"));
        contentListMain.add(new Content(R.drawable.owl, "Pretty Owl", "Just owl"));
        contentListMain.add(new Content(R.drawable.dog, "Собака Барабака", "ананас"));
        contentListMain.add(new Content(R.drawable.harley, "Harley Quinn", "Suicide Squad"));
        contentListMain.add(new Content(R.drawable.owl, "Pretty Owl", "Just owl"));
    }
}
