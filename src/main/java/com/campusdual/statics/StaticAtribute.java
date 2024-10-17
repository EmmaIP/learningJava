package com.campusdual.statics;

public class StaticAtribute {

    public static int  totalCounter = 0; //atributo estático

    //método de incrementa e imprime
    public void incrementAndPrint() {
        StaticAtribute.totalCounter++;  //en caso de tener otra clase con el mismo nombre de variable estático
        System.out.println("Counter: " + StaticAtribute.totalCounter);
    }

}
