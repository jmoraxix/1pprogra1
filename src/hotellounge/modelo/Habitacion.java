/*
 * HotelLounge
 * José David Mora Loría
 * Oscar Mauricio Gil
 * Melvin Arce Rodriguez
 * 12-nov-2015
 */
package hotellounge.modelo;

/**
 *
 * @author Cocho
 */
public class Habitacion {

    //Variables de clase
    private int codigoHabitacion;
    private int numeroCamas;
    private int maximoPersonas;
    private String tipo;
    private int precioNoche;
    private String descripcionHabitacion;
    private static int n_habitaciones = 10;
    
    //Constructor
    public Habitacion(int codigoHabitacion, int numeroCamas, int maximoPersonas, String tipo, int precioNoche, String descripcionHabitacion) {
        this.codigoHabitacion = codigoHabitacion;
        this.numeroCamas = numeroCamas;
        this.maximoPersonas = maximoPersonas;
        this.tipo = tipo;
        this.precioNoche = precioNoche;
        this.descripcionHabitacion = descripcionHabitacion;
    }

    //Getters & setters
    public int getCodigoHabitacion() {
        return codigoHabitacion;
    }

    public void setCodigoHabitacion(int codigoHabitacion) {
        this.codigoHabitacion = codigoHabitacion;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public int getMaximoPersonas() {
        return maximoPersonas;
    }

    public void setMaximoPersonas(int maximoPersonas) {
        this.maximoPersonas = maximoPersonas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(int precioNoche) {
        this.precioNoche = precioNoche;
    }

    public String getDescripcionHabitacion() {
        return descripcionHabitacion;
    }

    public void setDescripcionHabitacion(String descripcionHabitacion) {
        this.descripcionHabitacion = descripcionHabitacion;
    }

}
