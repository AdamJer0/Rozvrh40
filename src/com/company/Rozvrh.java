package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Rozvrh {
    private int score = 0;
    private Hodina hodina;
    private int pocetHodinVtydnu = 40;
    private ArrayList<Hodina> rozvrh = new ArrayList<Hodina>();
    private ArrayList<Ucitel> ucitelePrirazeniKhodinam;
    private Skola skola;
    private ArrayList<Ucebna> ucebnyPrirazeneKhodinam;
    Random rand = new Random();

    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }


    public ArrayList<Ucitel> priradUciteleKhodine() {
        ucitelePrirazeniKhodinam = new ArrayList<Ucitel>();

        for (int i = 0; i < pocetHodinVtydnu; i++) {
            int n = rand.nextInt(9);

                ucitelePrirazeniKhodinam.add(skola.getUcitelskySbor().get(n));
                System.out.println("Přiřadil jsem učitele " + skola.getUcitelskySbor().get(n).getJmeno() + " " + skola.getUcitelskySbor().get(n).getPrijmeni());

                System.out.println("Ucitele prirazeni k hodinam: ");
                System.out.println(ucitelePrirazeniKhodinam.get(i).getJmeno() + " " + ucitelePrirazeniKhodinam.get(i).getPrijmeni());

        }return ucitelePrirazeniKhodinam;
    }

    public ArrayList<Ucebna> priradUcebnuKhodine(){
        ucebnyPrirazeneKhodinam = new ArrayList<Ucebna>();

        for (int i = 0; i < ucebnyPrirazeneKhodinam.size(); i++){
            int m = rand.nextInt(skola.getUcebny().size());

            ucebnyPrirazeneKhodinam.add(skola.getUcebny().get(i));

        }
        return ucebnyPrirazeneKhodinam;
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
