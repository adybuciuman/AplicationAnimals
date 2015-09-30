package com.adybuciuman.aplicatiianimle;

/**
 * Created by Adrian on 06.08.2015.
 */
public class TRex extends Animal {

    private  int anDisparitie;
    private int nrPicioare;

    public TRex() {
        this("Trex", 0, 0, 0);
    }

    public TRex(String nume, int varsta, int anDisparitie, int nrPicioare) {
        super(nume, varsta);
        this.anDisparitie = anDisparitie;
        this.nrPicioare = nrPicioare;
        setImageID(R.drawable.trex);
    }

    @Override
    public String toString() {
        return super.toString() + " a disparut un " + anDisparitie + " si a mers pe " + nrPicioare + "picioare";
    }
}
