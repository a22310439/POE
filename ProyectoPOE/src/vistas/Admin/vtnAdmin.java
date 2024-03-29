package vistas.Admin;

import modelo.medico;
import modelo.usuario;
import vistas.vtnPrincipal;

public class vtnAdmin extends javax.swing.JFrame {

    vtnPrincipal ventPrincipal = null;
    vtnAdminUsuario ventAdminUsuario = null;
    vtnAdminMedico ventAdminMedico = null;
    usuario usu = null;
    medico med = null;

    public vtnAdmin() {
        initComponents();
    }

    public vtnAdmin(vtnPrincipal ventPrincipal, usuario usu, medico med) {
        initComponents();
        this.ventPrincipal = ventPrincipal;
        this.usu = usu;
        this.med = med;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpSeleccion = new javax.swing.ButtonGroup();
        pnlTitulo = new javax.swing.JPanel();
        lblAdministrador = new javax.swing.JLabel();
        pnlContenido = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblInfo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jrbUsuarios = new javax.swing.JRadioButton();
        jrbMedicos = new javax.swing.JRadioButton();
        btnIr = new javax.swing.JButton();
        btnIr1 = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pnlTitulo.setLayout(new java.awt.BorderLayout());

        lblAdministrador.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblAdministrador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdministrador.setText("Administrador");
        pnlTitulo.add(lblAdministrador, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlTitulo, java.awt.BorderLayout.PAGE_START);

        pnlContenido.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.BorderLayout());

        lblInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfo.setText("Seleccione una opción");
        jPanel2.add(lblInfo, java.awt.BorderLayout.PAGE_START);

        grpSeleccion.add(jrbUsuarios);
        jrbUsuarios.setText("Usuarios");

        grpSeleccion.add(jrbMedicos);
        jrbMedicos.setText("Médicos");

        btnIr.setText("Ir");
        btnIr.setPreferredSize(new java.awt.Dimension(70, 23));
        btnIr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrActionPerformed(evt);
            }
        });

        btnIr1.setText("Cerrar sesion");
        btnIr1.setPreferredSize(new java.awt.Dimension(70, 23));
        btnIr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIr1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jrbUsuarios)
                        .addGap(52, 52, 52)
                        .addComponent(jrbMedicos))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnIr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnIr1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(89, 89, 89))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbUsuarios)
                    .addComponent(jrbMedicos))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, java.awt.BorderLayout.CENTER);

        pnlContenido.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlContenido, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ventPrincipal.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnIrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrActionPerformed
        if(jrbUsuarios.isSelected()){
            if(ventAdminUsuario == null){
                ventAdminUsuario = new vtnAdminUsuario(this, usu);
            }
            ventAdminUsuario.setVisible(true);
            this.setVisible(false);
        }else if(jrbMedicos.isSelected()){
            if(ventAdminMedico == null){
                ventAdminMedico = new vtnAdminMedico(this, med);
            }
            ventAdminMedico.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnIrActionPerformed

    private void btnIr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIr1ActionPerformed
        ventPrincipal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnIr1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vtnAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vtnAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vtnAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vtnAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vtnAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIr;
    private javax.swing.JButton btnIr1;
    private javax.swing.ButtonGroup grpSeleccion;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jrbMedicos;
    private javax.swing.JRadioButton jrbUsuarios;
    private javax.swing.JLabel lblAdministrador;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JPanel pnlContenido;
    private javax.swing.JPanel pnlTitulo;
    // End of variables declaration//GEN-END:variables
}
