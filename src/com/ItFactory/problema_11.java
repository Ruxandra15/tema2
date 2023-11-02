package com.ItFactory;

import java.util.Scanner;

public class problema_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti cuvantul :");
        String cuvant = scanner.nextLine();

        String ultimele_2_litere = cuvant.substring(cuvant.length() - 2);

        boolean ok = true;

        while (ok) {

            System.out.println("introduceti noul cuvant:");

            String cuvant_nou = scanner.nextLine();

            if (cuvant_nou.isEmpty()) {

                System.out.println("Nu ai introdus cuvant.Jocul s-a terminat!");

                ok = false;

            } else if (cuvant_nou.startsWith(ultimele_2_litere)) {



                ultimele_2_litere = cuvant_nou.substring(cuvant_nou.length() - 2);

                System.out.println("Bravo!Urmatorul cuvant trebuie sa inceapa cu : " + ultimele_2_litere);

            } else {

                System.out.println("Cuvantul introdus este incorect.Jocul s a terminat!");

                ok = false;
            }

        }

    }
}
