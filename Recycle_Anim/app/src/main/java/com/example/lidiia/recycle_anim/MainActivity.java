package com.example.lidiia.recycle_anim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private List<Content> contentListMain = new ArrayList<>();
    private RecyclerView recyclerViewMain;
    private MyAdapter myAdapterMain;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.menu_second_id) {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

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
