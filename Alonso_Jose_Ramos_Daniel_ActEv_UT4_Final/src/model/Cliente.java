package model;
import java.util.List;


public class Cliente {

    private String idCliente;
    private String nombreCliente;
    private List<reserva> historialReserva; 
    private List<reserva> reservasCliente; 


    // Constructor
    public Cliente(String idCliente, String nombreCliente, List<reserva> reservasCliente, List<reserva> historialReserva) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.historialReserva = historialReserva;
        this.reservasCliente = reservasCliente;
    }

    // Getters y setters
    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public List<reserva> getHistorialReserva() {
        return historialReserva;
    }

    public void setHistorialReserva(List<reserva> historialReserva) {
        this.historialReserva = historialReserva;    
    }

    public List<reserva> getReservasCliente() {
        return reservasCliente;
    }

    public void setReservasCliente(List<reserva> reservasCliente) {
        this.reservasCliente = reservasCliente;
    }

    public String ClientetoString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(idCliente).append(" Nombre: ").append(nombreCliente);
        sb.append("\n");
        sb.append("Reservas: ");
        sb.append("\n");
        for (reserva reserva : reservasCliente) {
            sb.append(reserva.toString()).append("\n");
        }
        
        sb.append("Historial: ");
        for (reserva reserva : historialReserva) {
            sb.append(reserva.toString()).append("\n");
        }
        
        return sb.toString();
    }
}
