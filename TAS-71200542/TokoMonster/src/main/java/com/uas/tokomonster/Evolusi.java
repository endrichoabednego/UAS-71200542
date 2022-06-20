package com.uas.tokomonster;

public class Evolusi extends Monster {
    Monster monster1;
    Monster monster2;

    public Evolusi(Monster monster1, Monster monster2) {
        super(monster1.getNama() + " " + monster2.getNama());
        this.monster1 = monster1;
        this.monster2 = monster2;
    }

    public String bersuara() {
        String nama = "";
        String[] suaram1 = monster1.bersuara().split("");
        String[] suaram2 = monster2.bersuara().split("");
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 1) {
                nama += suaram1[i];
            } else {
                nama += suaram2[i];
            }
        }
        return nama;
    }
    @Override
    public String bergerak() {
        return monster1.getNama() + " " + monster2.bergerak() + "...";
    }
}
