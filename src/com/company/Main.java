package com.company;

public class Main {

    public static void main(String[] args) {


        Skola skola = new Skola();
        skola.vytvorDefaultneNastaveneObjekty();

        Rozvrh rozvrh = new Rozvrh();
        rozvrh.priradUcebnuKhodine();
        rozvrh.priradUciteleKhodine();


    }
}
