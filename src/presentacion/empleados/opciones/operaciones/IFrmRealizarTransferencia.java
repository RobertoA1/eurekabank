/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion.empleados.opciones.operaciones;

import presentacion.clientes.opciones.transacciones.*;
import presentacion.clientes.opciones.cuentas.*;
import presentacion.empleados.opciones.registros.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import validaciones.*;
import entidades.*;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import presentacion.FrmClientes;
import presentacion.administrador.FrmAdministrador;
import presentacion.empleados.FrmEmpleado;
import seguridad.Autenticacion;
import seguridad.Contrasenas;

/**
 *
 * @author Roberto
 */
public class IFrmRealizarTransferencia extends javax.swing.JInternalFrame {
    public static IFrmRealizarTransferencia form = null;
    private boolean administrador = false;
    /**
     * Creates new form FrmDatosCuentaObtenidos
     */
    private IFrmRealizarTransferencia() {
        initComponents();
        try {
            tipEmpleado.setText(Autenticacion.obtenerUsuario().getCodigo());
        } catch (IllegalArgumentException e){
            JOptionPane.showMessageDialog(this, e.getMessage(), "Un problema ha ocurrido...", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        } catch (IllegalStateException e){
            JOptionPane.showMessageDialog(this, "Autenticación | No se puede continuar: No existe una sesión iniciada.", "Un problema ha ocurrido...", JOptionPane.ERROR_MESSAGE);
            this.dispose();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(this, "Transferencias | Ha ocurrido un problema mientras nos conectabamos a la BD. Por favor, cierra el programa y vuelve a intentarlo.", "Un problema ha ocurrido...", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }

    public void habilitarAdministrador(){
        administrador = true;
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
        tituloPanel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelNumeroCuenta = new javax.swing.JLabel();
        btnRealizarTransferencia = new javax.swing.JButton();
        tipRealizandoTransf = new javax.swing.JLabel();
        tipTipoTransfer = new javax.swing.JLabel();
        txtNumeroCuentaEmisor = new javax.swing.JTextField();
        tipTipoTransfer1 = new javax.swing.JLabel();
        txtNumeroCuentaDestino = new javax.swing.JTextField();
        tipAccionEmpleado = new javax.swing.JLabel();
        tipEmpleado = new javax.swing.JLabel();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(630, 383));
        setRequestFocusEnabled(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(20, 45, 68));

        tituloPanel.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        tituloPanel.setForeground(new java.awt.Color(229, 229, 229));
        tituloPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloPanel.setText("Realizar una transferencia bancaria");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(tituloPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 70));

        jPanel2.setBackground(new java.awt.Color(229, 229, 229));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNumeroCuenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelNumeroCuenta.setForeground(new java.awt.Color(0, 0, 0));
        labelNumeroCuenta.setText("Introduce el número de cuenta destino:");
        jPanel2.add(labelNumeroCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 250, -1));

        btnRealizarTransferencia.setText("Realizar transferencia");
        btnRealizarTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarTransferenciaActionPerformed(evt);
            }
        });
        jPanel2.add(btnRealizarTransferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 190, 50));

        tipRealizandoTransf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tipRealizandoTransf.setForeground(new java.awt.Color(0, 0, 0));
        tipRealizandoTransf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tipRealizandoTransf.setText("Estás realizando una transferencia");
        jPanel2.add(tipRealizandoTransf, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 620, -1));

        tipTipoTransfer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tipTipoTransfer.setForeground(new java.awt.Color(0, 0, 0));
        tipTipoTransfer.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tipTipoTransfer.setText("Introduce el número de cuenta emisor:");
        jPanel2.add(tipTipoTransfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 240, -1));

        txtNumeroCuentaEmisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroCuentaEmisorActionPerformed(evt);
            }
        });
        jPanel2.add(txtNumeroCuentaEmisor, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 270, -1));

        tipTipoTransfer1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tipTipoTransfer1.setForeground(new java.awt.Color(0, 0, 0));
        tipTipoTransfer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tipTipoTransfer1.setText("Transferencia entre cuentas Eurekabank");
        jPanel2.add(tipTipoTransfer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 620, -1));
        jPanel2.add(txtNumeroCuentaDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 270, -1));

        tipAccionEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        tipAccionEmpleado.setText("Esta es una acción de empleado autorizada para:");
        jPanel2.add(tipAccionEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        tipEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        tipEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tipEmpleado.setText("usuarioPlaceholder");
        jPanel2.add(tipEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 164, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 620, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnRealizarTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarTransferenciaActionPerformed
        try {
            Cuenta cuentaReceptora = Cuentas.obtener(txtNumeroCuentaDestino.getText());
            Cuenta cuentaEmisora = Cuentas.obtener(txtNumeroCuentaEmisor.getText());
            System.out.println("codigo cliente emisor: " + cuentaEmisora.getCodigoCliente());
            Cliente clienteEmisor = Clientes.obtenerClientePorUsuario(cuentaEmisora.getCodigoUsuario());
            System.out.println("cliente emisor: " + clienteEmisor.getDni());
            Cliente clienteReceptor = Clientes.obtenerClientePorUsuario(cuentaReceptora.getCodigoUsuario());
            
            if (cuentaEmisora.getCodigoCliente().equalsIgnoreCase(cuentaReceptora.getCodigoCliente())){
                JOptionPane.showMessageDialog(this, "Realizar una transferencia | No puedes realizar una transferencia a una misma cuenta.", "Un problema ha ocurrido...", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (!cuentaEmisora.getCodigoMoneda().equalsIgnoreCase(cuentaReceptora.getCodigoMoneda())){
                JOptionPane.showMessageDialog(this, "Realizar una transferencia | No se puede continuar: La cuenta destino trabaja en una moneda distinta a la cuenta origen.", "Un problema ha ocurrido...", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            IFrmConfirmarTransferencia form = IFrmConfirmarTransferencia.getInstance(clienteEmisor, clienteReceptor, cuentaEmisora, cuentaReceptora);
            if (administrador == false) FrmEmpleado.centrarInternalFrame(form);
            else FrmAdministrador.centrarInternalFrame(form);
        } catch (IllegalArgumentException e){
            JOptionPane.showMessageDialog(this, e.getMessage(), "Un problema ha ocurrido...", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        } catch (IllegalStateException e){
            JOptionPane.showMessageDialog(this, "Autenticación | No se puede continuar: No existe una sesión iniciada.", "Un problema ha ocurrido...", JOptionPane.ERROR_MESSAGE);
            this.dispose();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(this, "Transferencias | Ha ocurrido un problema mientras nos conectabamos a la BD. Por favor, cierra el programa y vuelve a intentarlo.", "Un problema ha ocurrido...", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnRealizarTransferenciaActionPerformed

    private void txtNumeroCuentaEmisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroCuentaEmisorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroCuentaEmisorActionPerformed
    
    public static IFrmRealizarTransferencia getInstance(){
        form = new IFrmRealizarTransferencia();
        return form;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRealizarTransferencia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelNumeroCuenta;
    private javax.swing.JLabel tipAccionEmpleado;
    private javax.swing.JLabel tipEmpleado;
    private javax.swing.JLabel tipRealizandoTransf;
    private javax.swing.JLabel tipTipoTransfer;
    private javax.swing.JLabel tipTipoTransfer1;
    private javax.swing.JLabel tituloPanel;
    private javax.swing.JTextField txtNumeroCuentaDestino;
    private javax.swing.JTextField txtNumeroCuentaEmisor;
    // End of variables declaration//GEN-END:variables
}
