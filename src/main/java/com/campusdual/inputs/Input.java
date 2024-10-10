package com.campusdual.inputs;

import com.campusdual.Utils;

import java.util.Scanner;

public class Input {

    public static void useScannerToGetName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write your name: ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name);
    }

    public static void useUtilsToGetname() {
        int name = Utils.integer("Write your name: ");
        System.out.println("Hi " + name);
    }
    public static void main(String[] args) {
        //useScannerToGetName();
        useUtilsToGetname();
    }
}
