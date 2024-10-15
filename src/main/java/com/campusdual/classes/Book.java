package com.campusdual.classes;

import com.campusdual.Utils;

public class Book {  //con los atributos de la clase libro no inicializados
    public String title;
    public String author;
    public int pageNumber;

    public Book(String title, String author, int numberOfPages) {  //método constructor de la clase libro
        this.title = title;
        this.author = author;
        this.pageNumber = numberOfPages;
    }

    public Book() {   //constructor vacío
        this.title = Utils.string("Write the book title: ");
        this.author = Utils.string("Write the book author: ");
        this.pageNumber = Utils.integer("Write the number of pages: ");
    }

    //método para mostrar datos por pantalla sin static
    public void showBookDetails() {
        System.out.println(this.title + "-" + this.author + " (" + this.pageNumber + " pages)");
    }

    public static void main(String[] args) {
        Book book1 = new Book("Rhythm of war", "Brandon Sanderson", 1902);
        Book book2 = new Book("The Magician´s Appretice", "Trudi Canavan", 781);
        Book book3 = new Book("El paciente", "Juan Gómez-Jurado", 471);
        Book book4 = new Book();

        book1.showBookDetails();
        book2.showBookDetails();
        book3.showBookDetails();
        book4.showBookDetails();
    }
}
