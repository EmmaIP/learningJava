package com.campusdual.override;

public class Garage {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle();
        Car car1 = new Car();
        Tractor tractor1 = new Tractor();

        vehicle1.start();
        car1.start();
        tractor1.start();
    }
}
