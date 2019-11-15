package com.company;

import java.util.ArrayList;

public class Clovek {
    public Clovek(String jmeno, String prijmeni, boolean pohlaviJeMuz, int vek) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.pohlaviJeMuz = pohlaviJeMuz;
        this.vek = vek;
    }


    public boolean zjistiPohlavizeVstupu(String string){
        if (string.equals("muž")){
            pohlaviJeMuz = true;
        }
        else if (string.equals("žena")){
            pohlaviJeMuz = false;
        }
        else {
            System.out.println("Neznámé pohlaví.");
            return Boolean.parseBoolean(null);
        }return Boolean.parseBoolean(null);
    }


    public int najdiCloveka(Clovek clovek) {
        return this.lide.indexOf(lide);
    }
    public int najdiCloveka(String jmenoCloveka, String prijmeniCloveka) {
        for(int i = 0; i < this.lide.size(); i++){
            Clovek clovek = this.lide.get(i);
            if (clovek.getPrijmeni().equals(prijmeniCloveka) && clovek.getJmeno().equals(jmenoCloveka)){
                return i;
            }
        }return -1;
    }

    private String jmeno;
    private String prijmeni;
    private boolean pohlaviJeMuz;
    private int vek;
    private ArrayList<Clovek> lide;
    public String getJmeno() {
        return jmeno;
    }
    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }
    public String getPrijmeni() {
        return prijmeni;
    }
    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }
    public boolean isPohlaviJeMuz() {
        return pohlaviJeMuz;
    }
    public void setPohlaviJeMuz(boolean pohlaviJeMuz) {
        this.pohlaviJeMuz = pohlaviJeMuz;
    }
    public int getVek() {
        return vek;
    }
    public void setVek(int vek) {
        this.vek = vek;
    }
}
