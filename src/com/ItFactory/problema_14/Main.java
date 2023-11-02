package com.ItFactory.problema_14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CursValutar cursValutar = new CursValutar();
        cursValutar.setEUR(4.97);
        cursValutar.setUSD(4.70);
        cursValutar.setGBP(5.70);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti optiunea:");
        int optiune = scanner.nextInt();
        switch (optiune) {
            case 1:
                System.out.println("Introduceti suma de bani in RON :");

                double sumaRon = scanner.nextDouble();

                System.out.println("Introduceti moneda rezultata:");

                String monedaRezultata = scanner.next();

                switch (monedaRezultata) {
                    case "EUR":
                        System.out.println(cursValutar.conversieEur(sumaRon));
                        break;
                    case "USD":
                        System.out.println(cursValutar.conversieUsd(sumaRon));
                        break;
                    case "GBP":
                        System.out.println(cursValutar.conversieGbp(sumaRon));
                        break;
                    default:
                        System.out.println("Nu se poate realiza conversia!");

                }
                break;
            case 2:
                System.out.println("Introduceti moneda careia doriti sa-i schimbati cursul:");

                String moneda = scanner.next();

                System.out.println("Introduceti noul curs:");

                double cursNou = scanner.nextDouble();

                switch (moneda) {
                    case "EUR":
                        cursValutar.setEUR(cursNou);
                        //System.out.println(cursValutar.getEUR());
                        break;
                    case "USD":
                        cursValutar.setUSD(cursNou);
                        //System.out.println( cursValutar.getUSD());
                        break;
                    case "GBP":
                        cursValutar.setGBP(cursNou);
                        //System.out.println(cursValutar.getGBP());
                        break;
                    default:
                        System.out.println("nu se poate schimba cursul valutar");
                }
                break;
            case 3:
                System.out.println("Iesire din program!");
                System.exit(0);
                break;
            default:
                System.out.println("Optiune incorecta.Incercati din nou.");
        }

    }
}
