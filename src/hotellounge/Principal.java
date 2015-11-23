/*
 * HotelLounge
 * José David Mora Loría
 * Oscar Mauricio Gil
 * Melvin Arce Rodriguez
 * Nov 17, 2015
 */
package hotellounge;

import hotellounge.vista.Home;
import java.awt.Font;

/**
 *
 * @author jmora
 */
public class Principal {
    /**** VARIABLES GLOBALES DEL SISTEMA ****/
    private final static Font letraTitulo1 = new Font("Georgia", Font.BOLD, 34);
    private final static Font letraTexto1 = new Font("Georgia", Font.PLAIN, 26);
    private final static Font letraTexto2 = new Font("Georgia", Font.PLAIN, 20);
    private final static Font letraTexto3 = new Font("Georgia", Font.PLAIN, 16);

    private final static int ancho = 800, alto = 600;

    private final static String nombreProyecto = "Hotel Lounge";
    private final static String ruta = System.getProperty("user.home") + "\\"
			+ nombreProyecto;
        
    
    public static void iniciarAplicacion(){
        new Home();
    }
    
    /***** GETTERS AND SETTERS DE VARIABLES *****/
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
}
