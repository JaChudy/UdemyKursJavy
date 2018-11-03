package com.company.programowanieobiektowe.referencje;

public class Referencje3 {

    public static void main(String[] args) {

        String imie = new String("jakub");
        String imie2 = new String("jakub"); // te same ciagi znakow trzymane sa w tym samamym miejscu w pamięci porownuje adresy


        if(imie.equals(imie2)){ //Strinig porownujemy metodą equals
            System.out.println("sa rowne");
        }
    }
}
