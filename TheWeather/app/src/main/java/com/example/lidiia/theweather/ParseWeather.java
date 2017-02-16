package com.example.lidiia.theweather;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ParseWeather {

    private String dtTxt;
    private String temp;
    private String weatherMain;
    private String windSpeed;

    public ParseWeather(String dtTxt, String temp, String weatherMain, String windSpeed) {
        this.dtTxt = dtTxt;
        this.temp = temp;
        this.weatherMain = weatherMain;
        this.windSpeed = windSpeed;
    }

    public String getDtTxt() {
        return dtTxt;
    }

    public String getTemp() {
        return temp;
    }

    public String getWeatherMain() {
        return weatherMain;
    }

    public String getWindSpeed() {
        return windSpeed;
    }
}
