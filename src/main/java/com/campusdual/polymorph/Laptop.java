package com.campusdual.polymorph;

public class Laptop extends Device implements IChargeable{
    public Laptop(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void charge() {
        System.out.println(this.getBrand() + " " + this.getModel() + " is charging at 65W");
    }

    @Override
    public void use() {
        System.out.println("Using with mouse and keyboard");
    }

    public void behaviourOnCloseScreen(){
        System.out.println("Close screen, preventing power-saving mode");
    }
}
