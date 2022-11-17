package com.company.zive_tvory;

import java.util.Date;

public class Fenix extends ATvor {
    private String druh;
    private Long vaha_vtaka;

    @Override
    public void hybsa(int direction_x, int direction_y, int direction_z) {
        System.out.println("horiiim a letiiim");
    }

    public Fenix(String druh, Long vaha_vtaka) {
        this.druh = druh;
        this.vaha_vtaka = vaha_vtaka;
    }

    public Fenix() {
    }

    @Override
    public void born(Date datum_narodenia) {

    }

    @Override
    public void die(Date datum_umrtia) {

    }
}
