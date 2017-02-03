package com.example.lidiia.theweather;


import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class FetchWeaher {

    private static final String CHERKASY_CITY_ID = "710791"; // Cherkasy city id
    private static final String UNITS_METRIC = "metric"; // for Celsius temperature
    private static final String LANG_UA = "ua"; // ukraine language support
    private static final String WEATHER_KEY = "&APPID=bd5e378503939ddaee76f12ad7a97608";
    private static final String URL_5DAYS_CITY_ID = "http://api.openweathermap.org/data/2.5/forecast?id="; //5 days/3 hour forecast data

    public static JSONObject getJsonObject(Context context, String cityId, String units) {

        HttpURLConnection urlConnection = null;
        BufferedReader reader = null;
        String jsonStr = null;
        StringBuffer buffer = null;
        JSONObject jsonObject = null;
        URL url = null;
        try {
            url = new URL(URL_5DAYS_CITY_ID + cityId +
                    "&units=" + units +
                    "&lang=" + LANG_UA +
                    "&APPID=" + WEATHER_KEY);

            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();

            InputStream inputStream = urlConnection.getInputStream();
            buffer = new StringBuffer();
            reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                buffer.append(line + "\n");
            }

            jsonObject = new JSONObject(buffer.toString());
            Log.e("json", buffer.toString());

            if (jsonObject.getInt("cod") != 200) {
                return null;
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return jsonObject;
    }


}
