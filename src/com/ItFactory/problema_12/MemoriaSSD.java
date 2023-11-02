package com.ItFactory.problema_12;

public class MemoriaSSD {

    private int capacitateStocare;
    private String unitateMasura;

    public MemoriaSSD(int capacitateStocare, String unitateMasura) {
        this.capacitateStocare = capacitateStocare;
        this.unitateMasura = unitateMasura;
    }

    public int getCapacitateStocare() {
        return capacitateStocare;
    }

    public String getUnitateMasura() {
        return unitateMasura;
    }
}
