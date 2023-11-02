package com.ItFactory.problema_13;

public class Patrat {

    private double l;

    public Patrat(double l) {
        this.l = l;
    }

    public double calculeazaPerimetru() {
        double p = this.l * 4;
        return p;
    }

    public double calculeazaAria() {
        double a = this.l * this.l;
        return a;
    }
}
