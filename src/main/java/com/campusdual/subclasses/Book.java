package com.campusdual.subclasses;

public class Book extends Item{  //es una subclase de Item

    private String author;
    private String ISBN;

    public Book(String title, String author, String publicationDate, String ISBN) {
        super(title, publicationDate);  //son los atributos del constructor de la superclase
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
