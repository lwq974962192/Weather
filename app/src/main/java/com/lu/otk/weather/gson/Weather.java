package com.lu.otk.weather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * This project is created
 * by lwq
 * on 2018/2/16
 * at 10:35.
 */
public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
