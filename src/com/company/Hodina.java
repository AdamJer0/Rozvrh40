package com.company;

import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;

public class Hodina {
    private Rozvrh rozvrh;
    private int scoreZaHodinu;
    private int poradoveCisloHodinyDne;
    private boolean delena;
    private Ucebna ucebna;
    private LocalTime cas;
    private int poradoveCisloDneVtydnu;
    private int mensiNez;
    private int vetsiNez;
    private Ucitel zvolenyUcitel;
    private Predmet predmet;

    private ArrayList<Ucitel> zvoleniUcitele = new ArrayList<Ucitel>();
    private ArrayList<Predmet> predmety = new ArrayList<>();

    public Hodina(int poradoveCisloHodinyDne, boolean delena, Ucebna ucebna, int poradoveCisloDneVtydnu, Ucitel zvolenyUcitel, Predmet predmet) {
        this.poradoveCisloHodinyDne = poradoveCisloHodinyDne;
        this.delena = delena;
        this.ucebna = ucebna;
        this.poradoveCisloDneVtydnu = poradoveCisloDneVtydnu;
        this.zvolenyUcitel = zvolenyUcitel;
        this.predmet = predmet;
    }

    public int getPoradoveCisloHodinyDneOdzadu() {
        return poradoveCisloHodinyDne;
    }

    public void setPoradoveCisloHodinyDne(int poradoveCisloHodinyDne) {
        this.poradoveCisloHodinyDne = poradoveCisloHodinyDne;
    }

    public int zmenSkoreZaHodinu(int poradoveCisloHodinyDneOdzadu, Predmet predmet){
        if (predmet.getNazevPredmetu().equals("matematika")){
            scoreZaHodinu += poradoveCisloHodinyDneOdzadu;
            return scoreZaHodinu;
        }
        else if (predmet.getNazevPredmetu().equals("cestina")){
            scoreZaHodinu += poradoveCisloHodinyDneOdzadu * 0.5;
            return scoreZaHodinu;
        }
        else if (predmet.getNazevPredmetu().equals("anglictina")){
            scoreZaHodinu += poradoveCisloHodinyDneOdzadu * 0.5;
            return scoreZaHodinu;
        }
        else if (predmet.getNazevPredmetu().equals("zemepis")){
            scoreZaHodinu -= poradoveCisloHodinyDneOdzadu;
            return scoreZaHodinu;
        }
        else if (predmet.getNazevPredmetu().equals("dejepis")){
            scoreZaHodinu -= poradoveCisloHodinyDneOdzadu;
            return scoreZaHodinu;
        }
        else if (predmet.getNazevPredmetu().equals("obcanskaNauka")){
            scoreZaHodinu -= poradoveCisloHodinyDneOdzadu;
            return scoreZaHodinu;
        }
        else if (predmet.getNazevPredmetu().equals("politika")){
            scoreZaHodinu -= poradoveCisloHodinyDneOdzadu * 0.5;
            return scoreZaHodinu;
        }
        else if (predmet.getNazevPredmetu().equals("technickeKresleni")){
            scoreZaHodinu += poradoveCisloHodinyDneOdzadu;
            return scoreZaHodinu;
        }
        else if (predmet.getNazevPredmetu().equals("informatika")){
            scoreZaHodinu += poradoveCisloHodinyDneOdzadu;
            return scoreZaHodinu;
        }
        else if (predmet.getNazevPredmetu().equals("fyzika")){
            scoreZaHodinu += poradoveCisloHodinyDneOdzadu * 1;
            return scoreZaHodinu;
        }
        else if (predmet.getNazevPredmetu().equals("chemie")){
            scoreZaHodinu += poradoveCisloHodinyDneOdzadu * 1;
            return scoreZaHodinu;
        }
        else if (predmet.getNazevPredmetu().equals("telocvik")){
            scoreZaHodinu -= poradoveCisloHodinyDneOdzadu * 0.5;
            return scoreZaHodinu;
        }
        else {
            System.out.println("Nastala chyba, předmět nebyl nalezen.");
        }


        return rozvrh.getScore();
    }


}
