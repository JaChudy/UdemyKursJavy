package com.company.programowanieobiektowe.statyczność;

public class Statyczność {

    public static void main(String[] args) {
//        Matematyka test = new Matematyka();
//
        double wynik = Matematyka.dodaj(10,20);

        System.out.println(wynik);
        System.out.println(Matematyka.PI);

        Klient a = new Klient("Radek");
        Klient b = new Klient("Arkadiusz");
        Klient c = new Klient("Dupa");

        System.out.println(a.id);
        System.out.println(b.id);
        System.out.println(c.id);
    }
}

class Matematyka
{
    static final double PI = 3.14;
    static double dodaj(double a, double b){
        return a + b;
    }
}

class Klient{

    public Klient(String imie) {
        this.imie = imie;
        //this.id = id;
        nastepnyID++;
        id = nastepnyID;
    }

    String imie;
    int id = 0;
    static int nastepnyID = 0;
}
