package com.campusdual.operators;

public class LogicOperators {
    public static void main(String[] args) {
        System.out.println("4 is equal to 4:" + (4==4));
        System.out.println("3 is equal different to 4:" + (3!=4));
        System.out.println("3 is greater to 5:" + (3>5));
        System.out.println("5 is less or equal to 5:" + (5<=5));
        System.out.println("Unique true combination for AND:" + (true && true));
        System.out.println("Unique false combination for OR:" + (false || false));
        System.out.println("NOT false:" + (!false));
    }
}