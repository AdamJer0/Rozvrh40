package com.company;

import java.util.ArrayList;

public class TvoricObjektu {

    //promenne
    private int velikostUcitelstkehoSboru;
    private ArrayList<Predmet> predmety = new ArrayList<>();
    private ArrayList<Trida> tridy = new ArrayList<>();
    private int pocetZakuSkoly = 545;
    ArrayList<Ucitel> ucitelskySbor;


    //gettery a settery
    public ArrayList<Ucitel> getUcitelskySbor() {
        return ucitelskySbor;
    }
    public int getVelikostUcitelstkehoSboru() {
        return velikostUcitelstkehoSboru;
    }
    public ArrayList<Trida> getTridy() {
        return tridy;
    }
    public ArrayList<Predmet> getPredmety() {
        return predmety;
    }





    //predmety
    public void vytvorPredmety(){
        Predmet M = new Predmet("matematika");
        Predmet AJ = new Predmet("anglictina");
        Predmet CJ = new Predmet("cestina");
        Predmet zemepis = new Predmet("zemepis");
        Predmet dejepis = new Predmet("dejepis");
        Predmet obcanskaNauka = new Predmet("obcanskaNauka");
        Predmet politika = new Predmet("politika");
        Predmet technickeKresleni = new Predmet("technickeKresleni");
        Predmet informatika = new Predmet("informatika");
        Predmet fyzika = new Predmet("fyzika");
        Predmet chemie = new Predmet("chemie");
        Predmet telocvik = new Predmet("telocvik");
        System.out.println("Byly vytvořeny předměty: ");
        System.out.println(M.getJmenoPredmetu());
        System.out.println(AJ.getJmenoPredmetu());
        System.out.println(CJ.getJmenoPredmetu());
        System.out.println(zemepis.getJmenoPredmetu());
        System.out.println(dejepis.getJmenoPredmetu());
        System.out.println(obcanskaNauka.getJmenoPredmetu());
        System.out.println(politika.getJmenoPredmetu());
        System.out.println(technickeKresleni.getJmenoPredmetu());
        System.out.println(informatika.getJmenoPredmetu());
        System.out.println(fyzika.getJmenoPredmetu());
        System.out.println(chemie.getJmenoPredmetu());
        System.out.println(telocvik.getJmenoPredmetu());
        System.out.println();
        predmety = new ArrayList<>();
        predmety.add(M);
        predmety.add(AJ);
        predmety.add(CJ);
        predmety.add(zemepis);
        predmety.add(dejepis);
        predmety.add(obcanskaNauka);
        predmety.add(politika);
        predmety.add(technickeKresleni);
        predmety.add(informatika);
        predmety.add(fyzika);
        predmety.add(chemie);
        predmety.add(telocvik);
    }

