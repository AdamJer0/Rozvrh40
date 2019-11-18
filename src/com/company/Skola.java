package com.company;

import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

public class Skola {
    public TvoricObjektu getTvoricObjektu() {
        return tvoricObjektu;
    }

    TvoricObjektu tvoricObjektu;
    private Rozvrh rozvrh;

    public void vytvorDefaultneNastaveneObjekty(int pocetHodinVtydnu){
        tvoricObjektu = new TvoricObjektu();
        tvoricObjektu.vytvorPredmety();
        tvoricObjektu.vytvorUcebnu();
        tvoricObjektu.vytvorUcitele();
        tvoricObjektu.vytvorZaky();
        tvoricObjektu.vytvorTridy();
        tvoricObjektu.vytvorHodiny(pocetHodinVtydnu);
    }

    public int najdiUcitele(Ucitel ucitel){
        return rozvrh.getUcitelePrirazeniKhodinam().indexOf(ucitel);
    }
    public int najdiUcitele(String prijmeni){
        for(int i = 0; i < rozvrh.getUcitelePrirazeniKhodinam().size(); i++){
            Ucitel ucitel = rozvrh.getUcitelePrirazeniKhodinam().get(i);
            if (ucitel.getPrijmeni().equals(prijmeni)){
                return i;
            }
        }
        return -1;
    }

    public int najdiUcebnu(Ucebna ucebna){
        return rozvrh.getUcebnyPrirazeneKhodinam().indexOf(ucebna);
    }
    public int najdiUcebnu(String jmenoUcebny){
        for(int i = 0; i < rozvrh.getUcitelePrirazeniKhodinam().size(); i++){
            Ucebna ucebna = rozvrh.getUcebnyPrirazeneKhodinam().get(i);
            if (ucebna.getJmenoUcebny().equals(jmenoUcebny)){
                return i;
            }
        }
        return -1;
    }














}
