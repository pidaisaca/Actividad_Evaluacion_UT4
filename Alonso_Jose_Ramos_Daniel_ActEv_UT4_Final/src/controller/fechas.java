package controller;


import java.time.LocalDate;

import model.reserva;


public class fechas {

    
    /**
     * Establece la fecha de check-in a un dia deseado
     * @param reserva la reserva a la que se le establecer la fecha de check-in.
     */
    public void setFechaCheckIn(reserva reserva, LocalDate fechaCheckIn) {
        reserva.setFechaCheckIn(fechaCheckIn);
    }

    
    /**
     * Establece la fecha de check-out a 90 dias a partir del check-in
     * debido a la restricción de 90 dias
     * @param reserva la reserva a la que se le establecer la fecha de check-out.
     */
    public void setFechaCheckOutPorDefecto(reserva reserva) {
        LocalDate fechaCheckOut = reserva.getFechaCheckIn().plusDays(90);
        reserva.setFechaCheckOut(fechaCheckOut);
    }

    public void setFechaCheckOut(reserva reserva, LocalDate fechaCheckOut) {
        reserva.setFechaCheckOut(fechaCheckOut);
    }

    /**
     * Crea una fecha a partir de los 
     * parametros escritos por el usuario
     * @param dia el día del mes
     * @param mes el mes del año
     * @param anio el año
     * @return un objeto LocalDate que representa la fecha especificada
     */

    public LocalDate preguntarFecha(int dia, int mes, int anio) {
        LocalDate fechaReserva = LocalDate.of(anio, mes, dia);
        return fechaReserva;
    }

}

