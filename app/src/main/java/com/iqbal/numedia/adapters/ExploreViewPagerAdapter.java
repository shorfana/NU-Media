package com.iqbal.numedia.adapters;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.iqbal.numedia.views.explore.Channel;
import com.iqbal.numedia.views.explore.FragmentTokoh;

public class ExploreViewPagerAdapter extends FragmentStatePagerAdapter {

    public ExploreViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new Channel();
            case 1: return new FragmentTokoh();
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
            case 0: return "Video";
            case 1: return "Tokoh - tokoh";
            default: return null;
        }
    }
}
