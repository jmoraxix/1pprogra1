/*
 * HotelLounge
 * José David Mora Loría
 * Oscar Mauricio Gil
 * Melvin Arce Rodriguez
 * Nov 11, 2015
 */
package hotellounge.modelo;

/**
 *
 * @author jmora
 */
public class Hotel {

    private String nombreHotel;
    private int numeroTelefonicoHotel;
    private String direccionHotel;
    private String correoHotel;
    private int habitaciones;
    private String actividades;
    private String decripcionHotel;
    private String reservaciones;

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public int getNumeroTelefonicoHotel() {
        return numeroTelefonicoHotel;
    }

    public void setNumeroTelefonicoHotel(int numeroTelefonicoHotel) {
        this.numeroTelefonicoHotel = numeroTelefonicoHotel;
    }

    public String getDireccionHotel() {
        return direccionHotel;
    }

    public void setDireccionHotel(String direccionHotel) {
        this.direccionHotel = direccionHotel;
    }

    public String getCorreoHotel() {
        return correoHotel;
    }

    public void setCorreoHotel(String correoHotel) {
        this.correoHotel = correoHotel;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public String getActividades() {
        return actividades;
    }

    public void setActividades(String actividades) {
        this.actividades = actividades;
    }

    public String getDecripcionHotel() {
        return decripcionHotel;
    }

    public void setDecripcionHotel(String decripcionHotel) {
        this.decripcionHotel = decripcionHotel;
    }

    public String getReservaciones() {
        return reservaciones;
    }

    public void setReservaciones(String reservaciones) {
        this.reservaciones = reservaciones;
    }

}
