package com.company.dziedziczenie.potwory;

public class Szkielet extends Potwor{

    @Override
    public void atakuj() {
        super.atakuj();
        System.out.println("to jest metoda atakuj z klasy szkielet");
    }

    String typBroni = "łuk";

    public Szkielet(){
        System.out.println("D0myślny komstruktor z klasy szkielet");
    }

    public Szkielet(double predkoscChodzenia, double zywotnosc) {

        super(predkoscChodzenia, zywotnosc);
        System.out.println("Niedomyślny konstruktor z klasy Szkielet");
    }

    public Szkielet(double predkoscChodzenia, double zywotnosc, String typBroni) {
        super(predkoscChodzenia, zywotnosc);
        this.typBroni = typBroni;

        System.out.println("NieDomyslny konstruktor z klasy Szkielete");
    }
}
