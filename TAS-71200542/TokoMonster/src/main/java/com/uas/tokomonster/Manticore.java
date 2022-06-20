package com.uas.tokomonster;

public class Manticore extends Monster {
    public Manticore (String nama) {
        super(nama);
    }
    public String bersuara() {
        return "Roarroar";

    }
    public String bergerak(){
        return nama + "Terbang" + "...";
    }
}
