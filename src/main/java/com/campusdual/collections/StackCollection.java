package com.campusdual.collections;

import java.util.Stack;

public class StackCollection {
    public static void main(String[] args) {
        Stack<String> instruments = new Stack<>();
        instruments.push("guitar");
        instruments.push("piano");
        instruments.push("drums");
        instruments.push("violin");

        String removedInstru = instruments.pop();
        System.out.println("Instrument removed: " + removedInstru);

        String peekedInstru = instruments.peek();
        System.out.println("Instrument peeked: " + peekedInstru);

    }
}
