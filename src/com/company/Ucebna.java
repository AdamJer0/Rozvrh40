package com.company;

import java.util.ArrayList;

public class Ucebna {

    TvoricObjektu tvoricObjektu;
    private String jmenoUcebny;
    private boolean obsazena;

    public Ucebna(String jmenoMistnosti) {
        this.jmenoUcebny = jmenoMistnosti;
    }
    public String getJmenoUcebny() {
        return jmenoUcebny;
    }
    public void setJmenoUcebny(String jmenoUcebny) {
        this.jmenoUcebny = jmenoUcebny;
    }



    private int najdiUcebnu(Ucebna ucebna){
        return tvoricObjektu.ucebny.indexOf(ucebna);
    }
    private int najdiUcebnu(String jmenoUcebny){
        for(int i = 0; i < tvoricObjektu.ucebny.size(); i++){
            Ucebna ucebna = tvoricObjektu.ucebny.get(i);
            if (ucebna.getJmenoUcebny().equals(jmenoUcebny)){
                return i;
            }
        }return -1;
    }






}
