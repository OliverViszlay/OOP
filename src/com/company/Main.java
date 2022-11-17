package com.company;

import com.company.vesmirnetelesa.*;
import com.company.space.Vesmir;
import com.company.zive_tvory.*;
import com.company.zive_tvory.Ryby.Kapor;
import com.company.zive_tvory.Ryby.zralok;
import com.company.zive_tvory.Vtaky.Orol;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Vesmir mojprvyvesmir = new Vesmir(); // objekt triedy vesmir = mojprvyvesmir
        //vesmir = trieda

        Vesmir mojaprvaHmlovina = new Vesmir();

        Planeta mojaplaneta = new Planeta();

        Hviezda mojeSlnko = new Hviezda();

        Galaxia mliecna_cesta = new Galaxia();

        Slnecna_sustava slnkova_susatava = new Slnecna_sustava();

        ZEM maticka_zem = new ZEM("modra planeta", 500000,45000);

        Kapor vianocnykapor = new Kapor(50);

        Date dNow = new Date();
        vianocnykapor.born(dNow);

        maticka_zem.add_tvor(vianocnykapor);
        vianocnykapor.hybsa(10,10,0);
        vianocnykapor.die(dNow);

        System.out.println("vianocny kapor sa narodil"+vianocnykapor.getDatum_narodenia());
        System.out.println("Vianocny kapor umrel"+vianocnykapor.getDatum_umrtia());

        for (int i=0;i<vianocnykapor.getSustavy().length;i++)
        {
            System.out.println(vianocnykapor.getSustavy()[i].getTypSustavy());
        }


        for(int i = 0; i<2000;i++){
           // maticka_zem.add_tvor(new Ryby());
           // maticka_zem.add_tvor(new Vtak());
            maticka_zem.add_tvor(new Velryba());
            maticka_zem.add_tvor(new Fenix());
            maticka_zem.add_tvor(new zralok(8));
            maticka_zem.add_tvor(new Orol(6));
            maticka_zem.add_tvor(new Mucha());
        }

        ATvor[] pole = maticka_zem.getPoleTvorov();

        for (int i=0;i<2000;i++)
        {
            pole[i].hybsa(10,10,10);
        }




        Planeta merkur = new Planeta();
        Planeta venusa = new Planeta();
       // Planeta  zem = new Planeta();
        Planeta mars = new Planeta();
        Planeta jupiter = new Planeta();
        Planeta saturn = new Planeta();
        Planeta uran = new Planeta();
        Planeta neptun = new Planeta();


        mojprvyvesmir.startVesmir(); //start vesmiru

        mojprvyvesmir.increaseSize(); // funkcia velkost

        mojprvyvesmir.decreaseSize(); // funkcia velkost 2

        mojprvyvesmir.stopVesmir(); //stop vesmiru

        mliecna_cesta.addSustava(slnkova_susatava); //slnecna sustava



        Kometa kometa_kometeus = new Kometa("kometa","Kometeus");

        mliecna_cesta.setKometa(kometa_kometeus);

        mliecna_cesta.kometa_leti();



        System.out.println(mojaplaneta.gravitacia);
        mojaplaneta.setVaha(100000);
        System.out.println(mojaplaneta.gravitacia);
        //mojaplaneta.decreaseGravity(500);
       // mojaplaneta.increaseGravity(20);

        Planeta[] pole_planet = new Planeta[1000];
        int i=0;// vytvorenie 1000 planet

        while(i<1000)
        {
            pole_planet[i]=new Planeta();
            i++;
        }

        mojaplaneta.setPlanetaryWeight(200);

    }


}