package com.iqbal.numedia.presenters;

import com.iqbal.numedia.models.TokohUlamaModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface TokohUlamaInterface {
    @GET("ir0v7")
        Call<TokohUlamaModel> getDataUlama();

}
