package space;

public class Planeta extends Vesmirne_teleso{
    private String nazov;

    private double vaha;

    private double priemer;

    public double gravitacia;

    private boolean weightSet = false;


    public void setPlanetaryWeight(double vaha){
        if (!weightSet){
            setVaha(vaha);
            setWeightSet(true);
        }
    }

    public void setWeightSet(boolean weightSet) {
        this.weightSet = weightSet;
    }

    public double getGravitacia() { //getter
        return gravitacia;
    }


    public String getZem() { //getter
        return nazov;
    }

    public void setZem(String zem) { //setter
        zem = zem;
    }

    public double getVaha() { //getter
        return vaha;
    }

    public void setVaha(double vaha) { //setter

        if(this.vaha>vaha) {
            if ((this.vaha - vaha) <= 1000) {

                System.out.println("maličká");
                decreaseGravity(0.1);
            } else {

                System.out.println("velmi malička");
            }
        } else {
            if (Math.abs(this.vaha-vaha)<=1000){
                System.out.println("Sakra, velmi velká");
                System.out.println("vaha je teraz "+vaha+"kg");


            }else {
                System.out.println("Velmi velká!");
                increaseGravity(0.1);
            }
        }

        this.vaha = vaha;
    }

    public double getPriemer() { //getter
        return priemer;
    }

    public void setPriemer(double priemer) { //setter
        this.priemer = priemer;
    }

    public void increaseGravity(double add){
        gravitacia += add;
        System.out.println("gravitacia je "+gravitacia+"km3");
    }

    public void decreaseGravity(double dec){
        gravitacia -= dec;
        System.out.println("gravitacia je "+gravitacia+"km3");
    }

    public Planeta(String nazov,double vaha,double priemer) {
        super(nazov);
        this.nazov = nazov;
        this.vaha = vaha;
        this.priemer = priemer;
        gravitacia = 9.81;
    }


    public Planeta() {
        super("mesiac"); //konstruktor na hodnoty
        nazov = "mesiac";
        vaha = 10000;
        priemer = 3000;
    }

    public Planeta (String nazov, double vaha, double priemer, double gravitacia){
        super(nazov); //konstruktor basic
        this.nazov = nazov;
        setVaha(vaha);
        this.priemer = priemer;
        this.gravitacia = gravitacia;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }
}
