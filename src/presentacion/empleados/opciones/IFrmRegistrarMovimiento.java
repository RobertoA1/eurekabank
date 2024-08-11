/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion.empleados.opciones;

import entidades.Movimiento;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import seguridad.Autenticacion;
import validaciones.Movimientos;

/**
 *
 * @author LUCANO
 */
public class IFrmRegistrarMovimiento extends javax.swing.JInternalFrame {

    public static IFrmRegistrarMovimiento form = null;
    /**
     * Creates new form IFrmRegistrarMovimiento
     */
    public IFrmRegistrarMovimiento() {
        initComponents();
        try {
            tipEmpleado.setText(Autenticacion.obtenerUsuario().getCodigo());
        } catch (IllegalStateException e){
            JOptionPane.showMessageDialog(this, "Autenticación | No se puede continuar: No existe una sesión iniciada.", "Un problema ha ocurrido...", JOptionPane.ERROR_MESSAGE);
            this.dispose();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(this, "Datos de una Cuenta | Ha ocurrido un problema mientras nos conectabamos a la BD. Por favor, cierra el programa y vuelve a intentarlo.", "Un problema ha ocurrido...", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tituloPanel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtImporte = new javax.swing.JTextField();
        labelCodigo = new javax.swing.JLabel();
        labelCodigo1 = new javax.swing.JLabel();
        cbxDia = new javax.swing.JComboBox<>();
        cbxMes = new javax.swing.JComboBox<>();
        cbxAño = new javax.swing.JComboBox<>();
        txtCode = new javax.swing.JTextField();
        txtReferencia = new javax.swing.JTextField();
        txtNum = new javax.swing.JTextField();
        labelCodigo2 = new javax.swing.JLabel();
        labelCodigo3 = new javax.swing.JLabel();
        labelCodigo5 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        tipAccion = new javax.swing.JLabel();
        tipEmpleado = new javax.swing.JLabel();
        labelCodigo4 = new javax.swing.JLabel();
        cbxTM = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(20, 45, 68));

        tituloPanel1.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        tituloPanel1.setForeground(new java.awt.Color(229, 229, 229));
        tituloPanel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloPanel1.setText("Registrar Movimiento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(tituloPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(tituloPanel1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(229, 229, 229));

        labelCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCodigo.setForeground(new java.awt.Color(0, 0, 0));
        labelCodigo.setText("Código de la cuenta:");

        labelCodigo1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCodigo1.setForeground(new java.awt.Color(0, 0, 0));
        labelCodigo1.setText("Número de Movimiento:");

        cbxDia.setBackground(new java.awt.Color(255, 255, 255));
        cbxDia.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        cbxDia.setForeground(new java.awt.Color(0, 0, 0));
        cbxDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DD", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cbxMes.setBackground(new java.awt.Color(255, 255, 255));
        cbxMes.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        cbxMes.setForeground(new java.awt.Color(0, 0, 0));
        cbxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MM", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        cbxAño.setBackground(new java.awt.Color(255, 255, 255));
        cbxAño.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        cbxAño.setForeground(new java.awt.Color(0, 0, 0));
        cbxAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AAAA", "2010", "2011", "2012", "2013", "2014", "2015", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026" }));
        cbxAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAñoActionPerformed(evt);
            }
        });

        labelCodigo2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCodigo2.setForeground(new java.awt.Color(0, 0, 0));
        labelCodigo2.setText("Fecha:");

        labelCodigo3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCodigo3.setForeground(new java.awt.Color(0, 0, 0));
        labelCodigo3.setText("Importe:");

        labelCodigo5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCodigo5.setForeground(new java.awt.Color(0, 0, 0));
        labelCodigo5.setText("Referencia:");

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

        tipAccion.setForeground(new java.awt.Color(0, 0, 0));
        tipAccion.setText("Esta es una acción de empleado autorizada para:");

        tipEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        tipEmpleado.setText("usuarioPlaceholder");

        labelCodigo4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCodigo4.setForeground(new java.awt.Color(0, 0, 0));
        labelCodigo4.setText("Tipo de Movimiento:");

        cbxTM.setBackground(new java.awt.Color(255, 255, 255));
        cbxTM.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        cbxTM.setForeground(new java.awt.Color(0, 0, 0));
        cbxTM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apertura de cuenta", "Cancelación de la cuenta", "Depósitos ", "Retiros", "Interés", "Mantenimiento", "Transferencias", "Cargo por movimiento", "ITF (Impuesto a las transferencias Financieras)" }));
        cbxTM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(tipAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(tipEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(btnSalir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelCodigo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbxAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCodigo)
                            .addComponent(labelCodigo1))
                        .addGap(86, 86, 86)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNum)
                            .addComponent(txtCode)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCodigo3)
                            .addComponent(labelCodigo5)
                            .addComponent(labelCodigo4))
                        .addGap(110, 110, 110)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxTM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtReferencia)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cbxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(cbxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 121, Short.MAX_VALUE))
                            .addComponent(txtImporte))))
                .addGap(102, 102, 102))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipAccion)
                    .addComponent(tipEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigo)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigo1)
                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCodigo2)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbxAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigo4)
                    .addComponent(cbxTM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigo3)
                    .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelCodigo5)
                    .addComponent(txtReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnSalir))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 756, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static IFrmRegistrarMovimiento getInstance(){
        if (form == null) {
            form = new IFrmRegistrarMovimiento();
        }
        return form;
    }
    
    private void registrarInformacion(){
   
        try {
            int dia = Integer.parseInt(cbxDia.getSelectedItem().toString());
            int mes = Integer.parseInt(cbxMes.getSelectedItem().toString());
            int año = Integer.parseInt(cbxAño.getSelectedItem().toString());
            Date fecha = new Date(año, mes, dia);
            Movimientos.agregar(txtCode.getText(), Long.parseLong(txtNum.getText()), fecha, tipEmpleado.getText(), cbxTM.getSelectedItem().toString() ,Float.parseFloat(txtImporte.getText()), txtReferencia.getText());

            JOptionPane.showMessageDialog(this, "Datos del cliente registrados correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            Logger.getLogger(IFrmModificarDatosCliente.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error al registrar los datos en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
    private void cbxAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxAñoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        form.registrarInformacion();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cbxTMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTMActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxAño;
    private javax.swing.JComboBox<String> cbxDia;
    private javax.swing.JComboBox<String> cbxMes;
    private javax.swing.JComboBox<String> cbxTM;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelCodigo1;
    private javax.swing.JLabel labelCodigo2;
    private javax.swing.JLabel labelCodigo3;
    private javax.swing.JLabel labelCodigo4;
    private javax.swing.JLabel labelCodigo5;
    private javax.swing.JLabel tipAccion;
    private javax.swing.JLabel tipEmpleado;
    private javax.swing.JLabel tituloPanel1;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtImporte;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtReferencia;
    // End of variables declaration//GEN-END:variables
}
