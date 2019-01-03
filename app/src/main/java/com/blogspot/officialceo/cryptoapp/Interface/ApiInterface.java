package com.blogspot.officialceo.cryptoapp.Interface;

import com.blogspot.officialceo.cryptoapp.Model.CoinModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("?Limit=50")
    Call<List<CoinModel>> getCoins();

}
