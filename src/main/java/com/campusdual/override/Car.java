package com.campusdual.override;

public class Car extends Vehicle{

    @Override      //sobreescritura del método de la superclase
    public void start() {

        System.out.println("Starting the car");
    }
}
