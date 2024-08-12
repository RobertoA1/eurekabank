/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion.clientes.opciones.transacciones;

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
import operaciones.GestorTransacciones;
import seguridad.Autenticacion;
import seguridad.Contrasenas;

/**
 *
 * @author Roberto
 */
public class IFrmConfirmarTransferencia extends javax.swing.JInternalFrame {
    public static IFrmConfirmarTransferencia form = null;
    private ArrayList<Cuenta> cuentas = null;
    private Cuenta ctaemisor = null;
    private Cuenta ctareceptor = null;
    /**
     * Creates new form FrmDatosCuentaObtenidos
     */
    private IFrmConfirmarTransferencia(Cliente emisor, Cliente receptor, Cuenta ctaemisor, Cuenta ctareceptor) {
        initComponents();
        try {
            labelCodigoEmisor.setText("Estás transfiriendo desde tu cuenta: " + emisor.getCodigo());
            labelNombreEmisor.setText("Emisor: " + emisor.getApellidoPaterno() + " " + emisor.getApellidoMaterno() + " " + emisor.getNombre());
            labelCodigoReceptor.setText("Código de cuenta del receptor: " + receptor.getCodigo());
            labelNombreReceptor.setText("Receptor: " + receptor.getApellidoPaterno() + " " + receptor.getApellidoMaterno() + " " + receptor.getNombre());
            this.ctaemisor = ctaemisor;
            this.ctareceptor = ctareceptor;
        } catch (IllegalArgumentException e){
            JOptionPane.showMessageDialog(this, e.getMessage(), "Un problema ha ocurrido...", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        } catch (IllegalStateException e){
            JOptionPane.showMessageDialog(this, "Autenticación | No se puede continuar: No existe una sesión iniciada.", "Un problema ha ocurrido...", JOptionPane.ERROR_MESSAGE);
            this.dispose();
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
        labelCantidad = new javax.swing.JLabel();
        btnConfirmarTransferencia = new javax.swing.JButton();
        tipRealizandoTransf = new javax.swing.JLabel();
        labelNombreEmisor = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        tipTipoTransfer1 = new javax.swing.JLabel();
        labelCodigoEmisor = new javax.swing.JLabel();
        tipRealizandoTransf1 = new javax.swing.JLabel();
        labelCodigoReceptor = new javax.swing.JLabel();
        labelNombreReceptor = new javax.swing.JLabel();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(630, 560));
        setRequestFocusEnabled(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(20, 45, 68));

        tituloPanel.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        tituloPanel.setForeground(new java.awt.Color(229, 229, 229));
        tituloPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloPanel.setText("Confirma tu transferencia");

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

        labelCantidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCantidad.setForeground(new java.awt.Color(0, 0, 0));
        labelCantidad.setText("Introduce la cantidad a transferir:");
        jPanel2.add(labelCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 210, -1));

        btnConfirmarTransferencia.setText("Confirmar transferencia");
        btnConfirmarTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarTransferenciaActionPerformed(evt);
            }
        });
        jPanel2.add(btnConfirmarTransferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 190, 50));

        tipRealizandoTransf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tipRealizandoTransf.setForeground(new java.awt.Color(0, 0, 0));
        tipRealizandoTransf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tipRealizandoTransf.setText("Estás transfieriendo a:");
        jPanel2.add(tipRealizandoTransf, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 620, -1));

        labelNombreEmisor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelNombreEmisor.setForeground(new java.awt.Color(0, 0, 0));
        labelNombreEmisor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelNombreEmisor.setText("Emisor: nombresCompletosPlaceholder");
        jPanel2.add(labelNombreEmisor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 530, -1));
        jPanel2.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 190, -1));

        tipTipoTransfer1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tipTipoTransfer1.setForeground(new java.awt.Color(0, 0, 0));
        tipTipoTransfer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tipTipoTransfer1.setText("Transferencia entre cuentas Eurekabank");
        jPanel2.add(tipTipoTransfer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 620, -1));

        labelCodigoEmisor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCodigoEmisor.setForeground(new java.awt.Color(0, 0, 0));
        labelCodigoEmisor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelCodigoEmisor.setText("Estás transfiriendo desde tu cuenta: codigoPlaceholder");
        jPanel2.add(labelCodigoEmisor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 530, -1));

        tipRealizandoTransf1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tipRealizandoTransf1.setForeground(new java.awt.Color(0, 0, 0));
        tipRealizandoTransf1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tipRealizandoTransf1.setText("Estás realizando una transferencia");
        jPanel2.add(tipRealizandoTransf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 620, -1));

        labelCodigoReceptor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCodigoReceptor.setForeground(new java.awt.Color(0, 0, 0));
        labelCodigoReceptor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelCodigoReceptor.setText("Código de cuenta del receptor: codigoPlaceholder");
        jPanel2.add(labelCodigoReceptor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 530, -1));

        labelNombreReceptor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelNombreReceptor.setForeground(new java.awt.Color(0, 0, 0));
        labelNombreReceptor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelNombreReceptor.setText("Receptor: nombresCompletosPlaceholder");
        jPanel2.add(labelNombreReceptor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 530, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 620, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnConfirmarTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarTransferenciaActionPerformed
        try {
            float cantidad = Float.parseFloat(txtCantidad.getText());
            GestorTransacciones.transferir(ctaemisor.getCodigo(), ctareceptor.getCodigo(), cantidad, "9999");
            JOptionPane.showMessageDialog(this, "La transferencia se realizó correctamente.", "Transferencia completa", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } catch (IllegalArgumentException e){
            JOptionPane.showMessageDialog(this, e.getMessage(), "Un problema ha ocurrido...", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        } catch (IllegalStateException e){
            JOptionPane.showMessageDialog(this, "Autenticación | No se puede continuar: No existe una sesión iniciada.", "Un problema ha ocurrido...", JOptionPane.ERROR_MESSAGE);
            this.dispose();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(this, "Datos de una Cuenta | Ha ocurrido un problema mientras nos conectabamos a la BD. Por favor, cierra el programa y vuelve a intentarlo.", "Un problema ha ocurrido...", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnConfirmarTransferenciaActionPerformed
    
    public static IFrmConfirmarTransferencia getInstance(Cliente emisor, Cliente receptor, Cuenta ctaemisor, Cuenta ctareceptor){
        form = new IFrmConfirmarTransferencia(emisor, receptor, ctaemisor, ctareceptor);
        return form;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmarTransferencia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCantidad;
    private javax.swing.JLabel labelCodigoEmisor;
    private javax.swing.JLabel labelCodigoReceptor;
    private javax.swing.JLabel labelNombreEmisor;
    private javax.swing.JLabel labelNombreReceptor;
    private javax.swing.JLabel tipRealizandoTransf;
    private javax.swing.JLabel tipRealizandoTransf1;
    private javax.swing.JLabel tipTipoTransfer1;
    private javax.swing.JLabel tituloPanel;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
}
