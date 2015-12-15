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
public class Cliente {

    //Variables de clase
    private int cedula;
    private String nombreCliente;
    private String telefonoCliente;
    private String correo;
    
    //Constructor
    public Cliente(int cedula, String nombreCliente, String telefonoCliente, String correo) {
        this.cedula = cedula;
        this.nombreCliente = nombreCliente;
        this.telefonoCliente = telefonoCliente;
        this.correo = correo;
    }

    //Getters & setters
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
