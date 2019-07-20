package com.iqbal.numedia.models;

public class HightlightVideo {
    String videoUrl;
    public HightlightVideo(){}
    public HightlightVideo(String videoUrl){
        this.videoUrl = videoUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}
