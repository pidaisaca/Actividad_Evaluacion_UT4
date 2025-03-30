package controller;

import model.Cliente;
import model.Habitacion;
import model.estadoHabitacion;


public class gestorReservas {

    public void crearReserva(Cliente cliente, Habitacion habitacion) {
        int numHabitacion = habitacion.getNum();
        
        


        
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
