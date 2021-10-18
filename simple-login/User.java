package com.kobwid;

public class User {
    private String nama;
    private String nomorPelanggan;
    private int pin;
    private int saldo;

    User() {

    }
    User(String nama, String nomorPelanggan, int pin, int saldo) {
        this.nama = nama;
        this.nomorPelanggan = nomorPelanggan;
        this.pin = pin;
        this.saldo = saldo;
    }

    public String getNama() {
        return nama;
    }

    public String getNomorPelanggan() {
        return nomorPelanggan;
    }

    public int getPin() {
        return pin;
    }

    public int getSaldo() {
        return saldo;
    }

    public boolean putSaldo(int harga){
        int tempSaldo = getSaldo();
        this.saldo = getSaldo() - harga;
        if (this.saldo < 0) {
            this.saldo = tempSaldo;
            return false;
        }
        return true;
    }

    public void displayUserDetail() {
        System.out.println("Selamat Datang, " + getNama());
        System.out.println("Nomor Pelanggan = " + getNomorPelanggan());
        System.out.println("Sisa Saldo = " + getSaldo());
    }
}
