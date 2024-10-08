/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion.empleados.opciones;

import entidades.Moneda;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import validaciones.Monedas;

/**
 *
 * @author LUCANO
 */
public class IFrmModificarMoneda extends javax.swing.JInternalFrame {

    /**
     * Creates new form IFrmModificarInteresMensual
     */
    public IFrmModificarMoneda() {
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
        jSeparator2 = new javax.swing.JSeparator();
        btnBuscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtInteres = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtMM = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(229, 229, 229));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setBackground(new java.awt.Color(102, 255, 102));
        jSeparator2.setForeground(new java.awt.Color(0, 204, 102));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/search.gif"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 100, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 590, 10));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("CÓDIGO DE LA MONEDA:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 189, 34));

        jLabel7.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("INTERÉS MENSUAL:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 150, 34));

        txtCodigo.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 170, -1));

        txtInteres.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtInteres, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 170, -1));

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
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, -1, -1));

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
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("MONTO MÁXIMO:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 150, 34));

        jLabel9.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("CARGO POR MANTENIMIENTO:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 180, 34));

        jLabel10.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("COSTO POR MOVIMIENTO:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 150, 34));

        txtMM.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtMM, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 170, -1));

        txtCargo.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 170, -1));

        txtCosto.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 170, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String codigo = txtCodigo.getText();
        Moneda moneda = null;
        try {
            moneda = Monedas.obtener(codigo);
        } catch (SQLException ex) {
            Logger.getLogger(IFrmModificarTransaccion.class.getName()).log(Level.SEVERE, null, ex);
        } 
        if(moneda != null) {
            if(moneda.getCodigo().compareTo("00") != 0) {
                txtMM.setText(String.valueOf(moneda.getMontoMax()));
                txtCargo.setText(String.valueOf(moneda.getCargoMantenimiento()));
                txtCosto.setText(String.valueOf(moneda.getCostoMovimiento()));
                txtInteres.setText(String.valueOf(moneda.getInteresMensual()));
                activar(true);
            } else {
                JOptionPane.showMessageDialog(this, "El código no existe", "Resultado", 1);
                limpiar();
                activar(false);
            }
        } else {
            JOptionPane.showMessageDialog(this, "El código no es valido", "Resultado", 0);
            limpiar();
            activar(false);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    
    private void activar(boolean estado) {
        txtCodigo.setEnabled(!estado);
        txtMM.setEnabled(estado);
        txtCargo.setEnabled(estado);
        txtCosto.setEnabled(estado);
        txtInteres.setEnabled(estado);
        btnBuscar.setEnabled(!estado);
        btnActualizar.setEnabled(estado);
    }
    
    private void limpiar() {
        txtCodigo.setText(null);
        txtMM.setText(null);
        txtCargo.setText(null);
        txtCosto.setText(null);
        txtInteres.setText(null);
    }
    
    
    
    
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtInteres;
    private javax.swing.JTextField txtMM;
    // End of variables declaration//GEN-END:variables
}
