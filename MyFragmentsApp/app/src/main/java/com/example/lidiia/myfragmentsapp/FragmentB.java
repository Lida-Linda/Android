package com.example.lidiia.myfragmentsapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class FragmentB extends Fragment {

    List<String> strings = new ArrayList<>();
    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//here

        strings.add("hsakjdh");
        strings.add("asd");
        strings.add("asdsd");
        strings.add("asdsd");
        strings.add("asdsd");
        strings.add("asdsd");
        strings.add("asdsadsad");
        strings.add("asdsad");
        strings.add("asdsd");
        strings.add("sadsadd3");

        textView = (TextView) view.findViewById(R.id.details_id);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //from
    }

    public void update(int id) {
        textView.setText(strings.get(id));
    }
}
