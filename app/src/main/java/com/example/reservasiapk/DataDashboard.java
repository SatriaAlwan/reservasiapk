package com.example.reservasiapk;

public class DataDashboard {
    String nama_resto, tanggal, jumlah;

    public DataDashboard(String nama_resto, String tanggal, String Jumlah) {
        this.nama_resto = nama_resto;
        this.tanggal = tanggal;
        this.jumlah = jumlah;
    }

    public String getNama_resto() {
        return nama_resto;
    }

    public void setNama_resto(String nama_resto) {
        this.nama_resto = nama_resto;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }
}
