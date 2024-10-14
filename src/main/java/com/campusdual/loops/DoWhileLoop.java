package com.campusdual.loops;

import com.campusdual.Utils;

public class DoWhileLoop {

    public static void interactiveMenu() {
        int opt;
        do {
            System.out.println("\nInteractive menu");   //\n hace un salto de línea
            System.out.println("1. Print \"Hi\"");      // \"mantiene las comillas interiores
            System.out.println("2. Print \"Bye\"");
            System.out.println("3. Exit");

            opt = Utils.integer("\nChoose an option: ");
            switch (opt) {
                case 1:
                    System.out.println("Hi");
                    break;
                case 2:
                    System.out.println("Bye");
                    break;
                case 3:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("This is not a valid option, choose another");
                    break;
            }

        } while(opt !=3);  //ejecuta las instrucciones anteriores mientras el valor no sea 3
    }
    public static void main(String[] args) {
            interactiveMenu();
    }
}
