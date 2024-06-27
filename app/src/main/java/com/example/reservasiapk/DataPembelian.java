package com.example.reservasiapk;

public class DataPembelian {
    int image_menu, harga, quantity;
    String nama_menu;

    public DataPembelian(int image_menu ,int harga, String nama_menu,  int quantity) {
        this.image_menu = image_menu;
        this.nama_menu = nama_menu;
        this.harga = harga;
        this.quantity = 0;
    }

    public DataPembelian(int image_menu, int harga, String nama_menu) {
        this(image_menu, harga, nama_menu, 0); // Panggil konstruktor dengan quantity dan set quantity ke 0
    }

    public int getImage_menu() {
        return image_menu;
    }

    public void setImage_menu(int image_menu) {
        this.image_menu = image_menu;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getNama_menu() {
        return nama_menu;
    }

    public void setNama_menu(String nama_menu) {
        this.nama_menu = nama_menu;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
