package com.iqbal.numedia.views.explore;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.iqbal.numedia.API.APITokohUlamaEndPoint;
import com.iqbal.numedia.API.APITokohUlamaService;
import com.iqbal.numedia.R;
import com.iqbal.numedia.adapters.TokohUlamaAdapter;
import com.iqbal.numedia.models.Item;
import com.iqbal.numedia.models.TokohModels;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FragmentTokoh extends Fragment {


    private TokohUlamaAdapter viewAdapter;
    private List<Item> mItems = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View myFragment = inflater.inflate(R.layout.fragment_tokoh,container,false);
        final RecyclerView recyclerView = myFragment.findViewById(R.id.rUlamaTokoh);
        viewAdapter = new TokohUlamaAdapter(getContext(), mItems);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(viewAdapter);
        APITokohUlamaService api = APITokohUlamaEndPoint.getClient().create(APITokohUlamaService.class);
        Call<TokohModels> call = api.getTokohUlama();
        call.enqueue(new Callback<TokohModels>() {
            @Override
            public void onResponse(Call<TokohModels> call, Response<TokohModels> response) {
                mItems = response.body().getItem();
                viewAdapter = new TokohUlamaAdapter(getContext(), mItems);
                recyclerView.setAdapter(viewAdapter);
            }

            @Override
            public void onFailure(Call<TokohModels> call, Throwable t) {
                Toast.makeText(getContext(), "Maaf Koneksi Internet Anda sedang Gangguan ", Toast.LENGTH_SHORT).show();

            }
        });


        return myFragment;

    }


}
