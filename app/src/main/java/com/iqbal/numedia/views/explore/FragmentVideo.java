package com.iqbal.numedia.views.explore;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.iqbal.numedia.R;

public class FragmentVideo extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View myFragment = inflater.inflate(R.layout.fragment_video,container,false);
            Channel myf = new Channel();
        final android.support.v4.app.FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.mainFrame,myf);
        transaction.addToBackStack(null);
        transaction.commit();
        return myFragment;
    }
}
