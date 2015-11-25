/*
 * HotelLounge
 * José David Mora Loría
 * Oscar Mauricio Gil
 * Melvin Arce Rodriguez
 * Nov 18, 2015
 */
package hotellounge.vista;

import hotellounge.Principal;
import hotellounge.vista.base.PanelBase;
import hotellounge.vista.base.PanelConFondo;
import hotellounge.vista.base.VentanaBase;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author jmora
 */
public class Home extends VentanaBase {

    public Home() {
        //Se crea el panel del contenido 
        PanelBase panel_contenido = new PanelBase();
        setContentPane(panel_contenido);
        
        //Creacion de los titulos
        JLabel titulo1 = new javax.swing.JLabel("Bienvenido a su sistema de hotel", SwingConstants.CENTER);
        titulo1.setForeground(new java.awt.Color(0, 0, 0));
        titulo1.setFont(Principal.getLetraTexto1());
        panel_contenido.add(titulo1);
        titulo1.setBounds(Principal.getAncho()/2-250, 80, 500, 60);

        JLabel titulo2 = new javax.swing.JLabel("Hotel Lounge", SwingConstants.CENTER);
        titulo2.setFont(Principal.getLetraTitulo1());
        panel_contenido.add(titulo2);
        titulo2.setBounds(Principal.getAncho()/2-250, 110, 500, 60);
               
        //Se instancia el boton misReservaciones
        PanelConFondo btn_misReservaciones = new hotellounge.vista.base.PanelConFondo("logo_principal.png", "Mis reservaciones");
        btn_misReservaciones.setBounds(Principal.getAncho()/2-150, Principal.getAlto()/3, 300, 300);
        panel_contenido.add(btn_misReservaciones);
        btn_misReservaciones.getBtn().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goToReservaciones(evt);
            }
        });
        //Se instancia el boton admin
        PanelConFondo btn_admin = new hotellounge.vista.base.PanelConFondo("usuario.png", "Mis reservaciones");
        btn_admin.setBounds(200, 100, 100, 100);
        panel_contenido.add(btn_admin);
        btn_admin.getBtn().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goToAdmin(evt);
            }
        });
        
        //Se hace visible la ventana
        this.setVisible(true);
    }
    
    private void goToReservaciones(java.awt.event.MouseEvent evt) {                          
        new MisReservaciones().setVisible(true);
        this.dispose();
    }    
    private void goToAdmin(java.awt.event.MouseEvent evt) {                          
        new MenuAdministrador().setVisible(true);
        this.dispose();
    }    
    
}
