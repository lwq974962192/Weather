package com.lu.otk.weather.util;

import android.os.Build;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * This project is created
 * by lwq
 * on 2018/2/11
 * at 9:52.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request
                .Builder()
                .url(address)
                .build();
        client.newCall(request).enqueue(callback);
    }
}
