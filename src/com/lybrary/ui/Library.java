package com.lybrary.ui;

import com.lybrary.model.Book;
import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> library = new ArrayList<>();

    public void add(String name, String author, String isbn) {
        System.out.println("Unesi ime autora, naziv knjige i isbn");
        library.add(new Book(name, author, isbn));
    }

    public void showAll() {
        for (int i = 0; i < library.size(); i++) {
            System.out.println(library.get(i).author + " " + library.get(i).name);
        }
    }

    public void remove(String bookName) {
        System.out.println("Unesite ime knjige za brisanje:");
        for (int i = 0; i < library.size(); i++) {
            if (bookName.equals(library.get(i).name)) {
                library.remove(i);
            }
        }
    }

    public void bookInfo(String bookName) {
        System.out.println("Unesite ime knjige za pregled:");
        for (int i = 0; i < library.size(); i++) {
            if (bookName.equals(library.get(i).name)) {
                library.get(i).describe();
            }
        }
    }
}
