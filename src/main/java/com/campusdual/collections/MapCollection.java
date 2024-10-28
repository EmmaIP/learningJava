package com.campusdual.collections;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {
    public static void main(String[] args) {

        Map<String, String> instrumentsTypes = new HashMap<>();  //instrumento y tipo

        instrumentsTypes.put("guitar", "cords");
        instrumentsTypes.put("piano", "cords");
        instrumentsTypes.put("drums", "percussion");
        instrumentsTypes.put("violin", "cords");

        System.out.println("Map of instruments and types");
        for (Map.Entry<String, String> entry : instrumentsTypes.entrySet()) {  //se localizan primero las entradas que tienen y luego recorrerlas
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        instrumentsTypes.put("piano", "percussion");

        System.out.println("Map after modification");
        for (Map.Entry<String, String> entry : instrumentsTypes.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("Contains specific key");
        System.out.println(instrumentsTypes.containsKey("piano"));

    }
}
