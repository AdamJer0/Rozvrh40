package com.company;

import java.util.ArrayList;

public class Trida {
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


}
