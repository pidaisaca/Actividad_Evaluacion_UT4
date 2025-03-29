package model;
import java.util.List;

public class Cliente {

    private String idCliente;
    private String nombreCliente;
    private List<String> historialReserva; 
    private List<String> reservasCliente; 

    // Constructor
    public Cliente(String idCliente, String nombreCliente, List<String> historialReserva, List<String> reservasCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.historialReserva = historialReserva;
        this.reservasCliente = reservasCliente;
    }

    public String getIdCliente(){
        return idCliente;
    }

    public String  getNombreCliente(){
        return nombreCliente;
    }

    public List<String> getHistorialReserva(){
        return historialReserva;
    }

    public List<String> getReservaCliente(){
        return reservasCliente;
    }
}
