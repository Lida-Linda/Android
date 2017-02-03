package com.example.lidiia.theweather;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ParseWeather {

    public String getDt() {
        return dt;
    }

    private String dt;

    public ParseWeather(String dt) {
        this.dt = dt;
    }
}
