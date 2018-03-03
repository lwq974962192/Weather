package com.lu.otk.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * This project is created
 * by lwq
 * on 2018/2/16
 * at 9:17.
 */
public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
