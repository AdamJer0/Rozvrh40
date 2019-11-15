package com.company;

import java.util.ArrayList;

public class Predmet {
    private Ucitel moznyUcitel;
    public String getJmenoPredmetu() {
        return nazevPredmetu;
    }
    private String nazevPredmetu;
    TvoricObjektu tvoricObjektu;

    public Predmet(String JmenoPredmetu) {
        this.nazevPredmetu = JmenoPredmetu;
    }
    private double scoreZaHodinu;
    private ArrayList<Double> scoreZaHodiny = new ArrayList<>();
    private double celkoveScorePredmetu;



    private int najdiPredmet(Hodina hodina){
        return tvoricObjektu.getPredmety().indexOf(hodina);
    }
    private int najdiPredmet(String jmenoPredmetu) {
        for(int i = 0; i < tvoricObjektu.getPredmety().size(); i++){
            Predmet predmet = tvoricObjektu.getPredmety().get(i);
            if (predmet.getJmenoPredmetu().equals(jmenoPredmetu)){
                return i;
            }
        }return -1;
    }

    private int zvolPredmetProHodinu(Hodina hodina){
        return tvoricObjektu.getPredmety().indexOf(hodina);
    }
    private int zvolPredmetProHodinu(int poradoveCisloHodinyDneOdzadu){
        for(int i = 0; i < tvoricObjektu.getPredmety().size(); i++){
            Predmet predmet = this.tvoricObjektu.getPredmety().get(i);
            if (predmet.ukazSkoreHodinyZaPredmet(poradoveCisloHodinyDneOdzadu, getJmenoPredmetu()) == (predmet.ukazMaxScoreHodiny(poradoveCisloHodinyDneOdzadu, predmet))){
                return i;
            }
        }
        return -1;
    }





    public double ukazSkoreHodinyZaPredmet(int poradoveCisloHodinyDneOdzadu, String jmenoPredmetu){
        switch (getJmenoPredmetu()) {
            case "matematika":
                scoreZaHodinu = poradoveCisloHodinyDneOdzadu;
                return scoreZaHodinu;
            case "cestina":
                scoreZaHodinu = poradoveCisloHodinyDneOdzadu * 0.5;
                return scoreZaHodinu;
            case "anglictina":
                scoreZaHodinu = poradoveCisloHodinyDneOdzadu * 0.5;
                return scoreZaHodinu;
            case "zemepis":
                scoreZaHodinu = poradoveCisloHodinyDneOdzadu;
                return scoreZaHodinu;
            case "dejepis":
                scoreZaHodinu = poradoveCisloHodinyDneOdzadu;
                return scoreZaHodinu;
            case "obcanskaNauka":
                scoreZaHodinu = poradoveCisloHodinyDneOdzadu;
                return scoreZaHodinu;
            case "politika":
                scoreZaHodinu = poradoveCisloHodinyDneOdzadu * 0.5;
                return scoreZaHodinu;
            case "technickeKresleni":
                scoreZaHodinu = poradoveCisloHodinyDneOdzadu;
                return scoreZaHodinu;
            case "informatika":
                scoreZaHodinu = poradoveCisloHodinyDneOdzadu;
                return scoreZaHodinu;
            case "fyzika":
                scoreZaHodinu = poradoveCisloHodinyDneOdzadu * 1;
                return scoreZaHodinu;
            case "chemie":
                scoreZaHodinu = poradoveCisloHodinyDneOdzadu * 1;
                return scoreZaHodinu;
            case "telocvik":
                scoreZaHodinu = poradoveCisloHodinyDneOdzadu * 0.5;
                return scoreZaHodinu;
            default:
                System.out.println("Nastala chyba, předmět nebyl nalezen.");
                break;
        }
        return scoreZaHodinu;
    }

    public double ukazScoreZaHodiny(){
        for(int i = 0; i < scoreZaHodiny.size(); i++){
            scoreZaHodiny.add(scoreZaHodinu);
        }
        for(int i = 0; i < scoreZaHodiny.size(); i++){
            celkoveScorePredmetu += scoreZaHodiny.get(i);
        }
        return celkoveScorePredmetu;
    }

    public double ukazMaxScoreHodiny(int poradoveCisloHodinyDneOdzadu, Predmet predmet){
        double minMax = 0;
        double smallest = 0;
        double maxScoreHodiny = 0;
        for(int i = 0; i < tvoricObjektu.getPredmety().size(); i++){
            System.out.print("Number " + i + ": ");
            double inputNumbers = ukazSkoreHodinyZaPredmet(poradoveCisloHodinyDneOdzadu, getJmenoPredmetu());
            if(inputNumbers > maxScoreHodiny){
                maxScoreHodiny = inputNumbers;
            } else if (inputNumbers < smallest){
                smallest = inputNumbers;
            }
        }
        System.out.println();

        System.out.println("Smallest = " + smallest);
        System.out.println("Largest = " + maxScoreHodiny);
        return maxScoreHodiny;
    }






}
