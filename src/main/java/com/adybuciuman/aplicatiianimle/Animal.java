package com.adybuciuman.aplicatiianimle;

/**
 * Created by Adrian on 06.08.2015.
 */
public class Animal {

    private String nume;
    private int varsta;
    private int imageID;

    public Animal(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public Animal(){
        this("", 0);
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    @Override
    public String toString() {
        return nume + " are varsta de " + varsta;
    }
}
