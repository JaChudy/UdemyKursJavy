package com.company.programowanieobiektowe;

public class ProgramowanieObiektowe{

    public static void main(String[] args) {

        /*Obiekty - szbalony/pojemniki do przechowywania  zmiennych i funkcji tematycznie ze soba powiązanych
        *
        * Klasy - formy do tworzenia egzempalrzy obiektów
        * Properties
        * Metody - funkcje*/

        Monitor abc = new Monitor();
        abc.szerokosc = 124;
        Monitor abc2 = new Monitor();
        abc2.szerokosc = 215;

        Monitor abc3 = new  Monitor();

        System.out.println(abc.szerokosc);
        System.out.println(abc2.szerokosc);
        abc.wlacz();



    }

    static class Monitor
    {
        int szerokosc;
        int wysokosc;

        void wlacz(){

        }

        void wylacz(){

        }
    }
}
