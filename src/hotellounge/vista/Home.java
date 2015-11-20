/*
 * HotelLounge
 * José David Mora Loría
 * Oscar Mauricio Gil
 * Melvin Arce Rodriguez
 * Marvin Andrei Sandi Brenes
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
        PanelBase panel_contenido = new PanelBase();
        setContentPane(panel_contenido);
        this.setVisible(true);
    }
    
}
