package com.company;

public class Ucitel extends Clovek {
    private String aprobace1;
    private String aprobace2;

    public Ucitel(String jmeno, String prijmeni, boolean pohlaviJeMuz, int vek, String aprobace1, String aprobace2) {
        super(jmeno, prijmeni, pohlaviJeMuz, vek);
        this.aprobace1 = aprobace1;
        this.aprobace2 = aprobace2;
    }


    @Override
    public Ucitel rozpoznejClovekaZeVstupu(String string) {
        if (string.equals(this.getJmeno())){
            System.out.println("Učitel byl nalezen.");
            return this;
        }
        else {
            System.out.println("Jméno tohoto učitele nebylo nalezeno.");
        }
        return this;
    }
}
