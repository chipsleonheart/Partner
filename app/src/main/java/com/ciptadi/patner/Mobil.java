package com.ciptadi.patner;

/**
 * Created by cipta on 10/29/2016.
 */
public class Mobil {
    private String stnk;
    private String jenis;
    private String harga;
    private String url_image;

    public Mobil(String stnk, String jenis, String harga, String url_image) {
        this.stnk = stnk;
        this.jenis = jenis;
        this.harga = harga;
        this.url_image = url_image;
    }

    public String getStnk() {
        return stnk;
    }

    public void setStnk(String stnk) {
        this.stnk = stnk;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getUrl_image() {
        return url_image;
    }

    public void setUrl_image(String url_image) {
        this.url_image = url_image;
    }
}