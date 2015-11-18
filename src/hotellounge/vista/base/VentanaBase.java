/*
 * HotelLounge
 * José David Mora Loría
 * Oscar Mauricio Gil
 * Melvin Arce Rodriguez
 * Marvin Andrei Sandi Brenes
 * Nov 18, 2015
 */
package hotellounge.vista.base;

import hotellounge.Principal;
import javax.swing.JFrame;

/**
 *
 * @author jmora
 * Ventana base que se hereda a las demas de la aplicacion.
 */
public class VentanaBase extends JFrame {

	public VentanaBase() {
		// Declaracion b�sica de la venta
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(Principal.getAncho(), Principal.getAlto());
		setTitle(Principal.getNombreProyecto());
		//Image icon = Toolkit.getDefaultToolkit().getImage(HotelLoung.class.getResource("vista/imagenes/logo_principal_icono.png"));
		//setIconImage(icon);

	}
}
