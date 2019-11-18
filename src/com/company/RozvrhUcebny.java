package com.company;

public class RozvrhUcebny {
    private Predmet predmet;
    private Ucitel ucitel;
    private Trida trida;
    private Hodina hodina;

    public RozvrhUcebny(Predmet predmet, Ucitel ucitel, Trida trida, Hodina hodina) {
        this.predmet = predmet;
        this.ucitel = ucitel;
        this.trida = trida;
        this.hodina = hodina;
    }
}
