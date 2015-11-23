/*
 * HotelLounge
 * José David Mora Loría
 * Oscar Mauricio Gil
 * Melvin Arce Rodriguez
 * Nov 18, 2015
 */
package hotellounge.vista.base;

import hotellounge.HotelLounge;
import hotellounge.Principal;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author jmora
 * Ventana base que se hereda a las demas de la aplicacion.
 */
public class VentanaBase extends JFrame {

    private static final Logger logger = Logger.getLogger(VentanaBase.class.getName());
    
    public VentanaBase() {
            // Declaracion b�sica de la venta
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(Principal.getAncho(), Principal.getAlto());
            setTitle(Principal.getNombreProyecto());
            try {
            Image icon = Toolkit.getDefaultToolkit().getImage(HotelLounge.class.getResource("vista/imagenes/logo_principal.png"));
            setIconImage(icon);    
            } catch (Exception e){
                logger.log(Level.SEVERE, null, e);
            }
            
    }
}
