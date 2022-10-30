package space;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Vesmir mojprvyvesmir = new Vesmir(); // objekt triedy vesmir = mojprvyvesmir
        //vesmir = trieda

        Vesmir mojaprvaHmlovina = new Vesmir();

        Planeta mojaplaneta = new Planeta();

        Hviezda mojeSlnko = new Hviezda();

        Planeta merkur = new Planeta();
        Planeta venusa = new Planeta();
        Planeta  zem = new Planeta();
        Planeta mars = new Planeta();
        Planeta jupiter = new Planeta();
        Planeta saturn = new Planeta();
        Planeta uran = new Planeta();
        Planeta neptun = new Planeta();


        mojprvyvesmir.startVesmir(); //start vesmiru

        mojprvyvesmir.increaseSize(); // funkcia velkost

        mojprvyvesmir.decreaseSize(); // funkcia velkost 2

        mojprvyvesmir.stopVesmir(); //stop vesmiru

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