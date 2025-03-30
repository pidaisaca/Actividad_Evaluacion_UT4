package controller;

import java.util.ArrayList;

import model.Cliente;
import model.Habitacion;

public class gestorHotel {

    private ArrayList<Habitacion> habitaciones;
    private ArrayList<Cliente> clientes;

    
    //constructor para inicializar las listas
    public gestorHotel(){
        this.habitaciones = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }
    public void annadirHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public void annadirCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void listarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente.ClientetoString());
        }
    }

    public void listarHabitaciones() {
        for (Habitacion habitacion : habitaciones) {
            System.out.println(habitacion.toString());
        }
    }
}
