package com.campusdual.statics;

public class UseOfStatic {
    public static void main(String[] args) {

        System.out.println(StaticMethod.countDownToYear("Emma",2025));

        StaticAtribute  sta1= new StaticAtribute();
        StaticAtribute  sta2= new StaticAtribute();
        StaticAtribute  sta3= new StaticAtribute();

        System.out.println(StaticAtribute.totalCounter);


    }
}
