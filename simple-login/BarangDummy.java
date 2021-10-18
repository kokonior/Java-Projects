package com.kobwid;

public class BarangDummy {
    private Barang[] barangs;

    BarangDummy() {
        this.barangs = new Barang[]{
                new Barang(1, "Barang 1", 10000, 5),
                new Barang(2, "Barang 2", 20000, 5),
                new Barang(3, "Barang 3", 30000, 5),
        };
    }

    public Barang getBarangById(String no){
        int noBarang = Integer.parseInt(no);
        Barang barang = new Barang();
        for (Barang b : barangs){
            if (noBarang == b.getId()){
                barang = b;
                break;
            }
        }
        return barang;
    }

    public void displayListBarang() {
        for (Barang b : barangs){
            System.out.println(b.getId() + ". " + b.getNama());
            System.out.println("Harga : " + b.getHarga());
        }
    }
}
