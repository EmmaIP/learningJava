package com.campusdual.selections;

public class SwitchStatement {

    public static int methodSwitch(int number) {
        int toRet = 0;
        switch (number + 1){
            case 1:
                toRet = number + 1;
                break;
            case 2:
                toRet = number;
                break;
            case 3:
                toRet = number - 1;
                break;
            default:
                toRet = number + 2;
                break;
        }
        return toRet;
    }
    public static void main(String[] args) {

        int initialNumber = 4;
        int number = methodSwitch(initialNumber);
        System.out.println("Initial number is " + initialNumber + ", final number is " + number);
    }
}
