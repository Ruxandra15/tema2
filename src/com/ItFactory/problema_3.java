package com.ItFactory;

import java.util.Scanner;

public class problema_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nume_produs = scanner.nextLine();
        String pretTastatura = scanner.nextLine();
        String cantitateTastatura = scanner.nextLine();

        int pret = Integer.parseInt(pretTastatura);
        int cantitate = Integer.parseInt(cantitateTastatura);

        int pretTotal = pret * cantitate;
        System.out.println("Pentru produsele de tip " + nume_produs + " si cantiatea " + cantitate + " pretul este de " + pretTotal);
    }
}
