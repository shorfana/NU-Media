package com.iqbal.numedia.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.iqbal.numedia.R;
import com.iqbal.numedia.models.TokohUlamaModel;

import java.util.List;

public class TokohUlamaAdapter extends RecyclerView.Adapter<TokohUlamaViewHolder> {

    private List<TokohUlamaModel> list;
    private Context context;

    public TokohUlamaAdapter(List<TokohUlamaModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public TokohUlamaViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_tokohulama,viewGroup,false);


        return new TokohUlamaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TokohUlamaViewHolder tokohUlamaViewHolder, int i) {
        TokohUlamaModel currentData = list.get(i);
        tokohUlamaViewHolder.Name.setText(currentData.getNama_ulama());
        tokohUlamaViewHolder.Date.setText(currentData.getTanggal_lahir());
        tokohUlamaViewHolder.Place.setText(currentData.getTempat_lahir());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
