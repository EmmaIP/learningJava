package com.campusdual.exceptions;

public class ByZeroException extends ArithmeticException{
    public ByZeroException() {  //constructor vacío
    }

    public ByZeroException(String s) {
        super(s);
    }
}
