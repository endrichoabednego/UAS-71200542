package com.uas.tokomonster;

public class Cerberus extends Monster{
    public Cerberus (String nama){
        super(nama);

    }
    public String  bersuara() {
        return "Rawrrawr";
    }
    public String bergerak(){
        return nama + "Berlari" + "....";
    }
}
