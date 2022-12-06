package com.company.Cicavce;

import com.company.Sustavy.Nervova.Nervova_sustava_cicavec;
import com.company.zive_tvory.stavcoce_diely.Stavovec;
import com.company.zive_tvory.stavcoce_diely.Sustava;
import com.company.zive_tvory.stavcoce_diely.Sustavy.*;
import com.company.zive_tvory.stavcoce_diely.Typ_sustavy;



public abstract class Cicavec extends Stavovec implements Cicable{

    private float temperature;

    public Cicavec(int pocet_stavcov){
        super(pocet_stavcov);
        temperature = 39;
    }


    protected void create_sustavy() {
        sustavy = new Sustava[8];

        sustavy[0] = new OBEHOVA(Typ_sustavy.OBEHOVA);
        sustavy[1] = new OPORNA(Typ_sustavy.OPORNA);
        sustavy[2] = new VYLUCOVACIA(Typ_sustavy.VYLUCOVACIA);
        sustavy[3] = new POHYBOVA(Typ_sustavy.POHYBOVA);
        sustavy[4] = new DYCHACIA(Typ_sustavy.DYCHACIA);
        sustavy[5] = new TRAVIACA(Typ_sustavy.TRAVIACA);
        sustavy[6] = new ROZMNOZOVACIA(Typ_sustavy.ROZMNOZOVACIA);
        sustavy[7] = new Nervova_sustava_cicavec(Typ_sustavy.NERVOVA);
    }


}
