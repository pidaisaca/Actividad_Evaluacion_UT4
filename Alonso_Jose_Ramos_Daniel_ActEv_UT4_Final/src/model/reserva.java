package model;

import java.util.Date;

public class reserva {

    private String idReserva;
    private Date fechaCheckIn;
    private Date fechaCheckOut;
    private double totalReserva;
    private Habitacion habitacionReservada;

    public reserva(String idReserva, Date fechaCheckIn, Date fechaCheckOut, double totalReserva, Habitacion habitacionReservada) {
        this.idReserva = idReserva;
        this.fechaCheckIn = fechaCheckIn;
        this.fechaCheckOut = fechaCheckOut;
        this.totalReserva = totalReserva;
        this.habitacionReservada = habitacionReservada;
    }


public String getIdReserva() {
    return idReserva;
}

public void setIdReserva(String idReserva) {
    this.idReserva = idReserva;
}

public Date getFechaCheckIn() {
    return fechaCheckIn;
}

public void setFechaCheckIn(Date fechaCheckIn) {
    this.fechaCheckIn = fechaCheckIn;
}

public void setFechaCheckOut(Date fechaCheckOut) {
    this.fechaCheckOut = fechaCheckOut;
}

public Date getFechaCheckOut() {
    return fechaCheckOut;
}

public double getTotalReserva() {
    return totalReserva;
}

public void setTotalReserva(double totalReserva) {
    this.totalReserva = totalReserva;
}

public Habitacion getHabitacionReservada() {
    return habitacionReservada;
}

}
