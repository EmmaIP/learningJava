package com.campusdual.interfaces;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CarBooking implements IBooking{   //esta clase implementa la interfaz

    private String licensePlate;
    private boolean booked;  //es alquilable
    private Date bookDate;  //fecha en la que se alquila
    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
    //lo genero antes como atributo, no cada vez que se usa el método getDetails

    public CarBooking(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Boolean getBooked() {
        return booked;
    }

    public void setBooked(Boolean booked) {
        this.booked = booked;
    }

    public Date getBookDate() {
        return bookDate;
    }

    public void setBookDate(Date bookDate) {
        this.bookDate = bookDate;
    }

    @Override
    public void book(Date bookDate, String... args) {
        if(!this.booked) {  //reserva no activa, no se puede alquilar
            this.booked = true;  //aquí se puede alquilar
            this.bookDate = bookDate;
            System.out.println(this.licensePlate + " car booked successfully");

        }
        else{
            System.out.println(this.licensePlate + " car is already booked");
        }
    }

    @Override
    public void cancelBook() {  //cancelar reserva
        if(this.booked) {       //está alquilado
            this.booked = false;  //deja de estar alquilado
            System.out.println("Booking for " + this.licensePlate + " cancelled");
        }
        else {
            System.out.println(this.licensePlate + " car is not rented");
        }

    }

    @Override
    public void getTicketDetail() {   //ticket de reserva con la fecha



        if(this.booked) {
            System.out.println(this.licensePlate + " car booked for " + this.sdf.format(this.bookDate));
        }
        else {
            System.out.println(this.licensePlate + " car is not rented");
        }

    }
}
