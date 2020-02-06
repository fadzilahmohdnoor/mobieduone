package com.something.mobieduone.retrofit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    private static final RetrofitInstance ourInstance = new RetrofitInstance();

    public static RetrofitInstance getInstance() {
        return ourInstance;
    }

    private RetrofitInstance() {

    }

    public RetrofitService getRetrofit() {

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://mobieduone.000webhostapp.com/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        return retrofit.create(RetrofitService.class);
    }
}
