package com.example.lidiia.theweather;


import android.app.Activity;
import android.content.SharedPreferences;

public class CityUnitsPreference {

    SharedPreferences preferences;

    public CityUnitsPreference(Activity activity) {
        preferences = activity.getPreferences(Activity.MODE_PRIVATE);
    }

//    Якщо користувач ще не обрав місто, повертаються Черкаси за замовчуванням
    String getCity() {
        return preferences.getString("city_id", "710791");
    }

    void setCity(String cityId) {
        preferences.edit().putString("city_id", cityId).apply();
    }

//    За замовчуванням - градуси Цельсію
    String getUnits() {
        return preferences.getString("units", "metric");
    }

    void setUnits(String units) {
        preferences.edit().putString("units", units).apply();
    }
}
