package com.company.programowanieobiektowe;

public class Konstruktory {

    public static void main(String[] args) {


//        new Punkt(); //new Punkt() - wywolaj domyślny konstruktor;
//
//        Punkt p;

        Punkt p = new Punkt();
        Punkt p2 = new Punkt(30,40);

        p.x = 5;
        p.y = 20;

        System.out.println("p.x " + p.x);
        System.out.println("p.y " + p.y);

        System.out.println("p2.x " + p2.x);
        System.out.println("p2.y " + p2.y);
    }
}

class Punkt{

    int x;
    int y; //wlasciwosci opisujace punkt

    Punkt() {

        System.out.println("wywołano konstruktor");
        x=20; // ustawiamy domyślne wartości
        y=20;

    }

    Punkt(int pierwszy, int drugi){
        System.out.println("wywołano konstruktor z dwoma parametrami");
        x = pierwszy;
        y = drugi;
    }
}
