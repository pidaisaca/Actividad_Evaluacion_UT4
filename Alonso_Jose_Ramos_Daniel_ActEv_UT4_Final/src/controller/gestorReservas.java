package controller;

import model.reserva;
import model.Cliente;   

public class gestorReservas {

    public void crearReserva() {

    }

    public void cancelarReserva() {

    }

    public void historialReserva() {

    }

    public void reservasActivas() {

    }

    public void calcularReserva() {

    }

    public void controlMaxReservas(Cliente cliente) {
        if (cliente.getReservasCliente().size() >= 3) {
            System.out.println("El cliente " + cliente.getNombreCliente() + " ha superado el maximo de reservas permitidas.");
        }
    }
}
