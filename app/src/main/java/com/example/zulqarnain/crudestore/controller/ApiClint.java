package com.example.zulqarnain.crudestore.controller;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Zul Qarnain on 9/9/2017.
 */

public class ApiClint {
    private static String BASE_URL="http://10.0.3.2/trade/";
    private static Retrofit retrofit;

    public static Retrofit getApiClint(){
        if(retrofit==null){

            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).
                    addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
