package com.company.vesmirnetelesa;

import com.company.zive_tvory.ATvor;

public class ZEM extends Planeta{

    private ATvor[] poleTvorov;
    private int pocet_tvorov;
    public ZEM(String nazov, double vaha, double priemer) {
        super(nazov, vaha, priemer);
        poleTvorov = new ATvor[999999];
        pocet_tvorov = 0;
    }

    public ZEM() {

    }

    public ZEM(String nazov, double vaha, double priemer, double gravitacia) {
        super(nazov, vaha, priemer, gravitacia);
    }

    public void add_tvor(ATvor tento_tvor){
        poleTvorov[pocet_tvorov] = tento_tvor;
        pocet_tvorov++;
    }

    public ATvor[] getPoleTvorov() {
        return poleTvorov;
    }
}


