package com.rplbo.uasprojectpos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PointOfSales {
    private ArrayList<Barang> arrBarang;


    public PointOfSales() {
        arrBarang = new ArrayList<Barang>();
    }

    public void inputBarang(Barang barang) {
        arrBarang.add(barang);


    }

    public void tampilDaftarBarang() {
        System.out.println("Kode Barang\t\tNama Barang\t\t\t\tStok\tHarga");
        for (int i = 0; i < arrBarang.size(); i++) {
            System.out.print(arrBarang.get(i).getKode() + "\t\t\t" + arrBarang.get(i).getNama() + "\t" + arrBarang.get(i).getStok() + "\t\tRp " + arrBarang.get(i).getHarga());
            System.out.println("");
        }
    }

    public void checkout(HashMap<Barang, Integer> keranjang, long nominal) {
        int totalbayar = 0;
        int kembalian = 0;
        int a = 0;

        HashMap<Barang, Integer> keranjang1 = new HashMap<Barang, Integer>();
        for (Map.Entry<Barang, Integer> j : keranjang.entrySet()) {
            totalbayar = (int) (totalbayar + j.getKey().getHarga() * j.getValue());
            a = a + j.getKey().getStok() - j.getValue();
            for (int i = 0; i < arrBarang.size(); i++) {
                if (j.getKey().getNama().equals(arrBarang.get(i).getNama())) {
                    a = arrBarang.get(i).getStok() - j.getValue();
                    arrBarang.get(i).setStok(a);
                }
            }
        }
        System.out.println("---------Transaksi Sukses---------");
        System.out.println("Total tagihan : Rp " + totalbayar);
        System.out.println("Total Bayar: Rp " + nominal);
        kembalian = (int) (kembalian + nominal - totalbayar);
        System.out.println("Total kembalian: Rp " + kembalian);
    }

}