package com.ItFactory.problema15.reparatie;

import com.ItFactory.problema15.componente.CutieDeViteze;
import com.ItFactory.problema15.componente.Motor;

public class Reparatie {
   private  String marcaProductie;
    private double costReparatie;
    private Motor motor;
    private CutieDeViteze cutieDeViteze;

    public String getMarcaProductie() {
        return marcaProductie;
    }

    public void setMarcaProductie(String marcaProductie) {
        this.marcaProductie = marcaProductie;
    }

    public double getCostReparatie() {
        return costReparatie;
    }

    public void setCostReparatie(double costReparatie) {
        this.costReparatie = costReparatie;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public CutieDeViteze getCutieDeViteze() {
        return cutieDeViteze;
    }

    public void setCutieDeViteze(CutieDeViteze cutieDeViteze) {
        this.cutieDeViteze = cutieDeViteze;
    }

    public boolean verificareMarcaProductie(){
        boolean rezultat=marcaProductie.equals(motor.getMarcaProductie());
        return rezultat;


    }

    public boolean verificareMarcaProductie2(){
        boolean rezultat=marcaProductie.equals(cutieDeViteze.getMarcaProducitie());
        return rezultat;
    }
}
