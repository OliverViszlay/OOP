package space;

public class Hviezda extends Vesmirne_teleso{

    private String nazov;

    private long objem;

    private long velkost;

    public boolean svietim;

    public long teplota;


    public Hviezda(String nazov, long objem, long velkost,long teplota) {
        super(nazov); //konstrukor
        this.nazov = nazov;
        this.objem = objem;
        this.velkost = velkost;
        this.teplota = teplota;
    }

    public Hviezda() { //konstruktor
        super("slnko");
        nazov = "slnko";
        objem = 600000;
        velkost = 8000000;
        teplota = 1500;
    }


    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public long getObjem() {
        return objem;
    }

    public void setObjem(long objem) {
        this.objem = objem;
    }

    public long getVelkost() {
        return velkost;
    }

    public void setVelkost(long velkost) {
        this.velkost = velkost;
    }

   public void sviet(){
        svietim = true;
        teplota += 1000;
   }

    public void zhasni(){
        svietim = false;
        teplota -= 1000;
    }
}
