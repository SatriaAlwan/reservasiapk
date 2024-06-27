package com.example.reservasiapk.ui;

public class DataResto {
    int image_resto;
    String nama_resto;

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

    public String getNama_resto() {
        return nama_resto;
    }

    public void setNama_resto(String nama_resto) {
        this.nama_resto = nama_resto;
    }
}
