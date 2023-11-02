package com.ItFactory.problema_13;

public class Triunghi {

    private double a;

    private double b;

    private double c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double calculeazaPerimetru() {
        double p = this.a + this.b + this.c;
        return p;
    }
}
