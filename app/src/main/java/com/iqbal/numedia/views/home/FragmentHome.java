package com.iqbal.numedia.views.home;

import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.iqbal.numedia.R;
import com.iqbal.numedia.adapters.VideoHightlightAdapter;
import com.iqbal.numedia.models.HightlightVideo;

import java.io.IOException;
import java.util.List;
import java.util.Vector;

public class FragmentHome extends Fragment {
    RecyclerView recyclerView;

    Vector<HightlightVideo>youtubeVideos = new Vector<HightlightVideo>();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View myFragment = inflater.inflate(R.layout.fragment_home,container,false);
        ScrollView scrollView = (ScrollView)myFragment.findViewById(R.id.scrollbar_home);
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setHorizontalScrollBarEnabled(false);
        TextView txt_location = (TextView)myFragment.findViewById(R.id.lokasi_anda);
        recyclerView = (RecyclerView)myFragment.findViewById(R.id.rv_highlight);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayout.HORIZONTAL,false));
        youtubeVideos.add(new HightlightVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ajii9rd1Af0\" frameborder=\"0\" allow=\" encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youtubeVideos.add(new HightlightVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/YPHr7ZX5EGY\" frameborder=\"0\" allow=\" encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youtubeVideos.add(new HightlightVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/zkBAFwaDfjc\" frameborder=\"0\" allow=\" encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youtubeVideos.add(new HightlightVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/aYpti09nVoI\" frameborder=\"0\" allowfullscreen></iframe>"));
        VideoHightlightAdapter hightlightAdapter = new VideoHightlightAdapter(youtubeVideos);
        recyclerView.setAdapter(hightlightAdapter);

        CardView nuOnline = (CardView) myFragment.findViewById(R.id.Cv_NUonline);

        nuOnline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(FragmentHome.this.getActivity(), NuOnlineActivity.class);
                startActivity(i);
            }
        });

        CardView nuCare = (CardView) myFragment.findViewById(R.id.nuCare);
        nuCare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(FragmentHome.this.getActivity(), NuCareActivity.class);
                startActivity(i);
            }
        });
        CardView nuTv = (CardView) myFragment.findViewById(R.id.nuTv);
        nuTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(FragmentHome.this.getActivity(), NuTvActivity.class);
                startActivity(i);
            }
        });


        try {
                    Geocoder geocoder = new Geocoder(getContext());
                    List<Address> addresses = geocoder.getFromLocation(07.5731161,-6.9034443,1);
                    String kota = addresses.get(0).getAddressLine(0);
                    String city = addresses.get(0).getLocality();
                    txt_location.setText(kota);
                }catch (IOException e){
                    e.printStackTrace();
                }

//        private void loc_function(Location location){
//            try {
//                Geocoder geocoder = new Geocoder(getContext());
//                List<Address> addresses = null;
//                String kota = addresses.get(0).getCountryName();
//                txt_location.setText(kota);
//
//            }catch (IOException e){
//                e.printStackTrace();
//            }
//        }

        return myFragment;
    }



}
