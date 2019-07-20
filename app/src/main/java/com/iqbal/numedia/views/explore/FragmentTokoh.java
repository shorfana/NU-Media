package com.iqbal.numedia.views.explore;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.iqbal.numedia.R;
import com.iqbal.numedia.adapters.TokohUlamaAdapter;
import com.iqbal.numedia.models.TokohUlamaModel;
import com.iqbal.numedia.presenters.TokohUlamaInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FragmentTokoh extends Fragment {
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View myFragment = inflater.inflate(R.layout.fragment_tokoh,container,false);
        recyclerView = myFragment.findViewById(R.id.recycleViewTokoh);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.myjson.com/bins/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        TokohUlamaInterface tokohUlamaInterface = retrofit.create(TokohUlamaInterface.class);
        Call<TokohUlamaModel> listCall = tokohUlamaInterface.getDataUlama();
        listCall.enqueue(new Callback<TokohUlamaModel>() {
            @Override
            public void onResponse(Call<TokohUlamaModel> call, Response<TokohUlamaModel> response) {
                ShowIt(response.body());
            }

            @Override
            public void onFailure(Call<TokohUlamaModel> call, Throwable t) {

            }
        });





        return myFragment;

    }


    private void ShowIt(TokohUlamaModel response){
        TokohUlamaAdapter tokohUlamaAdapter = new TokohUlamaAdapter((List<TokohUlamaModel>) response,getContext());
        recyclerView.setAdapter(tokohUlamaAdapter);
    }
}
