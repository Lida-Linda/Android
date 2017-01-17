package com.example.lidiia.theweather;

import org.json.JSONException;
import org.json.JSONObject;

public class ParseWeather {

    private int temp;

    public ParseWeather() {

    }

    public ParseWeather (JSONObject jsonObject) throws JSONException {

        JSONObject jsonObjectMain = jsonObject.getJSONObject("main");

        temp = (int) jsonObjectMain.getDouble("temp");
    }


    public double getTemp() {
        return temp;
    }
}
