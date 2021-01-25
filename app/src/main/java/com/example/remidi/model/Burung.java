package com.example.remidi.model;

public class Burung {

    private String jenis;
    private  String asal;
    private String deskripsi;
    private int drawableRes;

    public Burung(String jenis, String asal, String deskripsi, int drawableRes){
        this.jenis = jenis;
        this.asal = asal;
        this.deskripsi = deskripsi;
        this.drawableRes = drawableRes;
    }

    public String getJenis() {return jenis; }

    public void setJenis (String jenis) {this.jenis = jenis; }

    public String getAsal() {return asal; }

    public void setAsal (String asal) {this.asal = asal; }

    public String getDeskripsi() {return deskripsi; }

    public void setDeskripsi (String deskripsi) {this.deskripsi = deskripsi; }

    public int getDrawebleRes() {return drawableRes; }

    public void setDrawebleRes (int drawebleRes) {this.drawableRes = drawebleRes; }
}


