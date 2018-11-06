package com.company.programowanieobiektowe.cwiczenia;

public class Butelka {

    double volume;

    public Butelka() { //pusty domyslny konstruktor
    }

    public Butelka(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    void  wlej(double ilosc){
        this.volume += ilosc;
    }

    boolean wylej(double ilosc){
        if(ilosc <= this.volume) {
            this.volume -= ilosc;
        }
        else{
            //System.out.println("Nie możesz wylać " + ilosc + " poniewaz w butelce jest tylko " + this.volume);
            return false;
        }
        return true;
    }

    void przelej(double ilosc, Butelka gdziePrzelac){

        if(this.wylej(ilosc))
        {
            gdziePrzelac.wlej(ilosc);
        }
        else{
            System.out.println("nie da sie");
        }
    }

    public static void main(String[] args) {

        Butelka[] butelka = new Butelka[50]; // NULL

     //   for(Butelka but:butelka){
      //      but = new Butelka();
     //   }

        for(int i = 0; i < butelka.length; i++){
            butelka[i] = new Butelka(2 + i );
        }

        butelka[1].wlej(5);
        butelka[2].wylej(3);
        butelka[3].wylej(10);

        butelka[4].przelej(2, butelka[5]);


        for(Butelka but: butelka){
            System.out.println(but.getVolume());
        }


//        butelka[0] = new Butelka(); // tworzymy za pomocą kostruktora
//        butelka[1] = new Butelka();
//        butelka[2] = new Butelka();



    }
}
