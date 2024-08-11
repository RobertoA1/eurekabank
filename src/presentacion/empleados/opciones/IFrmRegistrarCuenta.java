/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion.empleados.opciones;

import validaciones.Cuentas;

/**
 *
 * @author LUCANO
 */
public class IFrmRegistrarCuenta extends javax.swing.JInternalFrame {

    /**
     * Creates new form IFrmRegistrarCliente
     */
    public IFrmRegistrarCuenta() {
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

        jPanel1 = new javax.swing.JPanel();
        tituloPanel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tipAccion = new javax.swing.JLabel();
        tipEmpleado = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        labelMoneda = new javax.swing.JLabel();
        txtSucursal = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        labelMoneda1 = new javax.swing.JLabel();
        txtMoneda = new javax.swing.JTextField();
        labelMoneda2 = new javax.swing.JLabel();
        labelMoneda3 = new javax.swing.JLabel();
        txtCodigoCuenta = new javax.swing.JTextField();
        txtCodigoCliente = new javax.swing.JTextField();
        labelMoneda4 = new javax.swing.JLabel();
        txtCodigoUser = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(20, 45, 68));

        tituloPanel1.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        tituloPanel1.setForeground(new java.awt.Color(229, 229, 229));
        tituloPanel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloPanel1.setText("Registrar Cuenta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(359, Short.MAX_VALUE)
                .addComponent(tituloPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(337, 337, 337))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(tituloPanel1)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 60));

        jPanel2.setBackground(new java.awt.Color(229, 229, 229));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tipAccion.setForeground(new java.awt.Color(0, 0, 0));
        tipAccion.setText("Esta es una acción de empleado autorizada para:");
        jPanel2.add(tipAccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        tipEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        tipEmpleado.setText("usuarioPlaceholder");
        jPanel2.add(tipEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 164, -1));

        labelCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCodigo.setForeground(new java.awt.Color(0, 0, 0));
        labelCodigo.setText("Código:");
        jPanel2.add(labelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        txtClave.setEnabled(false);
        jPanel2.add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 172, -1));

        labelMoneda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelMoneda.setForeground(new java.awt.Color(0, 0, 0));
        labelMoneda.setText("Codigo de Cliente:");
        jPanel2.add(labelMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));

        txtSucursal.setEnabled(false);
        jPanel2.add(txtSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 172, -1));

        btnRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.gif"))); // NOI18N
        btnRegistrar.setMnemonic('S');
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, -1, -1));

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.gif"))); // NOI18N
        btnSalir.setMnemonic('S');
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        labelMoneda1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelMoneda1.setForeground(new java.awt.Color(0, 0, 0));
        labelMoneda1.setText("Clave:");
        jPanel2.add(labelMoneda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 70, -1));

        txtMoneda.setEnabled(false);
        jPanel2.add(txtMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 172, -1));

        labelMoneda2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelMoneda2.setForeground(new java.awt.Color(0, 0, 0));
        labelMoneda2.setText("Sucursal:");
        jPanel2.add(labelMoneda2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        labelMoneda3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelMoneda3.setForeground(new java.awt.Color(0, 0, 0));
        labelMoneda3.setText("Moneda:");
        jPanel2.add(labelMoneda3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 60, -1));

        txtCodigoCuenta.setEnabled(false);
        jPanel2.add(txtCodigoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 172, -1));

        txtCodigoCliente.setEnabled(false);
        jPanel2.add(txtCodigoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 172, -1));

        labelMoneda4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelMoneda4.setForeground(new java.awt.Color(0, 0, 0));
        labelMoneda4.setText("Código Usuario:");
        jPanel2.add(labelMoneda4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 120, -1));

        txtCodigoUser.setEnabled(false);
        jPanel2.add(txtCodigoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 172, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 900, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        
        //No se que hacer pipipi
        
        // Cuentas.agregar(txtCodigoCuenta.getText(), txtMoneda.getText(), txtSucursal.getText(), 
        //       txtCodigoCliente.getText(), txtCodigoUser.getText(), txtClave.getText());
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnActualizar1;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelMoneda;
    private javax.swing.JLabel labelMoneda1;
    private javax.swing.JLabel labelMoneda2;
    private javax.swing.JLabel labelMoneda3;
    private javax.swing.JLabel labelMoneda4;
    private javax.swing.JLabel tipAccion;
    private javax.swing.JLabel tipEmpleado;
    private javax.swing.JLabel tituloPanel1;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtCodigoCliente;
    private javax.swing.JTextField txtCodigoCuenta;
    private javax.swing.JTextField txtCodigoUser;
    private javax.swing.JTextField txtMoneda;
    private javax.swing.JTextField txtSucursal;
    // End of variables declaration//GEN-END:variables
}
