package com.campusdual.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCollection {
    public static void main(String[] args) {
        Queue<String> instruments = new LinkedList<>();
        instruments.offer("guitar");
        instruments.offer("piano");
        instruments.offer("drums");
        instruments.offer("violin");

        System.out.println("Queue of instruments: ");
        for (String instru:instruments) {
            System.out.println(instru);
        }
        String removedInstrument = instruments.poll();
        System.out.println("removed " + removedInstrument);

        System.out.println("Queue of instruments after removal: ");
        for (String instru:instruments) {
            System.out.println(instru);
        }
        String firstInstrument = instruments.peek();
        System.out.println("peeked instrument: " + firstInstrument);

        System.out.println("Queue of instruments after peek: ");
        for (String instru:instruments) {
            System.out.println(instru);
        }
    }
}
