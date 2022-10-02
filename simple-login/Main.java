package com.kobwid;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static UserDummy userDummy = new UserDummy();
    private static BarangDummy barangDummy = new BarangDummy();
    private static User userLogin;
    private static String nomorPelanggan;
    public static void main(String[] args) {

        System.out.print("Masukan Nomor Pelanggan : ");
        nomorPelanggan = sc.nextLine();
        userLogin = userDummy.getUserByNopelanggan(nomorPelanggan); // alamat user yg dipilih
        if (userLogin.getNomorPelanggan() == null) {
            System.out.println("Nomor Pelanggan tidak ditemukan");
            return;
        }
        System.out.println("ini teh scanner barang");
        System.out.println("================");
        userLogin.displayUserDetail();
        System.out.println("================");
        System.out.println("== List Barang ==");
        barangDummy.displayListBarang();
        System.out.println("================");
        System.out.print("Masukan Orderan : ");
        String orderan = sc.nextLine();
        if (transaction(orderan)){
            System.out.println("Berhasil membeli barang");
            System.out.println("Sisa saldo : " + userLogin.getSaldo());
        } else {
            System.out.println("Saldo tidak cukup");
            System.out.println("Sisa saldo : " + userLogin.getSaldo());
        }
    }

    private static boolean transaction(String orderan){
        String[] order = orderan.split(" ");
        for (String o : order){
            Barang barangTemp = barangDummy.getBarangById(o);
            if (barangTemp.getNama() == null){
                return false;
            }
            if (!userLogin.putSaldo(barangTemp.getHarga())){
                return false;
            }
        }
        return true;
    }
}
