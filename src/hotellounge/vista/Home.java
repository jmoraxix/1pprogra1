/*
 * HotelLounge
 * José David Mora Loría
 * Oscar Mauricio Gil
 * Melvin Arce Rodriguez
 * Nov 18, 2015
 */
package hotellounge.vista;

import hotellounge.vista.base.PanelBase;
import hotellounge.vista.base.VentanaBase;

/**
 *
 * @author jmora
 */
public class Home extends VentanaBase {

    public Home() {
        //Se crea el panel del contenido 
        PanelBase panel_contenido = new PanelBase();
        setContentPane(panel_contenido);
        
        //Se instancian los botones y se agregan al panel base
        //PanelConFondo btn_admin = new PanelConFondo("boton_admin", "Ingresar");
        //PanelConFondo btn_reservaciones = new PanelConFondo("boton_reservaciones", "Reservaciones");
        
        
        //Se hace visible la ventana
        this.setVisible(true);
    }
    
}
