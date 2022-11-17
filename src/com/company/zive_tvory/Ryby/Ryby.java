package com.company.zive_tvory.Ryby;

import com.company.zive_tvory.ATvor;
import com.company.zive_tvory.stavcoce_diely.Stavovec;

import java.util.Date;

public abstract class Ryby extends Stavovec {

    private String meno_ryby;
    private int dlzka_ryby;

    public Ryby(int stavec_counter) {
        super(stavec_counter);
    }

    @Override
    public void hybsa(int direction_x, int direction_y, int direction_z) {
        System.out.println("Plavam ako ryba");
    }

    public Ryby(String meno_ryby, int dlzka_ryby) {
        this.meno_ryby = meno_ryby;
        this.dlzka_ryby = dlzka_ryby;
    }

    public Ryby() {
    }

    @Override
    public void born(Date datum_narodenia) {

    }

    @Override
    public void die(Date datum_umrtia) {

    }



}
