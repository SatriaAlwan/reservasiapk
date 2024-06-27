package com.example.reservasiapk.ui;

public class DataResto {
    int image_resto, image_menu;
    String nama_resto, alamat_resto, harga;

    public DataResto(int image_resto, String nama_resto, int image_menu, String Harga, String alamat_resto){
        this.alamat_resto = alamat_resto;
        this.harga = harga;
        this.image_menu = image_menu;
    }

    public DataResto(int image_resto, String nama_resto) {
        this.image_resto = image_resto;
        this.nama_resto = nama_resto;
    }

    public int getImage_resto() {
        return image_resto;
    }

    public void setImage_resto(int image_resto) {
        this.image_resto = image_resto;
    }

    public int getImage_menu() {
        return image_menu;
    }

    public void setImage_menu(int image_menu) {
        this.image_menu = image_menu;
    }

    public String getNama_resto() {
        return nama_resto;
    }

    public void setNama_resto(String nama_resto) {
        this.nama_resto = nama_resto;
    }

    public String getAlamat_resto() {
        return alamat_resto;
    }

    public void setAlamat_resto(String alamat_resto) {
        this.alamat_resto = alamat_resto;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
}
