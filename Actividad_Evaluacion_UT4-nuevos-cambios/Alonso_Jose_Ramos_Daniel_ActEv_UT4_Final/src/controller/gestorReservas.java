package controller;


import java.time.LocalDate;
import java.time.temporal.*;
import java.util.Scanner;
import model.Cliente;
import model.Habitacion;
import model.estadoHabitacion;
import model.reserva;
import view.Vista;


public class gestorReservas {

    private int idContadorReservas = 4;
    Scanner sc = new Scanner(System.in);

    public void crearReserva(Cliente cliente, Habitacion habitacion) {
        reserva reservaCliente2 = new reserva(idContadorReservas, null, null, habitacion.getPrecio(), cliente, habitacion);
        fechas fechas = new fechas();
        Vista.imprimir("¿Qué dia desea reservar la habitación?");
        int dia = sc.nextInt();
        Vista.imprimir("¿Que mes desea reservar la habitación?");
        int mes = sc.nextInt();
        Vista.imprimir("¿Que año desea reservar la habitación?");
        int anio = sc.nextInt();
        LocalDate fechaCheckIn = fechas.preguntarFecha(dia, mes, anio);
        if (fechaCheckIn.isAfter(LocalDate.now()) || fechaCheckIn.isEqual(LocalDate.now())) {
            reservaCliente2.setFechaCheckIn(fechaCheckIn);
        } else {
            Vista.imprimir("La fecha de check-in no puede ser anterior a la fecha actual");
            return;
        }

        Vista.imprimir("¿Qué dia desea abandonar la habitación?");
        int dia_out = sc.nextInt();
        Vista.imprimir("¿Que mes desea abandonar la habitación?");
        int mes_out = sc.nextInt();
        Vista.imprimir("¿Que año desea abandonar la habitación?");
        int anio_out = sc.nextInt();
        LocalDate fechaCheckOut = fechas.preguntarFecha(dia_out, mes_out, anio_out);

        if (fechaCheckOut.isBefore(fechaCheckIn) || fechaCheckOut.isEqual(fechaCheckIn)) {
            Vista.imprimir("La fecha de check-out no puede ser anterior a la fecha de check-in. Se aplicará el máx de dias a la reserva");
            fechas.setFechaCheckOutPorDefecto(reservaCliente2);
        } else {
            reservaCliente2.setFechaCheckOut(fechaCheckOut);
        }

        Long dias = ChronoUnit.DAYS.between(reservaCliente2.getFechaCheckIn(), reservaCliente2.getFechaCheckOut());
        reservaCliente2.setTotalReserva(habitacion.getPrecio() * dias);
        cliente.getReservasCliente().add(reservaCliente2);
        habitacion.setEstado(estadoHabitacion.RESERVADA);
        idContadorReservas++;
        System.out.println("Reserva realizada con exito");
    }

    public void cancelarReserva(Habitacion cancelarReserva) {
        if(cancelarReserva.getEstado() == estadoHabitacion.RESERVADA){
            cancelarReserva.setEstado(estadoHabitacion.DISPONIBLE);
            Vista.imprimir("Se ha cancelado la reserva. La habitacion "+cancelarReserva.getNum()+" ahora está disponible");
        }
        else{
            Vista.imprimir("La habitacion no se encuentra reservada");
        }
    }

    public void historialReserva(Cliente cliente) {
        for (reserva reserva : cliente.getHistorialReserva()) {
            Vista.imprimir(reserva.toString());
        }
    }

    public void reservasActivas(Cliente cliente) {  
        for (reserva reserva : cliente.getReservasCliente()) {
            Vista.imprimir(reserva.toString());
        }
    }


    public Habitacion getHabitacion(String numHabitacion) {
        
        return null;
    }

    public boolean controlMaxReservas(Cliente cliente) {
        if (cliente.getReservasCliente().size() <= 3) {
            return false;
        }
        return true;
    }


    public boolean controlEstadoHabitacion(Habitacion habitacion) {
        if (habitacion.getEstado() == estadoHabitacion.OCUPADA) {
            Vista.imprimir("La habitacion " + habitacion.getNum() + " esta ocupada.");
            return false;
        } else if (habitacion.getEstado() == estadoHabitacion.RESERVADA) {
            Vista.imprimir("La habitacion " + habitacion.getNum() + " ya esta reservada.");
            return false;
        }

        return true;
    }


}
