package com.company.vesmirnetelesa;

public class Galaxia {


    public Kometa kometa;

    private Slnecna_sustava[] planetarna_sustava = new Slnecna_sustava[100];

    private int pocet_objektov = 0;
    public void addSustava(Slnecna_sustava tato_sustava){
        planetarna_sustava[pocet_objektov] = new Slnecna_sustava();
        pocet_objektov ++;

    }


    public void kometa_leti(){

        Planeta vesmirne_teleso = (Planeta) this.planetarna_sustava[0].getObezna_draha()[0];
        this.kometa.spadnem_na_planetu(vesmirne_teleso, this.kometa); //domáca uloha


    }

    public Kometa getKometa() {
        return kometa;
    }

    public void setKometa(Kometa kometa) {
        this.kometa = kometa;
    }
}
