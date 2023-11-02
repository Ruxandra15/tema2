package com.ItFactory.problema_13;

public class Main {
    public static void main(String[] args) {

        Triunghi triunghi=new Triunghi();
        triunghi.setA(4);
        triunghi.setB(5);
        triunghi.setC(7.2);

        System.out.println("perimetrul triunghiului este: "+triunghi.calculeazaPerimetru());
        System.out.println();

        Patrat patrat=new Patrat(5.6);
        System.out.println("perimetrul patratului este: "+patrat.calculeazaPerimetru());
        System.out.println("aria patratului este: " +patrat.calculeazaAria());

        System.out.println();

        Dreptunghi dreptunghi=new Dreptunghi();
        dreptunghi.setLatime(10);
        dreptunghi.setLungime(14);
        System.out.println("perimetrul dreptunghiului este : "+ dreptunghi.calculeazaPerimetrul());


    }
}
