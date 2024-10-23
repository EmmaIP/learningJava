package com.campusdual.interfaces;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FlightBooking implements  IBooking{
    private String company;
    private String flightNumber;
    private String bookedSeat = ""; //ahora mismo está vacío, no nulo, está inicializada
    private Date bookDate;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM");

    public FlightBooking(String company, String flightNumber) {
        this.company = company;
        this.flightNumber = flightNumber;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getBookedSeat() {
        return bookedSeat;
    }

    public void setBookedSeat(String bookedSeat) {
        this.bookedSeat = bookedSeat;
    }

    public Date getBookDate() {
        return bookDate;
    }

    public void setBookDate(Date bookDate) {
        this.bookDate = bookDate;
    }

    @Override
    public void book(Date bookDate, String... args) { //hacer reserva
        if(this.bookedSeat.isEmpty() && args.length > 0) {   //comprueba que el asiento reservado está vacío y además recibe más argumentos por parámetro
            this.bookedSeat = args[0];
            this.bookDate = bookDate;
            System.out.println("Booked seat on " + this.company + " " + this.flightNumber);
        }
        else {
            System.out.println("Not possible");
        }

    }

    @Override
    public void cancelBook() {
        this.bookedSeat = "";
        System.out.println("Booked cancelled");

    }

    @Override
    public void getTicketDetail() {
        if(!this.bookedSeat.isEmpty()) {  //lo contrario a q esté vacío, ie, existe reserva
            System.out.println("Flight: " + this.flightNumber + " " + this.company
                    + " for date: " + this.sdf.format(this.bookDate) + " has a seat booked");
        }
        else {
            System.out.println("This flight is not booked");
        }

    }
}
