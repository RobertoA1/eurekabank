/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion.clientes.registro;

import entidades.Cliente;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import validaciones.Usuarios;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import presentacion.login.Login;
import seguridad.Autenticacion;
import validaciones.Clientes;

/**
 *
 * @author Roberto
 */
public class RegistroPaso2 extends javax.swing.JFrame {
    private static RegistroPaso2 form = null;
    private static Cliente resultadosPaso1 = null;
    private String fuente = "login";
    /**
     * Creates new form RegistroPaso2
     */
    private RegistroPaso2() {
        initComponents();
    }
    
    private void setResultadosPaso1(Cliente resultados){
        this.resultadosPaso1 = resultados;
    }
    
    public static RegistroPaso2 getInstance(Cliente resultadosPaso1, String fuente){
        if (form == null) form = new RegistroPaso2();
        form.setResultadosPaso1(resultadosPaso1);
        form.setFuente(fuente);
        return form;
    }
    
    private void setFuente(String fuente){
        this.fuente = fuente;
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
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tipNombreUsuario = new javax.swing.JLabel();
        labelNombreUsuario = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        tituloPanel2 = new javax.swing.JLabel();
        tipTitulo = new javax.swing.JLabel();
        btnCrearCuenta = new javax.swing.JButton();
        tipContraseña = new javax.swing.JLabel();
        labelContraseña = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        labelIndicadorDisponibilidad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(20, 45, 68));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(229, 229, 229));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("¡Te damos la bienvenida a la familia EurekaBank!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(229, 229, 229));

        tipNombreUsuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tipNombreUsuario.setForeground(new java.awt.Color(0, 0, 0));
        tipNombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tipNombreUsuario.setText("¿Cómo quieres que te llamemos? Elige un nombre de usuario");

        labelNombreUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelNombreUsuario.setForeground(new java.awt.Color(0, 0, 0));
        labelNombreUsuario.setText("Mi nuevo de nombre de usuario es");

        tituloPanel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tituloPanel2.setForeground(new java.awt.Color(0, 0, 0));
        tituloPanel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloPanel2.setText("¡Ya casi lo tienes!");

        tipTitulo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tipTitulo.setForeground(new java.awt.Color(0, 0, 0));
        tipTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tipTitulo.setText("Estás a un paso de vivir la experiencia Eurekabank");

        btnCrearCuenta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCrearCuenta.setText("¡Quiero mi nueva cuenta!");
        btnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCuentaActionPerformed(evt);
            }
        });

        tipContraseña.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tipContraseña.setForeground(new java.awt.Color(0, 0, 0));
        tipContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tipContraseña.setText("¿Y cuál será la contraseña?");

        labelContraseña.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelContraseña.setForeground(new java.awt.Color(0, 0, 0));
        labelContraseña.setText("Mi nueva contraseña es");

        labelIndicadorDisponibilidad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelIndicadorDisponibilidad.setForeground(new java.awt.Color(0, 0, 0));
        labelIndicadorDisponibilidad.setText("Ese nombre de usuario está ...");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tipTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tipNombreUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelIndicadorDisponibilidad)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(labelNombreUsuario)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(251, 251, 251)
                                .addComponent(labelContraseña)
                                .addGap(18, 18, 18)
                                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(231, 231, 231)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(352, 352, 352))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(tituloPanel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tipTitulo)
                .addGap(24, 24, 24)
                .addComponent(tipNombreUsuario)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombreUsuario)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelIndicadorDisponibilidad)
                .addGap(28, 28, 28)
                .addComponent(tipContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelContraseña)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btnCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuentaActionPerformed
        String nombreUsuario = txtNombreUsuario.getText();
        String pass = String.valueOf(txtContraseña.getPassword());
        
        if (!verificarRestricciones()) return;
        
        try {
            Cliente c = resultadosPaso1;
            c.setIdUsuario(nombreUsuario);
            c.setCodigo(Clientes.generarCodigo());
            
            Autenticacion.registrar(nombreUsuario, pass, 1);
            Clientes.agregar(c.getCodigo(), c.getNombre(), c.getApellidoPaterno(), c.getApellidoMaterno(), c.getDni(), c.getCiudad(), c.getDireccion(), c.getTelefono(), c.getEmail(), nombreUsuario);
            JOptionPane.showMessageDialog(null, "La cuenta se ha creado correctamente. Ya puedes iniciar sesión.", "¡Ya eres parte de Eurekabank!", JOptionPane.INFORMATION_MESSAGE);
        } catch (InvalidKeySpecException | NoSuchAlgorithmException | NullPointerException e){
            JOptionPane.showMessageDialog(null, "Autenticación: Ha ocurrido un problema grave. Por favor, cierra el programa y vuelve a intentarlo.", "Un problema ha ocurrido...", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
        } catch (IllegalArgumentException e){
            JOptionPane.showMessageDialog(this, e.getMessage(), "Un problema ha ocurrido...", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        } catch (SQLException e){
            JOptionPane.showMessageDialog(this, "Paso 2 del Registro | Tuvimos un problema conectándonos a la base de datos. Por favor, cierra el programa y vuelve a intentarlo.", "Un problema ha ocurrido...", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
        
        if (fuente.equalsIgnoreCase("login")){
            Login login = Login.getInstance();
            this.setVisible(false);
            login.setVisible(true);
            this.dispose();
            return;
        } else if (fuente.equalsIgnoreCase("empleados")){
            this.setVisible(false);
            this.dispose();
            return;
        }

       JOptionPane.showMessageDialog(this, "Paso 2 del Registro | Error del desarrollador: La fuente de llamada al menú de Registro es incorrecta.", "Un problema ha ocurrido...", JOptionPane.ERROR_MESSAGE);
       this.dispose();
    }//GEN-LAST:event_btnCrearCuentaActionPerformed

    private boolean verificarRestricciones(){
        String nombreUsuario = txtNombreUsuario.getText();
        String pass = String.valueOf(txtContraseña.getPassword());
        if (nombreUsuario.isBlank()){
            JOPFallo("nombre de usuario");
            return false;
        }
        
        if (nombreUsuario.length() != 8){
            JOptionPane.showMessageDialog(this, "Paso 2 del Registro | El nombre de usuario debe tener 8 caracteres.", "Un problema ha ocurrido...", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if (pass.isBlank()){
            JOPFallo("contraseña");
            return false;
        }

        if (pass.length() < 8){
            JOptionPane.showMessageDialog(this, "Paso 2 del Registro | La contraseña debe tener como mínimo 8 caracteres.", "Un problema ha ocurrido...", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    private void JOPFallo(String campo){
        JOptionPane.showMessageDialog(this, "Paso 2 del Registro | El campo de " + campo + " no puede estar vacío.", "Un problema ha ocurrido...", JOptionPane.ERROR_MESSAGE);
    }
    /**
     * @param args the command line arguments
     */
    private static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(RegistroPaso2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroPaso2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroPaso2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroPaso2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroPaso2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelContraseña;
    private javax.swing.JLabel labelIndicadorDisponibilidad;
    private javax.swing.JLabel labelNombreUsuario;
    private javax.swing.JLabel tipContraseña;
    private javax.swing.JLabel tipNombreUsuario;
    private javax.swing.JLabel tipTitulo;
    private javax.swing.JLabel tituloPanel2;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}