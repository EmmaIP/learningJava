package com.campusdual.subclasses;

public class Library {
    public static void main(String[] args) {

        Item item1 = new Item("New Item", "2010-01-02");
        Book book1 = new Book("The Martian Chronicles", "Ray Bradbury", "1950-05-04", "987898945634");
        Magazine magazine1 = new Magazine("Historia National Geographic", "Josep María Casals", "2024-05", 245);
        DVD dvd1 = new DVD("Inception", "Christopher Nolan", "2010-07-16", 148);

        System.out.println(item1.getDetails());
        System.out.println(book1.getDetails());

        book1.checkedOut();  //alquilo el libro
        book1.returnItem();  //devuelvo el libro

        System.out.println(magazine1.getDetails());
        magazine1.checkedOut();
        magazine1.returnItem();

        System.out.println(dvd1.getDetails());
        dvd1.checkedOut();
        dvd1.returnItem();

        dvd1.checkedOut();
        dvd1.play();
        dvd1.returnItem();
    }
}
