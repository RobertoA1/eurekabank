/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion.empleados;

import presentacion.empleados.opciones.consultas.IFrmConsultarDatosCuenta;
import presentacion.empleados.opciones.consultas.IFrmConsultarDatosCliente;
import javax.swing.JInternalFrame;
import presentacion.FrmClientes;
import presentacion.empleados.opciones.IFrmSucursales;
import presentacion.clientes.registro.Registro;
import presentacion.empleados.opciones.*;
import presentacion.empleados.opciones.consultas.IFrmConsultarDatosMovimiento;
import presentacion.empleados.opciones.ediciones.IFrmModificarCliente;
import presentacion.empleados.opciones.registros.IFrmRegistrarCuenta;
import presentacion.empleados.opciones.registros.IFrmRegistrarMovimiento;

/**
 *
 * @author LUCANO
 */
public class FrmEmpleado extends javax.swing.JFrame {
    private static FrmEmpleado form = null;
    /**
     * Creates new form FrmEmpleado
     */
    public FrmEmpleado() {
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

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        dspFondo = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuBuscar = new javax.swing.JMenu();
        mi_verDatosCuenta = new javax.swing.JMenuItem();
        mi_verDatosCliente = new javax.swing.JMenuItem();
        mi_verDatosMovimiento = new javax.swing.JMenuItem();
        menuRegistrar = new javax.swing.JMenu();
        mi_registrarCliente = new javax.swing.JMenuItem();
        mi_registrarCuenta = new javax.swing.JMenuItem();
        mi_registrarMovimiento = new javax.swing.JMenuItem();
        menuModificar = new javax.swing.JMenu();
        mi_modificarCliente = new javax.swing.JMenuItem();
        mi_modificarMovimiento = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout dspFondoLayout = new javax.swing.GroupLayout(dspFondo);
        dspFondo.setLayout(dspFondoLayout);
        dspFondoLayout.setHorizontalGroup(
            dspFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        dspFondoLayout.setVerticalGroup(
            dspFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 697, Short.MAX_VALUE)
        );

        menuBuscar.setText("Buscar un registro");

        mi_verDatosCuenta.setText("Buscar una cuenta");
        mi_verDatosCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_verDatosCuentaActionPerformed(evt);
            }
        });
        menuBuscar.add(mi_verDatosCuenta);

        mi_verDatosCliente.setText("Buscar un cliente");
        mi_verDatosCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_verDatosClienteActionPerformed(evt);
            }
        });
        menuBuscar.add(mi_verDatosCliente);

        mi_verDatosMovimiento.setText("Buscar un movimiento");
        mi_verDatosMovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_verDatosMovimientoActionPerformed(evt);
            }
        });
        menuBuscar.add(mi_verDatosMovimiento);

        jMenuBar1.add(menuBuscar);

        menuRegistrar.setText("Crear un nuevo registro");

        mi_registrarCliente.setText("Registrar un nuevo cliente");
        mi_registrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_registrarClienteActionPerformed(evt);
            }
        });
        menuRegistrar.add(mi_registrarCliente);

        mi_registrarCuenta.setText("Registrar una nueva cuenta");
        mi_registrarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_registrarCuentaActionPerformed(evt);
            }
        });
        menuRegistrar.add(mi_registrarCuenta);

        mi_registrarMovimiento.setText("Registrar un nuevo movimiento (deshabilitado)");
        mi_registrarMovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_registrarMovimientoActionPerformed(evt);
            }
        });
        menuRegistrar.add(mi_registrarMovimiento);

        jMenuBar1.add(menuRegistrar);

        menuModificar.setText("Modificar un registro existente");

        mi_modificarCliente.setText("Modificar los datos de un cliente");
        mi_modificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_modificarClienteActionPerformed(evt);
            }
        });
        menuModificar.add(mi_modificarCliente);

        mi_modificarMovimiento.setText("Modificar los datos de un movimiento (deshabilitado)");
        mi_modificarMovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_modificarMovimientoActionPerformed(evt);
            }
        });
        menuModificar.add(mi_modificarMovimiento);

        jMenuItem7.setText("Modificar los datos de una cuenta");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        menuModificar.add(jMenuItem7);

        jMenuBar1.add(menuModificar);

        jMenu1.setText("Mantenedores (será removido)");

        jMenuItem1.setText("Empleado");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Usuarios");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Cuentas");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Sucursales (será removido)");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Monedas");
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Listados (será removido)");

        jMenuItem6.setText("Historial de Actividades");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Realizar Transaccion");

        jMenuItem9.setText("Depósitos ");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenuItem10.setText("Retiros");
        jMenu5.add(jMenuItem10);

        jMenuItem13.setText("Transferencias");
        jMenu5.add(jMenuItem13);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dspFondo)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dspFondo, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void centrarInternalFrame(JInternalFrame interna) {
        int x = dspFondo.getWidth()/2 - interna.getWidth()/2;
        int y = dspFondo.getHeight()/2 - interna.getHeight()/2;
        if(interna.isShowing())
            interna.setLocation(x, y);
        else {
            dspFondo.add(interna);
            interna.setLocation(x, y);
            interna.show();
        }        
    }
    
    
    
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        IFrmCuentas i = new IFrmCuentas();
        centrarInternalFrame(i);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void mi_registrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_registrarClienteActionPerformed
        Registro r = Registro.getInstance("empleados");
        r.setVisible(true);
    }//GEN-LAST:event_mi_registrarClienteActionPerformed

    private void mi_verDatosClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_verDatosClienteActionPerformed
        IFrmConsultarDatosCliente form = new IFrmConsultarDatosCliente();
        centrarInternalFrame(form);
    }//GEN-LAST:event_mi_verDatosClienteActionPerformed

    private void mi_modificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_modificarClienteActionPerformed
        IFrmModificarCliente form = new IFrmModificarCliente();
        centrarInternalFrame(form);
    }//GEN-LAST:event_mi_modificarClienteActionPerformed

    private void mi_verDatosCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_verDatosCuentaActionPerformed
        IFrmConsultarDatosCuenta form = new IFrmConsultarDatosCuenta();
        centrarInternalFrame(form);
    }//GEN-LAST:event_mi_verDatosCuentaActionPerformed

    private void mi_verDatosMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_verDatosMovimientoActionPerformed
        IFrmConsultarDatosMovimiento form = new IFrmConsultarDatosMovimiento();
        centrarInternalFrame(form);
    }//GEN-LAST:event_mi_verDatosMovimientoActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        IFrmSucursales i = new IFrmSucursales();
        centrarInternalFrame(i);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void mi_registrarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_registrarCuentaActionPerformed
        IFrmRegistrarCuenta form = IFrmRegistrarCuenta.getInstance();
        centrarInternalFrame(form);
    }//GEN-LAST:event_mi_registrarCuentaActionPerformed

    private void mi_registrarMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_registrarMovimientoActionPerformed
        IFrmRegistrarMovimiento form = IFrmRegistrarMovimiento.getInstance();
        centrarInternalFrame(form);
    }//GEN-LAST:event_mi_registrarMovimientoActionPerformed

    private void mi_modificarMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_modificarMovimientoActionPerformed
        /* Esperando clase Transacciones */
    }//GEN-LAST:event_mi_modificarMovimientoActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    public static FrmEmpleado getInstance(){
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        if (form == null) form = new FrmEmpleado();
        return form;
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JDesktopPane dspFondo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenu menuBuscar;
    private javax.swing.JMenu menuModificar;
    private javax.swing.JMenu menuRegistrar;
    private javax.swing.JMenuItem mi_modificarCliente;
    private javax.swing.JMenuItem mi_modificarMovimiento;
    private javax.swing.JMenuItem mi_registrarCliente;
    private javax.swing.JMenuItem mi_registrarCuenta;
    private javax.swing.JMenuItem mi_registrarMovimiento;
    private javax.swing.JMenuItem mi_verDatosCliente;
    private javax.swing.JMenuItem mi_verDatosCuenta;
    private javax.swing.JMenuItem mi_verDatosMovimiento;
    // End of variables declaration//GEN-END:variables
}
