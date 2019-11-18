package com.company;

import java.util.ArrayList;

public class SouborParametruHodinyZaka {
    private Predmet predmet;
    private Ucitel ucitel;
    private Ucebna ucebna;
    private Trida trida;
    private Hodina hodina;

    public SouborParametruHodinyZaka(Predmet predmet, Ucitel ucitel, Ucebna ucebna, Trida trida, Hodina hodina) {
        this.predmet = predmet;
        this.ucitel = ucitel;
        this.ucebna = ucebna;
        this.trida = trida;
        this.hodina = hodina;
    }
}
