package com.lu.otk.weather.gson;

/**
 * This project is created
 * by lwq
 * on 2018/2/16
 * at 9:24.
 */
public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
