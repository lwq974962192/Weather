package com.lu.otk.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * This project is created
 * by lwq
 * on 2018/2/16
 * at 9:25.
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
