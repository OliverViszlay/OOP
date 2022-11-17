package com.company.zive_tvory.Vtaky;


import com.company.zive_tvory.stavcoce_diely.Stavovec;

import java.util.Date;

public abstract class Vtak extends Stavovec {
    private String druh;
    private Long vaha_vtaka;

    @Override
    public void hybsa(int direction_x, int direction_y, int direction_z) {
        System.out.println("Letiiiim");
    }

    public Vtak(String druh, Long vaha_vtaka) {
        super();
        this.druh = druh;
        this.vaha_vtaka = vaha_vtaka;
    }

    public Vtak(int pocet_stavcov) {
        super(pocet_stavcov);
    }

    @Override
    public void born(Date datum_narodenia) {

    }

    @Override
    public void die(Date datum_umrtia) {

    }
}


