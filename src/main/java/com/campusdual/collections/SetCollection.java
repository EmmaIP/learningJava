package com.campusdual.collections;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {
    public static void main(String[] args) {
        Set<String> instruments = new HashSet<>();

        instruments.add("piano");
        instruments.add("guitar");
        instruments.add("piano");
        instruments.add("drums");
        instruments.add("bass");
        instruments.add("drums");

        System.out.println("Set of instruments: ");
        for (String instrument:instruments) {  //no imprime los elementos duplicados
            System.out.println(instrument);
        }
        instruments.remove("drums");
        instruments.add("flute");
        System.out.println("Set of instruments after modification: ");
        for (String instrument:instruments) {
            System.out.println(instrument);
        }

    }
}
