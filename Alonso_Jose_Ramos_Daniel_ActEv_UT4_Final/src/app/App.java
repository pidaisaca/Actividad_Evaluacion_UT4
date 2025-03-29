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

public class App {
    public static void main(String[] args) throws Exception {
        
        gestorHotel gestorHotel = new gestorHotel();
        gestorReservas gestorReservas = new gestorReservas();
        tipoHabitacion INDIVIDUAL = tipoHabitacion.INDIVIDUAL;
        tipoHabitacion DOBLE = tipoHabitacion.DOBLE;
        tipoHabitacion SUITE = tipoHabitacion.SUITE;
        estadoHabitacion DISPONIBLE = estadoHabitacion.DISPONIBLE;
        estadoHabitacion RESERVADA = estadoHabitacion.RESERVADA;
        estadoHabitacion OCUPADA = estadoHabitacion.OCUPADA;
        double precioIndividual = 100.0;
        double precioDoble = 200.0;
        double precioSuite = 300.0;

        // Crear habitaciones
        
        Habitacion habitacion1 = new Habitacion(101, INDIVIDUAL, precioIndividual, DISPONIBLE, "Habitacion individual");
        Habitacion habitacion2 = new Habitacion(102, DOBLE, precioDoble, DISPONIBLE, "Habitacion doble");
        Habitacion habitacion3 = new Habitacion(103, SUITE, precioSuite, DISPONIBLE, "Habitacion suite");
        Habitacion habitacion4 = new Habitacion(104, INDIVIDUAL, precioIndividual, DISPONIBLE, "Habitacion individual");
        Habitacion habitacion5 = new Habitacion(105, DOBLE, precioDoble, DISPONIBLE, "Habitacion doble");
        Habitacion habitacion6 = new Habitacion(201, SUITE, precioSuite, DISPONIBLE, "Habitacion suite");
        Habitacion habitacion7 = new Habitacion(202, INDIVIDUAL, precioIndividual, DISPONIBLE, "Habitacion individual");
        Habitacion habitacion8 = new Habitacion(203, DOBLE, precioDoble, DISPONIBLE, "Habitacion doble");
        Habitacion habitacion9 = new Habitacion(204, SUITE, precioSuite, DISPONIBLE, "Habitacion suite");
        Habitacion habitacion10 = new Habitacion(205, INDIVIDUAL, precioIndividual, DISPONIBLE, "Habitacion individual");
        Habitacion habitacion11 = new Habitacion(301, DOBLE, precioDoble, DISPONIBLE, "Habitacion doble");
        Habitacion habitacion12 = new Habitacion(302, SUITE, precioSuite, DISPONIBLE, "Habitacion suite");
        Habitacion habitacion13 = new Habitacion(303, INDIVIDUAL, precioIndividual, RESERVADA, "Habitacion individual");
        Habitacion habitacion14 = new Habitacion(304, DOBLE, precioDoble, RESERVADA, "Habitacion doble");
        Habitacion habitacion15 = new Habitacion(305, SUITE, precioSuite, RESERVADA, "Habitacion suite");

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
            
            System.out.println("Bienvenido al Gloria Palace Resort");
            System.out.println("¿Que desea hacer?");
            System.out.println("1. Listar habitaciones o clientes");
            System.out.println("2. Cambiar el estado de una habitacion");
            System.out.println("3. Ver reservas de cliente");
            System.out.println("4. Salir");
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
                    System.out.println("Adios");
                    break;
                    
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
        
        
    }
}
