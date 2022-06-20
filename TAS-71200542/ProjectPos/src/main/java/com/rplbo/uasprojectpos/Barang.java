package com.rplbo.uasprojectpos;

import java.util.Locale;

public class Barang {
    private String kode;
    private int stok;
    private static int nextNum = 1;
    private String nama;
    private long harga;

    public Barang(String nama, int stok, long harga) {
        this.nama = nama;;
        this.stok = stok;
        this.harga = harga;
        String[] name = nama.split(" ");

        for (int i = 0 ; i < name.length; i++) {
            String namaBarang = name[i];
            if (namaBarang.equalsIgnoreCase("keyboard")) {
                this.kode = "KB00" + nextNum++;
            } else if (namaBarang.equalsIgnoreCase("headset")) {
                this.kode = "HS00" + nextNum++;
            } else if (namaBarang.equalsIgnoreCase("mouse")) {
                this.kode = "MS00" + nextNum++;
            }

        }
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getKode() {
        return kode;
    }

    public int getStok() {
        return stok;
    }

    public String getNama() {
        return nama;
    }

    public long getHarga() {
        return harga;
    }
}