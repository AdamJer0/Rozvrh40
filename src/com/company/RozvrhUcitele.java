package com.company;

public class RozvrhUcitele {
    private Predmet predmet;
    private Ucebna ucebna;
    private Trida trida;
    private Hodina hodina;

    public RozvrhUcitele(Predmet predmet, Ucebna ucebna, Trida trida, Hodina hodina) {
        this.predmet = predmet;
        this.ucebna = ucebna;
        this.trida = trida;
        this.hodina = hodina;
    }
}
