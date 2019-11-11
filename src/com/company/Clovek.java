package com.company;

public abstract class Clovek {
    public Clovek(String jmeno, String prijmeni, boolean pohlaviJeMuz, int vek) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.pohlaviJeMuz = pohlaviJeMuz;
        this.vek = vek;
    }

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

    private String jmeno;
    private String prijmeni;
    private boolean pohlaviJeMuz;
    private int vek;


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

    public abstract Clovek rozpoznejClovekaZeVstupu(String string);

}
