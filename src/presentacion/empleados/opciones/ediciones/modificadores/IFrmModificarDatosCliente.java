/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion.empleados.opciones.ediciones.modificadores;

import entidades.Cliente;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import seguridad.Autenticacion;
import validaciones.Clientes;

/**
 *
 * @author LUCANO
 */
public class IFrmModificarDatosCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form IFrmModificarDatosCliente
     */
    
    public static IFrmModificarDatosCliente form = null;
    
    public IFrmModificarDatosCliente() {
        initComponents();
        try {
            tipEmpleado.setText(Autenticacion.obtenerUsuario().getCodigo());
        } catch (IllegalStateException e){
            JOptionPane.showMessageDialog(this, "Autenticación | No se puede continuar: No existe una sesión iniciada.", "Un problema ha ocurrido...", JOptionPane.ERROR_MESSAGE);
            this.dispose();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(this, "Datos de un Cliente | Ha ocurrido un problema mientras nos conectabamos a la BD. Por favor, cierra el programa y vuelve a intentarlo.", "Un problema ha ocurrido...", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
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
        labelApellidoPaterno = new javax.swing.JLabel();
        labelApellidoMaterno = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelDNI = new javax.swing.JLabel();
        labelCiudad = new javax.swing.JLabel();
        labelDireccion = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellidoMaterno = new javax.swing.JTextField();
        txtApellidoPaterno = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        tipModificandoCliente = new javax.swing.JLabel();
        tipClienteCodigo = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        tipAccionEmpleado = new javax.swing.JLabel();
        tipEmpleado = new javax.swing.JLabel();

        setClosable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(20, 45, 68));

        tituloPanel.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        tituloPanel.setForeground(new java.awt.Color(229, 229, 229));
        tituloPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloPanel.setText("Estás modificando un cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(tituloPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, -1));

        jPanel2.setBackground(new java.awt.Color(229, 229, 229));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelApellidoPaterno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelApellidoPaterno.setForeground(new java.awt.Color(0, 0, 0));
        labelApellidoPaterno.setText("Apellido Paterno:");
        jPanel2.add(labelApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        labelApellidoMaterno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelApellidoMaterno.setForeground(new java.awt.Color(0, 0, 0));
        labelApellidoMaterno.setText("Apellido Materno:");
        jPanel2.add(labelApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        labelNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelNombre.setForeground(new java.awt.Color(0, 0, 0));
        labelNombre.setText("Nombre:");
        jPanel2.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        labelDNI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelDNI.setForeground(new java.awt.Color(0, 0, 0));
        labelDNI.setText("DNI:");
        jPanel2.add(labelDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        labelCiudad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCiudad.setForeground(new java.awt.Color(0, 0, 0));
        labelCiudad.setText("Ciudad:");
        jPanel2.add(labelCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        labelDireccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelDireccion.setForeground(new java.awt.Color(0, 0, 0));
        labelDireccion.setText("Direccion:");
        jPanel2.add(labelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        labelTelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelTelefono.setForeground(new java.awt.Color(0, 0, 0));
        labelTelefono.setText("Telefono:");
        jPanel2.add(labelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        labelEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(0, 0, 0));
        labelEmail.setText("Email:");
        jPanel2.add(labelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, -1, -1));
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 190, -1));
        jPanel2.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 190, -1));
        jPanel2.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 190, -1));
        jPanel2.add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 190, -1));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 190, -1));
        jPanel2.add(txtApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 190, 24));
        jPanel2.add(txtApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 190, -1));

        btnActualizar.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(0, 0, 0));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/style_file.gif"))); // NOI18N
        btnActualizar.setMnemonic('S');
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 145, 43));

        tipModificandoCliente.setForeground(new java.awt.Color(0, 0, 0));
        tipModificandoCliente.setText("Estás modificando al cliente con código");
        jPanel2.add(tipModificandoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        tipClienteCodigo.setForeground(new java.awt.Color(0, 0, 0));
        tipClienteCodigo.setText("codigoClientePlaceholder");
        jPanel2.add(tipClienteCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 164, -1));
        jPanel2.add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 190, -1));

        tipAccionEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        tipAccionEmpleado.setText("Esta es una acción de empleado autorizada para:");
        jPanel2.add(tipAccionEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        tipEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        tipEmpleado.setText("usuarioPlaceholder");
        jPanel2.add(tipEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 164, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 580, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
       form.actualizarInformacion();
    }//GEN-LAST:event_btnActualizarActionPerformed

    
    public static IFrmModificarDatosCliente getInstance(Cliente cliente){
        form = new IFrmModificarDatosCliente();
        form.rellenarInformacion(cliente);
        codigo = cliente.getCodigo();
        return form;
    }
    
    
    private void actualizarInformacion(){
        try {
            Clientes.modificarApellidoPaterno(codigo, txtApellidoPaterno.getText());
            Clientes.modificarApellidoMaterno(codigo, txtApellidoMaterno.getText());
            Clientes.modificarNombre(codigo, txtNombre.getText());
            Clientes.modificarDni(codigo, txtDNI.getText());
            Clientes.modificarCiudad(codigo, txtCiudad.getText());
            Clientes.modificarDireccion(codigo, txtDireccion.getText());
            Clientes.modificarTelefono(codigo, txtTelefono.getText());
            Clientes.modificarEmail(codigo, txtEmail.getText());

            JOptionPane.showMessageDialog(this, "Datos del cliente actualizados correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            Logger.getLogger(IFrmModificarDatosCliente.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error al actualizar los datos en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    private void rellenarInformacion(Cliente cliente){
        try {
            tipClienteCodigo.setText(cliente.getCodigo());
            txtApellidoPaterno.setText(cliente.getApellidoPaterno());
            txtApellidoMaterno.setText(cliente.getApellidoMaterno());
            txtNombre.setText(cliente.getNombre());
            txtDNI.setText(cliente.getDni());
            txtCiudad.setText(cliente.getCiudad());
            txtDireccion.setText(cliente.getDireccion());
            txtTelefono.setText(cliente.getTelefono());
            txtEmail.setText(cliente.getEmail());
        } catch (IllegalArgumentException e){
            JOptionPane.showMessageDialog(this, e.getMessage(), "Un problema ha ocurrido...", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        } 

    }
    
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        
    }//GEN-LAST:event_formInternalFrameOpened

    private static String codigo = null;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelApellidoMaterno;
    private javax.swing.JLabel labelApellidoPaterno;
    private javax.swing.JLabel labelCiudad;
    private javax.swing.JLabel labelDNI;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel tipAccionEmpleado;
    private javax.swing.JLabel tipClienteCodigo;
    private javax.swing.JLabel tipEmpleado;
    private javax.swing.JLabel tipModificandoCliente;
    private javax.swing.JLabel tituloPanel;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
