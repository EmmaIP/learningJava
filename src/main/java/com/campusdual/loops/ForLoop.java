package com.campusdual.loops;

import com.campusdual.Utils;

public class ForLoop {

    public static void countEvenNumbers() {
        int initialNumber = Utils.integer("Write your start number: ");
        int finalNumber = Utils.integer("Write your final number: ");
        int count = 0;

        for(int i = initialNumber; i<= finalNumber; i++) {
            if(i % 2 == 0) {    //si es número par el resto de dividirlo entre 2 es cero
                count++;
            }
        }
        System.out.println("There are " + count + " between " + initialNumber + " and " + finalNumber);
    }
    public static void main(String[] args) {
        countEvenNumbers();

    }
}
