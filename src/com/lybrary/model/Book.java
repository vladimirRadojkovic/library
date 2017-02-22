package com.lybrary.model;

public class Book {

    public String name = "unknown";
    public String author = "unknown";
    public String isbn = "unknown";

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Book(String name, String author, String isbn) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
    }

    public void describe() {
        System.out.println(this.name + " " + this.author + " " + this.isbn);
    }
}
