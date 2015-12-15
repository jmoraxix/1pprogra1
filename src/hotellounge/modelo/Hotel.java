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

    //Variables de clase
    private String nombreHotel;
    private int numeroTelefonicoHotel;
    private String direccionHotel;
    private String correoHotel;
    private String decripcionHotel;
    
    //Constructor
    public Hotel(String nombreHotel, int numeroTelefonicoHotel, String direccionHotel, String correoHotel) {
        this.nombreHotel = nombreHotel;
        this.numeroTelefonicoHotel = numeroTelefonicoHotel;
        this.direccionHotel = direccionHotel;
        this.correoHotel = correoHotel;
    }

    //Getters & setters
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

    public String getDecripcionHotel() {
        return decripcionHotel;
    }

    public void setDecripcionHotel(String decripcionHotel) {
        this.decripcionHotel = decripcionHotel;
    }
}
