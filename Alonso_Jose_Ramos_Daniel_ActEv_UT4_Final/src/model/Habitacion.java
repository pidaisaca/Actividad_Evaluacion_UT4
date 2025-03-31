package model;

public class Habitacion {
    private final int numeroHabitacion;
    private final tipoHabitacion tipo;
    private final double precioNoche;
    private  estadoHabitacion estado;
    private  String descripcion;

    public Habitacion(int numeroHabitacion, tipoHabitacion tipo, double precioNoche, estadoHabitacion estado,
            String descripcion) {

        this.numeroHabitacion = numeroHabitacion;
        this.tipo = tipo;
        this.precioNoche = precioNoche;
        this.estado = estado;
        this.descripcion = descripcion;
    }

    public int getNum() {
        return numeroHabitacion;
    }
    public tipoHabitacion getTipo(){
        return tipo;
    }
    public double getPrecio(){
        return precioNoche;
    }
    public estadoHabitacion getEstado(){
        return estado;
    }
    public String getDescripcion(){
        return descripcion;
    }

    public void setEstado(estadoHabitacion nuevoEstado){
        this.estado = nuevoEstado;
    }

    public String toString() {
        return "Habitacion Nº " + numeroHabitacion + " | Tipo: " + tipo + " | Precio por noche: " + precioNoche
                + "€ | Estado: " + estado + "| Descripcion: " + descripcion;
    }
}
