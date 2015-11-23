/*
 * HotelLounge
 * José David Mora Loría
 * Oscar Mauricio Gil Batres
 * Jose Melvin Rodriguez Alvarado
 * Nov 7, 2015
 */
package hotellounge;

import java.io.File;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author jmora
 */
public class HotelLounge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.gc();

        File directorio = new File(Principal.getRuta());
        directorio.mkdir();

        // LookAndFeel de la aplicacion
        JFrame.setDefaultLookAndFeelDecorated(true);
        try {
            UIManager
                    .setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
        }
        
        Principal.iniciarAplicacion();
    }

}
