package com.lu.otk.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * This project is created
 * by lwq
 * on 2018/2/16
 * at 10:29.
 */
public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }

}
