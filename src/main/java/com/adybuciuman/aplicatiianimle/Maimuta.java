package com.adybuciuman.aplicatiianimle;

/**
 * Created by Adrian on 06.08.2015.
 */
public class Maimuta extends Animal {

    private int portieBananePeZi;

    public Maimuta() {
        this("maimuta", 0, 0);
    }

    public Maimuta(String nume, int varsta, int portieBananePeZi) {
        super(nume, varsta);
        this.portieBananePeZi = portieBananePeZi;
        setImageID(R.drawable.monkey);
    }

    @Override
    public String toString() {
        return  super.toString() + " si mananca " + portieBananePeZi + " banane";
    }
}
