package com.campusdual.abstractclass;

public class Zoo {
    public static void main(String[] args) {
        //no se puede instanciar: Animal Anima a = new(name);
        Cat c = new Cat("cat");
        c.sleep();
        c.wakeUp();
        c.makeSound();

        Fox f = new Fox("fox");
        f.sleep();
        f.wakeUp();
        f.makeSound();

        AngoraCat ac = new AngoraCat("Angi");
        ac.sleep();
        ac.wakeUp();
        ac.makeSound();


    }
}
