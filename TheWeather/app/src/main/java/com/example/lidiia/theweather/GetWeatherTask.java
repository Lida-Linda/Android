package com.example.lidiia.theweather;

import android.os.AsyncTask;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class GetWeatherTask extends AsyncTask<Void, String, String> {


    private static final String CITY_ID = "710791"; // Cherkasy city id
    private static final String UNITS = "metric"; // for Celsius temperature
    private static final String LANG = "ua"; // ukraine language support
    private static final String WEATHER_KEY = "fb932f11d172ebff38ca77f59cd8e63b";
    private static final String URL_5DAYS_CITY_ID = "api.openweathermap.org/data/2.5/forecast?id="; //5 days/3 hour forecast data


    @Override
    protected String doInBackground(Void... voids) {
        HttpURLConnection urlConnection = null;
        BufferedReader reader = null;
        String jsonStr = null;

        try {
            URL url = new URL(URL_5DAYS_CITY_ID + CITY_ID +
                    "&units="+ UNITS +
                    "&lang=" + LANG +
                    "&APPID=" + WEATHER_KEY);
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();
            InputStream inputStream = urlConnection.getInputStream();
            StringBuffer buffer = new StringBuffer();
            reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                buffer.append(line + "\n");
            }
            jsonStr = buffer.toString();

        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return jsonStr;
    }
}
