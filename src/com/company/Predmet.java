package com.company;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class Predmet {
    private Ucitel moznyUcitel;

    public String getNazevPredmetu() {
        return nazevPredmetu;
    }

    private String nazevPredmetu;


    public Predmet(String nazevPredmetu) {
        this.nazevPredmetu = nazevPredmetu;
    }
}
