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
 * @author jmora Ventana base que se hereda a las demas de la aplicacion.
 */
public class VentanaBase_usuario extends JFrame {

    private static final Logger logger = Logger.getLogger(VentanaBase_usuario.class.getName());

    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem m_nosotros;
    private javax.swing.JMenuItem m_ingresar;
    private javax.swing.JMenuItem m_salir;

    public VentanaBase_usuario() {
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
        m_nosotros = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        m_salir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        m_ingresar = new javax.swing.JMenuItem();

        jMenu1.setText("Archivo"); 
        
        m_nosotros.setText("Sobre Hotel Lounge");
        m_nosotros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_nosotrosActionPerformed(evt);
            }
        });
        jMenu1.add(m_nosotros);
        jMenu1.add(jSeparator1);

        m_salir.setText("Salir"); 
        m_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_salirActionPerformed(evt);
            }
        });
        jMenu1.add(m_salir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Adminstrar");

        m_ingresar.setText("Ingresar");
        m_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_ingresarActionPerformed(evt);
            }
        });
        jMenu2.add(m_ingresar);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

    }

    //Eventos de la barra del menu
    //Menu salir cierra el programa
    private void m_salirActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }
    private void m_ingresarActionPerformed(java.awt.event.ActionEvent evt) {
        new IniciarSesion(this, true).setVisible(true);
    }
    private void m_nosotrosActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                 
}
