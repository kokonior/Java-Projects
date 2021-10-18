package com.kobwid;

public class Barang {
    private int id;
    private String nama;
    private int harga;
    private int stock;

    Barang() {

    }

    Barang(int id, String nama, int harga, int stock){
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public int getStock() {
        return stock;
    }
}
