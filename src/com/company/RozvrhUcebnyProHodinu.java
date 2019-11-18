package com.company;

public class RozvrhUcebnyProHodinu {
    private Predmet predmet;
    private Ucitel ucitel;
    private Trida trida;
    private Hodina hodina;

    public RozvrhUcebnyProHodinu(Predmet predmet, Ucitel ucitel, Trida trida, Hodina hodina) {
        this.predmet = predmet;
        this.ucitel = ucitel;
        this.trida = trida;
        this.hodina = hodina;
    }
}
