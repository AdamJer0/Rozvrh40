package com.company;

import java.util.ArrayList;

public class Ucitel extends Clovek {
    private String aprobace1;
    private String aprobace2;
    private Ucitel ucitel;
    private ArrayList<Hodina> rozvrhUcitele;
    Rozvrh rozvrh;

    public Ucitel(String jmeno, String prijmeni, boolean pohlaviJeMuz, int vek, String aprobace1, String aprobace2) {
        super(jmeno, prijmeni, pohlaviJeMuz, vek);
        this.aprobace1 = aprobace1;
        this.aprobace2 = aprobace2;
    }

    public ArrayList<Hodina> vytvorRozvrhUcitele(Ucitel ucitel){
        rozvrhUcitele = new ArrayList<Hodina>();



        return rozvrhUcitele;
    }









}



