package com.company;

public class Main {

    public static void main(String[] args) {

        Rozvrh rozvrh = new Rozvrh();
        rozvrh.priradUdajeKhodine();
        rozvrh.vytvotRozvrh();
        System.out.println();
        rozvrh.vytvorSouboryParametruHodin();
        System.out.println();
        rozvrh.getRozvrhUcitele("k");
        System.out.println();
        rozvrh.getRozvrhUcebny("VI");
        System.out.println();
    }
}
