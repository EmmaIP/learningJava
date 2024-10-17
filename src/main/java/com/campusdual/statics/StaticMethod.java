package com.campusdual.statics;

import java.util.Calendar;
import java.util.Date;

public class StaticMethod {

    public static String countDownToYear(String name, int year) {
        //objeto tipo date en el momento de ejecutar
        Date today = new Date();
        //momento concreto de tipo calendar, calendario de este momento
        Calendar calendar = Calendar.getInstance();
        //modifico el calendar a mi antojo pasándole el año por parámetro
        calendar.set(year, 0, 1, 0, 0, 0);
        //transforma el calendario a tipo date para conseguir el tiempo exacto
        Date targetDate = calendar.getTime();
        //milisegundos por eso es long
        long millis = targetDate.getTime() - today.getTime();
        //pasar de milis a días
        long days = millis/ (1000*60*60*24);

        if (days >0) {
            return "HI "+ name + " countdown to year " + year + " : " + days + " days";
        } else
            return "HI "+ name + " countdown to year " + year + " : " + Math.abs(days) + " days";
    }

    /*public static void main(String[] args) {
        String message = countDownToYear("Emma",2025);
        System.out.println(message);
        //forma más correcta llamando al static method primero
        System.out.println(StaticMethod.countDownToYear("Emma",2025));

    }*/
}
