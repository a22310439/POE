package eventos;

public class ActividadClase extends javax.swing.JFrame {

    /**
     * Creates new form ActividadClase
     */
    public ActividadClase() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        txtNombre = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        jrbAdmin = new javax.swing.JRadioButton();
        jrbCliente = new javax.swing.JRadioButton();
        jrbInvitado = new javax.swing.JRadioButton();
        btnIngreso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });

        lblNombre.setText("Nombre");

        lblContraseña.setText("Contraseña");

        buttonGroup1.add(jrbAdmin);
        jrbAdmin.setText("Admin");

        buttonGroup1.add(jrbCliente);
        jrbCliente.setText("Cliente");
        jrbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbClienteActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbInvitado);
        jrbInvitado.setText("Invitado");

        btnIngreso.setText("Ingreso");
        btnIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIngreso)
                    .addComponent(jrbCliente)
                    .addComponent(jrbAdmin)
                    .addComponent(jrbInvitado)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblContraseña)
                        .addComponent(lblNombre)
                        .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                        .addComponent(txtContraseña)))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jrbAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbInvitado)
                .addGap(18, 18, 18)
                .addComponent(btnIngreso)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbClienteActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
        checarCredenciales();
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void btnIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoActionPerformed
        // TODO add your handling code here:
        checarCredenciales();
    }//GEN-LAST:event_btnIngresoActionPerformed

    public void checarCredenciales(){
        if (jrbAdmin.isSelected()) {
            if(txtNombre.getText().equals("Admin") && txtContraseña.getText().equals("Admin")){
                System.out.println("Bienvenido, Admin!");
            }else
                System.out.println("No eres Admin.");
        } else if (jrbCliente.isSelected()) {
            if(txtNombre.getText().equals("Cliente") && txtContraseña.getText().equals("Cliente")){
                System.out.println("Bienvenido, Cliente!");
            }else{
                System.out.println("No eres Cliente.");
            }
        } else if (jrbInvitado.isSelected()) {
            if(txtNombre.getText().equals("Invitado") && txtContraseña.getText().equals("Invitado")){
                System.out.println("Bienvenido, Invitado!");
            }else{
                System.out.println("No eres Invitado.");
            }
        }
    }
    
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ActividadClase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActividadClase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActividadClase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActividadClase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActividadClase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngreso;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton jrbAdmin;
    private javax.swing.JRadioButton jrbCliente;
    private javax.swing.JRadioButton jrbInvitado;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
