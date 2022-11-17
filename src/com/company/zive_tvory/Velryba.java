package com.company.zive_tvory;

import java.util.Date;

public class Velryba extends ATvor{

    private String meno;

    private int vaha;

    @Override
    public void hybsa(int dirextion_x,int direction_y, int direction_z){
        System.out.println("stale plavaj stale plavaj");
    }

    public Velryba(String meno, int vaha) {
        this.meno = meno;
        this.vaha = vaha;
    }

    public Velryba() {
    }

    @Override
    public void born(Date datum_narodenia) {

    }

    @Override
    public void die(Date datum_umrtia) {

    }
}
