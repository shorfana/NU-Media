package com.iqbal.numedia.views.explore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.iqbal.numedia.R;
import com.iqbal.numedia.models.Item;

public class DetailTokoh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tokoh);


        String nama_ulama = getIntent().getExtras().getString("nama_ulama");
        String tanggal_ulama = getIntent().getExtras().getString("tanggal_ulama");
        String tempat_ulama = getIntent().getExtras().getString("tempat_ulama");
        String link_gambar = getIntent().getExtras().getString("link_ulama");
        String desk_ulama = getIntent().getExtras().getString("desk");



        ImageView gambar = (ImageView)findViewById(R.id.item_poto_tokoh);
        TextView  nama   = (TextView)findViewById(R.id.namaTokoh);
        TextView  tempat = (TextView)findViewById(R.id.tempatTokoh);
        TextView  tanggal = (TextView)findViewById(R.id.tangal_lahir);
        TextView  desk      = (TextView)findViewById(R.id.content_detail);

        nama.setText(nama_ulama);
        tempat.setText(tempat_ulama);
        tanggal.setText(tanggal_ulama);
        desk.setText(desk_ulama);
        Glide.with(this).load(link_gambar).override(120,120).into(gambar);
    }
}
