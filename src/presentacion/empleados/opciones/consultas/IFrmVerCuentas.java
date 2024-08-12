/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion.empleados.opciones.consultas;

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
public class IFrmVerCuentas extends javax.swing.JInternalFrame {
    public static IFrmVerCuentas form = null;
    private ArrayList<Cuenta> cuentas = null;
    private boolean administrador = false;
    /**
     * Creates new form FrmDatosCuentaObtenidos
     */
    private IFrmVerCuentas(Cliente cliente) {
        initComponents();
        
        try {
            tipSaludo.setText("Lista de cuentas de " + cliente.getNombre());
            
            rellenarInfoTabla(cliente);
        } catch (IllegalArgumentException e){
            JOptionPane.showMessageDialog(this, e.getMessage(), "Un problema ha ocurrido...", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        } catch (IllegalStateException e){
            JOptionPane.showMessageDialog(this, "Autenticación | No se puede continuar: No existe una sesión iniciada.", "Un problema ha ocurrido...", JOptionPane.ERROR_MESSAGE);
            this.dispose();
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
        tipSaludo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCuentas = new javax.swing.JTable();
        tipCuentasContratadas1 = new javax.swing.JLabel();
        btnVerHistorial = new javax.swing.JButton();
        tipCuentasContratadas2 = new javax.swing.JLabel();
        tipCuentasContratadas3 = new javax.swing.JLabel();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(20, 45, 68));

        tituloPanel.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        tituloPanel.setForeground(new java.awt.Color(229, 229, 229));
        tituloPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloPanel.setText("Estás viendo las cuentas de un Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 70));

        jPanel2.setBackground(new java.awt.Color(229, 229, 229));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tipSaludo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tipSaludo.setForeground(new java.awt.Color(0, 0, 0));
        tipSaludo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tipSaludo.setText("Lista de cuentas de usuarioPlaceholder");
        jPanel2.add(tipSaludo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 790, -1));

        jScrollPane1.setBackground(new java.awt.Color(229, 229, 229));

        tablaCuentas.setAutoCreateRowSorter(true);
        tablaCuentas.setBackground(new java.awt.Color(229, 229, 229));
        tablaCuentas.setForeground(new java.awt.Color(0, 0, 0));
        tablaCuentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número de Cuenta", "Moneda", "Sucursal", "Saldo", "Fecha de Creación"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaCuentas.setGridColor(new java.awt.Color(229, 229, 229));
        tablaCuentas.setSelectionBackground(new java.awt.Color(30, 30, 30));
        jScrollPane1.setViewportView(tablaCuentas);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 720, 250));

        tipCuentasContratadas1.setForeground(new java.awt.Color(0, 0, 0));
        tipCuentasContratadas1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tipCuentasContratadas1.setText("Selecciona alguna de las cuentas y presiona el botón debajo");
        jPanel2.add(tipCuentasContratadas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 790, -1));

        btnVerHistorial.setText("Ver el historial de movimientos");
        btnVerHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerHistorialActionPerformed(evt);
            }
        });
        jPanel2.add(btnVerHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 210, 40));

        tipCuentasContratadas2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tipCuentasContratadas2.setForeground(new java.awt.Color(0, 0, 0));
        tipCuentasContratadas2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tipCuentasContratadas2.setText("Se muestran las cuentas contratadas");
        jPanel2.add(tipCuentasContratadas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 50, 790, -1));

        tipCuentasContratadas3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tipCuentasContratadas3.setForeground(new java.awt.Color(0, 0, 0));
        tipCuentasContratadas3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tipCuentasContratadas3.setText("Acceder al historial de movimientos");
        jPanel2.add(tipCuentasContratadas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 790, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 790, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerHistorialActionPerformed
        int row = tablaCuentas.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Ver Transacciones | No se ha seleccionado una cuenta.", "Un problema ha ocurrido...", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Cuenta cuenta = cuentas.get(row);
        IFrmVerHistorial historial = IFrmVerHistorial.getInstance(cuenta);
        if (administrador == false) FrmEmpleado.centrarInternalFrame(historial);
        else FrmAdministrador.centrarInternalFrame(historial);
    }//GEN-LAST:event_btnVerHistorialActionPerformed
    
    private void rellenarInfoTabla(Cliente cliente){
        try {
            Object[] cols = {"Número de Cuenta", "Moneda", "Sucursal", "Saldo", "Fecha de Creación"};
            DefaultTableModel nuevaTabla = new DefaultTableModel();
            nuevaTabla.setColumnIdentifiers(cols);
            
            Object[] row = new Object[cols.length];
            
            cuentas = Clientes.listarCuentas(cliente.getCodigo());
            Iterator<Cuenta> iterador = cuentas.iterator();
            
            SimpleDateFormat formateadorFecha = new SimpleDateFormat("dd/MM/yyyy");
            
            while (iterador.hasNext()){
                Cuenta c = iterador.next();
                row[0] = c.getCodigo();
                row[1] = Monedas.obtener(c.getCodigoMoneda()).getDescripcion();
                row[2] = Sucursales.obtener(c.getCodigoSucursal()).getNombre();
                row[3] = c.getSaldo();
                
                String fecha = formateadorFecha.format(new java.util.Date(c.getFechaCreacion().getTime()));
                row[4] = fecha;
                nuevaTabla.addRow(row);
            }
            
            tablaCuentas.setModel(nuevaTabla);
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
    }
    
    public static IFrmVerCuentas getInstance(Cliente cliente){
        form = new IFrmVerCuentas(cliente);
        return form;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerHistorial;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaCuentas;
    private javax.swing.JLabel tipCuentasContratadas1;
    private javax.swing.JLabel tipCuentasContratadas2;
    private javax.swing.JLabel tipCuentasContratadas3;
    private javax.swing.JLabel tipSaludo;
    private javax.swing.JLabel tituloPanel;
    // End of variables declaration//GEN-END:variables
}