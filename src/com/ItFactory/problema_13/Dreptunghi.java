package com.ItFactory.problema_13;

public class Dreptunghi {

    private double lungime;

    private double latime;

    public double getLungime() {
        return lungime;
    }

    public void setLungime(double lungime) {
        this.lungime = lungime;
    }

    public double getLatime() {
        return latime;
    }

    public void setLatime(double latime) {
        this.latime = latime;
    }

    public double calculeazaPerimetrul() {
        double p = this.latime * 2 + this.lungime * 2;
        return p;
    }

    public double calculeazaAria() {
        double a = this.latime * this.lungime;
        return a;
    }
}
