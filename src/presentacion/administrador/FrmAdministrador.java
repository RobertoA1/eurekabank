/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion.administrador;

import presentacion.empleados.opciones.consultas.IFrmConsultarDatosCuenta;
import presentacion.empleados.opciones.consultas.IFrmConsultarDatosCliente;
import javax.swing.JInternalFrame;
import presentacion.FrmClientes;
import presentacion.administrador.opciones.empleados.IFrmModificarEmpleados;
import presentacion.administrador.opciones.empleados.IFrmRegistrarEmpleados;
import presentacion.administrador.opciones.sucursal.IFrmCrearSucursal;
import presentacion.administrador.opciones.sucursal.IFrmModificarSucursal;
import presentacion.clientes.registro.Registro;
import presentacion.empleados.opciones.consultas.IFrmConsultarCuentasCliente;
import presentacion.empleados.opciones.consultas.IFrmConsultarDatosMovimiento;
import presentacion.empleados.opciones.ediciones.IFrmModificarCliente;
import presentacion.empleados.opciones.ediciones.IFrmModificarCuenta;
import presentacion.empleados.opciones.registros.IFrmRegistrarCuenta;
import presentacion.empleados.opciones.operaciones.*;

/**
 *
 * @author LUCANO
 */
public class FrmAdministrador extends javax.swing.JFrame {
    private static FrmAdministrador form = null;
    /**
     * Creates new form FrmEmpleado
     */
    public FrmAdministrador() {
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
        menuOperaciones = new javax.swing.JMenu();
        miDeposito = new javax.swing.JMenuItem();
        miRetiro = new javax.swing.JMenuItem();
        miTransferencia = new javax.swing.JMenuItem();
        menuBuscar = new javax.swing.JMenu();
        mi_verDatosCuenta = new javax.swing.JMenuItem();
        mi_verDatosCliente = new javax.swing.JMenuItem();
        mi_verDatosMovimiento = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        menuRegistrar = new javax.swing.JMenu();
        mi_registrarCliente = new javax.swing.JMenuItem();
        mi_registrarCuenta = new javax.swing.JMenuItem();
        mi_registrarSucursal = new javax.swing.JMenuItem();
        mi_registrarEmpleado = new javax.swing.JMenuItem();
        menuModificar = new javax.swing.JMenu();
        mi_modificarCliente = new javax.swing.JMenuItem();
        mi_modificarSucursal = new javax.swing.JMenuItem();
        mi_modificarEmpleado = new javax.swing.JMenuItem();

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

        menuOperaciones.setText("Realizar operaciones");

        miDeposito.setText("Realizar un depósito a una cuenta");
        miDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDepositoActionPerformed(evt);
            }
        });
        menuOperaciones.add(miDeposito);

        miRetiro.setText("Realizar un retiro de una cuenta");
        miRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRetiroActionPerformed(evt);
            }
        });
        menuOperaciones.add(miRetiro);

        miTransferencia.setText("Realizar una transferencia de una cuenta a otra");
        miTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miTransferenciaActionPerformed(evt);
            }
        });
        menuOperaciones.add(miTransferencia);

        jMenuBar1.add(menuOperaciones);

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

        jMenuItem6.setText("Ver las cuentas de una persona");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        menuBuscar.add(jMenuItem6);

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

        mi_registrarSucursal.setText("Registrar una nueva sucursal");
        mi_registrarSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_registrarSucursalActionPerformed(evt);
            }
        });
        menuRegistrar.add(mi_registrarSucursal);

        mi_registrarEmpleado.setText("Registrar un nuevo empleado");
        mi_registrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_registrarEmpleadoActionPerformed(evt);
            }
        });
        menuRegistrar.add(mi_registrarEmpleado);

        jMenuBar1.add(menuRegistrar);

        menuModificar.setText("Modificar un registro existente");

        mi_modificarCliente.setText("Modificar los datos de un cliente");
        mi_modificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_modificarClienteActionPerformed(evt);
            }
        });
        menuModificar.add(mi_modificarCliente);

        mi_modificarSucursal.setText("Modificar los datos de una sucursal");
        mi_modificarSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_modificarSucursalActionPerformed(evt);
            }
        });
        menuModificar.add(mi_modificarSucursal);

        mi_modificarEmpleado.setText("Modificar los datos de un empleado");
        mi_modificarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_modificarEmpleadoActionPerformed(evt);
            }
        });
        menuModificar.add(mi_modificarEmpleado);

        jMenuBar1.add(menuModificar);

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
    
    
    
    private void mi_registrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_registrarClienteActionPerformed
        Registro r = Registro.getInstance("empleados");
        r.setVisible(true);
    }//GEN-LAST:event_mi_registrarClienteActionPerformed

    private void mi_verDatosClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_verDatosClienteActionPerformed
        IFrmConsultarDatosCliente i = new IFrmConsultarDatosCliente();
        i.habilitarAdministrador();
        centrarInternalFrame(i);
    }//GEN-LAST:event_mi_verDatosClienteActionPerformed

    private void mi_modificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_modificarClienteActionPerformed
        IFrmModificarCliente i = new IFrmModificarCliente();
        i.habilitarAdministrador();
        centrarInternalFrame(i);
    }//GEN-LAST:event_mi_modificarClienteActionPerformed

    private void mi_verDatosCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_verDatosCuentaActionPerformed
        IFrmConsultarDatosCuenta i = new IFrmConsultarDatosCuenta();
        i.habilitarAdministrador();
        centrarInternalFrame(i);
    }//GEN-LAST:event_mi_verDatosCuentaActionPerformed

    private void mi_verDatosMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_verDatosMovimientoActionPerformed
        IFrmConsultarDatosMovimiento i = new IFrmConsultarDatosMovimiento();
        i.habilitarAdministrador();
        centrarInternalFrame(i);
    }//GEN-LAST:event_mi_verDatosMovimientoActionPerformed

    private void mi_registrarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_registrarCuentaActionPerformed
        IFrmRegistrarCuenta i = IFrmRegistrarCuenta.getInstance();
        centrarInternalFrame(i);
    }//GEN-LAST:event_mi_registrarCuentaActionPerformed

    private void miDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDepositoActionPerformed
        IFrmRealizarDeposito i = IFrmRealizarDeposito.getInstance();
        FrmAdministrador.centrarInternalFrame(i);
    }//GEN-LAST:event_miDepositoActionPerformed

    private void miTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miTransferenciaActionPerformed
        IFrmRealizarTransferencia i = IFrmRealizarTransferencia.getInstance();
        FrmAdministrador.centrarInternalFrame(i);
    }//GEN-LAST:event_miTransferenciaActionPerformed

    private void miRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRetiroActionPerformed
        IFrmRealizarRetiro i = IFrmRealizarRetiro.getInstance();
        FrmAdministrador.centrarInternalFrame(i);
    }//GEN-LAST:event_miRetiroActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        IFrmConsultarCuentasCliente i = new IFrmConsultarCuentasCliente();
        i.habilitarAdministrador();
        FrmAdministrador.centrarInternalFrame(i);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void mi_registrarSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_registrarSucursalActionPerformed
        IFrmCrearSucursal form = new IFrmCrearSucursal();
        FrmAdministrador.centrarInternalFrame(form);
    }//GEN-LAST:event_mi_registrarSucursalActionPerformed

    private void mi_registrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_registrarEmpleadoActionPerformed
        IFrmRegistrarEmpleados frm = new IFrmRegistrarEmpleados();
        FrmAdministrador.centrarInternalFrame(frm);
    }//GEN-LAST:event_mi_registrarEmpleadoActionPerformed

    private void mi_modificarSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_modificarSucursalActionPerformed
        IFrmModificarSucursal form = new IFrmModificarSucursal();
        FrmAdministrador.centrarInternalFrame(form);
    }//GEN-LAST:event_mi_modificarSucursalActionPerformed

    private void mi_modificarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_modificarEmpleadoActionPerformed
        IFrmModificarEmpleados form = new IFrmModificarEmpleados();
        FrmAdministrador.centrarInternalFrame(form);
    }//GEN-LAST:event_mi_modificarEmpleadoActionPerformed

    public static FrmAdministrador getInstance(){
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
        if (form == null) form = new FrmAdministrador();
        return form;
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JDesktopPane dspFondo;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenu menuBuscar;
    private javax.swing.JMenu menuModificar;
    private javax.swing.JMenu menuOperaciones;
    private javax.swing.JMenu menuRegistrar;
    private javax.swing.JMenuItem miDeposito;
    private javax.swing.JMenuItem miRetiro;
    private javax.swing.JMenuItem miTransferencia;
    private javax.swing.JMenuItem mi_modificarCliente;
    private javax.swing.JMenuItem mi_modificarEmpleado;
    private javax.swing.JMenuItem mi_modificarSucursal;
    private javax.swing.JMenuItem mi_registrarCliente;
    private javax.swing.JMenuItem mi_registrarCuenta;
    private javax.swing.JMenuItem mi_registrarEmpleado;
    private javax.swing.JMenuItem mi_registrarSucursal;
    private javax.swing.JMenuItem mi_verDatosCliente;
    private javax.swing.JMenuItem mi_verDatosCuenta;
    private javax.swing.JMenuItem mi_verDatosMovimiento;
    // End of variables declaration//GEN-END:variables
}
