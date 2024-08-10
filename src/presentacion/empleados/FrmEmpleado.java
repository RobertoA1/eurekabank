/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion.empleados;

import javax.swing.JInternalFrame;
import presentacion.FrmPrincipal;
import presentacion.IFrmSucursales;
import presentacion.clientes.registro.Registro;
import presentacion.empleados.opciones.*;

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
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

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

        mi_registrarMovimiento.setText("Registrar un nuevo movimiento");
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

        mi_modificarMovimiento.setText("Modificar los datos de un movimiento");
        menuModificar.add(mi_modificarMovimiento);

        jMenuBar1.add(menuModificar);

        jMenu1.setText("Mantenedores");

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

        jMenuItem4.setText("Sucursales");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Monedas");
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Listados");

        jMenuItem6.setText("Historial de Actividades");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

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
    
    public static void centrarInternalFrameExterno(JInternalFrame interna) {
        centrarInternalFrame(interna);
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
        // TODO add your handling code here:
    }//GEN-LAST:event_mi_modificarClienteActionPerformed

    private void mi_verDatosCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_verDatosCuentaActionPerformed
        //IFrmConsultarDatosCuenta form = new IFrmConsultarDatosCuenta();
        //centrarInternalFrame(form);
        /* Es una futura adición */
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
        
    }//GEN-LAST:event_mi_registrarCuentaActionPerformed

    private void mi_registrarMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_registrarMovimientoActionPerformed
        
    }//GEN-LAST:event_mi_registrarMovimientoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        if (form == null) form = new FrmEmpleado();
        return form;
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JDesktopPane dspFondo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
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
