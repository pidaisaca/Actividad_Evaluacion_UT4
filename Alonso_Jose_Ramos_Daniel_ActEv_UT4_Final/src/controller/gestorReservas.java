package controller;

import model.Cliente;
import model.Habitacion;
import model.estadoHabitacion;
import model.reserva;

import java.time.LocalDate;

public class gestorReservas {

    private int idContadorReservas = 4;

    public void crearReserva(Cliente cliente, Habitacion habitacion) {
        reserva reservaCliente2 = new reserva(idContadorReservas, null, null, precioSuite, habitacion15);
        System.out.println("¿Qué dia desea reservar la habitación?");
        fechas fechas = new fechas();
        LocalDate fechaCheckIn = fechas.preguntarFecha(1, 1, 2023);
        fechas.setFechaCheckIn( reservaCliente2,fechaCheckIn);
        fechas.setFechaCheckOut(reservaCliente2);
        
    }

    public void cancelarReserva() {

    }

    public void historialReserva() {

    }

    public void reservasActivas() {

    }

    public void calcularReserva() {

    }

    public Habitacion getHabitacion(String numHabitacion) {
        
        return null;
    }

    public void controlMaxReservas(Cliente cliente) {
        if (cliente.getReservasCliente().size() >= 3) {
            System.out.println("El cliente " + cliente.getNombreCliente() + " ha superado el maximo de reservas permitidas.");
        }
    }

    public void buscarCliente(String idCliente) {
        
    }

    public boolean controlEstadoHabitacion(Habitacion habitacion) {
        if (habitacion.getEstado() == estadoHabitacion.OCUPADA) {
            System.out.println("La habitacion " + habitacion.getNum() + " esta ocupada.");
            return false;
        } else if (habitacion.getEstado() == estadoHabitacion.RESERVADA) {
            System.out.println("La habitacion " + habitacion.getNum() + " ya esta reservada.");
            return false;
        }

        return true;
    }


}
