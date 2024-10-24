package com.campusdual.polymorph;

public class FixitShop {
    public static void main(String[] args) {
        Device smart1 = new Smartphone("Coco", "J4"); //polimorfismo
        Device tablet1 = new Tablet("Mitushi", "34");
        Device laptop1 = new Laptop("Hauin", "WG78");

        //utiliza solo los métodos de la superclase
        smart1.turnOn();
        tablet1.turnOn();
        laptop1.turnOn();
        smart1.turnOff();
        tablet1.turnOff();
        laptop1.turnOff();

        IChargeable smart2 = new Smartphone("Gyu", "9Y"); //los guardo en una interfaz
        IChargeable tablet2 = new Tablet("Feasg", "6YU");
        IChargeable laptop2 = new Laptop("Weert", "WYG65");

        //utiliza solo los métodos de la interfaz
        smart2.use();
        tablet2.use();
        laptop2.use();
        smart2.charge();
        tablet2.charge();
        laptop2.charge();


        Device smart3 = new Smartphone("YUJI", "·34");
        IChargeable tablet3 = new Tablet("Weher", "Ert7");
        Device laptop3 = new Laptop("Korel", "W634");

        ((Smartphone)smart3).makeACall(); //castea el smart3 para que en ese momento sea un Smartphone en lugar de un Device
        ((Device)tablet3).turnOn(); //castea la interfaz a Device solo para esto
        ((IChargeable)laptop3).charge(); //castea de forma temporal el Device a interfaz

    }
}
