package com.campusdual.classes.anotherPackage;

import com.campusdual.classes.Book;

public class AnotherClass {
    public static void main(String[] args) {
        Book book1 = new Book("Rhythm of war", "Brandon Sanderson", 1902);
        Book book2 = new Book("The Magician´s Appretice", "Trudi Canavan", 781);

       book1.showBookDetails();
        book2.showBookDetails();
       System.out.println(book1.title);
    }
}
