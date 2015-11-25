/*
 * HotelLounge
 * José David Mora Loría
 * Oscar Mauricio Gil
 * Melvin Arce Rodriguez
 * Nov 18, 2015
 */
package hotellounge.vista.base;

import hotellounge.Principal;

/**
 *
 * @author jmora
 */
public class PanelBase extends PanelConFondo {

	public PanelBase() {
		super("fondo_principal.png");
                setSize(Principal.getAncho(), Principal.getAlto());
	}
}
