/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion.empleados.opciones;

import entidades.Cliente;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import presentacion.empleados.FrmEmpleado;
import static presentacion.empleados.opciones.IFrmModificarDatosCliente.form;
import seguridad.Autenticacion;
import validaciones.Clientes;

/**
 *
 * @author LUCANO
 */
public class IFrmConsultarDatosCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form IFrmConsultarDatosCliente
     */
    public IFrmConsultarDatosCliente() {
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

        txtDNI = new javax.swing.JTextField();
        btnPaso2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tituloPanel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tipEmpleado = new javax.swing.JLabel();

        btnPaso2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnPaso2.setText("¡Quiero mi nueva cuenta!");
        btnPaso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaso2ActionPerformed(evt);
            }
        });

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(20, 45, 68));

        tituloPanel.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        tituloPanel.setForeground(new java.awt.Color(229, 229, 229));
        tituloPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloPanel.setText("Ver los datos de un Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(tituloPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(tituloPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 70));

        jPanel2.setBackground(new java.awt.Color(229, 229, 229));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Por favor, introduce tu codigo de cliente:");

        btnBuscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Esta es una acción de empleado autorizada para:");

        tipEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        tipEmpleado.setText("usuarioPlaceholder");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addComponent(tipEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tipEmpleado))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(224, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 850, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPaso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaso2ActionPerformed
        
    }//GEN-LAST:event_btnPaso2ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String codigo = txtCodigo.getText();
        
        try{
            if(FrmEmpleado.getOpciones()==1){
                IFrmDatosClienteObtenidos form = IFrmDatosClienteObtenidos.getInstance(Clientes.obtener(codigo));
                FrmEmpleado.centrarInternalFrame(form);
            }
            if(FrmEmpleado.getOpciones() == 2){
                IFrmModificarDatosCliente form = IFrmModificarDatosCliente.getInstance(Clientes.obtener(codigo));
                FrmEmpleado.centrarInternalFrame(form);
            }
            
        } catch (IllegalArgumentException e){
            JOptionPane.showMessageDialog(this, e.getMessage(), "Un problema ha ocurrido...", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        } catch (SQLException e){
            JOptionPane.showMessageDialog(this, "Datos de una Cuenta | Ha ocurrido un problema mientras nos conectabamos a la BD. Por favor, cierra el programa y vuelve a intentarlo.", "Un problema ha ocurrido...", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnPaso2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel tipEmpleado;
    private javax.swing.JLabel tituloPanel;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDNI;
    // End of variables declaration//GEN-END:variables
}
