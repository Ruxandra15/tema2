package com.ItFactory.problema_12;

public class Laptop {
    private String marca;
    private String culoare;
    private double dimensiuneEcran;

    private MemorieRam memorieRam;
    private MemoriaSSD memoriaSSD;


    public Laptop(String marca, String culoare, double dimensiuneEcran, MemorieRam memorieRam, MemoriaSSD memoriaSSD) {
        this.marca = marca;
        this.culoare = culoare;
        this.dimensiuneEcran = dimensiuneEcran;
        this.memorieRam = memorieRam;
        this.memoriaSSD = memoriaSSD;
    }

    public Laptop() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public double getDimensiuneEcran() {
        return dimensiuneEcran;
    }

    public void setDimensiuneEcran(double dimensiuneEcran) {
        this.dimensiuneEcran = dimensiuneEcran;
    }

    public MemorieRam getMemorieRam() {
        return memorieRam;
    }

    public void setMemorieRam(MemorieRam memorieRam) {
        this.memorieRam = memorieRam;
    }

    public MemoriaSSD getMemoriaSSD() {
        return memoriaSSD;
    }

    public void setMemoriaSSD(MemoriaSSD memoriaSSD) {
        this.memoriaSSD = memoriaSSD;
    }
}
