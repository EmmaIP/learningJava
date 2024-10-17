package com.campusdual.subclasses;

public class Library {
    public static void main(String[] args) {
        Item item1 = new Item("New Item", "2010-01-02");
        Book book1 = new Book("The Martian Chronicles", "Ray Bradbury", "1950-05-04", "987898945634");

        System.out.println(item1.getDetails());
        System.out.println(book1.getDetails());
    }
}
