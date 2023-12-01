package vistas.Admin;

public class vtnAdminMedico extends javax.swing.JFrame {

    vtnAdmin ventAdmin = null;

    public vtnAdminMedico() {
        initComponents();
    }

    public vtnAdminMedico(vtnAdmin ventAdmin) {
        initComponents();
        this.ventAdmin = ventAdmin;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbpMedicos = new javax.swing.JTabbedPane();
        pnlAgregarUsuario = new javax.swing.JPanel();
        pnlAgregarUsuario1 = new javax.swing.JPanel();
        lblAgregarMédico = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        txtNombreAgregar = new javax.swing.JTextField();
        txtCodigoAgregar = new javax.swing.JTextField();
        txtPosicionAgregar = new javax.swing.JTextField();
        lblPosicion = new javax.swing.JLabel();
        txtedulaProfesionalAgregar = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblPosicion1 = new javax.swing.JLabel();
        txtEmailAgregar = new javax.swing.JTextField();
        lblApellidos = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        txtApellidosAgregar = new javax.swing.JTextField();
        txtAreaAgregar = new javax.swing.JTextField();
        lblArea = new javax.swing.JLabel();
        pnlEditarUsuario = new javax.swing.JPanel();
        lblEditarMedico = new javax.swing.JLabel();
        btnGuardar1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstMedicos = new javax.swing.JList<>();
        txtPosicionEditar = new javax.swing.JTextField();
        lblPosicion2 = new javax.swing.JLabel();
        txtCedulaProfesionalEditar = new javax.swing.JTextField();
        lblEmailAgregar = new javax.swing.JLabel();
        lblPosicion3 = new javax.swing.JLabel();
        txtEmailEditar = new javax.swing.JTextField();
        lblApellidos1 = new javax.swing.JLabel();
        lblCodigo1 = new javax.swing.JLabel();
        txtNombreEditar = new javax.swing.JTextField();
        txtApellidosEditar = new javax.swing.JTextField();
        txtNombreUsuarioEditar = new javax.swing.JTextField();
        lblArea21 = new javax.swing.JLabel();
        lblNombre1 = new javax.swing.JLabel();
        txtCodigoEditar = new javax.swing.JTextField();
        pnlEliminarUsuario = new javax.swing.JPanel();
        pnlEliminarMedico = new javax.swing.JPanel();
        lblEliminarMedico = new javax.swing.JLabel();
        txtCodigoMedico = new javax.swing.JTextField();
        lblCodigoMedico = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtInfoMedico = new javax.swing.JTextArea();
        btnEliminarMedico = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pnlAgregarUsuario1.setPreferredSize(new java.awt.Dimension(400, 410));

        lblAgregarMédico.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblAgregarMédico.setText("Agregar un médico");

        btnGuardar.setText("Guardar médico");

        lblNombre.setText("Nombre:");

        lblPosicion.setText("Posicion:");

        lblEmail.setText("Email:");

        lblPosicion1.setText("Cedula Profesional:");

        lblApellidos.setText("Apellidos:");

        lblCodigo.setText("Codigo:");

        lblArea.setText("Area:");

        javax.swing.GroupLayout pnlAgregarUsuario1Layout = new javax.swing.GroupLayout(pnlAgregarUsuario1);
        pnlAgregarUsuario1.setLayout(pnlAgregarUsuario1Layout);
        pnlAgregarUsuario1Layout.setHorizontalGroup(
            pnlAgregarUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAgregarUsuario1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(96, 96, 96))
            .addGroup(pnlAgregarUsuario1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(pnlAgregarUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlAgregarUsuario1Layout.createSequentialGroup()
                        .addGroup(pnlAgregarUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodigo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblApellidos, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblArea, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPosicion, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPosicion1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlAgregarUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigoAgregar)
                            .addComponent(txtEmailAgregar)
                            .addComponent(txtApellidosAgregar)
                            .addComponent(txtAreaAgregar)
                            .addComponent(txtPosicionAgregar)
                            .addComponent(txtedulaProfesionalAgregar)
                            .addComponent(txtNombreAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblAgregarMédico))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        pnlAgregarUsuario1Layout.setVerticalGroup(
            pnlAgregarUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAgregarUsuario1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblAgregarMédico)
                .addGap(41, 41, 41)
                .addGroup(pnlAgregarUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombreAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAgregarUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidos)
                    .addComponent(txtApellidosAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAgregarUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAgregarUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAgregarUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblArea)
                    .addComponent(txtAreaAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAgregarUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPosicion)
                    .addComponent(txtPosicionAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAgregarUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPosicion1)
                    .addComponent(txtedulaProfesionalAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout pnlAgregarUsuarioLayout = new javax.swing.GroupLayout(pnlAgregarUsuario);
        pnlAgregarUsuario.setLayout(pnlAgregarUsuarioLayout);
        pnlAgregarUsuarioLayout.setHorizontalGroup(
            pnlAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgregarUsuarioLayout.createSequentialGroup()
                .addComponent(pnlAgregarUsuario1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );
        pnlAgregarUsuarioLayout.setVerticalGroup(
            pnlAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAgregarUsuario1, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
        );

        tbpMedicos.addTab("Agregar Médico", pnlAgregarUsuario);

        lblEditarMedico.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblEditarMedico.setText("Editar un médico");

        btnGuardar1.setText("Guardar usuario");

        jScrollPane3.setViewportView(lstMedicos);

        lblPosicion2.setText("Posicion:");

        lblEmailAgregar.setText("Email:");

        lblPosicion3.setText("Cedula Profesional:");

        lblApellidos1.setText("Apellidos:");

        lblCodigo1.setText("Codigo:");

        lblArea21.setText("Area:");

        lblNombre1.setText("Nombre:");

        javax.swing.GroupLayout pnlEditarUsuarioLayout = new javax.swing.GroupLayout(pnlEditarUsuario);
        pnlEditarUsuario.setLayout(pnlEditarUsuarioLayout);
        pnlEditarUsuarioLayout.setHorizontalGroup(
            pnlEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditarUsuarioLayout.createSequentialGroup()
                .addGroup(pnlEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEditarUsuarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodigo1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblApellidos1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNombre1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblArea21, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPosicion2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPosicion3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEmailAgregar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlEditarUsuarioLayout.createSequentialGroup()
                                .addComponent(lblEditarMedico)
                                .addGap(0, 89, Short.MAX_VALUE))
                            .addGroup(pnlEditarUsuarioLayout.createSequentialGroup()
                                .addGroup(pnlEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtCodigoEditar)
                                        .addComponent(txtEmailEditar)
                                        .addComponent(txtNombreEditar)
                                        .addComponent(txtApellidosEditar)
                                        .addComponent(txtNombreUsuarioEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPosicionEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtCedulaProfesionalEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                    .addGroup(pnlEditarUsuarioLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(btnGuardar1)))
                .addContainerGap())
        );
        pnlEditarUsuarioLayout.setVerticalGroup(
            pnlEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditarUsuarioLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblEditarMedico)
                .addGap(35, 35, 35)
                .addGroup(pnlEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEditarUsuarioLayout.createSequentialGroup()
                        .addGroup(pnlEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre1)
                            .addComponent(txtNombreEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApellidos1)
                            .addComponent(txtApellidosEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmailEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmailAgregar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigo1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblArea21)
                            .addComponent(txtNombreUsuarioEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPosicion2)
                            .addComponent(txtPosicionEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPosicion3)
                            .addComponent(txtCedulaProfesionalEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(btnGuardar1)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        tbpMedicos.addTab("Editar Médico", pnlEditarUsuario);

        lblEliminarMedico.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblEliminarMedico.setText("Eliminar médico");

        txtCodigoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoMedicoActionPerformed(evt);
            }
        });

        lblCodigoMedico.setText("Codigo del médico a eliminar:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtInfoMedico.setColumns(20);
        txtInfoMedico.setRows(5);
        jScrollPane2.setViewportView(txtInfoMedico);

        btnEliminarMedico.setText("Eliminar médico");

        javax.swing.GroupLayout pnlEliminarMedicoLayout = new javax.swing.GroupLayout(pnlEliminarMedico);
        pnlEliminarMedico.setLayout(pnlEliminarMedicoLayout);
        pnlEliminarMedicoLayout.setHorizontalGroup(
            pnlEliminarMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEliminarMedicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEliminarMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEliminarMedicoLayout.createSequentialGroup()
                        .addGap(0, 109, Short.MAX_VALUE)
                        .addComponent(lblEliminarMedico)
                        .addGap(109, 109, 109))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEliminarMedicoLayout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
            .addGroup(pnlEliminarMedicoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblCodigoMedico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigoMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEliminarMedicoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminarMedico)
                .addGap(145, 145, 145))
        );
        pnlEliminarMedicoLayout.setVerticalGroup(
            pnlEliminarMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEliminarMedicoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblEliminarMedico)
                .addGap(18, 18, 18)
                .addGroup(pnlEliminarMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoMedico)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addComponent(btnEliminarMedico))
        );

