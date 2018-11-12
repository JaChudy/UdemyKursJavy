package com.company.dziedziczenie;

import com.company.dziedziczenie.potwory.Potwor;
import com.company.dziedziczenie.potwory.Szkielet;
import com.company.dziedziczenie.potwory.Zombie;

public class Dziedziczenie {

    public static void main(String[] args) {

        // Potwór  -> Zombie, szkielet

        Potwor p = new Potwor(10, 1000);
        System.out.println(p.predkoscChodzenia);

        Szkielet s = new Szkielet();
        Zombie z = new Zombie();



        p.atakuj();

    }
}

