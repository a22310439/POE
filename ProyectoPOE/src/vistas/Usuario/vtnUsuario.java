package vistas.Usuario;

import modelo.paciente;
import vistas.vtnPrincipal;
import dao.PacienteImpDao;
import javax.swing.JOptionPane;

public class vtnUsuario extends javax.swing.JFrame {

    paciente pac = new paciente();
    vtnPrincipal ventPrincipal = null;
    vtnAgregarPaciente ventAgregarPaciente = null;
    vtnEditarPaciente ventEditarPaciente = null;
    vtnEliminarPaciente ventEliminarPaciente = null;
    PacienteImpDao bdPaciente = new PacienteImpDao();

    public vtnUsuario() {
        initComponents();
    }

    public vtnUsuario(vtnPrincipal ventPrincipal) {
        initComponents();
        this.ventPrincipal = ventPrincipal;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlUsuario = new javax.swing.JPanel();
        pnlTitulo = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        pnlTabla = new javax.swing.JPanel();
        btnCerrarSesion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInfoPaciente = new javax.swing.JTextArea();
        lblBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        menuUsuario = new javax.swing.JMenuBar();
        menuAgregarPaciente = new javax.swing.JMenu();
        itemAgregarPaciente = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        itemEditarPaciente = new javax.swing.JMenuItem();
        menuEliminar = new javax.swing.JMenu();
        itemEliminarPaciente = new javax.swing.JMenuItem();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pnlUsuario.setPreferredSize(new java.awt.Dimension(400, 400));

        pnlTitulo.setLayout(new java.awt.CardLayout());

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("Usuario");
        pnlTitulo.add(lblUsuario, "card2");

        pnlTabla.setLayout(new java.awt.GridLayout(1, 0));

        btnCerrarSesion.setText("Cerrar sesión");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        txtInfoPaciente.setColumns(20);
        txtInfoPaciente.setRows(5);
        jScrollPane1.setViewportView(txtInfoPaciente);

        lblBuscar.setText("Ingrese el código del paciente:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUsuarioLayout = new javax.swing.GroupLayout(pnlUsuario);
        pnlUsuario.setLayout(pnlUsuarioLayout);
        pnlUsuarioLayout.setHorizontalGroup(
            pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(pnlUsuarioLayout.createSequentialGroup()
                .addGroup(pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlUsuarioLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btnCerrarSesion)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlUsuarioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlUsuarioLayout.setVerticalGroup(
            pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsuarioLayout.createSequentialGroup()
                .addComponent(pnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblBuscar)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrarSesion)
                .addGap(42, 42, 42))
        );

        getContentPane().add(pnlUsuario, java.awt.BorderLayout.CENTER);

        menuAgregarPaciente.setText("Agregar");

        itemAgregarPaciente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemAgregarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plus.png"))); // NOI18N
        itemAgregarPaciente.setText("Agregar Paciente");
        itemAgregarPaciente.setPreferredSize(new java.awt.Dimension(177, 22));
        itemAgregarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarPacienteActionPerformed(evt);
            }
        });
        menuAgregarPaciente.add(itemAgregarPaciente);

        menuUsuario.add(menuAgregarPaciente);

        menuEditar.setText("Editar");

        itemEditarPaciente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemEditarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pen.png"))); // NOI18N
        itemEditarPaciente.setText("Editar Paciente");
        itemEditarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarPacienteActionPerformed(evt);
            }
        });
        menuEditar.add(itemEditarPaciente);

        menuUsuario.add(menuEditar);

        menuEliminar.setText("Eliminar");

        itemEliminarPaciente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemEliminarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/remove.png"))); // NOI18N
        itemEliminarPaciente.setText("Eliminar Paciente");
        itemEliminarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarPacienteActionPerformed(evt);
            }
        });
        menuEliminar.add(itemEliminarPaciente);

        menuUsuario.add(menuEliminar);

        setJMenuBar(menuUsuario);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemEditarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarPacienteActionPerformed
        if(ventEditarPaciente == null){
            ventEditarPaciente = new vtnEditarPaciente(this, pac, bdPaciente);
        }
        ventEditarPaciente.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itemEditarPacienteActionPerformed

    private void itemAgregarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarPacienteActionPerformed
        if(ventAgregarPaciente == null){
            ventAgregarPaciente = new vtnAgregarPaciente(this, pac, bdPaciente);
        }
        ventAgregarPaciente.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itemAgregarPacienteActionPerformed

    private void itemEliminarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarPacienteActionPerformed
        if(ventEliminarPaciente == null){
            ventEliminarPaciente = new vtnEliminarPaciente(this, pac, bdPaciente);
        }
        ventEliminarPaciente.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itemEliminarPacienteActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        btnCerrarSesionActionPerformed(null);
    }//GEN-LAST:event_formWindowClosing

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        ventPrincipal.setVisible(true);
        this.setVisible(false);
        txtBuscar.setText("");
        txtInfoPaciente.setText("");
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        bdPaciente.abrirConexion();
        pac = bdPaciente.consultarPaciente(txtBuscar.getText());
        bdPaciente.cerrarConexion();
        if(pac != null){
        txtInfoPaciente.setText(pac.mostrarInfo());
        }else{
            JOptionPane.showMessageDialog(this, "El paciente buscado no existe en el registro");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(vtnUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vtnUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vtnUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vtnUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vtnUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JMenuItem itemAgregarPaciente;
    private javax.swing.JMenuItem itemEditarPaciente;
    private javax.swing.JMenuItem itemEliminarPaciente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JMenu menuAgregarPaciente;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenu menuEliminar;
    private javax.swing.JMenuBar menuUsuario;
    private javax.swing.JPanel pnlTabla;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JPanel pnlUsuario;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextArea txtInfoPaciente;
    // End of variables declaration//GEN-END:variables
}
