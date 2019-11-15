package com.company;

import java.time.LocalTime;
import java.util.ArrayList;

public class Hodina {
    private Rozvrh rozvrh;
    private int poradoveCisloDneVtydnu;
    private int poradoveCisloHodinyDne;
    private Ucitel zvolenyUcitel;
    private Predmet predmet;
    private ArrayList<Hodina> hodiny;
    private ArrayList<Ucitel> zvoleniUcitele = new ArrayList<Ucitel>();
    private ArrayList<Predmet> predmety = new ArrayList<>();
    private boolean delena;
    private Ucebna ucebna;

    public int getPoradoveCisloDneVtydnu() {
        return poradoveCisloDneVtydnu;
    }
    public int getPoradoveCisloHodinyDne() {
        return poradoveCisloHodinyDne;
    }


    public Hodina(int poradoveCisloHodinyDne, boolean delena, int poradoveCisloDneVtydnu) {
        this.poradoveCisloHodinyDne = poradoveCisloHodinyDne;
        this.delena = delena;
        this.poradoveCisloDneVtydnu = poradoveCisloDneVtydnu;
    }

}
