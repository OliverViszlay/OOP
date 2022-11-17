package com.company.zive_tvory;

import java.util.Date;

public abstract class ATvor implements Ibornable,Idieable{

    protected Date datum_narodenia;
    protected Date datum_umrtia;

    public abstract void hybsa(int direction_x, int direction_y, int direction_z);

    public Date getDatum_narodenia() {
        return datum_narodenia;
    }

    public Date getDatum_umrtia() {
        return datum_umrtia;
    }
}




