package com.company.programowanieobiektowe.enkapsulacja;

public class Enkapsulacja{
    public static void main(String[] args) {

        /*Enkapsulacja (hermetyzacja - pakowanie wlaciwosci
         * w taki sposob, aby nie bylo do nich bezposredniego dostepu
          * z innych klas*/

            KontoBankowe oszczednosciowe = new KontoBankowe();

          oszczednosciowe.wpalac(2087);

        System.out.println(oszczednosciowe.getSaldo());

         oszczednosciowe.wyplac(200);

        System.out.println(oszczednosciowe.getSaldo());

        if(oszczednosciowe.wyplac(3000)){
            System.out.println("wyplacono");
            System.out.println(oszczednosciowe.getSaldo());
        }
        else {
            System.out.println("nie da się wypłacić, za mało masz kasy." +
                    "twoje saldo wynosi " +
                    oszczednosciowe.getSaldo());
        }

    }

}

class KontoBankowe{

    public KontoBankowe() {

        saldo = 1000;
    }

    private int saldo;

    public int getSaldo() {
        return saldo;
    }

    private void setSaldo(int saldo) {

        //warunki tc etc etc
        this.saldo = saldo;
    }

    boolean wyplac(int ile){
        if(saldo < ile){
            return false;
        }else{
            setSaldo(saldo - ile);
        }


        return true;
    }

    boolean wpalac(int ile){
        setSaldo(saldo + ile);
        return true;
    }
}
