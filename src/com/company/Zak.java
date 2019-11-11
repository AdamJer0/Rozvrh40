package com.company;

public class Zak extends Clovek {
    private Trida trida;
    private Skola skola;

    public Zak(String jmeno, String prijmeni, boolean pohlaviJeMuz, int vek) {
        super(jmeno, prijmeni, pohlaviJeMuz, vek);
    }

    @Override
    public Clovek rozpoznejClovekaZeVstupu(String string) {
        if (string.equals(this.getJmeno())) {
            System.out.println("Žák byl nalezen.");
            return this;
        } else {
            System.out.println("Jméno tohoto žáka nebylo nalezeno.");
        }
        return this;
    }

    public Zak pridejDoTridy(String tridaNaVstupu) {
        Trida tridaProNovehoZaka = skola.vyhledejTridu(tridaNaVstupu);
        tridaProNovehoZaka.zapisZakaDoTridy();
        System.out.println("Žák: " + this.getJmeno() + " byl přidán do třídy " + tridaProNovehoZaka.getJmenoTridy());
        return this;
    }
}
