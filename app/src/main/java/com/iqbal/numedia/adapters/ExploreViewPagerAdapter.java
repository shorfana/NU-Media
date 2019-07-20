package com.iqbal.numedia.adapters;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.iqbal.numedia.views.explore.FragmentTokoh;
import com.iqbal.numedia.views.explore.FragmentVideo;

public class ExploreViewPagerAdapter extends FragmentStatePagerAdapter {

    public ExploreViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new FragmentTokoh();
            case 1: return new FragmentVideo();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return "Tokoh - tokoh";
            case 1: return "Video";
            default: return null;
        }
    }
}
