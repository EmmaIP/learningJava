package com.campusdual.interfaces;

import java.util.Date;

public interface IBooking {

    //en la interfaz todos los métodos son públicos no es necesario indicarlo
    void book(Date bookDate, String...args); //los siguientes parámetros son todos String, da igual el número
    void cancelBook();
    void getTicketDetail();
}
