package com.uas.tokomonster;

public abstract class Monster implements Monsterinterface{
    String nama;

    public Monster(String nama) {
        this.nama = nama;
    }

    public abstract String bersuara();

    public void getInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Suara: " + bersuara());
        System.out.println("Gerak: " +  bergerak() );
    }

    public String getNama() {

        return nama;
    }
}

