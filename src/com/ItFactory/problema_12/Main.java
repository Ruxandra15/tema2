package com.ItFactory.problema_12;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setMarca("asus");
        laptop.setCuloare("negru");
        laptop.setDimensiuneEcran(15.6);

        System.out.println("Detalii laptop:");
        System.out.println("Marca: " + laptop.getMarca());
        System.out.println("culoare: " + laptop.getCuloare());
        System.out.println("dimensiune ecran : " + laptop.getDimensiuneEcran());

        System.out.println();

        MemorieRam memorieRam = new MemorieRam();
        System.out.println("Memorie RAM: ");
        memorieRam.setTipMemorie("DDR3");
        memorieRam.setUnitateMasura("GB");
        memorieRam.setCapacitateMemorie(16);

        MemoriaSSD memoriaSSD = new MemoriaSSD(256, "GB");

        laptop.setMemoriaSSD(memoriaSSD);
        laptop.setMemorieRam(memorieRam);


        System.out.println("Tip de memorie RAM: " + laptop.getMemorieRam().getTipMemorie());
        System.out.println("Unitate de masura memorie: " + laptop.getMemorieRam().getUnitateMasura());
        System.out.println("capacitate memorie: " + laptop.getMemorieRam().getCapacitateMemorie());

        System.out.println();


        System.out.println("Spatiu de stocare SSD :");
        System.out.println("Capacitate Stocare : " + laptop.getMemoriaSSD().getCapacitateStocare());
        System.out.println("Unitate de masura : " + laptop.getMemoriaSSD().getUnitateMasura());


    }
}
