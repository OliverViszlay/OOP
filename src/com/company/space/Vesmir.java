package com.company.space;

public class Vesmir {
    private boolean state;
    private long size;

    private long desiredSize;

    public Vesmir() {
        state = false;
        size = 1;
        desiredSize = 500;
    }

    public void startVesmir(){
        state=true;
        System.out.println("Vesmir Started");
    }

    public void stopVesmir(){
        state=false;
        System.out.println("Vesmir stoped");
    }

    public void increaseSize(){
        while(size < 999){
            size++;
        }
        System.out.println("Velkost vesmiru je "+size+"km3");
    }

    public void decreaseSize(){
        while(size > desiredSize){
            size--;
        }
        System.out.println("velkost teraz je "+ size+"km3");
    }
}
