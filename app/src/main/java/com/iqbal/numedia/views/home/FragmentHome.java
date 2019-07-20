package com.iqbal.numedia.views.home;

import android.content.Intent;
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

import com.iqbal.numedia.R;
import com.iqbal.numedia.adapters.VideoHightlightAdapter;
import com.iqbal.numedia.models.HightlightVideo;

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

        return myFragment;
    }
}
