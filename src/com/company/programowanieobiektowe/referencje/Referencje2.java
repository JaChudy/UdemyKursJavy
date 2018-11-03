package com.company.programowanieobiektowe.referencje;

public class Referencje2 {

    public static void main(String[] args) {

        int a = 5;

        Test2 x = new Test2();

        a =  x.zmiennaWartosci(a);

        System.out.println(a);

        Foo foo = new Foo();

        x.zmiennaZawartosc(foo);

        System.out.println(foo.y);
    }
}

class Test2{

    int zmiennaWartosci(int zm){

        zm = zm + 2;

        return zm;
    }

    void zmiennaZawartosc(Foo zm){
        zm.y = zm.y + 40;
    }
}

class Foo{
    int y = 20;
}
