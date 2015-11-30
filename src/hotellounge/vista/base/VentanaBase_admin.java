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
import hotellounge.vista.Home;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author jmora Ventana base que se hereda a las demas de la aplicacion.
 */
public class VentanaBase_admin extends JFrame {

    private static final Logger logger = Logger.getLogger(VentanaBase_admin.class.getName());

    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem m_cerrar_session;
    private javax.swing.JMenuItem m_salir;

    public VentanaBase_admin() {
        // Declaracion b�sica de la venta
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(Principal.getAncho(), Principal.getAlto());
        setTitle(Principal.getNombreProyecto());
        try {
            Image icon = Toolkit.getDefaultToolkit().getImage(HotelLounge.class.getResource("vista/imagenes/logo_principal.png"));
            setIconImage(icon);
        } catch (Exception e) {
            logger.log(Level.SEVERE, null, e);
        }

        //Creacion de la barra de menu
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        m_salir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        m_cerrar_session = new javax.swing.JMenuItem();

        jMenu1.setText("Archivo"); 

        m_salir.setText("Salir"); 
        m_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_salirActionPerformed(evt);
            }
        });
        jMenu1.add(m_salir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Adminstrar");

        m_cerrar_session.setText("Cerrar sesion");
        m_cerrar_session.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_cerrar_sessionActionPerformed(evt);
            }
        });
        jMenu2.add(m_cerrar_session);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

    }

    //Eventos de la barra del menu
    //Menu salir cierra el programa
    private void m_salirActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void m_cerrar_sessionActionPerformed(java.awt.event.ActionEvent evt) {
        new Home().setVisible(true);
        this.dispose();
    }
}
