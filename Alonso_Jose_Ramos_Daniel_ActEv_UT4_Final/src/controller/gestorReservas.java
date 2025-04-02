package controller;


import java.time.LocalDate;
import java.time.temporal.*;

import model.Cliente;
import model.Habitacion;
import model.estadoHabitacion;
import model.reserva;
import view.Vista;
import java.util.*;


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
        Vista.imprimir("Reserva finalizada para el cliente "+cliente.getNombreCliente()+ " en la habitación "+habitacion.getNum()+" codigo de la reserva: "+reservaCliente2.getIdReserva());
        Vista.imprimir("La habitación estará reservada desde "+reservaCliente2.getFechaCheckIn()+" hasta "+reservaCliente2.getFechaCheckOut());
    }

    public void cancelarReserva(Cliente clienteCancelar, int idReserva) {

        gestorHotel gestorHotel = new gestorHotel();

        List<reserva> reservasClienteCancelar = clienteCancelar.getReservasCliente();
        boolean reservaEncontrada = false;
        for (int i = 0; i < reservasClienteCancelar.size(); i++) {
            if (reservasClienteCancelar.get(i).getIdReserva() == idReserva) {
                Habitacion habitacionCancelar = reservasClienteCancelar.get(i).getHabitacionReservada();
                habitacionCancelar.setEstado(estadoHabitacion.DISPONIBLE);
                reservasClienteCancelar.remove(i);
                Vista.imprimir("Reserva cancelada para el cliente " + clienteCancelar.getNombreCliente()+ " en la habitación " + habitacionCancelar.getNum());
                reservaEncontrada = true;
                break;
            }
        }
        if (!reservaEncontrada) {
            Vista.imprimir("Reserva no encontrada");
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
        if (cliente.getReservasCliente().size() < 3) {
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
