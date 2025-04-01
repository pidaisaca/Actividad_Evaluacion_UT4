package model;

import java.time.LocalDate;

public class reserva {

    private int idReserva;
    private LocalDate fechaCheckIn;
    private LocalDate fechaCheckOut;
    private double totalReserva;
    private Habitacion habitacionReservada;
    private Cliente cliente;

    public reserva(int idReserva, LocalDate fechaCheckIn, LocalDate fechaCheckOut, double totalReserva, Cliente cliente, Habitacion habitacionReservada) {
        this.idReserva = idReserva;
        this.fechaCheckIn = fechaCheckIn;
        this.fechaCheckOut = fechaCheckOut;
        this.totalReserva = totalReserva;
        this.cliente = cliente;
        this.habitacionReservada = habitacionReservada;
    }


public int getIdReserva() {
    return idReserva;
}

public void setIdReserva(int idReserva) {
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

public void setHabitacionReservada(Habitacion habitacionReservada) {
    this.habitacionReservada = habitacionReservada;
}

public Cliente getCliente() {
    return cliente;
}

public void setCliente(Cliente cliente) {
    this.cliente = cliente;
}

public String toString() {
    return "Reserva " + idReserva + ": " + fechaCheckIn + " - " + fechaCheckOut + ", Habitación " + habitacionReservada.getNum() + ", Precio: " + totalReserva + "€";
}

}
