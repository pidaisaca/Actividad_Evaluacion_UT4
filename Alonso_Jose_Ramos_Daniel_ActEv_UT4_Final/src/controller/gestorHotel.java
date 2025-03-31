package controller;

import java.util.ArrayList;

import model.Cliente;
import model.Habitacion;
import view.Vista;

public class gestorHotel {

    private ArrayList<Habitacion> habitaciones;
    private ArrayList<Cliente> clientes;

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
            Vista.imprimir(cliente.ClientetoString());
        }
    }

    public void listarHabitaciones() {
        for (Habitacion habitacion : habitaciones) {
            Vista.imprimir(habitacion.toString());
        }
    }

    public Habitacion buscarHabitacion(int numHabitacion) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNum() == numHabitacion) {
                return habitacion;
            }
        }
        return null;
    }

    public Cliente buscarCliente(String dni) {
        for (Cliente cliente : clientes) {
            if (cliente.getIdCliente().equals(dni)) {
                return cliente;
            }
        }
        return null;
    }
}
