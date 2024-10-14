package com.campusdual.loops;

import com.campusdual.Utils;

public class ContinueWithLoop {

    public static void continueExample() {  //todos los números pares hasta que el número que le digamos
        int num = Utils.integer("Write a number: ");
        for (int i = 0; i <= num; i++) {
            if(i % 2 != 0) {
                continue;   //en este caso vuelve al for
            }
            System.out.println(i + "/2 = " + (i/2));

            //if(i % == 0) { System.out.println(i + "/2 = " + (i/2));} otra forma sin continue
        }
    }
    public static void main(String[] args) {
        continueExample();
    }
}
