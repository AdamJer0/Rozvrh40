package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Rozvrh {
    private TvoricObjektu tvoricObjektu;
    private int score;
    private Hodina hodina;
    private int pocetHodinVtydnu;
    private ArrayList<Hodina> rozvrh;
    private ArrayList<Ucitel> ucitelePrirazeniKhodinam;
    private ArrayList<Trida> tridyPrirazeneKhodinam;
    private ArrayList<Predmet> predmetyPrirazeneKhodinam;
    private Skola skola;
    private Ucebna ucebna;
    private ArrayList<Ucebna> ucebnyPrirazeneKhodinam;
    Random rand;
    private Ucitel ucitel;

    public Rozvrh() {
        skola = new Skola();
        skola.vytvorDefaultneNastaveneObjekty();
        score = 0;
        pocetHodinVtydnu = 40;
        rozvrh = new ArrayList<Hodina>();
        rand = new Random();
    }

    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }




    public ArrayList<Ucitel> priradUciteleKhodine() {
        ucitelePrirazeniKhodinam = new ArrayList<Ucitel>();
        for (int i = 0; i < pocetHodinVtydnu; i++) {
            int n = rand.nextInt(skola.getTvoricObjektu().getVelikostUcitelstkehoSboru());

                ucitelePrirazeniKhodinam.add(skola.getTvoricObjektu().getUcitelskySbor().get(n));
                System.out.println("Přiřadil jsem učitele " + skola.getTvoricObjektu().getUcitelskySbor().get(n).getJmeno() + " " + skola.getTvoricObjektu().getUcitelskySbor().get(n).getPrijmeni());

                System.out.println("Ucitel prirazený k hodinam: ");
                System.out.println(ucitelePrirazeniKhodinam.get(i).getJmeno() + " " + ucitelePrirazeniKhodinam.get(i).getPrijmeni());

        }return ucitelePrirazeniKhodinam;
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
        }
        return tridyPrirazeneKhodinam;
    }
    public ArrayList<Predmet> priradPredmetKhodine(){
        predmetyPrirazeneKhodinam = new ArrayList<Predmet>();
        for (int i = 0; i < pocetHodinVtydnu; i++){
            int p = rand.nextInt(skola.getTvoricObjektu().getPredmety().size());
            predmetyPrirazeneKhodinam.add(skola.getTvoricObjektu().getPredmety().get(p));
        }
        return predmetyPrirazeneKhodinam;
    }

    public ArrayList<Hodina> vytvotRozvrh(){
        for (int i = 0; i < pocetHodinVtydnu; i++){
            //rozvrh.add(hodina = new Hodina(getRandomNumber(), poradoveCisloHodinyDne, boolean delena, Ucebna ucebna, int poradoveCisloDneVtydnu, Ucitel zvolenyUcitel, Predmet predmet), Ucebna ucebna, int poradoveCisloDneVtydnu, Ucitel zvolenyUcitel, Predmet predmet)));

            this.getScore();
            System.out.println("Skore tohoto rozvrhu je: " + score);
        }
        return rozvrh;
    }








}
