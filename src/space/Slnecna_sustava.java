package space;

public class Slnecna_sustava {

    private Hviezda slnko;

    private Vesmirne_teleso[] obezna_draha = new Vesmirne_teleso[5000];

    private int object_counter;

    public Slnecna_sustava(){
        slnko = new Hviezda();

        object_counter = 0;

        obezna_draha[object_counter] = new Planeta("Mars",432432,432432);
        object_counter++;

        obezna_draha[object_counter] = new Planeta("Venus",432432,432432);
        object_counter++;

        obezna_draha[object_counter] = new Hviezda("mesiacik",45621,45886,1560);
        object_counter++;

        obezna_draha[object_counter] = new Kometa("rychla","Blesk");
        object_counter++;
    }

    public void addSpaceBody(Vesmirne_teleso newSpaceBody)
    {
        obezna_draha[object_counter]=newSpaceBody;
        object_counter++;
    }

    public int getObject_counter() {
        return object_counter;
    }

    public void setObject_counter(int object_counter) {
        this.object_counter = object_counter;
    }
}
