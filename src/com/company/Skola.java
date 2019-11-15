package com.company;

import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

public class Skola {
    public TvoricObjektu getTvoricObjektu() {
        return tvoricObjektu;
    }

    TvoricObjektu tvoricObjektu;

    public void vytvorDefaultneNastaveneObjekty(){
        tvoricObjektu = new TvoricObjektu();
        tvoricObjektu.vytvorPredmety();
        tvoricObjektu.vytvorUcebnu();
        tvoricObjektu.vytvorUcitele();
        tvoricObjektu.vytvorZaky();
        tvoricObjektu.vytvorTridy();
        tvoricObjektu.getPredmety().get(7).ukazSkoreHodinyZaPredmet(7, tvoricObjektu.getPredmety().get(7).getJmenoPredmetu());
    }





   




}
