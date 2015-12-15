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
public class Actividad {

    //Variables de clase
    private int codigoActividad;
    private String titulo;
    private String descripcionActividad;
    private String horaInicial;
    private String horaFinal;
    private int precioPersona;
    
    //Constructor
    public Actividad(int codigoActividad, String titulo, String descripcionActividad, String horaInicial, String horaFinal, int precioPersona) {
        this.codigoActividad = codigoActividad;
        this.titulo = titulo;
        this.descripcionActividad = descripcionActividad;
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
        this.precioPersona = precioPersona;
    }

    //Getters & setters
    public int getCodigoActividad() {
        return codigoActividad;
    }

    public void setCodigoActividad(int codigoActividad) {
        this.codigoActividad = codigoActividad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcionActividad() {
        return descripcionActividad;
    }

    public void setDescripcionActividad(String descripcionActividad) {
        this.descripcionActividad = descripcionActividad;
    }

    public String getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(String horaInicial) {
        this.horaInicial = horaInicial;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    public int getPrecioPersona() {
        return precioPersona;
    }

    public void setPrecioPersona(int precioPersona) {
        this.precioPersona = precioPersona;
    }

}
