package com.campusdual.exceptions;

public class Exceptions {

    public static int divisionByNumber(int a, int b) throws ByZeroException{
        if(b == 0){
            throw new ByZeroException("Cannot perform a division by 0");
        }
        else{
            return a/b;
        }
    }

    public static void main(String[] args) {
        int dividend = 3, divisor = 0;
        try {
            int result = Exceptions.divisionByNumber(dividend, divisor);
            //String greetings = "hello there!";
            //System.out.println(Integer.parseInt(greetings));
        }
        catch (ByZeroException e) {
            System.out.println("Program failed " + e.getMessage());
            e.printStackTrace(); //imprime la traza del error

        }

            System.out.println("Program finished");




    }
}
