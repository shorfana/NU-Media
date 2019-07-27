package com.iqbal.numedia.API;

import com.iqbal.numedia.models.TokohModels;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APITokohUlamaService {

    //read
    @GET("zh4ex")
    Call<TokohModels> getTokohUlama();

}
