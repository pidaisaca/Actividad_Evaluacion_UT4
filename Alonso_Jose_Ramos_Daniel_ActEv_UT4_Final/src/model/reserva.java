package model;

import java.time.LocalDate;
import java.util.Date;

public class reserva {

    private String idReserva;
    private LocalDate fechaCheckIn;
    private LocalDate fechaCheckOut;
    private double totalReserva;
    private Habitacion habitacionReservada;

    public reserva(String idReserva, LocalDate fechaCheckIn, LocalDate fechaCheckOut, double totalReserva, Habitacion habitacionReservada) {
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

public LocalDate getFechaCheckIn() {
    return fechaCheckIn;
}

public void setFechaCheckIn(LocalDate fechaCheckIn) {
    this.fechaCheckIn = fechaCheckIn;
}

public void setFechaCheckOut(LocalDate fechaCheckOut) {
    this.fechaCheckOut = fechaCheckOut;
}

public LocalDate getFechaCheckOut() {
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
