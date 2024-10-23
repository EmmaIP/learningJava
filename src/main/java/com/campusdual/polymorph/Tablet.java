package com.campusdual.polymorph;

public class Tablet extends Device implements IChargeable{
    public Tablet(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void charge() {
        System.out.println(this.getBrand() + " " + this.getModel() + " is charging at 33W");
    }

    @Override
    public void use() {
        System.out.println("Using with touch screen and keyboard");
    }

    public void changeScreenOrientatiom(){
        System.out.println("Switch screen orientation");
    }
}
