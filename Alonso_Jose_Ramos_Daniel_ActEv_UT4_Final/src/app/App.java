package app;

import java.util.*;

import controller.gestorHotel;
import controller.gestorReservas;
import model.Cliente;
import model.Habitacion;
import model.reserva;
import model.estadoHabitacion;
import model.tipoHabitacion;
import java.time.LocalDate;
import vista.Vista;

public class App {
    public static void main(String[] args) throws Exception {
        
        gestorHotel gestorHotel = new gestorHotel();
        gestorReservas gestorReservas = new gestorReservas();
        double precioIndividual = 100.0;
        double precioDoble = 200.0;
        double precioSuite = 300.0;

        // Crear habitaciones
        
        Habitacion habitacion1 = new Habitacion(101, tipoHabitacion.INDIVIDUAL, precioIndividual, estadoHabitacion.DISPONIBLE, "Habitacion individual");
        Habitacion habitacion2 = new Habitacion(102, tipoHabitacion.DOBLE, precioDoble, estadoHabitacion.DISPONIBLE, "Habitacion doble");
        Habitacion habitacion3 = new Habitacion(103, tipoHabitacion.SUITE, precioSuite, estadoHabitacion.DISPONIBLE, "Habitacion suite");
        Habitacion habitacion4 = new Habitacion(104, tipoHabitacion.INDIVIDUAL, precioIndividual, estadoHabitacion.DISPONIBLE, "Habitacion individual");
        Habitacion habitacion5 = new Habitacion(105, tipoHabitacion.DOBLE, precioDoble, estadoHabitacion.DISPONIBLE, "Habitacion doble");
        Habitacion habitacion6 = new Habitacion(201, tipoHabitacion.SUITE, precioSuite, estadoHabitacion.DISPONIBLE, "Habitacion suite");
        Habitacion habitacion7 = new Habitacion(202, tipoHabitacion.INDIVIDUAL, precioIndividual, estadoHabitacion.DISPONIBLE, "Habitacion individual");
        Habitacion habitacion8 = new Habitacion(203, tipoHabitacion.DOBLE, precioDoble, estadoHabitacion.DISPONIBLE, "Habitacion doble");
        Habitacion habitacion9 = new Habitacion(204, tipoHabitacion.SUITE, precioSuite, estadoHabitacion.DISPONIBLE, "Habitacion suite");
        Habitacion habitacion10 = new Habitacion(205, tipoHabitacion.INDIVIDUAL, precioIndividual, estadoHabitacion.DISPONIBLE, "Habitacion individual");
        Habitacion habitacion11 = new Habitacion(301, tipoHabitacion.DOBLE, precioDoble, estadoHabitacion.DISPONIBLE, "Habitacion doble");
        Habitacion habitacion12 = new Habitacion(302, tipoHabitacion.SUITE, precioSuite, estadoHabitacion.DISPONIBLE, "Habitacion suite");
        Habitacion habitacion13 = new Habitacion(303, tipoHabitacion.INDIVIDUAL, precioIndividual, estadoHabitacion.RESERVADA, "Habitacion individual");
        Habitacion habitacion14 = new Habitacion(304, tipoHabitacion.DOBLE, precioDoble, estadoHabitacion.RESERVADA, "Habitacion doble");
        Habitacion habitacion15 = new Habitacion(305, tipoHabitacion.SUITE, precioSuite, estadoHabitacion.RESERVADA, "Habitacion suite");

        gestorHotel.annadirHabitacion(habitacion1);
        gestorHotel.annadirHabitacion(habitacion2);
        gestorHotel.annadirHabitacion(habitacion3);
        gestorHotel.annadirHabitacion(habitacion4);
        gestorHotel.annadirHabitacion(habitacion5);
        gestorHotel.annadirHabitacion(habitacion6);
        gestorHotel.annadirHabitacion(habitacion7);
        gestorHotel.annadirHabitacion(habitacion8);
        gestorHotel.annadirHabitacion(habitacion9);
        gestorHotel.annadirHabitacion(habitacion10);
        gestorHotel.annadirHabitacion(habitacion11);
        gestorHotel.annadirHabitacion(habitacion12);
        gestorHotel.annadirHabitacion(habitacion13);
        gestorHotel.annadirHabitacion(habitacion14);
        gestorHotel.annadirHabitacion(habitacion15);


        // Crear clientes, reservas y historial. Cliente1 tendra reservas al maximo y un historial. Cliente2 estará sin reservas

        List<reserva> reservasCliente1 = new ArrayList<reserva>();
        List<reserva> reservasCliente2 = new ArrayList<reserva>();
        List<reserva> historialCliente1 = new ArrayList<reserva>();
        List<reserva> historialCliente2 = new ArrayList<reserva>();

        reserva reservaCliente1_1 = new reserva("1", null, null, precioSuite, habitacion15);
        reserva reservaCliente1_2 = new reserva("2", null, null, precioDoble, habitacion14);
        reserva reservaCliente1_3 = new reserva("3", null, null, precioIndividual, habitacion13);

        reservasCliente1.add(reservaCliente1_1);
        reservasCliente1.add(reservaCliente1_2);
        reservasCliente1.add(reservaCliente1_3);

        Cliente cliente1 = new Cliente("1", "Javier", reservasCliente1, historialCliente1);
        Cliente cliente2 = new Cliente("2", "Alba", reservasCliente2, historialCliente2);

        gestorHotel.annadirCliente(cliente1);
        gestorHotel.annadirCliente(cliente2);

        int opcion1 = 0;

        while(opcion1 != 4){
            
            Vista.imprimir("Bienvenido al Gloria Palace Resort");
            Vista.imprimir("¿Que desea hacer?");
            Vista.imprimir("1. Listar habitaciones o clientes");
            Vista.imprimir("2. Cambiar el estado de una habitacion");
            Vista.imprimir("3. Ver reservas de cliente");
            Vista.imprimir("4. Salir");
            Scanner scanner = new Scanner(System.in);
            opcion1 = scanner.nextInt();

            switch (opcion1) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
    
                case 4:
                Vista.imprimir("Adios");
                    break;
                    
                default:
                Vista.imprimir("Opcion no valida");
                    break;
            }
        }
        
        
    }
}
