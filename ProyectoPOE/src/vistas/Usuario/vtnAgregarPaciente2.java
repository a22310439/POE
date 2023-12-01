package vistas.Usuario;

import modelo.paciente;

public class vtnAgregarPaciente2 extends javax.swing.JFrame{

    paciente pac;
    vtnAgregarPaciente ventAgregarPaciente = null;
    vtnUsuario ventUsuario = null;

    public vtnAgregarPaciente2() {
        initComponents();
    }

    public vtnAgregarPaciente2(vtnAgregarPaciente ventAgregarPaciente, vtnUsuario ventUsuario, paciente pac) {
        initComponents();
        this.ventAgregarPaciente = ventAgregarPaciente;
        this.ventUsuario = ventUsuario;
        this.pac = pac;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pnlAgregarPaciente = new javax.swing.JPanel();
        lblEstadoVivienda = new javax.swing.JLabel();
        txtEstadoVivienda = new javax.swing.JTextField();
        lblTipoSangre = new javax.swing.JLabel();
        txtTipoSangre = new javax.swing.JTextField();
        lblEnfermedadesInfancia = new javax.swing.JLabel();
        txtEnfermedadesInfancia = new javax.swing.JTextField();
        lblEnfermedadesInfecciosas = new javax.swing.JLabel();
        txtEnfermedadesInfecciosas = new javax.swing.JTextField();
        lblEnfermedadesCronicoDegenerativas = new javax.swing.JLabel();
        txtEnfermedadesCronicoDegenerativas = new javax.swing.JTextField();
        lblAlergias = new javax.swing.JLabel();
        txtAlergias = new javax.swing.JTextField();
        lblCirugiasPruebas = new javax.swing.JLabel();
        txtCirugiasPrevias = new javax.swing.JTextField();
        lblFracturas = new javax.swing.JLabel();
        txtFracturas = new javax.swing.JTextField();
        lblTransgusionesSanguineas = new javax.swing.JLabel();
        txtTransfusionesSanguineas = new javax.swing.JTextField();
        lblHospitalizaciones = new javax.swing.JLabel();
        txtHospitalizaciones = new javax.swing.JTextField();
        lblMotivoConsulta = new javax.swing.JLabel();
        txtMotivoConsulta = new javax.swing.JTextField();
        lblEvolucionPadecimientoActual = new javax.swing.JLabel();
        txtEvolucionPadecimientoActual = new javax.swing.JTextField();
        lblSospechaDiagnostica = new javax.swing.JLabel();
        txtSospechaDiagnostica = new javax.swing.JTextField();
        lblPlanTratamiento = new javax.swing.JLabel();
        txtPlanTratamiento = new javax.swing.JTextField();
        lblEvolucionPaciente = new javax.swing.JLabel();
        txtEvolucionPaciente = new javax.swing.JTextField();
        btnAnterior = new javax.swing.JButton();
        lblPacientePrioritario = new javax.swing.JLabel();
        cbxPacientePrioritario = new javax.swing.JCheckBox();
        btnGuardar = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pnlTitulo.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar paciente");
        pnlTitulo.add(jLabel1, "card2");

        getContentPane().add(pnlTitulo, java.awt.BorderLayout.PAGE_START);

        lblEstadoVivienda.setText("Estado de vivienda:");

        lblTipoSangre.setText("Tipo de sangre:");

        lblEnfermedadesInfancia.setText("Enfermedades de la Infancia:");

        lblEnfermedadesInfecciosas.setText("Enfermedades Infecciosas:");

        lblEnfermedadesCronicoDegenerativas.setText("Enfermedades Cronico Degenerativas:");

        lblAlergias.setText("Alergias:");

        lblCirugiasPruebas.setText("Cirugias Previas:");

        lblFracturas.setText("Fracturas:");

        lblTransgusionesSanguineas.setText("Transfusiones Sanguineas:");

        lblHospitalizaciones.setText("Hospitalizaciones:");

        lblMotivoConsulta.setText("Motivo de Consulta:");

        lblEvolucionPadecimientoActual.setText("Evolucion del Padecimiento Actual:");

        lblSospechaDiagnostica.setText("Sospecha Diagnostica:");

        lblPlanTratamiento.setText("Plan de Tratamiento:");

        lblEvolucionPaciente.setText("Evolución del Paciente:");

        btnAnterior.setText("Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        lblPacientePrioritario.setText("Paciente Prioritario");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAgregarPacienteLayout = new javax.swing.GroupLayout(pnlAgregarPaciente);
        pnlAgregarPaciente.setLayout(pnlAgregarPacienteLayout);
        pnlAgregarPacienteLayout.setHorizontalGroup(
            pnlAgregarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgregarPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAgregarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAgregarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblSospechaDiagnostica)
                        .addComponent(lblTransgusionesSanguineas)
                        .addComponent(lblFracturas)
                        .addComponent(lblTipoSangre)
                        .addComponent(lblEstadoVivienda)
                        .addComponent(lblEnfermedadesInfecciosas)
                        .addComponent(lblEnfermedadesCronicoDegenerativas)
                        .addComponent(lblAlergias)
                        .addComponent(lblCirugiasPruebas)
                        .addComponent(lblHospitalizaciones)
                        .addComponent(lblPlanTratamiento)
                        .addComponent(lblEvolucionPaciente)
                        .addComponent(lblPacientePrioritario))
                    .addComponent(lblEnfermedadesInfancia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMotivoConsulta, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEvolucionPadecimientoActual, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAgregarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAgregarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtEstadoVivienda)
                        .addComponent(txtTipoSangre)
                        .addComponent(txtEnfermedadesInfancia)
                        .addComponent(txtEnfermedadesInfecciosas)
                        .addComponent(txtAlergias)
                        .addComponent(txtCirugiasPrevias)
                        .addComponent(txtFracturas)
                        .addComponent(txtTransfusionesSanguineas)
                        .addComponent(txtSospechaDiagnostica)
                        .addComponent(txtEvolucionPadecimientoActual)
                        .addComponent(txtMotivoConsulta)
                        .addComponent(txtHospitalizaciones)
                        .addComponent(txtPlanTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEnfermedadesCronicoDegenerativas))
                    .addComponent(txtEvolucionPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxPacientePrioritario))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAgregarPacienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAnterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar)
                .addGap(18, 18, 18))
        );
        pnlAgregarPacienteLayout.setVerticalGroup(
            pnlAgregarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgregarPacienteLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlAgregarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstadoVivienda)
                    .addComponent(txtEstadoVivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAgregarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoSangre)
                    .addComponent(txtTipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAgregarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnfermedadesInfancia)
                    .addComponent(txtEnfermedadesInfancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAgregarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEnfermedadesInfecciosas)
                    .addComponent(txtEnfermedadesInfecciosas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAgregarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEnfermedadesCronicoDegenerativas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEnfermedadesCronicoDegenerativas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAgregarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAlergias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAlergias))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAgregarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCirugiasPrevias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCirugiasPruebas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAgregarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFracturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFracturas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAgregarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTransfusionesSanguineas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTransgusionesSanguineas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAgregarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHospitalizaciones)
                    .addComponent(txtHospitalizaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAgregarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMotivoConsulta)
                    .addComponent(txtMotivoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAgregarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEvolucionPadecimientoActual)
                    .addComponent(txtEvolucionPadecimientoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAgregarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSospechaDiagnostica)
                    .addComponent(txtSospechaDiagnostica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAgregarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlanTratamiento)
                    .addComponent(txtPlanTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAgregarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEvolucionPaciente)
                    .addComponent(txtEvolucionPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAgregarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPacientePrioritario)
                    .addComponent(cbxPacientePrioritario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(pnlAgregarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnterior)
                    .addComponent(btnGuardar))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlAgregarPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(pnlAgregarPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ventAgregarPaciente.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        ventAgregarPaciente.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardarDatos();
        ventUsuario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnGuardarActionPerformed

    public void guardarDatos() {
        pac.setEstadoVivienda(txtEstadoVivienda.getText());
        pac.setTipoSangre(txtTipoSangre.getText());
        pac.setEnfInfancia(txtEnfermedadesInfancia.getText());
        pac.setEnfInfecciosas(txtEnfermedadesInfecciosas.getText());
        pac.setEnfCronicoDegenerativas(txtEnfermedadesCronicoDegenerativas.getText());
        pac.setAlergias(txtAlergias.getText());
        pac.setCirugiasPrevias(txtCirugiasPrevias.getText());
        pac.setFracturas(txtFracturas.getText());
        pac.setTransfusionesSanguineas(txtTransfusionesSanguineas.getText());
        pac.setHospitalizaciones(txtHospitalizaciones.getText());
        pac.setMotivoConsulta(txtMotivoConsulta.getText());
        pac.setEvoPadecimientoActual(txtEvolucionPadecimientoActual.getText());
        pac.setSospechaDiagnostica(txtSospechaDiagnostica.getText());
        pac.setPlanTratamiento(txtPlanTratamiento.getText());
        pac.setEvoPaciente(txtEvolucionPaciente.getText());
        if(cbxPacientePrioritario.isSelected()){
            pac.setPrioritario("Si");
        }else{
            pac.setPrioritario("No");
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
            java.util.logging.Logger.getLogger(vtnAgregarPaciente2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vtnAgregarPaciente2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vtnAgregarPaciente2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vtnAgregarPaciente2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vtnAgregarPaciente2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JCheckBox cbxPacientePrioritario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAlergias;
    private javax.swing.JLabel lblCirugiasPruebas;
    private javax.swing.JLabel lblEnfermedadesCronicoDegenerativas;
    private javax.swing.JLabel lblEnfermedadesInfancia;
    private javax.swing.JLabel lblEnfermedadesInfecciosas;
    private javax.swing.JLabel lblEstadoVivienda;
    private javax.swing.JLabel lblEvolucionPaciente;
    private javax.swing.JLabel lblEvolucionPadecimientoActual;
    private javax.swing.JLabel lblFracturas;
    private javax.swing.JLabel lblHospitalizaciones;
    private javax.swing.JLabel lblMotivoConsulta;
    private javax.swing.JLabel lblPacientePrioritario;
    private javax.swing.JLabel lblPlanTratamiento;
    private javax.swing.JLabel lblSospechaDiagnostica;
    private javax.swing.JLabel lblTipoSangre;
    private javax.swing.JLabel lblTransgusionesSanguineas;
    private javax.swing.JPanel pnlAgregarPaciente;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JTextField txtAlergias;
    private javax.swing.JTextField txtCirugiasPrevias;
    private javax.swing.JTextField txtEnfermedadesCronicoDegenerativas;
    private javax.swing.JTextField txtEnfermedadesInfancia;
    private javax.swing.JTextField txtEnfermedadesInfecciosas;
    private javax.swing.JTextField txtEstadoVivienda;
    private javax.swing.JTextField txtEvolucionPaciente;
    private javax.swing.JTextField txtEvolucionPadecimientoActual;
    private javax.swing.JTextField txtFracturas;
    private javax.swing.JTextField txtHospitalizaciones;
    private javax.swing.JTextField txtMotivoConsulta;
    private javax.swing.JTextField txtPlanTratamiento;
    private javax.swing.JTextField txtSospechaDiagnostica;
    private javax.swing.JTextField txtTipoSangre;
    private javax.swing.JTextField txtTransfusionesSanguineas;
    // End of variables declaration//GEN-END:variables
}
