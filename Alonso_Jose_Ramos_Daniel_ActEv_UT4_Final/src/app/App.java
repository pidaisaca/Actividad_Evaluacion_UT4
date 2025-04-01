package app;

import java.util.*;
import view.Vista;
import controller.gestorHotel;
import controller.gestorReservas;
import model.Cliente;
import model.Habitacion;
import model.reserva;
import model.estadoHabitacion;
import model.tipoHabitacion;
import java.time.LocalDate;
//Tareas a hacer: crear metodos de busqueda de habitaciones
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
        Habitacion habitacion3 = new Habitacion(103, SUITE, precioSuite, OCUPADA, "Habitacion suite");
        Habitacion habitacion4 = new Habitacion(104, INDIVIDUAL, precioIndividual, DISPONIBLE, "Habitacion individual");
        Habitacion habitacion5 = new Habitacion(105, DOBLE, precioDoble, DISPONIBLE, "Habitacion doble");
        Habitacion habitacion6 = new Habitacion(201, SUITE, precioSuite, DISPONIBLE, "Habitacion suite");
        Habitacion habitacion7 = new Habitacion(202, INDIVIDUAL, precioIndividual, OCUPADA, "Habitacion individual");
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

        // Crear clientes, reservas y historial. Cliente1 tendra reservas al maximo y un
        // historial. Cliente2 estará sin reservas

        List<reserva> reservasCliente1 = new ArrayList<reserva>();
        List<reserva> reservasCliente2 = new ArrayList<reserva>();
        List<reserva> historialCliente1 = new ArrayList<reserva>();
        List<reserva> historialCliente2 = new ArrayList<reserva>();

        Cliente cliente1 = new Cliente("1", "Javier", reservasCliente1, historialCliente1);
        Cliente cliente2 = new Cliente("2", "Alba", reservasCliente2, historialCliente2);

        reserva reservaCliente1_1 = new reserva(1, LocalDate.of(2025, 6, 1), LocalDate.of(2025, 7, 1), precioSuite, cliente1, habitacion15);
        reserva reservaCliente1_2 = new reserva(2, null, null, precioDoble, cliente1, habitacion14);
        reserva reservaCliente1_3 = new reserva(3, null, null, precioIndividual, cliente1, habitacion13);

        reservasCliente1.add(reservaCliente1_1);
        reservasCliente1.add(reservaCliente1_2);
        reservasCliente1.add(reservaCliente1_3);

        gestorHotel.annadirCliente(cliente1);
        gestorHotel.annadirCliente(cliente2);

        int opcion1 = 0;
        int numeroHabitacion = 0;
        String busqueda = null;
        Scanner scanner = new Scanner(System.in);
        while (opcion1 != 3) {
        
            Vista.imprimir("Bienvenido al Gloria Palace Resort");
            Vista.imprimir("¿Que desea hacer?");
            Vista.imprimir("1. Opciones de cliente");
            Vista.imprimir("2. Opciones de habitaciones");

            Vista.imprimir("3. Salir");
          
            opcion1 = scanner.nextInt();

            switch (opcion1) {
                case 1:
                    int opcion2 = 0;
                    while (opcion2 != 4) {
                        Vista.imprimir("¿Que desea hacer?");
                        Vista.imprimir("1. Listar clientes");
                        Vista.imprimir("2. Ver reservas de un cliente");
                        Vista.imprimir("3. Ver historial de un cliente");
                        Vista.imprimir("4. Salir");
                        opcion2 = scanner.nextInt();
                        switch (opcion2) {
                            case 1:
                                gestorHotel.listarClientes();
                                break;
                            case 2:
                                Vista.imprimir("¿De que cliente desea ver sus reservas? Escriba su ID");
                                String id_reservas = scanner.next();
                                Cliente clienteReservas = gestorHotel.buscarCliente(id_reservas);
                                gestorReservas.reservasActivas(clienteReservas);
                                break;
                            case 3:
                                Vista.imprimir("¿De que cliente desea ver sus reservas? Escriba su ID");
                                String id_historial = scanner.next();
                                Cliente clienteHistorial = gestorHotel.buscarCliente(id_historial);
                                gestorReservas.historialReserva(clienteHistorial);
                                break;
                            case 4:

                                break;
                            default:
                                Vista.imprimir("Opcion no valida");
                                break;
                        }
                    }
                    break;
                case 2:
                    int opcion3 = 0;
                    while (opcion3 != 5) {
                        Vista.imprimir("¿Que desea hacer?");
                        Vista.imprimir("1. Listar habitaciones");
                        Vista.imprimir("2. Reservar habitacion");
                        Vista.imprimir("3. Cancelar reserva");
                        Vista.imprimir("4. Buscar habitacion");
                        Vista.imprimir("5. Salir");
                        opcion3 = scanner.nextInt();
                        switch (opcion3) {
                            case 1:
                                gestorHotel.listarHabitaciones();
                                break;
                            case 2:
                                Vista.imprimir("¿Que habitacion desea reservar? Escribe el numero de la habitacion");
                                numeroHabitacion = scanner.nextInt();
                                Habitacion habitacionReservada = gestorHotel.buscarHabitacion(numeroHabitacion);
                                if (habitacionReservada == null) {
                                    Vista.imprimir("Habitacion no encontrada");
                                    break;
                                }
                               if (!gestorReservas.controlEstadoHabitacion(habitacionReservada)){
                                break;
                               }
                                Vista.imprimir(
                                "¿Que cliente desea reservar la habitacion? Escribe el numero del cliente");
                                String numeroCliente = scanner.next();
                                Cliente cliente = gestorHotel.buscarCliente(numeroCliente);
                                if (cliente == null) {
                                    Vista.imprimir("Cliente no encontrado");
                                    break;
                                }
                                if (gestorReservas.controlMaxReservas(cliente)) {
                                    Vista.imprimir("El cliente " + cliente.getNombreCliente() + " ha superado el maximo de reservas permitidas.");
                                    break;
                                } else {
                                    gestorReservas.crearReserva(cliente, habitacionReservada);
                                }
                                break;
                            case 3:
                                Vista.imprimir("Introduzca el numero de la habitación cuya reserva desea cancelar");
                                numeroHabitacion = scanner.nextInt();
                                Habitacion cancelarReserva = gestorHotel.buscarHabitacion(numeroHabitacion);
                                if (cancelarReserva == null){
                                    Vista.imprimir("Habitacion no encontrada");
                                    break;
                                }
                                gestorReservas.cancelarReserva(cancelarReserva);
                                break;
                            case 4:
                                int opcion3_1 = 0;
                                while (opcion3_1 != 4) {
                                    Vista.imprimir("¿Como desea buscar?");
                                    Vista.imprimir("1. Buscar por numero");
                                    Vista.imprimir("2. Buscar por tipo");
                                    Vista.imprimir("3. Buscar por estado");
                                    Vista.imprimir("4. Salir");
                                    opcion3_1 = scanner.nextInt();
                                    switch (opcion3_1) {
                                        case 1:
                                        Vista.imprimir("Introduce el numero de la habitacion");
                                        numeroHabitacion = scanner.nextInt();
                                        Habitacion buscarPorNumero = gestorHotel.buscarHabitacion(numeroHabitacion);
                                        Vista.imprimir(buscarPorNumero.toString());
                                            break;
                                        case 2:
                                        Vista.imprimir("Introduce el tipo de habitacion");
                                        Vista.imprimir("INDIVIDUAL");
                                        Vista.imprimir("DOBLE");
                                        Vista.imprimir("SUITE");
                                        busqueda = scanner.next().toUpperCase();
                                        try{
                                            tipoHabitacion tipoBuscado = tipoHabitacion.valueOf(busqueda);
                                            ArrayList<Habitacion> buscador = gestorHotel.buscarPorTipo(tipoBuscado);
                                            Vista.imprimir("Habitaciones tipo "+tipoBuscado);
                                            for(Habitacion habitacion : buscador){
                                                Vista.imprimir(habitacion.toString());
                                            }
                                        }catch(IllegalArgumentException e){
                                            Vista.imprimir("Tipo invalido. Los tipos permitidos son:");
                                            Vista.imprimir("INDIVIDUAL");
                                            Vista.imprimir("DOBLE");
                                            Vista.imprimir("SUITE");
                                        }
                                            break;
                                        case 3:
                                        Vista.imprimir("Introduce el estado de  la habitacion");
                                        Vista.imprimir("DISPONIBLE");
                                        Vista.imprimir("OCUPADA");
                                        Vista.imprimir("RESERVADA");
                                        busqueda = scanner.next().toUpperCase();
                                        try{
                                            estadoHabitacion estadoBuscado = estadoHabitacion.valueOf(busqueda);
                                            ArrayList<Habitacion> buscador = gestorHotel.buscarPorEstado(estadoBuscado);
                                            Vista.imprimir("Habitaciones "+estadoBuscado+"S");
                                            for (Habitacion habitacion : buscador){
                                                Vista.imprimir(habitacion.toString());
                                            }
                                        } catch(IllegalArgumentException e){
                                            Vista.imprimir("Estado invalido. Los estados permitidos son:");
                                            Vista.imprimir("DISPONIBLE");
                                            Vista.imprimir("OCUPADA");
                                            Vista.imprimir("RESERVADA");
                                        }
                                   
                                            break;
                                        case 5:
                                        Vista.imprimir("Cerrando Opciones de habitacion");
                                            break;
                                        default:
                                            Vista.imprimir("Opcion no valida");
                                            break;
                                    }
                                }
                                break;
                            case 5:

                                break;
                            default:
                                Vista.imprimir("Opcion no valida");
                                break;
                        }
                    }
                    break;
                case 3:
                    Vista.imprimir("Cerrando Sesion");
                    break;

                default:
                    Vista.imprimir("Opcion no valida");
                    break;
            }
        }
        scanner.close();

    }

}
