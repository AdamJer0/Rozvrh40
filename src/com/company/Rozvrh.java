package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Rozvrh {
    private TvoricObjektu tvoricObjektu;
    private int score;
    private int pocetHodinVtydnu = 40;
    private ArrayList<Hodina> rozvrhHodin;
    private ArrayList<Ucitel> ucitelePrirazeniKhodinam;
    private ArrayList<Trida> tridyPrirazeneKhodinam;
    private ArrayList<Predmet> predmetyPrirazeneKhodinam;
    private SouborParametruHodiny souborParametruHodiny;
    private ArrayList<SouborParametruHodiny> souborParametruHodin;


    public Skola getSkola() {
        return skola;
    }

    private Skola skola;
    private Ucebna ucebna;
    private ArrayList<Ucebna> ucebnyPrirazeneKhodinam;
    Random rand;
    private Ucitel ucitel;

    public Rozvrh() {
        skola = new Skola();
        skola.vytvorDefaultneNastaveneObjekty(pocetHodinVtydnu);
        score = 0;
        pocetHodinVtydnu = 40;
        rozvrhHodin = new ArrayList<Hodina>();
        rand = new Random();
    }

    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public int getPocetHodinVtydnu() {
        return pocetHodinVtydnu;
    }

    public ArrayList<Hodina> priradUdajeKhodine(){
        priradUciteleKhodine();
        priradUcebnuKhodine();
        priradTriduKhodine();
        priradPredmetKhodinam();

        return rozvrhHodin;
    }


    public ArrayList<Ucitel> priradUciteleKhodine() {
        ucitelePrirazeniKhodinam = new ArrayList<Ucitel>();
        for (int i = 0; i < pocetHodinVtydnu; i++) {
            int n = rand.nextInt(skola.getTvoricObjektu().getVelikostUcitelstkehoSboru());

                ucitelePrirazeniKhodinam.add(skola.getTvoricObjektu().getUcitelskySbor().get(n));
                System.out.println("Přiřadil jsem učitele " + skola.getTvoricObjektu().getUcitelskySbor().get(n).getJmeno() + " " + skola.getTvoricObjektu().getUcitelskySbor().get(n).getPrijmeni());
                System.out.println("Ucitel prirazený k hodinam: ");
                System.out.println(ucitelePrirazeniKhodinam.get(i).getJmeno() + " " + ucitelePrirazeniKhodinam.get(i).getPrijmeni());
        }

        return ucitelePrirazeniKhodinam;
    }

    public ArrayList<Ucebna> priradUcebnuKhodine(){
        ucebnyPrirazeneKhodinam = new ArrayList<Ucebna>();
        for (int i = 0; i < pocetHodinVtydnu; i++){
            int m = rand.nextInt(skola.getTvoricObjektu().getUcebny().size());
            ucebnyPrirazeneKhodinam.add(skola.getTvoricObjektu().getUcebny().get(m));
        }
        return ucebnyPrirazeneKhodinam;
    }

    public ArrayList<Trida> priradTriduKhodine(){
        tridyPrirazeneKhodinam = new ArrayList<Trida>();
        for (int i = 0; i < pocetHodinVtydnu; i++){
            int o = rand.nextInt(skola.getTvoricObjektu().getTridy().size());
            tridyPrirazeneKhodinam.add(skola.getTvoricObjektu().getTridy().get(o));


            System.out.println("Přiřadil jsem třídu " + skola.getTvoricObjektu().getTridy().get(o).getJmenoTridy() +
                                " k hodině " + skola.getTvoricObjektu().getHodiny().get(o).getPoradoveCisloDneVtydnu() + " ve dnu týdne " +
                                skola.getTvoricObjektu().getHodiny().get(o).getPoradoveCisloDneVtydnu());
        }
        return tridyPrirazeneKhodinam;
    }
    public ArrayList<Predmet> priradPredmetKhodinam(){
        predmetyPrirazeneKhodinam = new ArrayList<Predmet>();
        for (int i = 0; i < pocetHodinVtydnu; i++){
            int p = rand.nextInt(skola.getTvoricObjektu().getPredmety().size());
            predmetyPrirazeneKhodinam.add(skola.getTvoricObjektu().getPredmety().get(p));

            System.out.println("Přiřadil jsem předmět " + skola.getTvoricObjektu().getPredmety().get(p).getJmenoPredmetu() + " k hodině " +
                                skola.getTvoricObjektu().getHodiny().get(p).getPoradoveCisloDneVtydnu());

            score += predmetyPrirazeneKhodinam.get(i).ukazSkoreHodinyZaPredmet(skola.getTvoricObjektu().getHodiny().get(i).getPoradoveCisloHodinyDne(), predmetyPrirazeneKhodinam.get(i).getJmenoPredmetu());
            System.out.println("Score je: " + score);
        }
        return predmetyPrirazeneKhodinam;
    }

    public ArrayList<Hodina> vytvotRozvrh(){
        for (int i = 0; i < pocetHodinVtydnu; i++){
            rozvrhHodin.add(skola.getTvoricObjektu().getHodiny().get(i));

            System.out.println("Skore tohoto rozvrhu je: " + this.getScore());
        }
        return rozvrhHodin;
    }



    public ArrayList<SouborParametruHodiny> vytvorSouboryParametruHodin(){
        souborParametruHodin = new ArrayList<SouborParametruHodiny>();
        for(int i = 0; i < getPocetHodinVtydnu(); i++){

            souborParametruHodiny = new SouborParametruHodiny(predmetyPrirazeneKhodinam.get(i), ucitelePrirazeniKhodinam.get(i), ucebnyPrirazeneKhodinam.get(i), tridyPrirazeneKhodinam.get(i), rozvrhHodin.get(i));
            souborParametruHodin.add(souborParametruHodiny);
        }
        for(int i = 0; i < pocetHodinVtydnu; i++) {
            System.out.println("Do souboru parametrů hodin jsem přidal: " + "Předmět: " +
                    predmetyPrirazeneKhodinam.get(i).getJmenoPredmetu() + " Učebnu: " +
                    ucebnyPrirazeneKhodinam.get(i).getJmenoUcebny() + " Třídu: " +
                    tridyPrirazeneKhodinam.get(i).getJmenoTridy() + " Hodinu s pořadovým čáslem hodiny dne: " +
                    rozvrhHodin.get(i).getPoradoveCisloHodinyDne() + " a s pořadovým číslem dne v týdnu: " +
                    rozvrhHodin.get(i).getPoradoveCisloDneVtydnu() + " Učitele: " +
                    ucitelePrirazeniKhodinam.get(i).getJmeno() + " " + ucitelePrirazeniKhodinam.get(i).getPrijmeni());
        }
        return souborParametruHodin;
    }







}
