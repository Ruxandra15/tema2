package com.ItFactory.problema_14;

public class CursValutar {

    private double EUR;

    private double USD;

    private double GBP;

//    public CursValutar(double EUR, double USD, double GBP) {
//        this.EUR = EUR;
//        this.USD = USD;
//        this.GBP = GBP;
//    }
//
//    public CursValutar() {
//    }

    public double getEUR() {

        return EUR;
    }


    public void setEUR(double EUR) {
        this.EUR = EUR;
    }

    public double getUSD() {
        return USD;
    }

    public void setUSD(double USD) {
        this.USD = USD;
    }

    public double getGBP() {
        return GBP;
    }

    public void setGBP(double GBP) {
        this.GBP = GBP;
    }

    public double conversieEur(double RON) {
        double c = RON / this.EUR;
        return c;
    }

    public double conversieUsd(double RON) {
        double c = RON / this.USD;
        return c;
    }

    public double conversieGbp(double RON) {
        double c = RON / this.GBP;
        return c;
    }
}
