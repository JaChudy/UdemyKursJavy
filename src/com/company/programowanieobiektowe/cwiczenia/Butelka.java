package com.company.programowanieobiektowe.cwiczenia;

public class Butelka {

    double volume;

    public Butelka(double volume) {
        this.volume = volume;
    }

    public static void main(String[] args) {

        Butelka[] butelka = new Butelka[50]; // NULL

     //   for(Butelka but:butelka){
      //      but = new Butelka();
     //   }

        for(int i = 0; i < butelka.length; i++){
            butelka[i] = new Butelka(12);
        }


//        butelka[0] = new Butelka(); // tworzymy za pomocą kostruktora
//        butelka[1] = new Butelka();
//        butelka[2] = new Butelka();



    }
}
