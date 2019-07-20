package com.iqbal.numedia.models;

import java.util.HashMap;
import java.util.Map;


public class TokohUlamaModel {
    private String id_ulama;
    private String nama_ulama;
    private String tanggal_lahir;
    private String tempat_lahir;
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


    public TokohUlamaModel() {
    }

    public TokohUlamaModel(String id_ulama, String nama_ulama, String tanggal_lahir, String tempat_lahir, Map<String, Object> additionalProperties) {
        this.id_ulama = id_ulama;
        this.nama_ulama = nama_ulama;
        this.tanggal_lahir = tanggal_lahir;
        this.tempat_lahir = tempat_lahir;
        this.additionalProperties = additionalProperties;
    }
}
