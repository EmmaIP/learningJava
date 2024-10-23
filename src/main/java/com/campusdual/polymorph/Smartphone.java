package com.campusdual.polymorph;

public class Smartphone extends Device implements IChargeable{
    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void charge() {
        System.out.println(this.getBrand() + " " + this.getModel() + " is charging at 15W");
    }

    @Override
    public void use() {
        System.out.println("Using with touch screen");

    }

    public void makeACall() {

        System.out.println("Making a call");
    }
}