        pnlEliminarUsuario.add(pnlEliminarMedico);

        tbpMedicos.addTab("Eliminar Médico", pnlEliminarUsuario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbpMedicos, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbpMedicos, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoMedicoActionPerformed

    }//GEN-LAST:event_txtCodigoMedicoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ventAdmin.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(vtnAdminMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vtnAdminMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vtnAdminMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vtnAdminMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vtnAdminMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminarMedico;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAgregarMédico;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblApellidos1;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblArea21;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigo1;
    private javax.swing.JLabel lblCodigoMedico;
    private javax.swing.JLabel lblEditarMedico;
    private javax.swing.JLabel lblEliminarMedico;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmailAgregar;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblPosicion;
    private javax.swing.JLabel lblPosicion1;
    private javax.swing.JLabel lblPosicion2;
    private javax.swing.JLabel lblPosicion3;
    private javax.swing.JList<String> lstMedicos;
    private javax.swing.JPanel pnlAgregarUsuario;
    private javax.swing.JPanel pnlAgregarUsuario1;
    private javax.swing.JPanel pnlEditarUsuario;
    private javax.swing.JPanel pnlEliminarMedico;
    private javax.swing.JPanel pnlEliminarUsuario;
    private javax.swing.JTabbedPane tbpMedicos;
    private javax.swing.JTextField txtApellidosAgregar;
    private javax.swing.JTextField txtApellidosEditar;
    private javax.swing.JTextField txtAreaAgregar;
    private javax.swing.JTextField txtCedulaProfesionalEditar;
    private javax.swing.JTextField txtCodigoAgregar;
    private javax.swing.JTextField txtCodigoEditar;
    private javax.swing.JTextField txtCodigoMedico;
    private javax.swing.JTextField txtEmailAgregar;
    private javax.swing.JTextField txtEmailEditar;
    private javax.swing.JTextArea txtInfoMedico;
    private javax.swing.JTextField txtNombreAgregar;
    private javax.swing.JTextField txtNombreEditar;
    private javax.swing.JTextField txtNombreUsuarioEditar;
    private javax.swing.JTextField txtPosicionAgregar;
    private javax.swing.JTextField txtPosicionEditar;
    private javax.swing.JTextField txtedulaProfesionalAgregar;
    // End of variables declaration//GEN-END:variables
}
