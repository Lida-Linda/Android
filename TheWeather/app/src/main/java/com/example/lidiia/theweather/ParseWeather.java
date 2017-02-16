package com.example.lidiia.theweather;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ParseWeather {

    private String dtTxt;
    private int temp;
    private String weatherMain;

    public ParseWeather(String dtTxt, int temp, String weatherMain) {
        this.dtTxt = dtTxt;
        this.temp = temp;
        this.weatherMain = weatherMain;
    }

    public String getDtTxt() {
        return dtTxt;
    }

    public int getTemp() {
        return temp;
    }

    public String getWeatherMain() {
        return weatherMain;
    }
}

