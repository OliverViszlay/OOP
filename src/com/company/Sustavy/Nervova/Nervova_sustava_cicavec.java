package com.company.Sustavy.Nervova;

import com.company.zive_tvory.stavcoce_diely.Typ_sustavy;

public class Nervova_sustava_cicavec extends Nervova_sustava_default{
    private CNS CentralNervSustava;
    private PNS PerifernaNervSustava;

    public Nervova_sustava_cicavec(Typ_sustavy typSustavy){
        super(typSustavy);
        CentralNervSustava = new CNS();
        PerifernaNervSustava = new PNS();
    }

}
