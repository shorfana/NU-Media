
package com.iqbal.numedia.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;
import java.util.Map;

public class Item implements Parcelable {

    private String id_ulama;
    private String nama_ulama;
    private String tanggal_lahir;
    private String tempat_lahir;
    private String link_gambar;
    private String desk;



    protected Item(Parcel in){
        id_ulama = in.readString();
        nama_ulama = in.readString();
        tanggal_lahir = in.readString();
        tempat_lahir = in.readString();
        link_gambar = in.readString();
    }

    public Item(){

    }

    public String getDesk() {
        return desk;
    }

    public void setDesk(String desk) {
        this.desk = desk;
    }

    public String getLink_gambar() {
        return link_gambar;
    }

    public void setLink_gambar(String link_gambar) {
        this.link_gambar = link_gambar;
    }

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getId_ulama() {
        return id_ulama;
    }

    public void setId_ulama(String id_ulama) {
        this.id_ulama = id_ulama;
    }

    public String getNama_ulama() {
        return nama_ulama;
    }

    public void setNama_ulama(String nama_ulama) {
        this.nama_ulama = nama_ulama;
    }

    public String getTanggal_lahir() {
        return tanggal_lahir;
    }

    public void setTanggal_lahir(String tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public String getTempat_lahir() {
        return tempat_lahir;
    }

    public void setTempat_lahir(String tempat_lahir) {
        this.tempat_lahir = tempat_lahir;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public static final Creator<Item> CREATOR = new Creator<Item>() {
        @Override
        public Item createFromParcel(Parcel source) {
            return new Item(source);
        }

        @Override
        public Item[] newArray(int size) {
            return new Item[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(this.id_ulama);
        parcel.writeString(this.nama_ulama);
        parcel.writeString(this.tanggal_lahir);
        parcel.writeString(this.tempat_lahir);
        parcel.writeString(this.link_gambar);

    }
}
