package com.company;

import java.time.LocalTime;
import java.util.ArrayList;

public class Hodina {
    private Rozvrh rozvrh;

    private int poradoveCisloHodinyDne;
    private boolean delena;
    private Ucebna ucebna;
    private int poradoveCisloDneVtydnu;
    private Ucitel zvolenyUcitel;
    private Predmet predmet;

    private ArrayList<Ucitel> zvoleniUcitele = new ArrayList<Ucitel>();
    private ArrayList<Predmet> predmety = new ArrayList<>();

    public Hodina(int poradoveCisloHodinyDne, boolean delena, Ucebna ucebna, int poradoveCisloDneVtydnu, Ucitel zvolenyUcitel, Predmet predmet) {
        this.poradoveCisloHodinyDne = poradoveCisloHodinyDne;
        this.delena = delena;
        this.ucebna = ucebna;
        this.poradoveCisloDneVtydnu = poradoveCisloDneVtydnu;
        this.zvolenyUcitel = zvolenyUcitel;
        this.predmet = predmet;
    }

    public int getPoradoveCisloHodinyDneOdzadu() {
        return poradoveCisloHodinyDne;
    }

    public void setPoradoveCisloHodinyDne(int poradoveCisloHodinyDne) {
        this.poradoveCisloHodinyDne = poradoveCisloHodinyDne;
    }




}
