package com.ItFactory;

import java.util.Scanner;

public class problema_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti textul: ");

        String textIntrodus = scanner.nextLine();
        int litereMici = 0;
        int litereMari = 0;

        for (int i = 0; i < textIntrodus.length(); i++) {
            char litera = textIntrodus.charAt(i);
            if (Character.isLowerCase(litera)) {
                litereMici++;
            } else if (Character.isUpperCase(litera)) {
                litereMari++;
            }
        }
        System.out.println("Ati introdus " + litereMici + " litere mici.");
        System.out.println("Ati introdus " + litereMari + " litere mari.");


    }
}
