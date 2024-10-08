/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion.empleados.opciones.registros.obtenidos;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import validaciones.*;
import entidades.*;
import seguridad.Autenticacion;

/**
 *
 * @author Roberto
 */
public class IFrmDatosMovimientoObtenidos extends javax.swing.JInternalFrame {
    public static IFrmDatosMovimientoObtenidos form = null;
    /**
     * Creates new form FrmDatosCuentaObtenidos
     */
    private IFrmDatosMovimientoObtenidos() {
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
        tipAccion = new javax.swing.JLabel();
        tipEmpleado = new javax.swing.JLabel();
        labelTipoMovimiento = new javax.swing.JLabel();
        labelNumeroMovimiento = new javax.swing.JLabel();
        labelCodigoEmisora = new javax.swing.JLabel();
        labelCodigoReceptora = new javax.swing.JLabel();
        labelFechaMovimiento = new javax.swing.JLabel();
        labelEmpleadoAutorizador = new javax.swing.JLabel();
        txtImporte = new javax.swing.JTextField();
        txtNumeroMovimiento = new javax.swing.JTextField();
        txtTipoMovimiento = new javax.swing.JTextField();
        txtCodigoEmisora = new javax.swing.JTextField();
        txtCodigoReceptora = new javax.swing.JTextField();
        labelImporte = new javax.swing.JLabel();
        txtFechaMovimiento = new javax.swing.JTextField();
        txtEmpleadoAutorizador = new javax.swing.JTextField();
        txtImporteMoneda = new javax.swing.JTextField();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(914, 420));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(20, 45, 68));

        tituloPanel.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        tituloPanel.setForeground(new java.awt.Color(229, 229, 229));
        tituloPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloPanel.setText("Estás observando los datos de un movimiento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 70));

        jPanel2.setBackground(new java.awt.Color(229, 229, 229));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tipAccion.setForeground(new java.awt.Color(0, 0, 0));
        tipAccion.setText("Esta es una acción de empleado autorizada para:");
        jPanel2.add(tipAccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        tipEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        tipEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tipEmpleado.setText("usuarioPlaceholder");
        jPanel2.add(tipEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 164, -1));

        labelTipoMovimiento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelTipoMovimiento.setForeground(new java.awt.Color(0, 0, 0));
        labelTipoMovimiento.setText("Tipo de Movimiento:");
        jPanel2.add(labelTipoMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        labelNumeroMovimiento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelNumeroMovimiento.setForeground(new java.awt.Color(0, 0, 0));
        labelNumeroMovimiento.setText("Número de movimiento:");
        jPanel2.add(labelNumeroMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        labelCodigoEmisora.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCodigoEmisora.setForeground(new java.awt.Color(0, 0, 0));
        labelCodigoEmisora.setText("Código de cuenta emisora:");
        jPanel2.add(labelCodigoEmisora, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        labelCodigoReceptora.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCodigoReceptora.setForeground(new java.awt.Color(0, 0, 0));
        labelCodigoReceptora.setText("Código de cuenta receptora:");
        jPanel2.add(labelCodigoReceptora, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        labelFechaMovimiento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelFechaMovimiento.setForeground(new java.awt.Color(0, 0, 0));
        labelFechaMovimiento.setText("Fecha del Movimiento:");
        jPanel2.add(labelFechaMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, -1, -1));

        labelEmpleadoAutorizador.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelEmpleadoAutorizador.setForeground(new java.awt.Color(0, 0, 0));
        labelEmpleadoAutorizador.setText("Empleado autorizador:");
        jPanel2.add(labelEmpleadoAutorizador, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        txtImporte.setEnabled(false);
        txtImporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImporteActionPerformed(evt);
            }
        });
        jPanel2.add(txtImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 70, -1));

        txtNumeroMovimiento.setEnabled(false);
        jPanel2.add(txtNumeroMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 190, -1));

        txtTipoMovimiento.setEnabled(false);
        jPanel2.add(txtTipoMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 190, -1));

        txtCodigoEmisora.setEnabled(false);
        jPanel2.add(txtCodigoEmisora, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 190, -1));

        txtCodigoReceptora.setEnabled(false);
        jPanel2.add(txtCodigoReceptora, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 190, -1));

        labelImporte.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelImporte.setForeground(new java.awt.Color(0, 0, 0));
        labelImporte.setText("Importe:");
        jPanel2.add(labelImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        txtFechaMovimiento.setEnabled(false);
        txtFechaMovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaMovimientoActionPerformed(evt);
            }
        });
        jPanel2.add(txtFechaMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 190, -1));

        txtEmpleadoAutorizador.setEnabled(false);
        txtEmpleadoAutorizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpleadoAutorizadorActionPerformed(evt);
            }
        });
        jPanel2.add(txtEmpleadoAutorizador, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, 190, -1));

        txtImporteMoneda.setEnabled(false);
        txtImporteMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImporteMonedaActionPerformed(evt);
            }
        });
        jPanel2.add(txtImporteMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 110, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 900, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtImporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImporteActionPerformed

    private void txtFechaMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaMovimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaMovimientoActionPerformed

    private void txtEmpleadoAutorizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpleadoAutorizadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpleadoAutorizadorActionPerformed

    private void txtImporteMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImporteMonedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImporteMonedaActionPerformed
    
    public static IFrmDatosMovimientoObtenidos getInstance(Movimiento mov){
        form = new IFrmDatosMovimientoObtenidos();
        form.rellenarInformacion(mov);
        return form;
    }
    
    private void rellenarInformacion(Movimiento movimiento){
        try {
            txtNumeroMovimiento.setText(String.valueOf(movimiento.getMovinumero()));
            txtTipoMovimiento.setText(TiposMovimiento.obtener(movimiento.getTipoCodigo()).getDescripcion());
            txtCodigoEmisora.setText(movimiento.getCuencodigo());
            txtCodigoReceptora.setText(movimiento.getCuenReferencia());
            txtImporte.setText(String.valueOf(movimiento.getImporte()));
            
            /* Obtiene el código de la moneda y obtiene su descripción */
            txtImporteMoneda.setText(Monedas.obtener(Cuentas.obtener(movimiento.getCuencodigo()).getCodigoMoneda()).getDescripcion());
            
            txtEmpleadoAutorizador.setText(movimiento.getEmplcodigo());
            
            /* Convierte la fecha java.sql.Date a String */
            java.sql.Date fechaSql = movimiento.getFecha();
            SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
            java.util.Date fechaUtil = new java.util.Date(fechaSql.getTime());
            String fechaFormateada = formateador.format(fechaUtil);
            txtFechaMovimiento.setText(fechaFormateada);
        } catch (NullPointerException e){
            // Detecta si el parser falló para la fecha
            JOptionPane.showMessageDialog(this, "Datos de una Cuenta | No se pudo obtener la fecha correctamente.", "Ocurrió un problema...", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e){
            JOptionPane.showMessageDialog(this, e.getMessage(), "Un problema ha ocurrido...", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        } catch (SQLException e){
            JOptionPane.showMessageDialog(this, "Datos de un Movimiento | Ha ocurrido un problema mientras nos conectabamos a la BD. Por favor, cierra el programa y vuelve a intentarlo.", "Un problema ha ocurrido...", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCodigoEmisora;
    private javax.swing.JLabel labelCodigoReceptora;
    private javax.swing.JLabel labelEmpleadoAutorizador;
    private javax.swing.JLabel labelFechaMovimiento;
    private javax.swing.JLabel labelImporte;
    private javax.swing.JLabel labelNumeroMovimiento;
    private javax.swing.JLabel labelTipoMovimiento;
    private javax.swing.JLabel tipAccion;
    private javax.swing.JLabel tipEmpleado;
    private javax.swing.JLabel tituloPanel;
    private javax.swing.JTextField txtCodigoEmisora;
    private javax.swing.JTextField txtCodigoReceptora;
    private javax.swing.JTextField txtEmpleadoAutorizador;
    private javax.swing.JTextField txtFechaMovimiento;
    private javax.swing.JTextField txtImporte;
    private javax.swing.JTextField txtImporteMoneda;
    private javax.swing.JTextField txtNumeroMovimiento;
    private javax.swing.JTextField txtTipoMovimiento;
    // End of variables declaration//GEN-END:variables
}
