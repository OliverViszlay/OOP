package com.company.vesmirnetelesa;

public class Kometa extends Vesmirne_teleso {

    public String nazov;



    public Kometa(String typ,String nazov) {
        super(typ);
        this.nazov = nazov;
    }

    public void spadnem_na_planetu(Planeta planeta, Kometa kometa){
        System.out.println("Kometa "+kometa.nazov+" spadla na planetu "+planeta.getNazov());
    }
}
