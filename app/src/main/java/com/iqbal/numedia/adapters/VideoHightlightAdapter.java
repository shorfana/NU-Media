package com.iqbal.numedia.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import com.iqbal.numedia.R;
import com.iqbal.numedia.models.HightlightVideo;

import java.util.List;

public class VideoHightlightAdapter extends RecyclerView.Adapter<VideoHightlightAdapter.VideoViewHolder> {
    List<HightlightVideo> youtubeVideoList;
    public VideoHightlightAdapter(){}


    @Override
    public VideoViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_highlight,viewGroup,false);
        return new VideoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(VideoHightlightAdapter.VideoViewHolder videoHolder, int i) {
        videoHolder.videoWeb.loadData(youtubeVideoList.get(i).getVideoUrl(),"text/html","utf-8");
    }

    @Override
    public int getItemCount() {
        return youtubeVideoList.size();
    }

    public VideoHightlightAdapter(List<HightlightVideo> youtubeVideoList) {
        this.youtubeVideoList = youtubeVideoList;
    }

    public class VideoViewHolder extends RecyclerView.ViewHolder{
        WebView videoWeb;
        public VideoViewHolder(View itemView){
            super(itemView);
            videoWeb = (WebView)itemView.findViewById(R.id.v_hightlight);
            videoWeb.getSettings().setJavaScriptEnabled(true);
            videoWeb.setWebChromeClient(new WebChromeClient());
        }
    }



}
