package visual;

public class EditarDatos extends javax.swing.JFrame {

    String ventAnterior;

    VentanaPacientes ventPacientes = null;
    VentanaListaPacientes ventListaPacientes = null;

    Paciente paciente = null;
    
    Paciente Jorge = null;
    Paciente Pedro = null;
    Paciente Alma = null;
    Paciente Luis = null;

    public EditarDatos(VentanaPacientes ventPacientes, VentanaListaPacientes ventListaPacientes, Paciente Jorge, Paciente Pedro, Paciente Alma, Paciente Luis) {
        initComponents();
        this.ventPacientes = ventPacientes;
        this.ventListaPacientes = ventListaPacientes;
        this.Jorge = Jorge;
        this.Pedro = Pedro;
        this.Alma = Alma;
        this.Luis = Luis;
    }

    public EditarDatos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoEditarSexo = new javax.swing.ButtonGroup();
        lblEditarDatos = new javax.swing.JLabel();
        cBoxPacientes = new javax.swing.JComboBox<>();
        lblNombreEditar = new javax.swing.JLabel();
        txtNombreEditar = new javax.swing.JTextField();
        lblApellidosEditar = new javax.swing.JLabel();
        txtApellidosEditar = new javax.swing.JTextField();
        lblEdadEditar = new javax.swing.JLabel();
        spEdadEditar = new javax.swing.JSpinner();
        lblEmailEditar = new javax.swing.JLabel();
        txtEmailEditar = new javax.swing.JTextField();
        lblTelefonoEditar = new javax.swing.JLabel();
        txtTelefonoEditar = new javax.swing.JTextField();
        lblSexoEditar = new javax.swing.JLabel();
        rbHombreEditar = new javax.swing.JRadioButton();
        rbMujerEditar = new javax.swing.JRadioButton();
        rbOtroEditar = new javax.swing.JRadioButton();
        lblNacionalidadEditar = new javax.swing.JLabel();
        txtNacionalidadEditar = new javax.swing.JTextField();
        lblResidenciaEditar = new javax.swing.JLabel();
        txtResidenciaEditar = new javax.swing.JTextField();
        lblTipoSangreEditar = new javax.swing.JLabel();
        txtTipoSangreEditar = new javax.swing.JTextField();
        lblAlergiasEditar = new javax.swing.JLabel();
        txtAlergiasEditar = new javax.swing.JTextField();
        lblVacunasEditar = new javax.swing.JLabel();
        txtVacunasEditar = new javax.swing.JTextField();
        chboxPrioritarioEditar = new javax.swing.JCheckBox();
        btnGuardarDatosEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblEditarDatos.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lblEditarDatos.setText("Editar Datos");

        cBoxPacientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Paciente...", "Jorge Gonzalez Castillo", "Pedro Cabrera Lozano", "Alma Delfina López Cuevas", "Luis Enrique Vazquez Becerril" }));
        cBoxPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxPacientesActionPerformed(evt);
            }
        });

        lblNombreEditar.setText("Nombre:");

        lblApellidosEditar.setText("Apellidos:");

        lblEdadEditar.setText("Edad:");

        spEdadEditar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spEdadEditarStateChanged(evt);
            }
        });

        lblEmailEditar.setText("Email:");

        lblTelefonoEditar.setText("Telefono:");

        lblSexoEditar.setText("Sexo:");

        grupoEditarSexo.add(rbHombreEditar);
        rbHombreEditar.setText("Hombre");
        rbHombreEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbHombreEditarActionPerformed(evt);
            }
        });

        grupoEditarSexo.add(rbMujerEditar);
        rbMujerEditar.setText("Mujer");

        grupoEditarSexo.add(rbOtroEditar);
        rbOtroEditar.setText("Otro");
        rbOtroEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOtroEditarActionPerformed(evt);
            }
        });

        lblNacionalidadEditar.setText("Nacionalidad:");

        lblResidenciaEditar.setText("Residencia:");

        lblTipoSangreEditar.setText("Tipo de Sangre:");

        lblAlergiasEditar.setText("Alergias:");

        lblVacunasEditar.setText("Vacunas:");

        chboxPrioritarioEditar.setText("Prioritario");
        chboxPrioritarioEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chboxPrioritarioEditarActionPerformed(evt);
            }
        });

        btnGuardarDatosEditar.setText("Guardar datos del paciente");
        btnGuardarDatosEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarDatosEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblEditarDatos)
                        .addGap(142, 142, 142))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cBoxPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblApellidosEditar)
                            .addComponent(lblNombreEditar)
                            .addComponent(lblEdadEditar)
                            .addComponent(lblEmailEditar)
                            .addComponent(lblTelefonoEditar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtApellidosEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(txtEmailEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(txtTelefonoEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(spEdadEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                            .addComponent(txtNombreEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblVacunasEditar)
                            .addComponent(lblAlergiasEditar)
                            .addComponent(lblTipoSangreEditar)
                            .addComponent(lblResidenciaEditar)
                            .addComponent(lblNacionalidadEditar)
                            .addComponent(lblSexoEditar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNacionalidadEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtResidenciaEditar, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTipoSangreEditar, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtAlergiasEditar, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtVacunasEditar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnGuardarDatosEditar)
                                    .addComponent(chboxPrioritarioEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(rbHombreEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbMujerEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbOtroEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblEditarDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cBoxPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreEditar)
                    .addComponent(txtNombreEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidosEditar)
                    .addComponent(txtApellidosEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdadEditar)
                    .addComponent(spEdadEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmailEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefonoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefonoEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexoEditar)
                    .addComponent(rbHombreEditar)
                    .addComponent(rbMujerEditar)
                    .addComponent(rbOtroEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNacionalidadEditar)
                    .addComponent(txtNacionalidadEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResidenciaEditar)
                    .addComponent(txtResidenciaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipoSangreEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipoSangreEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlergiasEditar)
                    .addComponent(txtAlergiasEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVacunasEditar)
                    .addComponent(txtVacunasEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chboxPrioritarioEditar)
                .addGap(24, 24, 24)
                .addComponent(btnGuardarDatosEditar)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarDatosEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarDatosEditarActionPerformed
        GuardarDatos(ventAnterior);
    }//GEN-LAST:event_btnGuardarDatosEditarActionPerformed

    private void rbOtroEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOtroEditarActionPerformed
    }//GEN-LAST:event_rbOtroEditarActionPerformed

    private void rbHombreEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbHombreEditarActionPerformed
    }//GEN-LAST:event_rbHombreEditarActionPerformed

    private void spEdadEditarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spEdadEditarStateChanged
        System.out.println("Nuevo valor: " + spEdadEditar.getValue());
    }//GEN-LAST:event_spEdadEditarStateChanged

    private void chboxPrioritarioEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chboxPrioritarioEditarActionPerformed
        System.out.println("Se ha cambiado la selección del Check Box.");
    }//GEN-LAST:event_chboxPrioritarioEditarActionPerformed

    private void cBoxPacientesActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println("Se ha seleccionado un elemento del Combo Box.");
        switch (cBoxPacientes.getSelectedIndex()) {
            case 0:
                ModificarDatos("", "", 0, "", "", "", "", "", "", "", "", "");
                break;
            case 1:
                ModificarDatos(Jorge.getNombre(), Jorge.getApellidos(), Jorge.getEdad(), Jorge.getEmail(), Jorge.getTelefono(), Jorge.getSexo(), Jorge.getNacionalidad(), Jorge.getResidencia(), Jorge.getTipoSangre(), Jorge.getAlergias(), Jorge.getVacunas(), Jorge.getPrioritario());
                break;
            case 2:
                ModificarDatos(Pedro.getNombre(), Pedro.getApellidos(), Pedro.getEdad(), Pedro.getEmail(), Pedro.getTelefono(), Pedro.getSexo(), Pedro.getNacionalidad(), Pedro.getResidencia(), Pedro.getTipoSangre(), Pedro.getAlergias(), Pedro.getVacunas(), Pedro.getPrioritario());
                break;
            case 3:
                ModificarDatos(Alma.getNombre(), Alma.getApellidos(), Alma.getEdad(), Alma.getEmail(), Alma.getTelefono(), Alma.getSexo(), Alma.getNacionalidad(), Alma.getResidencia(), Alma.getTipoSangre(), Alma.getAlergias(), Alma.getVacunas(), Alma.getPrioritario());
                break;
            case 4:
                ModificarDatos(Luis.getNombre(), Luis.getApellidos(), Luis.getEdad(), Luis.getEmail(), Luis.getTelefono(), Luis.getSexo(), Luis.getNacionalidad(), Luis.getResidencia(), Luis.getTipoSangre(), Luis.getAlergias(), Luis.getVacunas(), Luis.getPrioritario());
                break;
        }
    }                                             

    public void setDatos(Paciente paciente){
        switch(paciente.getNombre()){
            case "Jorge":
                cBoxPacientes.setSelectedIndex(1);
                break;
            case "Pedro":
                cBoxPacientes.setSelectedIndex(2);
                break;
            case "Alma Delfina":
                cBoxPacientes.setSelectedIndex(3);
                break;
            case "Luis Enrique":
                cBoxPacientes.setSelectedIndex(4);
        }
        txtNombreEditar.setText(paciente.getNombre());
        txtApellidosEditar.setText(paciente.getApellidos());
        spEdadEditar.setValue(paciente.getEdad());
        txtEmailEditar.setText(paciente.getEmail());
        txtTelefonoEditar.setText(paciente.getTelefono());
        if(paciente.getSexo().equals("Hombre")){
            rbHombreEditar.setSelected(true);
        }else if(paciente.getSexo().equals("Mujer")){
            rbMujerEditar.setSelected(true);
        }else{
            rbOtroEditar.setSelected(true);
        }
        txtNacionalidadEditar.setText(paciente.getNacionalidad());
        txtResidenciaEditar.setText(paciente.getResidencia());
        txtTipoSangreEditar.setText(paciente.getTipoSangre());
        txtAlergiasEditar.setText(paciente.getAlergias());
        txtVacunasEditar.setText(paciente.getVacunas());
        if(paciente.getPrioritario().equals("Si")){
            chboxPrioritarioEditar.setSelected(true);
        }else{
            chboxPrioritarioEditar.setSelected(false);
        }
    }

    public void ModificarDatos(String nombre, String apellidos, int edad, String email, String telefono, String sexo, String nacionalidad, String residencia, String tipoSangre, String alergias, String vacunas, String prioritario) {
        txtNombreEditar.setText(nombre);
        txtApellidosEditar.setText(apellidos);
        spEdadEditar.setValue(edad);
        txtEmailEditar.setText(email);
        txtTelefonoEditar.setText(telefono);
        
        if(sexo.equals("Hombre")){
            rbHombreEditar.setSelected(true);
        }else if(sexo.equals("Mujer")){
            rbMujerEditar.setSelected(true);
        }else{
            rbOtroEditar.setSelected(true);
        }

        txtNacionalidadEditar.setText(nacionalidad);
        txtResidenciaEditar.setText(residencia);
        txtTipoSangreEditar.setText(tipoSangre);
        txtAlergiasEditar.setText(alergias);
        txtVacunasEditar.setText(vacunas);
        chboxPrioritarioEditar.setSelected(prioritario.equals("Si"));

    }

    public void GuardarDatos(String ventAnterior) {
        switch (cBoxPacientes.getSelectedIndex()) {
            case 0:
                break;
            case 1:
                paciente = Jorge;
                break;
            case 2:
                paciente = Pedro;
                break;
            case 3:
                paciente = Alma;
                break;
            case 4:
                paciente = Luis;
                break;
        }
        paciente.setNombre(txtNombreEditar.getText());
        paciente.setApellidos(txtApellidosEditar.getText());
        paciente.setEdad((int) spEdadEditar.getValue());
        paciente.setEmail(txtEmailEditar.getText());
        paciente.setTelefono(txtTelefonoEditar.getText());
        if (rbHombreEditar.isSelected()) {
            paciente.setSexo("Hombre");
        } else if (rbMujerEditar.isSelected()) {
            paciente.setSexo("Mujer");
        } else {
            paciente.setSexo("Otro");
        }
        paciente.setNacionalidad(txtNacionalidadEditar.getText());
        paciente.setResidencia(txtResidenciaEditar.getText());
        paciente.setTipoSangre(txtTipoSangreEditar.getText());
        paciente.setAlergias(txtAlergiasEditar.getText());
        paciente.setVacunas(txtVacunasEditar.getText());
        if (chboxPrioritarioEditar.isSelected()) {
            paciente.setPrioritario("Si");
        } else {
            paciente.setPrioritario("No");
        }
        this.setVisible(false);
        if (ventAnterior.equals("Ventana Pacientes")) {
            ventPacientes.LlenadoDeDatos();
            ventPacientes.setVisible(true);
        } else {
            ventListaPacientes.LlenadoDeDatos(paciente);
            ventListaPacientes.setVisible(true);
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
            java.util.logging.Logger.getLogger(EditarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarDatosEditar;
    private javax.swing.JComboBox<String> cBoxPacientes;
    private javax.swing.JCheckBox chboxPrioritarioEditar;
    private javax.swing.ButtonGroup grupoEditarSexo;
    private javax.swing.JLabel lblAlergiasEditar;
    private javax.swing.JLabel lblApellidosEditar;
    private javax.swing.JLabel lblEdadEditar;
    private javax.swing.JLabel lblEditarDatos;
    private javax.swing.JLabel lblEmailEditar;
    private javax.swing.JLabel lblNacionalidadEditar;
    private javax.swing.JLabel lblNombreEditar;
    private javax.swing.JLabel lblResidenciaEditar;
    private javax.swing.JLabel lblSexoEditar;
    private javax.swing.JLabel lblTelefonoEditar;
    private javax.swing.JLabel lblTipoSangreEditar;
    private javax.swing.JLabel lblVacunasEditar;
    private javax.swing.JRadioButton rbHombreEditar;
    private javax.swing.JRadioButton rbMujerEditar;
    private javax.swing.JRadioButton rbOtroEditar;
    private javax.swing.JSpinner spEdadEditar;
    private javax.swing.JTextField txtAlergiasEditar;
    private javax.swing.JTextField txtApellidosEditar;
    private javax.swing.JTextField txtEmailEditar;
    private javax.swing.JTextField txtNacionalidadEditar;
    private javax.swing.JTextField txtNombreEditar;
    private javax.swing.JTextField txtResidenciaEditar;
    private javax.swing.JTextField txtTelefonoEditar;
    private javax.swing.JTextField txtTipoSangreEditar;
    private javax.swing.JTextField txtVacunasEditar;
    // End of variables declaration//GEN-END:variables
}
