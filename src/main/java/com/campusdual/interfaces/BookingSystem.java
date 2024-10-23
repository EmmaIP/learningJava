package com.campusdual.interfaces;

import java.util.Date;

public class BookingSystem {
    public static void main(String[] args) {

        CarBooking cb = new CarBooking("0865764");
        cb.book(new Date());  //alquilar el coche ahora
        cb.getTicketDetail();
        cb.cancelBook();
        cb.getTicketDetail();
        FlightBooking fb = new FlightBooking("Iberia", "IB4567");
        fb.book(new Date(), "v56");
        fb.getTicketDetail();
    }
}
