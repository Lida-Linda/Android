package com.example.lidiia.thegame;


import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AnimalsFragment extends Fragment {

    private static final int GRID_COLUMN = 2;
    RecyclerView recyclerView;
    List<ListeningImageContent> listeningImageContents;
    MyRVAdapter myRVAdapter;
    MediaPlayer mp;
    //    ListeningImageContent listeningImageContent;
    OnFragmentInteractionListener fragmentListener;
    MyPagerAdapter myPagerAdapter;

    public AnimalsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = (RecyclerView) view.findViewById(R.id.rv_id);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), GRID_COLUMN));
        myRVAdapter = new MyRVAdapter(data());

        recyclerView.setAdapter(myRVAdapter);
    }

    private List<ListeningImageContent> data() {
        listeningImageContents = new ArrayList<>();

        new Thread() {
            @Override
            public void run() {
                super.run();
                //        конструктор для додавання зображення і звуку
                listeningImageContents.add(new ListeningImageContent(R.drawable.animal_icon_01_big_size, R.raw.tiger_1)); //tiger
                //        конструктор для додавання зображення
                listeningImageContents.add(new ListeningImageContent(R.drawable.animal_icon_02_big_size));
                listeningImageContents.add(new ListeningImageContent(R.drawable.animal_icon_03_big_size));
                listeningImageContents.add(new ListeningImageContent(R.drawable.animal_icon_04_big_size));
                listeningImageContents.add(new ListeningImageContent(R.drawable.animal_icon_05_big_size));
                listeningImageContents.add(new ListeningImageContent(R.drawable.animal_icon_06_big_size));
                listeningImageContents.add(new ListeningImageContent(R.drawable.animal_icon_07_big_size));
                listeningImageContents.add(new ListeningImageContent(R.drawable.animal_icon_08_big_size));
                listeningImageContents.add(new ListeningImageContent(R.drawable.animal_icon_09_big_size));
                listeningImageContents.add(new ListeningImageContent(R.drawable.animal_icon_10_big_size));
                listeningImageContents.add(new ListeningImageContent(R.drawable.animal_icon_11_big_size));
                listeningImageContents.add(new ListeningImageContent(R.drawable.animal_icon_12_big_size));

            }
        }.start();

        return listeningImageContents;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_animals, container, false);
    }

    public interface OnFragmentInteractionListener {
        void OnFragmentInteraction(int id);
    }

}
