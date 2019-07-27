package com.iqbal.numedia.presenters;

import android.view.View;

public class CLickListenerTokoh implements View.OnClickListener {


    public int position;
    private OnItemClickCallback onItemClickCallback;

    public CLickListenerTokoh(int position, OnItemClickCallback onItemClickCallback) {
        this.position = position;
        this.onItemClickCallback = onItemClickCallback;
    }

    @Override
    public void onClick(View view) {
        onItemClickCallback.onItemClicked(view, position);

    }

    public interface OnItemClickCallback {
        void onItemClicked(View view, int position);
    }
}
