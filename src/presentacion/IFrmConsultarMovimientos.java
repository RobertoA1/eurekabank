/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import entidades.Movimiento;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import validaciones.Movimientos;

/**
 *
 * @author LUCANO
 */
public class IFrmConsultarMovimientos extends javax.swing.JInternalFrame {

    /**
     * Creates new form IFrmConsultarMovimientos
     */
    
     private String cuenValue;
    
    public IFrmConsultarMovimientos() {
        this.cuenValue = IFrmCuentas.getCuenValue();
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

        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMovimientos = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();

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

        jPanel2.setBackground(new java.awt.Color(229, 229, 229));

        tblMovimientos.setBackground(new java.awt.Color(252, 162, 17));
        tblMovimientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Número", "Fecha", "Código de Empleado", "Tipo Codigo", "Importe", "Referencia", "Estado"
            }
        ));
        jScrollPane2.setViewportView(tblMovimientos);

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.gif"))); // NOI18N
        btnSalir.setMnemonic('S');
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {
            lista = Movimientos.listar();
            lista.removeIf(movimiento -> !movimiento.getCuencodigo().equals(cuenValue));

            if (lista.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No se encontraron movimientos.", "Información", JOptionPane.INFORMATION_MESSAGE);
            } else {
                llenarTabla();
            }
        } catch (SQLException ex) {
            Logger.getLogger(IFrmConsultarMovimientos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error al obtener los movimientos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_formInternalFrameOpened

    
    private void llenarTabla() {
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(columnas);
        iterador = lista.iterator();
        while(iterador.hasNext()) {
            movimiento = iterador.next();
            fila[0] = movimiento.getCuencodigo();
            fila[1] = movimiento.getMovinumero();
            fila[2] = movimiento.getFecha();
            fila[3] = movimiento.getEmplcodigo();
            fila[4] = movimiento.getTipoCodigo();
            fila[5] = movimiento.getImporte();
            fila[6] = movimiento.getCuenReferencia();
            fila[7] = movimiento.getEstado();
            
            modelo.addRow(fila);            
        }
        tblMovimientos.setModel(modelo);
    }  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblMovimientos;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel modelo;
    private ArrayList<Movimiento> lista = null;
    private String columnas[] = {"Código", "Número", "Fecha", "Código de Empleado", "Tipo Codigo", "Importe", "Referencia", "Estado"};
private Object fila[] = new Object[columnas.length];
    private Iterator<Movimiento> iterador;
    private Movimiento movimiento;


}
