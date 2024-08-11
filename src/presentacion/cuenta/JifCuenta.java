/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion.cuenta;

import entidades.Cliente;
import entidades.Cuenta;
import entidades.Empleado;
import entidades.Movimiento;
import entidades.Usuario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import listas.DBEmpleado;
import validaciones.Clientes;
import validaciones.Cuentas;
import validaciones.Movimientos;

/**
 *
 * @author Usuario
 */
public class JifCuenta extends javax.swing.JInternalFrame {

    /**
     * Creates new form JifCuenta
     */
    public JifCuenta() {
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
        lblDatos = new javax.swing.JLabel();
        cbxCuentas = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        treeFiltrar = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

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
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDatos.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        lblDatos.setForeground(new java.awt.Color(229, 229, 229));
        lblDatos.setText("DETALLES DE LA OPERACIÓN");
        jPanel1.add(lblDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 330, 40));

        cbxCuentas.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        cbxCuentas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CUENTA" }));
        cbxCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCuentasActionPerformed(evt);
            }
        });
        jPanel1.add(cbxCuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 100, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(229, 229, 229));
        jLabel1.setText("CÓDIGO DE CUENTA:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 100));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        treeFiltrar.setBackground(new java.awt.Color(204, 204, 204));
        treeFiltrar.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        treeFiltrar.setForeground(new java.awt.Color(0, 51, 51));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Operaciones");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Ingresos");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Apertura de cuenta");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Depósito");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Interes");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Transferencia");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Salidas");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Cancelar cuenta");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Retiro");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Mantenimiento");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("ITF");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Transferencia.");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Cargo por movimiento");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeFiltrar.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        treeFiltrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                treeFiltrarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(treeFiltrar);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 220, 340));

        tblDatos.setBackground(new java.awt.Color(20, 45, 68));
        tblDatos.setForeground(new java.awt.Color(229, 229, 229));
        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblDatos);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 600, 270));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("FILTRAR POR:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 880, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void treeFiltrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_treeFiltrarMouseClicked
        int row = treeFiltrar.getRowForLocation(evt.getX(), evt.getY());
        if (row != -1) {
            DefaultMutableTreeNode clickedNode = (DefaultMutableTreeNode) treeFiltrar.getPathForRow(row).getLastPathComponent();
            
            
            String nodo = String.valueOf(clickedNode.getUserObject());
        
            if (nodo.equalsIgnoreCase("Apertura de cuenta")) {
                try {
                    listaMov = Movimientos.obtenerMovPorNumCuenta(String.valueOf(cbxCuentas.getSelectedItem()));
                    llenarTabla("001");
                } catch (IllegalArgumentException | SQLException ex) {
                    Logger.getLogger(JifCuenta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (nodo.equalsIgnoreCase("Cancelar cuenta")) {
                try {
                    listaMov = Movimientos.obtenerMovPorNumCuenta(String.valueOf(cbxCuentas.getSelectedItem()));
                    llenarTabla("002");
                } catch (IllegalArgumentException | SQLException ex) {
                    Logger.getLogger(JifCuenta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (nodo.equalsIgnoreCase("Depósito")) {
                try {
                    listaMov = Movimientos.obtenerMovPorNumCuenta(String.valueOf(cbxCuentas.getSelectedItem()));
                    llenarTabla("003");
                } catch (IllegalArgumentException | SQLException ex) {
                    Logger.getLogger(JifCuenta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (nodo.equalsIgnoreCase("Retiro")) {
                try {
                    listaMov = Movimientos.obtenerMovPorNumCuenta(String.valueOf(cbxCuentas.getSelectedItem()));
                    llenarTabla("004");
                } catch (IllegalArgumentException | SQLException ex) {
                    Logger.getLogger(JifCuenta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (nodo.equalsIgnoreCase("Interes")) {
                try {
                    listaMov = Movimientos.obtenerMovPorNumCuenta(String.valueOf(cbxCuentas.getSelectedItem()));
                    llenarTabla("005");
                } catch (IllegalArgumentException | SQLException ex) {
                    Logger.getLogger(JifCuenta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (nodo.equalsIgnoreCase("Mantenimiento")) {
                try {
                    listaMov = Movimientos.obtenerMovPorNumCuenta(String.valueOf(cbxCuentas.getSelectedItem()));
                    llenarTabla("006");
                } catch (IllegalArgumentException | SQLException ex) {
                    Logger.getLogger(JifCuenta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (nodo.equalsIgnoreCase("ITF")) {
                try {
                    listaMov = Movimientos.obtenerMovPorNumCuenta(String.valueOf(cbxCuentas.getSelectedItem()));
                    llenarTabla("007");
                } catch (IllegalArgumentException | SQLException ex) {
                    Logger.getLogger(JifCuenta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (nodo.equalsIgnoreCase("Transferencia")) {
                try {
                listaMov = Movimientos.obtenerMovPorNumCuenta(String.valueOf(cbxCuentas.getSelectedItem()));
                llenarTabla("008");
                } catch (IllegalArgumentException | SQLException ex) {
                    Logger.getLogger(JifCuenta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (nodo.equalsIgnoreCase("Transferencia.")) {
                try {
                    listaMov = Movimientos.obtenerMovPorNumCuenta(String.valueOf(cbxCuentas.getSelectedItem()));
                    llenarTabla("009");
                } catch (IllegalArgumentException | SQLException ex) {
                    Logger.getLogger(JifCuenta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (nodo.equalsIgnoreCase("Cargo por mantenimiento")) {
                try {
                    listaMov = Movimientos.obtenerMovPorNumCuenta(String.valueOf(cbxCuentas.getSelectedItem()));
                    llenarTabla("010");
                } catch (IllegalArgumentException | SQLException ex) {
                    Logger.getLogger(JifCuenta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (nodo.equalsIgnoreCase("Ingresos")) {
                try {
                    listaMov = Movimientos.obtenerMovPorNumCuenta(String.valueOf(cbxCuentas.getSelectedItem()));
                    llenarTabla1();
                } catch (IllegalArgumentException | SQLException ex) {
                    Logger.getLogger(JifCuenta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (nodo.equalsIgnoreCase("Salidas")) {
                try {
                    listaMov = Movimientos.obtenerMovPorNumCuenta(String.valueOf(cbxCuentas.getSelectedItem()));
                    llenarTabla2();
                } catch (IllegalArgumentException | SQLException ex) {
                    Logger.getLogger(JifCuenta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
               
        }
    }//GEN-LAST:event_treeFiltrarMouseClicked

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {
            Usuario usuario = seguridad.Autenticacion.obtenerUsuario();
            Cliente cliente = Clientes.obtenerPorIdUsuario(usuario.getCodigo());
            listaC = Clientes.listarCuentas(cliente.getCodigo());
            llenarListaC();
            listaMov = Movimientos.obtenerMovPorNumCuenta(String.valueOf(cbxCuentas.getSelectedItem()));
            llenarTabla();
        } catch (IllegalStateException | SQLException ex) {
            Logger.getLogger(JifCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void cbxCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCuentasActionPerformed
        try {
            listaMov = Movimientos.obtenerMovPorNumCuenta(String.valueOf(cbxCuentas.getSelectedItem()));
            llenarTabla();
        } catch (IllegalArgumentException | SQLException ex) {
            Logger.getLogger(JifCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbxCuentasActionPerformed
    
    private void llenarTabla(String tipoMov) throws IllegalArgumentException, SQLException {
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(columnas);
        if(listaMov!=null){
            iterador = listaMov.iterator();
            while(iterador.hasNext()) {
                movimiento = iterador.next();
                fila[0] = movimiento.getMovinumero();
                fila[1] = movimiento.getFecha();
                fila[2] = retornarEmpleado(movimiento.getEmplcodigo());
                if(tipoMov.equalsIgnoreCase("002") || tipoMov.equalsIgnoreCase("004") ||  tipoMov.equalsIgnoreCase("006") || tipoMov.equalsIgnoreCase("007"))
                    fila[3] = "-" + movimiento.getImporte();
                else   
                    fila[3] = movimiento.getImporte();
                fila[4] = movimiento.getCuenReferencia();
                    if(tipoMov.equalsIgnoreCase(movimiento.getTipoCodigo())){
                        modelo.addRow(fila);
                        confirmador++;
                    }
            }
            if(confirmador!=0){
                tblDatos.setModel(modelo);
                confirmador=0;
            } else {
                fila[0] = "---";
                fila[1] = "---";
                fila[2] = "---";
                fila[3] = "---";
                fila[4] = "---";
                modelo.addRow(fila);
                tblDatos.setModel(modelo);
            }
        } else {
            fila[0] = "---";
            fila[1] = "---";
            fila[2] = "---";
            fila[3] = "---";
            fila[4] = "---";
            modelo.addRow(fila);
            tblDatos.setModel(modelo);
        }
    }
    
    private void llenarTabla() throws SQLException{
        
        modelo2 = new DefaultTableModel();
        modelo2.setColumnIdentifiers(columnas1);
        if(listaMov!=null){
        iterador2 = listaMov.iterator();
        while(iterador2.hasNext()) {
            movimiento = iterador2.next();
            fila1[0] = movimiento.getMovinumero();
            fila1[1] = movimiento.getFecha();
            fila1[2] = retornarEmpleado(movimiento.getEmplcodigo());
            fila1[3] = retornarDescripcion(movimiento.getTipoCodigo());
            fila1[4] = movimiento.getImporte();
            fila1[5] = movimiento.getCuenReferencia();
            modelo2.addRow(fila1);
            tblDatos.setModel(modelo2);
        }
        } else {
            fila1[0] = "---";
            fila1[1] = "---";
            fila1[2] = "---";
            fila1[3] = "---";
            fila1[4] = "---";
            fila1[5] = "---";
            modelo2.addRow(fila1);
            tblDatos.setModel(modelo2);
        }
            
    }
    
    private void llenarTabla1() throws SQLException{
        modelo2 = new DefaultTableModel();
        modelo2.setColumnIdentifiers(columnas1);
        if(listaMov!=null){
        iterador2 = listaMov.iterator();
        while(iterador2.hasNext()) {
            movimiento = iterador2.next();
            fila1[0] = movimiento.getMovinumero();
            fila1[1] = movimiento.getFecha();
            fila1[2] = retornarEmpleado(movimiento.getEmplcodigo());
            fila1[3] = retornarDescripcion(movimiento.getTipoCodigo());
            fila1[4] = movimiento.getImporte();
            fila1[5] = movimiento.getCuenReferencia();
            String c = movimiento.getTipoCodigo();
            if(c.equalsIgnoreCase("001") || c.equalsIgnoreCase("003") ||
                    c.equalsIgnoreCase("005") || c.equalsIgnoreCase("007") || c.equalsIgnoreCase("008")){
                modelo2.addRow(fila1);
                confirmador++;
            }  
        } if(confirmador!=0){
            tblDatos.setModel(modelo2);
            confirmador=0;
        } else {
            fila1[0] = "---";
            fila1[1] = "---";
            fila1[2] = "---";
            fila1[3] = "---";
            fila1[4] = "---";
            fila1[5] = "---";
            modelo2.addRow(fila1);
            tblDatos.setModel(modelo2);
        }
        
        } else {
            fila1[0] = "---";
            fila1[1] = "---";
            fila1[2] = "---";
            fila1[3] = "---";
            fila1[4] = "---";
            fila1[5] = "---";
            modelo2.addRow(fila1);
            tblDatos.setModel(modelo2);
        }
    }
    
    private void llenarTabla2() throws SQLException{
        modelo2 = new DefaultTableModel();
        modelo2.setColumnIdentifiers(columnas1);
        if(listaMov!=null){
        iterador2 = listaMov.iterator();
        while(iterador2.hasNext()) {
            movimiento = iterador2.next();
            fila1[0] = movimiento.getMovinumero();
            fila1[1] = movimiento.getFecha();
            fila1[2] = retornarEmpleado(movimiento.getEmplcodigo());
            fila1[3] = retornarDescripcion(movimiento.getTipoCodigo());
            fila1[4] = movimiento.getImporte();
            fila1[5] = movimiento.getCuenReferencia();
            String c = movimiento.getTipoCodigo();
            if(c.equalsIgnoreCase("002") || c.equalsIgnoreCase("004") ||
                    c.equalsIgnoreCase("006") || c.equalsIgnoreCase("009") || c.equalsIgnoreCase("010")){
                modelo2.addRow(fila1);
                confirmador++;
            }
            
        } 
            if(confirmador!=0){
                tblDatos.setModel(modelo2);
                confirmador=0;
            }else {
                fila1[0] = "---";
            fila1[1] = "---";
            fila1[2] = "---";
            fila1[3] = "---";
            fila1[4] = "---";
            fila1[5] = "---";
            modelo2.addRow(fila1);
            tblDatos.setModel(modelo2);
            }
        
        }else {
            fila1[0] = "---";
            fila1[1] = "---";
            fila1[2] = "---";
            fila1[3] = "---";
            fila1[4] = "---";
            fila1[5] = "---";
            modelo2.addRow(fila1);
            tblDatos.setModel(modelo2);
        }
    }
        
    
    
    private String retornarDescripcion(String tipoMov){
        //Se podria hacer PA de TipoMovimiento y hacer un getDescripcion() pero me da pereza :/
        String descripcion=" ";
        switch(tipoMov){
            case "001":
                descripcion= "Apertura de cuenta"; break;
            case "002":
                descripcion= "Cancelar cuenta"; break;
            case "003":
                descripcion= "Depósito"; break;
            case "004":
                descripcion= "Retiro"; break;
            case "005":
                descripcion= "Interes"; break;
            case "006":
                descripcion= "Mantenimiento"; break;
            case "007":
                descripcion= "ITF"; break;
            case "008":
                descripcion= "Transferencia"; break;
            case "009":
                descripcion= "Transferencia/Salida"; break;
            case "010":
                descripcion= "Cargo"; break;
        }
        return descripcion;
    }
    
    private void llenarListaC(){
        modeloC = new DefaultComboBoxModel();
        if(listaC!=null){
            iteradorC = listaC.iterator();
            while(iteradorC.hasNext()) {
                c = iteradorC.next();
                modeloC.addElement(c.getCodigo());
            }
            cbxCuentas.setModel(modeloC);
        } else {
            cbxCuentas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CUENTA" }));
        }
        
    }
    
    private String retornarEmpleado(String codEmpl) throws SQLException{
        Empleado e = DBEmpleado.obtener(codEmpl);
        return e.getApellidoPaterno() + " " + e.getNombre();
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxCuentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDatos;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTree treeFiltrar;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel modelo;
    private DefaultTableModel modelo2;
    DefaultComboBoxModel<String> modeloC;
    private static ArrayList<Movimiento> listaMov;
    private Movimiento movimiento;
    private ArrayList<Cuenta> listaC;
    private Iterator<Cuenta> iteradorC;
    private Cuenta c;
    private final String columnas[] = {"N° OP", "Fecha","Encargado","Importe","Destinatario"};
    private final Object fila[] = new Object[columnas.length];
    String columnas1[] = {"N° OP", "Fecha","Encargado","Operacion","Importe","Destinatario"};
    Object fila1[] = new Object[columnas1.length];
    private Iterator<Movimiento> iterador;
    private Iterator<Movimiento> iterador2;
    private int confirmador = 0;
}
