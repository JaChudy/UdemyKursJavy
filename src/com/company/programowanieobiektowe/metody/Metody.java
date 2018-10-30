package com.company.programowanieobiektowe.metody;

public class Metody {

    public static void main(String[] args) {

        System.out.println("blablabla"); // to jest matoda klasy System


        Test a = new Test();
        Test a2 = new Test();

        a.wypisz("darek", "baran");// wywołanie metody na obiekcie a
        a2.wypisz("Artur", "Dran");

        int wynik = a.dodaj(5,20);


        System.out.println(wynik);

        double wynik2 = a.dzielenie(4,0);

        System.out.println(wynik2);

        double wynik3 = a.dzielenie(5,2);

        System.out.println(wynik3);

    }

}

//FUNKCJE (c++) == METODY java
class Test{

    //metoda ktora nie zwraca nic zaczyna sie od slowa void
    void wypisz(String imie, String nazwisko){

        System.out.println("Imię: " + imie + " Nazwisko: " + nazwisko);
    }

    //ta metoda zwraca nam wartosc typu int
    int dodaj(int a, int b){
        return a + b; //slowo return konczy metode
    }

    double dzielenie (double a, double b){

        if(b == 0){
            System.out.println("Nie dziel przez 0");
            return 0;
        }

        return a/b;
    }
}
