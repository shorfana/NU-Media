package com.iqbal.numedia.views.home;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
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
import android.widget.Toast;

import com.iqbal.numedia.R;
import com.iqbal.numedia.adapters.VideoHightlightAdapter;
import com.iqbal.numedia.models.HightlightVideo;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Vector;

public class FragmentHome extends Fragment {
    RecyclerView recyclerView;
    TextView city_location;
    Double latitude = 0.0;
    Double longitude = 0.0;
    static String TAG = "FragmentHome";
    Location gps_loc = null, network_loc = null, final_loc = null;

    Vector<HightlightVideo>youtubeVideos = new Vector<HightlightVideo>();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View myFragment = inflater.inflate(R.layout.fragment_home,container,false);

//        city_location = myFragment.findViewById(R.id.lokasi_anda);
//        LocationManager locationManager = (LocationManager) getActivity().getSystemService(Context.LOCATION_SERVICE);
//        if (ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED &&
//            ActivityCompat.checkSelfPermission(getContext(),Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED &&
//            ActivityCompat.checkSelfPermission(getContext(),Manifest.permission.ACCESS_NETWORK_STATE) != PackageManager.PERMISSION_GRANTED){
//
//            Toast.makeText(getContext(), "Not Granted",Toast.LENGTH_SHORT).show();
//        }else{
//            Toast.makeText(getContext(),"Granted",Toast.LENGTH_SHORT).show();
//        }
//
//        try {
//            gps_loc = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
//            network_loc = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//        if (gps_loc != null){
//                final_loc = gps_loc;
//                latitude = final_loc.getLatitude();
//                longitude = final_loc.getLongitude();
//        }else if(network_loc != null){
//                final_loc = network_loc;
//                latitude = final_loc.getLatitude();
//                longitude = final_loc.getLongitude();
//        }else{
//            latitude = 0.0;
//            longitude = 0.0;
//        }
//
//        try {
//            Geocoder geocoder = new Geocoder(getContext().getApplicationContext(), Locale.getDefault());
//            List<Address> addresses = geocoder.getFromLocation(latitude,longitude,1);
//            if (addresses != null && addresses.size()>0){
//                    String city = addresses.get(0).getLocality();
//                    city_location.setText(city);
//            }
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//        city_location.setText("kota");


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

        CardView nuGames = (CardView) myFragment.findViewById(R.id.nuGames);
        nuGames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(FragmentHome.this.getActivity(), NuGamesActivity.class);
                startActivity(i);
            }
        });


        return myFragment;
    }



}
