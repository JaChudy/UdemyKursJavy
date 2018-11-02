package com.company.programowanieobiektowe.referencje;

public class Referencje {

    public static void main(String[] args) {

        int a = 53;
        int b = a;

        b = 30;

        System.out.println(a);

        Test x = new Test();  // nie znajduje się wartość zwykła tylko adres -> zmienna referencyjna

        Test y = x;

        y.a = 40;

        System.out.println(x.a);

        String imie = "Jakub";
        String imie2= imie;

        imie2 = "tralalala";

        System.out.println(imie);
        System.out.println(imie2);
    }
}

class Test{

    int a = 20;
}
