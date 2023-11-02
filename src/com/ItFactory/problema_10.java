package com.ItFactory;

import java.util.Scanner;

public class problema_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti textul:");
        String text = scanner.nextLine();

        System.out.println("Introduceti keyword");
        String keyword = scanner.nextLine();

        int k = 0;

        while (text.contains(keyword)) {
            k++;
            text = text.replaceFirst(keyword, "");
        }

        System.out.println("Propozitia contine cuvantul " + keyword + " de " + k + " ori");
    }
}
