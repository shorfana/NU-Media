package com.iqbal.numedia.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.iqbal.numedia.R;

public class TokohUlamaViewHolder extends RecyclerView.ViewHolder {

    TextView Name,Date,Place;


    public TokohUlamaViewHolder(@NonNull View itemView) {
        super(itemView);

        Name = itemView.findViewById(R.id.ulamaName);
        Date = itemView.findViewById(R.id.ulamaDate);
        Place = itemView.findViewById(R.id.ulamaPlace);

    }
}
