package com.ItFactory;

import java.util.Scanner;

public class problema_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti numele candidatului:");

        String nume_candidat = scanner.nextLine();

        if (nume_candidat.length() > 25) {
            System.out.println("Numele introdus este prea lung pentru sistem");
        }
    }
}