    //ucebny
    public ArrayList<Ucebna> getUcebny() {
        return ucebny;
    }
    ArrayList<Ucebna> ucebny;
    public void vytvorUcebnu(){
        Ucebna ucebnaChemie = new Ucebna("ucebnaChemie");
        Ucebna ucebnaFyziky = new Ucebna("ucebnaFyziky");
        Ucebna ucebnaJazyku = new Ucebna("ucebnaJazyku");
        Ucebna ucebnaBiologie = new Ucebna("ucebnaBiologie");
        Ucebna telocvicna = new Ucebna("telocvicna");
        Ucebna I = new Ucebna("I");
        Ucebna II = new Ucebna("II");
        Ucebna III = new Ucebna("III");
        Ucebna IV = new Ucebna("IV");
        Ucebna V = new Ucebna("V");
        Ucebna VI = new Ucebna("VI");
        Ucebna VII = new Ucebna("VII");
        Ucebna VIII = new Ucebna("VIII");
        Ucebna IX = new Ucebna("IX");

        System.out.println("Byly vytvořeny účebny: ");
        System.out.println(ucebnaChemie.getJmenoUcebny());
        System.out.println(ucebnaFyziky.getJmenoUcebny());
        System.out.println(ucebnaJazyku.getJmenoUcebny());
        System.out.println(ucebnaBiologie.getJmenoUcebny());
        System.out.println(telocvicna.getJmenoUcebny());
        System.out.println();
        System.out.println("Byly vytvořeny i učebny: " + I.getJmenoUcebny() + II.getJmenoUcebny() + III.getJmenoUcebny() + IV.getJmenoUcebny() + V.getJmenoUcebny() + VI.getJmenoUcebny() + VII.getJmenoUcebny() + IX.getJmenoUcebny());

        System.out.println();
        ucebny = new ArrayList<Ucebna>();
        ucebny.add(ucebnaChemie);
        ucebny.add(ucebnaFyziky);
        ucebny.add(ucebnaJazyku);
        ucebny.add(ucebnaBiologie);
        ucebny.add(telocvicna);
        ucebny.add(I);
        ucebny.add(II);
        ucebny.add(III);
        ucebny.add(IV);
        ucebny.add(V);
        ucebny.add(VI);
        ucebny.add(VII);
        ucebny.add(VIII);
        ucebny.add(IX);


    }
    //tridy
    public void vytvorTridy() {
        Ucitel ucitelTridni;
        Ucebna tridniUcebna;

        Trida trida1 = new Trida(ucitelTridni = new Ucitel("t", "1", true, 29, "cestina", "dejepis"), tridniUcebna = new Ucebna("I"), "I");
        Trida trida2 = new Trida(ucitelTridni = new Ucitel("t", "2", true, 29, "zemepis", "dejepis"), tridniUcebna = new Ucebna("II"), "II");
        Trida trida3 = new Trida(ucitelTridni = new Ucitel("t", "3", true, 29, "cestina", "dejepis"), tridniUcebna = new Ucebna("III"), "III");
        Trida trida4 = new Trida(ucitelTridni = new Ucitel("t", "4", true, 29, "cestina", "dejepis"), tridniUcebna = new Ucebna("IV"), "IV");
        Trida trida5 = new Trida(ucitelTridni = new Ucitel("t", "5", true, 29, "cestina", "dejepis"), tridniUcebna = new Ucebna("V"), "V");
        Trida trida6 = new Trida(ucitelTridni = new Ucitel("t", "6", true, 29, "cestina", "dejepis"), tridniUcebna = new Ucebna("VI"), "VI");
        Trida trida7 = new Trida(ucitelTridni = new Ucitel("t", "7", true, 29, "cestina", "dejepis"), tridniUcebna = new Ucebna("VII"), "VII");
        Trida trida8 = new Trida(ucitelTridni = new Ucitel("t", "8", true, 29, "cestina", "dejepis"), tridniUcebna = new Ucebna("VIII"), "VIII");
        Trida trida9 = new Trida(ucitelTridni = new Ucitel("t", "9", true, 29, "cestina", "dejepis"), tridniUcebna = new Ucebna("IX"), "IX");
        System.out.println("Byly vytvořeny třídy: ");
        System.out.println(trida1.getJmenoTridy());
        System.out.println(trida2.getJmenoTridy());
        System.out.println(trida3.getJmenoTridy());
        System.out.println(trida4.getJmenoTridy());
        System.out.println(trida5.getJmenoTridy());
        System.out.println(trida6.getJmenoTridy());
        System.out.println(trida7.getJmenoTridy());
        System.out.println(trida8.getJmenoTridy());
        System.out.println(trida9.getJmenoTridy());
        System.out.println();
        tridy.add(trida1);
        tridy.add(trida2);
        tridy.add(trida3);
        tridy.add(trida4);
        tridy.add(trida5);
        tridy.add(trida6);
        tridy.add(trida7);
        tridy.add(trida8);
        tridy.add(trida9);
    }


    //ucitele

    public void vytvorUcitele() {
        Ucitel ucitel1 = new Ucitel("x", "i", true, 29, "fyzika", "matematika");
        Ucitel ucitel2 = new Ucitel("y", "j", true, 29, "zemepis", "dejepis");
        Ucitel ucitel3 = new Ucitel("z", "k", true, 29, "anglictina", "matematika");
        Ucitel ucitel4 = new Ucitel("xx", "ii", true, 29, "fyzika", "chemie");
        Ucitel ucitel5 = new Ucitel("yy", "jj", true, 29, "informatika", "informatika");
        Ucitel ucitel6 = new Ucitel("zz", "kk", true, 29, "telocvik", "zemepis");
        Ucitel ucitel7 = new Ucitel("xxx", "iii", true, 29, "fyzika", "technickeKresleni");
        Ucitel ucitel8 = new Ucitel("yyy", "jjj", true, 29, "cestina", "dejepis");
        Ucitel ucitel9 = new Ucitel("zzz", "kkk", true, 29, "matematika", "dejepis");

        System.out.println("Učitelé byli vytvořeni: ");
        ucitelskySbor = new ArrayList<Ucitel>();
        ucitelskySbor.add(ucitel1);
        ucitelskySbor.add(ucitel2);
        ucitelskySbor.add(ucitel3);
        ucitelskySbor.add(ucitel4);
        ucitelskySbor.add(ucitel5);
        ucitelskySbor.add(ucitel6);
        ucitelskySbor.add(ucitel7);
        ucitelskySbor.add(ucitel8);
        ucitelskySbor.add(ucitel9);
        velikostUcitelstkehoSboru = ucitelskySbor.size();

        for (int i = 0; i < ucitelskySbor.size(); i++){
            System.out.println("Učitel: " + ucitelskySbor.get(i).getJmeno() + " " + ucitelskySbor.get(i).getPrijmeni() + " byl vytvořen.");
        }
        System.out.println();
    }

    //zaci
    public void vytvorZaky() {
        for (int i = 0; i < pocetZakuSkoly; i++){
            Zak zak = new Zak("i", "czernek", true, 15);
            System.out.println("Žák byl vytvořen: " + zak.getJmeno() + " " + zak.getPrijmeni());
        }
        System.out.println();
    }
}
