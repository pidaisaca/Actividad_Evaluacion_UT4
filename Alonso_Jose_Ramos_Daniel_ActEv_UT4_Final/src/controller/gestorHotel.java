package controller;

import java.util.ArrayList;

import model.Cliente;
import model.Habitacion;

public class gestorHotel {

    private ArrayList<Habitacion> habitaciones;
    private ArrayList<Cliente> clientes;

    public void annadirHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public void annadirCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void listarClientes() {
        clientes.forEach(System.out::println);
    }

    public void listarHabitaciones() {
        habitaciones.forEach(System.out::println);
    }
}
