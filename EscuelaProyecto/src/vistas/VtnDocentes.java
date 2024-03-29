package vistas;
import javax.swing.JOptionPane;

import dao.AlumnoImpDao;
import modelo.Alumno;
import modelo.Docente;

public class VtnDocentes extends javax.swing.JFrame {
    
    VtnPrincipal ventPrincipal = null;
    Alumno objAl = null;
    Docente objDoc = null;
    AlumnoImpDao bd = new AlumnoImpDao();
    
    public VtnDocentes(VtnPrincipal ventPrincipal, Alumno alumno, Docente docente){
        initComponents();
        this.ventPrincipal = ventPrincipal;
        this.objAl = alumno;
        this.objDoc = docente;
        ocultarComponentes();
    }
    
    public VtnDocentes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor./
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        tbpDocente = new javax.swing.JTabbedPane();
        pnlRegistrar = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblEdad = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblHoras = new javax.swing.JLabel();
        txtCantHoras = new javax.swing.JTextField();
        lblPagoHora = new javax.swing.JLabel();
        txtPagoHora = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        pnlEvaluar = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        txtMate = new javax.swing.JTextField();
        lblMate = new javax.swing.JLabel();
        txtFisica = new javax.swing.JTextField();
        lblFisica = new javax.swing.JLabel();
        txtProgra = new javax.swing.JTextField();
        lblProgra = new javax.swing.JLabel();
        btnEvaluar = new javax.swing.JButton();
        lblAlumno = new javax.swing.JLabel();
        lblNombreAlumno = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        lblTitulo.setText("Docentes");

        lblNombre.setText("Nombre:");

        lblEdad.setText("Edad:");

        txtEdad.setColumns(3);

        lblEmail.setText("Email");

        lblCodigo.setText("Codigo:");

        lblHoras.setText("Horas:");

