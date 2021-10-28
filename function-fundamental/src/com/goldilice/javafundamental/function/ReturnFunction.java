package com.dicoding.javafundamental.function;

public class ReturnFunction {
    public static void main(String[] args) {
        double p = 7;
        double l = 6.5;
        double hasil = hasilLuas(p, l); // memanggil fungsi
        System.out.println("Hasilnya adalah " + hasil);
    }

    // fungsi dengan nilai balik
    public static double hasilLuas(double panjang, double lebar) {
        double luas = panjang * lebar;
        return luas;
    }
}
