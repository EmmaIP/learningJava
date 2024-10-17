package com.campusdual.encapsulation;

public class Vehicle {

    //definimos los atributos
    private String brand;
    private String licensePlate;
    private String model;
    private boolean available;
    public static final int LEGAL_MAX_SPEED = 120;


    //generamos el constructor con los atributos
    public Vehicle(String brand, String licensePlate, String model) {
        this.brand = brand;
        this.licensePlate = licensePlate;
        this.model = model;
        this.available = true;


    }
    //generamos los getters y los setters
    public String getBrand() {

        return this.brand;
    }

    public void setBrand(String brand) {

        this.brand = brand;
    }

    public String getLicensePlate() {

        return this.licensePlate;
    }

    public void setLicensePlate(String licensePlate) {

        this.licensePlate = licensePlate;
    }

    public String getModel() {

        return this.model;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public boolean isAvailable() {

        return this.available;
    }

    public void setAvailable(boolean available) {

        this.available = available;
    }

    //método para alquilar un coche
    public void rentACar(){
        if(this.available) {   //la condición siempre es true
            this.available = false;
            System.out.println("The vehicle with license plate: " + this.licensePlate + " has been rented.");
        }
        else {
            System.out.println("The vehicle with license plate: " + this.licensePlate + " is not available.");
        }
    }

    public void returnACar(){
        if(!this.available) {   //niega la condición
            this.available = true;
            System.out.println("The vehicle with license plate: " + this.licensePlate + " has been returned.");
        }
        else {
            System.out.println("The vehicle with license plate: " + this.licensePlate + " is already available.");
        }
    }

    public String getDetails() {
        return this.brand + " " + this.model + "\n\tlicense plate: " + this.licensePlate + "\n\tavailable " + (this.available ? "YES" : "NO" );
    }

    public static void main(String[] args) {
        Vehicle ve1 = new Vehicle("Ford", "8976567", "Mondeo");
        System.out.println(ve1.getDetails());
        ve1.rentACar();
        System.out.println(ve1.getDetails());
        ve1.returnACar();
        System.out.println(ve1.getDetails());
    }


}
