package com.example.lidiia.theweather;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class WeatherRVAdapter extends RecyclerView.Adapter<WeatherRVAdapter.WeatherViewHolder> {

    List<ParseWeather> parseWeatherList = new ArrayList<>();

    public WeatherRVAdapter(List<ParseWeather> parseWeatherList) {
        this.parseWeatherList = parseWeatherList;
    }

    @Override
    public WeatherViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new WeatherViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_holder,parent,false));
    }

    @Override
    public void onBindViewHolder(WeatherViewHolder holder, int position) {
        holder.bindWeather(parseWeatherList.get(position));
    }

    @Override
    public int getItemCount() {
        return parseWeatherList.size();
    }

    public class WeatherViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView tvTemp;
        TextView tvDtTxt;
        TextView tvWeatherMain;

        public WeatherViewHolder(View itemView) {
            super(itemView);

            tvTemp = (TextView)itemView.findViewById(R.id.tv_temp_list);
            tvDtTxt = (TextView)itemView.findViewById(R.id.tv_dt_txt_list);
            tvWeatherMain = (TextView)itemView.findViewById(R.id.tv_weather_main_list);
        }

        @Override
        public void onClick(View view) {
        }

        public void bindWeather(ParseWeather parseWeather) {
            tvTemp.setText(parseWeather.getTemp() + "°");
            tvDtTxt.setText(parseWeather.getDtTxt());
            tvWeatherMain.setText(parseWeather.getWeatherMain());
        }
    }


}

