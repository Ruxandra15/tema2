package com.ItFactory;

import java.util.Scanner;

public class problema_6 {
    public static void main(String[] args) {

        String text="Ma numesc NumePrenume si sunt cursant la cursul de testare din cadrul companiei facebook";
        Scanner scanner = new Scanner(System.in);
        String NumePrenume = scanner.nextLine();
        String denumire_curs = scanner.nextLine();
        String companie = scanner.nextLine();

        text=text.replace("NumePrenume",NumePrenume);
        text=text.replace("testare",denumire_curs);
        text=text.replace("facebook",companie);
        System.out.println(text);
    }
}
