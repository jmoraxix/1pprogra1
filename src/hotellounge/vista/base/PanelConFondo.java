/*
 * HotelLounge
 * José David Mora Loría
 * Oscar Mauricio Gil
 * Melvin Arce Rodriguez
 * Nov 11, 2015
 */
package hotellounge.vista.base;

import hotellounge.HotelLounge;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author jmora Extiende JPanel. Define un panel y le asigna un fondo
 */
public class PanelConFondo extends JPanel {

    private JButton btn;
    private String fondo;
    private String titulo;
    private static final Logger logger = Logger.getLogger(PanelConFondo.class.getName());

    /**
     * Define un JPanel normal. Puede cambiarse el fondo usando su respectivo
     * setter.
     */
    public PanelConFondo() {
        setForeground(SystemColor.controlHighlight);
        setLayout(null);
    }

    /**
     * Crea JPanel y le defina una imagen de fondo.
     *
     * @param urlImagen Nombre de la imagen de fondo.
     */
    public PanelConFondo(String urlImagen) {
        setForeground(SystemColor.controlHighlight);
        definirBorde(this.fondo = urlImagen);
        setLayout(null);
    }

    /**
     * Crea un panel para mostrar una imagen.
     *
     * @param urlImagen Nombre de la imagen de fondo.
     * @param isOpaque True si el panel no es transparente. False para que el
     * panel sea transparente.
     */
    // Recibe un string con la URL de la imagen y si el panel es opaco o no
    public PanelConFondo(String urlImagen, boolean isOpaque) {
        setForeground(SystemColor.controlHighlight);
        definirBorde(this.fondo = urlImagen);
        setOpaque(isOpaque);
    }

    /**
     * Crea un panel con un boton invisible y una imagen de fondo.
     *
     * @param urlImagen Nombre de la imagen de fondo.
     * @param titulo Título del botón.
     */
    public PanelConFondo(String urlImagen, String titulo) {
        setForeground(SystemColor.controlHighlight);
        definirBorde(this.fondo = urlImagen);
        setOpaque(false);
        setLayout(new BorderLayout(0, 0));

        this.btn = new JButton();
        this.btn.setOpaque(false);
        this.btn.setContentAreaFilled(false);
        this.btn.setBorderPainted(false);
        //this.btn.setFont(Principal.getLetratexto2());
        add(this.btn, BorderLayout.CENTER);
        add(new JLabel(titulo), BorderLayout.SOUTH);
    }

    /**
     * Retorna el botón invisible del panel. Puede ser utilizado para asignarle
     * un evento del tipo click.
     *
     * @return
     */
    public JButton getBtn() {
        return this.btn;
    }
    
    /**
     * Define el fondo del panel.
     * @param fondo Nombre de la imagen de fondo en el paquete vista.imagenes.
     */
    public void setFondo(String fondo) {
        definirBorde(this.fondo = fondo);
        setOpaque(false);
        this.setLayout(null);
    }
    /**
     * Define el titulo del panel cuando tiene un botón
     * @param titulo Titulo del botón
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
        this.add(new JLabel(titulo), BorderLayout.SOUTH);
    }
    
    
    
    
    private void definirBorde(String url) {
        try {
            URL imagen = HotelLounge.class.getResource("vista/imagenes/" + url);
            BufferedImage img = ImageIO.read(imagen);
            BgBorder borde = new BgBorder(img);
            this.setBorder(borde);
        } catch (IOException ioe) {
            logger.log(Level.SEVERE, null, ioe);
        } catch (Exception e) {
            logger.log(Level.SEVERE, null, e);
        }
    }

}

/**
 * @author jmora 17/11/2015 Clase para generar un borde para el panel y
 * asignarselo como fondo.
 */
class BgBorder implements Border {

    private BufferedImage mImagen = null;

    public BgBorder(BufferedImage pImagen) {
        mImagen = pImagen;
    }

    public void paintBorder(Component c, Graphics g, int x, int y, int width,
            int height) {
        if (mImagen != null) {
            g.drawImage(mImagen, 0, 0, width, height, null);
        }
    }

    public Insets getBorderInsets(Component c) {
        return new Insets(0, 0, 0, 0);
    }

    public boolean isBorderOpaque() {
        return true;
    }
}
