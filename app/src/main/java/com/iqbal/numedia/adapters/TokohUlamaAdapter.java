package com.iqbal.numedia.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.iqbal.numedia.R;
import com.iqbal.numedia.models.Item;
import com.iqbal.numedia.models.TokohModels;
import com.iqbal.numedia.views.explore.DetailTokoh;

import java.util.List;

public class TokohUlamaAdapter extends RecyclerView.Adapter<TokohUlamaAdapter.MyHolder> {

    List<Item> mList;
    Context ctx;

    public TokohUlamaAdapter(Context ctx,List<Item> mList) {
        this.mList = mList;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View layout = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_tokohulama,viewGroup, false);
        final MyHolder holder = new MyHolder(layout);

        holder.btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ctx,DetailTokoh.class);
                i.putExtra("nama_ulama",mList.get(holder.getAdapterPosition()).getNama_ulama());
                i.putExtra("tanggal_ulama",mList.get(holder.getAdapterPosition()).getTanggal_lahir());
                i.putExtra("tempat_ulama",mList.get(holder.getAdapterPosition()).getTempat_lahir());
                i.putExtra("link_ulama",mList.get(holder.getAdapterPosition()).getLink_gambar());
                i.putExtra("desk",mList.get(holder.getAdapterPosition()).getDesk());

                ctx.startActivity(i);

            }
        });

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {
        Item tokohList = mList.get(i);
        myHolder.nama_ulama.setText(tokohList.getNama_ulama());
        myHolder.tanggal_lahir.setText(tokohList.getTanggal_lahir());
        myHolder.tempat_lahir.setText(tokohList.getTempat_lahir());
        Glide.with(ctx).load(tokohList.getLink_gambar()).override(350,550).into(myHolder.link_gambar);





    }

    @Override
    public int getItemCount() {
        return mList.size();
    }



    public class MyHolder extends RecyclerView.ViewHolder {
        TextView nama_ulama, tanggal_lahir, tempat_lahir,desk;
        ImageView link_gambar;
        Button btnDetail;
        public MyHolder(View v)
        {
            super(v);

            nama_ulama  = (TextView) v.findViewById(R.id.ulamaName);
            tanggal_lahir = (TextView) v.findViewById(R.id.ulamaDate);
            tempat_lahir = (TextView) v.findViewById(R.id.ulamaPlace);
            link_gambar = (ImageView) v.findViewById(R.id.link_gambar);
            btnDetail = (Button) v.findViewById(R.id.btn_detail);

        }

    }
}
