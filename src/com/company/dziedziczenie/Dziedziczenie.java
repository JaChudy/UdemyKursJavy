package com.company.dziedziczenie;

import com.company.dziedziczenie.potwory.Potwor;
import com.company.dziedziczenie.potwory.Szkielet;
import com.company.dziedziczenie.potwory.Zombie;

public class Dziedziczenie {

    public static void main(String[] args) {

        // Potwór  -> Zombie, szkielet

        Potwor p = new Szkielet(10, 1000);



    }
}

