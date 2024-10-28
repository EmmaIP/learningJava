package com.campusdual.collections;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {
    public static void main(String[] args) {
        List<String> instruments = new ArrayList<>();

        instruments.add("guitar");
        instruments.add("piano");
        instruments.add("drums");
        instruments.add("bass");

        for (int i = 0; i < instruments.size(); i++) {
            System.out.println("Instrument: " + instruments.get(i) + " at index " + i);
        }
        instruments.remove(instruments.get(1)); //elimina el elemento del index 1

        for (int i = 0; i < instruments.size(); i++) {
            System.out.println("Instrument: " + instruments.get(i) + " at index " + i);
        }
        for (String item : instruments) {  //foreach recorre sin tener en cuenta el index
            System.out.println(item);
        }
    }
}
