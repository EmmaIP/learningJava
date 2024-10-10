package com.campusdual.methods;

public class Method {

    public static int arithmeticOperators() {
        int value = 5;
        value = value + 3;
        value = 2 - value;
        value += 3;
        value -=  1;
        value *= 4;
        value = (value-2) / 2;
        int newValue = 3;
        int myValue = 2;
        value = newValue + myValue;
        final int CONST = 2;
        value = CONST;
        value += 3;
        value = value % 2;
        value ++;
        value --;
        return value;
    }
    public static void logicOperators() {
        System.out.println("4 is equal to 4:" + (4==4));
        System.out.println("3 is equal different to 4:" + (3!=4));
        System.out.println("3 is greater to 5:" + (3>5));
        System.out.println("5 is less or equal to 5:" + (5<=5));
        System.out.println("Unique true combination for AND:" + (true && true));
        System.out.println("Unique false combination for OR:" + (false || false));
        System.out.println("NOT false:" + (!false));
    }

    public static String myCustonMessage(String custonName) {
        return "Hi " + custonName +"! This is your custon message";
    }

    public static void main(String[] args) {
        logicOperators();
        int arithResult = arithmeticOperators();
        System.out.println("Arithmetic result: " + arithResult);
        System.out.println("Arithmetic result: " + arithmeticOperators());
        String name = "Emma";
        String message = myCustonMessage(name);
        System.out.println(myCustonMessage(name));
        System.out.println(message);
    }
}


