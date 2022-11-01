package space;

public class Galaxia {

    public int velkost;

    private Slnecna_sustava[] planetarna_sustava = new Slnecna_sustava[100];

    private int pocet_objektov = 0;
    public void addSustava(Slnecna_sustava tato_sustava){
        planetarna_sustava[pocet_objektov] = new Slnecna_sustava();
        pocet_objektov ++;

    }

    public void zvecsenie(int hodnota){
        while(velkost != hodnota){
            velkost++;
        }
    }
}
