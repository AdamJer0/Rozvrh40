package com.company;

import java.time.LocalDateTime;
import java.util.Scanner;

public class App {
    private Zak zak;
    private Skola skola;

    public void nastartujAplikaci(){

        Scanner sc = new Scanner(System.in);
    String volba = "";

        while (!volba.equals(4)){
        this.vypisUvodniObrazovku();
        System.out.println();
        System.out.println("Vyberte si s jakým objektem chcete pracovat:");
        System.out.println("1 - žák");
        System.out.println("2 - učitel");
        System.out.println("3 - učebna");
        System.out.println("4 - třída");
        System.out.println("5 - hodina");
        System.out.println("6 - jiný objekt");
        System.out.println("7 - zástupce ředitele");
        System.out.println("8 - ředitel");
        System.out.println("9 - Konec");
        volba = sc.nextLine();
        System.out.println();

        switch (volba){
            case "1":
                System.out.println("Vyberte akci: ");
                System.out.println("1 - přidat");
                System.out.println("2 - vymazat");
                System.out.println("3 - změnit");
                switch (volba){
                    case "1":
                        System.out.println("Zadejte jméno: ");
                        String jmeno = sc.nextLine();
                        System.out.println("Zadejte příjmení: ");
                        String prijmeni = sc.nextLine();
                        System.out.println("Zadejte pohlaví: ");
                        String pohlaviSlovne = sc.nextLine();
                        boolean pohlavi = zak.zjistiPohlavizeVstupu(pohlaviSlovne);
                        System.out.println("Zadejte věk: ");
                        int vek = sc.nextInt();
                        Zak zak = new Zak(jmeno, prijmeni, pohlavi, vek);
                        System.out.println("Do jaké třídy si přejete žáka přidat? ");
                        String tridaNaVstupu = sc.nextLine();

                }

                break;
            case "2":

                break;
            case "3":

                break;
            case "4":
                System.out.println("Vyberte akci: ");
                System.out.println("1 - přidat");
                System.out.println("2 - vymazat");
                System.out.println("3 - změnit");
                switch (volba) {
                    case "1":
                        System.out.println("Zadejte jméno třídy: ");
                        String jmenoTridy = sc.nextLine();
                        System.out.println("Zadejte jméno třídního učitele: ");
                        String jmenoTridnihoUcitele = sc.nextLine();
                        System.out.println("Zadejte jméno třídní místnosti: ");
                        String jmenoTridniMistnosti = sc.nextLine();

                }


                break;
            case "5":

                break;
            case "6":

                break;
            case "7":

                break;
            case "8":

            break;
            case "9":
                System.out.println("Libovolnou klávesou ukončíte program...");
                break;
            default:
                System.out.println("Neplatná volna, stiskněte libovolnou klávesou a opakujte volbu.");
                break;

        }

        }


    }

    public void vypisUvodniObrazovku(){
        System.out.println();
        System.out.println();
        System.out.println("Vítejte ve školní aplikaci!");


        System.out.println();
        System.out.println("\n-----");

        System.out.println();
        System.out.println("\n------");


        System.out.println();
    }
}
