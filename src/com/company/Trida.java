package com.company;

import java.util.ArrayList;

public class Trida {
    TvoricObjektu tvoricObjektu;
    private Zak zak;
    private Skola skola;
    private Ucitel tridniUcitel;
    private Ucebna tridniUcebna;
    private String jmenoTridy;
    private ArrayList<Zak> trida = new ArrayList<>();

    public Trida(Ucitel tridniUcitel, Ucebna tridniMistnost, String jmenoTridy) {
        this.tridniUcitel = tridniUcitel;
        this.tridniUcebna = tridniMistnost;
        this.jmenoTridy = jmenoTridy;
    }

    public String getJmenoTridy() {
        return jmenoTridy;
    }
    public void setJmenoTridy(String jmenoTridy) {
        this.jmenoTridy = jmenoTridy;
    }

    public ArrayList<Zak> zapisZakaDoTridy(){
        trida.add(zak);
        return trida;
    }

    private int najdiTridu(Trida trida){
        return tvoricObjektu.getTridy().indexOf(trida);
    }
    private int najdiTridu(String jmenoTridy) {
        for(int i = 0; i < tvoricObjektu.getTridy().size(); i++){
            Trida trida = tvoricObjektu.getTridy().get(i);
            if (trida.getJmenoTridy().equals(jmenoTridy)){
                return i;
            }
        }return -1;
    }




}
