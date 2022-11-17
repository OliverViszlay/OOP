package com.company.zive_tvory.stavcoce_diely;

import com.company.zive_tvory.ATvor;

public class Chrbtica {

    public Stavec[] pole_stavcov;

    public int stavec_counter;

    public void add_stavec(Stavec tento_stavec){
        pole_stavcov[stavec_counter] = tento_stavec;
        stavec_counter++;
    }

    public Chrbtica(int stavec_counter) {
        this.stavec_counter = stavec_counter;
    }
}