        lblPagoHora.setText("Pago por hora:");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRegistrarLayout = new javax.swing.GroupLayout(pnlRegistrar);
        pnlRegistrar.setLayout(pnlRegistrarLayout);
        pnlRegistrarLayout.setHorizontalGroup(
            pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrarLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCodigo)
                    .addComponent(lblHoras)
                    .addComponent(lblEmail)
                    .addComponent(lblEdad)
                    .addComponent(lblNombre)
                    .addComponent(lblPagoHora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombre)
                    .addComponent(txtEmail)
                    .addComponent(txtCantHoras)
                    .addComponent(txtCodigo)
                    .addComponent(txtEdad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPagoHora))
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegistrarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(158, 158, 158))
        );
        pnlRegistrarLayout.setVerticalGroup(
            pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrarLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoras)
                    .addComponent(txtCantHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPagoHora)
                    .addComponent(txtPagoHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnGuardar)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        tbpDocente.addTab("Registrar", pnlRegistrar);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtMate.setColumns(3);

        lblMate.setText("Matematicas");

        txtFisica.setColumns(3);

        lblFisica.setText("Fisica");

        lblProgra.setText("Programacion");

        btnEvaluar.setText("Evaluar");
        btnEvaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvaluarActionPerformed(evt);
            }
        });

        lblAlumno.setText("Alumno:");

        javax.swing.GroupLayout pnlEvaluarLayout = new javax.swing.GroupLayout(pnlEvaluar);
        pnlEvaluar.setLayout(pnlEvaluarLayout);
        pnlEvaluarLayout.setHorizontalGroup(
            pnlEvaluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEvaluarLayout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(pnlEvaluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEvaluarLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(pnlEvaluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlEvaluarLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblFisica))
                            .addComponent(txtFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlEvaluarLayout.createSequentialGroup()
                        .addComponent(lblMate)
                        .addGap(67, 67, 67)
                        .addGroup(pnlEvaluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlEvaluarLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(txtProgra, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlEvaluarLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(lblProgra))))
                    .addGroup(pnlEvaluarLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(txtMate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEvaluarLayout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEvaluarLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(btnEvaluar))
                    .addGroup(pnlEvaluarLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(73, 73, 73))
        );
        pnlEvaluarLayout.setVerticalGroup(
            pnlEvaluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEvaluarLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(pnlEvaluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlEvaluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlumno)
                    .addComponent(lblNombreAlumno))
                .addGap(18, 18, 18)
                .addGroup(pnlEvaluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProgra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEvaluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProgra)
                    .addGroup(pnlEvaluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMate)
                        .addComponent(lblFisica)))
                .addGap(35, 35, 35)
                .addComponent(btnEvaluar)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        tbpDocente.addTab("Evaluar", pnlEvaluar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbpDocente)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(tbpDocente)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ventPrincipal.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        objDoc.setNombre(txtNombre.getText());
        objDoc.setEdad(Integer.parseInt(txtEdad.getText()));
        objDoc.setEmail(txtEmail.getText());
        objDoc.setCantHoras(Double.parseDouble(txtCantHoras.getText()));

        JOptionPane.showMessageDialog(this, "Docente guardado correctamente");
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String buscado = txtBuscar.getText();
        bd.abrirConexion();
        objAl = bd.consultarAlumno(buscado);
        bd.cerrarConexion();

        if(objAl != null){
            JOptionPane.showMessageDialog(this, "Alumno encontrado");
            mostrarComponentes();
        }else{
            JOptionPane.showMessageDialog(this,"Alumno no encontrado");
            ocultarComponentes();
        }
        limpiarCajas();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvaluarActionPerformed
        objDoc.evaluarAlumno(objAl, Double.parseDouble(txtMate.getText()), Double.parseDouble(txtFisica.getText()), Double.parseDouble(txtProgra.getText()));
        bd.abrirConexion();
        bd.actualizarAlumno(objAl);
        bd.cerrarConexion();
        
        JOptionPane.showMessageDialog(this, "Alumno evaluado");
        ocultarComponentes();
        limpiarCajas();
    }//GEN-LAST:event_btnEvaluarActionPerformed

    public void mostrarComponentes(){
        lblNombreAlumno.setText(objAl.getNombre());
        txtMate.setText(String.valueOf(objAl.getCalMate()));
        txtFisica.setText(String.valueOf(objAl.getCalFisica()));
        txtProgra.setText(String.valueOf(objAl.getCalProgra()));
        lblAlumno.setVisible(true);
        lblNombreAlumno.setVisible(true);
        lblMate.setVisible(true);
        txtMate.setVisible(true);
        lblFisica.setVisible(true);
        txtFisica.setVisible(true);
        lblProgra.setVisible(true);
        txtProgra.setVisible(true);
        btnEvaluar.setVisible(true);
    }

    public void ocultarComponentes(){
        lblAlumno.setVisible(false);
        lblNombreAlumno.setVisible(false);
        lblMate.setVisible(false);
        txtMate.setVisible(false);
        lblFisica.setVisible(false);
        txtFisica.setVisible(false);
        lblProgra.setVisible(false);
        txtProgra.setVisible(false);
        btnEvaluar.setVisible(false);
    }

    public void limpiarCajas(){
        txtBuscar.setText("");
        txtNombre.setText("");
        txtEdad.setText("");
        txtEmail.setText("");
        txtCodigo.setText("");
        txtCantHoras.setText("");
        txtPagoHora.setText("");
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
            java.util.logging.Logger.getLogger(VtnDocentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnDocentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnDocentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnDocentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnDocentes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEvaluar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel lblAlumno;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFisica;
    private javax.swing.JLabel lblHoras;
    private javax.swing.JLabel lblMate;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreAlumno;
    private javax.swing.JLabel lblPagoHora;
    private javax.swing.JLabel lblProgra;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlEvaluar;
    private javax.swing.JPanel pnlRegistrar;
    private javax.swing.JTabbedPane tbpDocente;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCantHoras;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFisica;
    private javax.swing.JTextField txtMate;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPagoHora;
    private javax.swing.JTextField txtProgra;
    // End of variables declaration//GEN-END:variables
}
