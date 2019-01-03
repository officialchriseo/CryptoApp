package com.blogspot.officialceo.cryptoapp.Client;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static  String BASE_URL = "https://api.coinmarketcap.com/v1/ticker/";
    private static Retrofit retrofit;


    public static  Retrofit getClient(){

        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;

    }

}
