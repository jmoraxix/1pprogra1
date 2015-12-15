/*
 * HotelLounge
 * José David Mora Loría
 * Oscar Mauricio Gil
 * Melvin Arce Rodriguez
 * Nov 17, 2015
 */
package hotellounge;

import hotellounge.modelo.Actividad;
import hotellounge.modelo.Cliente;
import hotellounge.modelo.Habitacion;
import hotellounge.modelo.Hotel;
import hotellounge.modelo.Reservacion;
import hotellounge.vista.Home;
import java.awt.Font;

/**
 *
 * @author jmora
 */
public class Principal {

    /**
     * ** VARIABLES GLOBALES DEL SISTEMA ***
     */
    private final static Font letraTitulo1 = new Font("Georgia", Font.BOLD, 34);
    private final static Font letraTexto1 = new Font("Georgia", Font.PLAIN, 26);
    private final static Font letraTexto2 = new Font("Georgia", Font.PLAIN, 20);
    private final static Font letraTexto3 = new Font("Georgia", Font.PLAIN, 16);

    private final static int ancho = 800, alto = 600;

    private final static String nombreProyecto = "Hotel Lounge";
    private final static String ruta = System.getProperty("user.home") + "\\"
            + nombreProyecto;

    private static Hotel hotel = new Hotel("Hotel Lounge", 12345678, "Escazú, San José", "info@hotellounge.com");
    private static Cliente clientes[] = new Cliente[100];
    private static Habitacion habitaciones[] = new Habitacion[10];
    private static Actividad actividades[] = new Actividad[10];
    private static Reservacion reservaciones[] = new Reservacion[100];

    public static void iniciarAplicacion() {
        new GenerarVariables();
        new Home().setVisible(true);
    }

    /**
     * *** GETTERS AND SETTERS DE VARIABLES ****
     */
    public static int getAncho() {
        return ancho;
    }

    public static int getAlto() {
        return alto;
    }

    public static String getNombreProyecto() {
        return nombreProyecto;
    }

    public static String getRuta() {
        return ruta;
    }

    public static Font getLetraTitulo1() {
        return letraTitulo1;
    }

    public static Font getLetraTexto1() {
        return letraTexto1;
    }

    public static Font getLetraTexto2() {
        return letraTexto2;
    }

    public static Font getLetraTexto3() {
        return letraTexto3;
    }

    //Getters y setters de los arrays
    public static Hotel getHotel() {
        return hotel;
    }

    public static void setHotel(Hotel hotel) {
        Principal.hotel = hotel;
    }

    public static Cliente[] getClientes() {
        return clientes;
    }

    public static boolean addCliente(Cliente cliente) {
        boolean agregado = false;
        for (int i = 0; i < Principal.clientes.length; i++) {
            if (Principal.clientes[i] == null) {
                Principal.clientes[i] = cliente;
                agregado = true;
            }
        }
        return agregado;
    }

    public static Habitacion[] getHabitaciones() {
        return habitaciones;
    }

    public static boolean addHabitacion(Habitacion habitacion) {
        boolean agregado = false;
        for (int i = 0; i < Principal.habitaciones.length; i++) {
            if (Principal.habitaciones[i] == null) {
                Principal.habitaciones[i] = habitacion;
                agregado = true;
            }
        }
        return agregado;
    }

    public static Actividad[] getActividades() {
        return actividades;
    }

    public static boolean addActividad(Actividad actividad) {
        boolean agregado = false;
        for (int i = 0; i < Principal.actividades.length; i++) {
            if (Principal.actividades[i] == null) {
                Principal.actividades[i] = actividad;
                agregado = true;
            }
        }
        return agregado;

    }

    public static Reservacion[] getReservaciones() {
        return reservaciones;
    }

    public static boolean addReservacion(Reservacion reservacion) {
        boolean agregado = false;
        for (int i = 0; i < Principal.reservaciones.length; i++) {
            if (Principal.reservaciones[i] == null) {
                Principal.reservaciones[i] = reservacion;
                agregado = true;
            }
        }
        return agregado;
    }

}
