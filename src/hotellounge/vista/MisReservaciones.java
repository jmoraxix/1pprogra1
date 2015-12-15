/*
 * HotelLounge
 * José David Mora Loría
 * Oscar Mauricio Gil
 * Melvin Arce Rodriguez
 * Nov 30, 2015
 */
package hotellounge.vista;

import hotellounge.Principal;
import hotellounge.vista.base.VentanaBase_usuario;

/**
 *
 * @author jmora
 */
public class MisReservaciones extends VentanaBase_usuario {

    /**
     * Creates new form MisReservaciones
     */
    public MisReservaciones() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBase1 = new hotellounge.vista.base.PanelBase();
        panel_titulo = new hotellounge.vista.base.PanelConFondo();
        lbl_titulo1 = new javax.swing.JLabel();
        panel_info = new hotellounge.vista.base.PanelConFondo();
        ConsultarReservacion = new hotellounge.vista.base.PanelConFondo();
        panelConFondo1 = new hotellounge.vista.base.PanelConFondo();
        jLabel1 = new javax.swing.JLabel();
        btn_regresar = new hotellounge.vista.base.PanelConFondo();
        CrearReservacion = new hotellounge.vista.base.PanelConFondo();
        panelConFondo4 = new hotellounge.vista.base.PanelConFondo();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("hotellounge/vista/Bundle"); // NOI18N
        panel_titulo.setFondo(bundle.getString("MisReservaciones.panel_titulo.fondo")); // NOI18N

        lbl_titulo1.setFont(Principal.getLetraTexto1());
        lbl_titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo1.setText(bundle.getString("MisReservaciones.lbl_titulo1.text_1")); // NOI18N
        panel_titulo.add(lbl_titulo1);
        lbl_titulo1.setBounds(20, 10, 360, 50);

        panelBase1.add(panel_titulo);
        panel_titulo.setBounds(210, 60, 400, 70);

        panel_info.setFondo(bundle.getString("MisReservaciones.panel_info.fondo")); // NOI18N
        panelBase1.add(panel_info);
        panel_info.setBounds(80, 190, 270, 350);

        ConsultarReservacion.setFondo(bundle.getString("MisReservaciones.ConsultarReservacion.fondo")); // NOI18N
        ConsultarReservacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsultarReservacionMouseClicked(evt);
            }
        });

        panelConFondo1.setFondo(bundle.getString("MisReservaciones.panelConFondo1.fondo")); // NOI18N
        ConsultarReservacion.add(panelConFondo1);
        panelConFondo1.setBounds(20, 20, 140, 90);

        jLabel1.setFont(Principal.getLetraTexto3());
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(bundle.getString("MisReservaciones.jLabel1.text_1")); // NOI18N
        ConsultarReservacion.add(jLabel1);
        jLabel1.setBounds(10, 110, 170, 30);

        panelBase1.add(ConsultarReservacion);
        ConsultarReservacion.setBounds(480, 360, 180, 160);

        btn_regresar.setFondo(bundle.getString("MisReservaciones.btn_regresar.fondo")); // NOI18N
        btn_regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_regresarMouseClicked(evt);
            }
        });
        panelBase1.add(btn_regresar);
        btn_regresar.setBounds(40, 70, 80, 40);

        CrearReservacion.setFondo(bundle.getString("MisReservaciones.CrearReservacion.fondo")); // NOI18N
        CrearReservacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrearReservacionMouseClicked(evt);
            }
        });

        panelConFondo4.setFondo(bundle.getString("MisReservaciones.panelConFondo4.fondo")); // NOI18N
        CrearReservacion.add(panelConFondo4);
        panelConFondo4.setBounds(20, 20, 140, 80);

        jLabel2.setFont(Principal.getLetraTexto3());
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(bundle.getString("MisReservaciones.jLabel2.text_1")); // NOI18N
        CrearReservacion.add(jLabel2);
        jLabel2.setBounds(20, 110, 140, 30);

        panelBase1.add(CrearReservacion);
        CrearReservacion.setBounds(480, 200, 180, 160);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBase1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBase1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_regresarMouseClicked
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_regresarMouseClicked

    private void ConsultarReservacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsultarReservacionMouseClicked
     
    }//GEN-LAST:event_ConsultarReservacionMouseClicked

    private void CrearReservacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearReservacionMouseClicked
        // TODO add your handling code here:
        new CrearReservaciones().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CrearReservacionMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private hotellounge.vista.base.PanelConFondo ConsultarReservacion;
    private hotellounge.vista.base.PanelConFondo CrearReservacion;
    private hotellounge.vista.base.PanelConFondo btn_regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_titulo1;
    private hotellounge.vista.base.PanelBase panelBase1;
    private hotellounge.vista.base.PanelConFondo panelConFondo1;
    private hotellounge.vista.base.PanelConFondo panelConFondo4;
    private hotellounge.vista.base.PanelConFondo panel_info;
    private hotellounge.vista.base.PanelConFondo panel_titulo;
    // End of variables declaration//GEN-END:variables
}
