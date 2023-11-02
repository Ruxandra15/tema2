package com.ItFactory;

public class problema_7 {
    public static void main(String[] args) {


        String text = "avion avion avion avion avion avion avion avion, masina masina masina masina masina masina masina";

        for (int i = 1; i <= 5; i++) {
            text = text.replaceFirst("avion", "racheta");
        }
        for (int j = 1; j <= 3; j++) {
            text = text.replaceFirst("masina", "autobuz");
        }

        System.out.println(text);
    }
}


