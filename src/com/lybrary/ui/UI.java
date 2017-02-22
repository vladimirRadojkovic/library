package com.lybrary.ui;

import java.util.Scanner;

public class UI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        while (true) {
            System.out.println("Unesi [1] za unos knjige [2] za prikaz knjiga [3] za brisanje knjige [4] za informacije o knjizi");
            try {
                int option = scanner.nextInt();
                if (option == 1) {
                    library.add(scanner.next(), scanner.next(), scanner.next());
                }
                if (option == 2) {
                    library.showAll();
                }
                if (option == 3) {
                    library.remove(scanner.next());
                }
                if (option == 4) {
                    library.bookInfo(scanner.next());
                }
            } catch (Exception ex) {
                System.out.println("Greska u unosu");
                scanner.next();
            }
        }
    }
}
