package com.example.lidiia.theweather;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentRV.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class FragmentRV extends Fragment {

    private static final String TAG = "Fetch";
    private OnFragmentInteractionListener mListener;
    RecyclerView recyclerView;
    WeatherRVAdapter weatherRVAdapter;
    List<ParseWeather> parseWeatherList;
    Handler handler;

    public FragmentRV() {
        handler = new Handler();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = (RecyclerView) view.findViewById(R.id.rv_id);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        weatherRVAdapter = new WeatherRVAdapter(data());

        recyclerView.setAdapter(weatherRVAdapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rv, container, false);
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }


    private List<ParseWeather> data() {
        String cityId = new CityUnitsPreference(getActivity()).getCity();
        String units = new CityUnitsPreference(getActivity()).getUnits();

        parseWeatherList = new ArrayList<>();

        try {
            JSONObject jsonObject = FetchWeaher.getJsonObject(getActivity(), cityId, units);

            parseWeatherList.add(new ParseWeather(jsonObject));


        } catch (JSONException je) {
            Log.e(TAG, "Failed to parse JSON", je);
            je.printStackTrace();
        }

        return parseWeatherList;
    }

}
