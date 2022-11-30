package com.company.zive_tvory.stavcoce_diely;

import com.company.zive_tvory.ATvor;


import java.util.Date;



public abstract class Stavovec extends ATvor {
    public Stavovec() {

    }

    @Override
    public void hybsa(int direction_x, int direction_y, int direction_z) {

    }

    @Override
    public void born(Date datum_narodenia) {

    }

    @Override
    public void die(Date datum_umrtia) {

    }

    protected Chrbtica chrbtica;
    protected Sustava[] sustavy;

    public Stavovec(int pocet_stavcov){
        chrbtica = new Chrbtica(pocet_stavcov);
        create_sustavy();
    }

    @Override
    protected void create_sustavy()
    {
        sustavy = new Sustava[8];

        sustavy[0] = new Sustava(Typ_sustavy.OBEHOVA);
        sustavy[1] = new Sustava(Typ_sustavy.OPORNA);
        sustavy[2] = new Sustava(Typ_sustavy.VYLUCOVACIA);
        sustavy[3] = new Sustava(Typ_sustavy.POHYBOVA);
        sustavy[4] = new Sustava(Typ_sustavy.DYCHACIA);
        sustavy[5] = new Sustava(Typ_sustavy.TRAVIACA);
        sustavy[6] = new Sustava(Typ_sustavy.ROZMNOZOVACIA);
        sustavy[7] = new Sustava(Typ_sustavy.NERVOVA);
    }

    public Sustava[] getSustavy() {
        return sustavy;
    }


}


