package com.iqbal.numedia.views.explore;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.iqbal.numedia.R;
import com.iqbal.numedia.adapters.ExploreViewPagerAdapter;

public class FragmentExplore extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View myFragment = inflater.inflate(R.layout.fragment_explore,container,false);
        ViewPager viewPager = (ViewPager)myFragment.findViewById(R.id.pager);
        ExploreViewPagerAdapter exploreViewPagerAdapter = new ExploreViewPagerAdapter(getFragmentManager());
        viewPager.setAdapter(exploreViewPagerAdapter);
        TabLayout tabLayout = (TabLayout) myFragment.findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);

        return myFragment;
    }





}
