package model;

import java.util.Date;

public class reserva {

    private String idReserva;
    private Date fechaCheckIn;
    private Date fechaCheckOut;
    private double totalReserva;

    public reserva(String idReserva, Date fechaCheckin, Date fechaCheckOut, double totalReserva) {
        this.idReserva = idReserva;
        this.fechaCheckIn = fechaCheckin;
        this.fechaCheckOut = fechaCheckOut;
        this.totalReserva = totalReserva;
    }

    public String getIdReserva(){
        return idReserva;
    }

    public Date getFechaChekIn(){
        return fechaCheckIn;
    }
    public Date getFechaCheckOut(){
        return fechaCheckOut;
    }
    public double getTotalReserva(){
        return  totalReserva;
    }
}
