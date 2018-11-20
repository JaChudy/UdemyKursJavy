package com.company.dziedziczenie.potwory;

public class Potwor {

    public double predkoscChodzenia = 10;
    public double zywotnosc;

    public void atakuj(){

        /*





         */

        System.out.println("To jest metoda ataku z klasy potwór");
    }

    public Potwor(){

        System.out.println("Domyślny konstruktor z klasy Potwór");

    }

    public Potwor(double predkoscChodzenia, double zywotnosc){
        this.predkoscChodzenia = predkoscChodzenia;
        this.zywotnosc = zywotnosc;

        System.out.println("Dwuargumentowy konstruktor klasy Potwór");
    }
}
