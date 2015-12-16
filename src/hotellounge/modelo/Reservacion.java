/*
 * HotelLounge
 * José David Mora Loría
 * Oscar Mauricio Gil
 * Melvin Arce Rodriguez
 * 12-nov-2015
 */
package hotellounge.modelo;

import java.util.Date;

/**
 *
 * @author Cocho
 */
public class Reservacion {

    //Variables de clase
    private int codigoReservacion;
    private int dias;
    private int cantidadPersonas;
    private Date fechaReservacion;
    private String cliente;
    private int habitacion = 0;
    private int actividades[] = new int[10];
    private int precio = 0;

    //Constructor
    public Reservacion(int codigoReservacion, int dias, int cantidadPersonas, Date fechaReservacion, String cliente) {
        this.codigoReservacion = codigoReservacion;
        this.dias = dias;
        this.cantidadPersonas = cantidadPersonas;
        this.fechaReservacion = fechaReservacion;
        this.cliente = cliente;
    }

    //Getters & setters
    public int getCodigoReservacion() {
        return codigoReservacion;
    }

    public void setCodigoReservacion(int codigoReservacion) {
        this.codigoReservacion = codigoReservacion;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public Date getFechaReservacion() {
        return fechaReservacion;
    }

    public void setFechaReservacion(Date fechaReservacion) {
        this.fechaReservacion = fechaReservacion;
    }

    public int getHabitacion() {
        return habitacion;
    }
    
    public void addHabitacion(int habitacion) {
        this.habitacion = habitacion;
    }
    
    public int[] getActividades() {
        return actividades;
    }
    
    public void setActividades(int[] actividades) {
        this.actividades = actividades;
    }
    
    public int getPrecio() {
        return precio;
    }
    
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
}
