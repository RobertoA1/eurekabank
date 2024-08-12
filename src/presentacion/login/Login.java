/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion.login;

import presentacion.empleados.FrmEmpleado;
import presentacion.clientes.registro.Registro;
import entidades.Usuario;
import java.awt.Cursor;
import java.awt.Image;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import java.sql.SQLException;
import presentacion.*;
import presentacion.administrador.FrmAdministrador;

import seguridad.Autenticacion;

/**
 *
 * @author Roberto
 */
public class Login extends javax.swing.JFrame {
    
    private static Login form = null;
    /**
     * Creates new form Login
     */
    public Login() {
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

        panelInfo = new javax.swing.JPanel();
        nombre_Euireka = new javax.swing.JLabel();
        slogan_Eureka = new javax.swing.JLabel();
        logo_Eureka = new javax.swing.JLabel();
        panelLogin = new javax.swing.JPanel();
        tip_ClienteNuevo = new javax.swing.JLabel();
        label_Registrate = new javax.swing.JLabel();
        nlabel_nombreUsuario = new javax.swing.JLabel();
        txt_nombreUsuario = new javax.swing.JTextField();
        nlabel_contraseña = new javax.swing.JLabel();
        txt_contraseña = new javax.swing.JPasswordField();
        btn_iniciarSesion = new javax.swing.JButton();
        separador_Login_Recuperar = new javax.swing.JSeparator();
        tip_OlvidasteContraseña = new javax.swing.JLabel();
        label_RecuperarCuenta = new javax.swing.JLabel();
        chk_mantenerSesion = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelInfo.setBackground(new java.awt.Color(20, 45, 68));
        panelInfo.setPreferredSize(new java.awt.Dimension(450, 600));

        nombre_Euireka.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        nombre_Euireka.setForeground(new java.awt.Color(229, 229, 229));
        nombre_Euireka.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre_Euireka.setText("Eurekabank");

        slogan_Eureka.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        slogan_Eureka.setForeground(new java.awt.Color(229, 229, 229));
        slogan_Eureka.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        slogan_Eureka.setText("El tiempo vale más que el dinero");

        URL url = getClass().getResource("/imagenes/Logo_Eurekabank.png");
        Image icono = new ImageIcon(url).getImage().getScaledInstance(208,186,Image.SCALE_SMOOTH);
        logo_Eureka.setIcon(new ImageIcon(icono));

        javax.swing.GroupLayout panelInfoLayout = new javax.swing.GroupLayout(panelInfo);
        panelInfo.setLayout(panelInfoLayout);
        panelInfoLayout.setHorizontalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(slogan_Eureka, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombre_Euireka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(logo_Eureka, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        panelInfoLayout.setVerticalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addComponent(logo_Eureka, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(nombre_Euireka)
                .addGap(18, 18, 18)
                .addComponent(slogan_Eureka)
                .addGap(137, 137, 137))
        );

        getContentPane().add(panelInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 600));

        panelLogin.setBackground(new java.awt.Color(229, 229, 229));

        tip_ClienteNuevo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tip_ClienteNuevo.setForeground(new java.awt.Color(0, 0, 0));
        tip_ClienteNuevo.setText("¿Eres cliente nuevo?");

        label_Registrate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        label_Registrate.setForeground(new java.awt.Color(210, 135, 15));
        label_Registrate.setText("Regístrate");
        label_Registrate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_RegistrateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_RegistrateMouseEntered(evt);
            }
        });

        nlabel_nombreUsuario.setForeground(new java.awt.Color(0, 0, 0));
        nlabel_nombreUsuario.setText("Nombre de Usuario");

        nlabel_contraseña.setForeground(new java.awt.Color(0, 0, 0));
        nlabel_contraseña.setText("Contraseña");

        btn_iniciarSesion.setText("Iniciar Sesión");
        btn_iniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciarSesionActionPerformed(evt);
            }
        });

        separador_Login_Recuperar.setForeground(new java.awt.Color(0, 0, 0));

        tip_OlvidasteContraseña.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tip_OlvidasteContraseña.setForeground(new java.awt.Color(0, 0, 0));
        tip_OlvidasteContraseña.setText("¿Olvidaste tu contraseña?");

        label_RecuperarCuenta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label_RecuperarCuenta.setForeground(new java.awt.Color(210, 135, 15));
        label_RecuperarCuenta.setText("Recupera tu cuenta");

        chk_mantenerSesion.setForeground(new java.awt.Color(0, 0, 0));
        chk_mantenerSesion.setText("Mantener sesión activa");

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separador_Login_Recuperar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                        .addComponent(tip_OlvidasteContraseña)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_RecuperarCuenta)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                        .addComponent(btn_iniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(chk_mantenerSesion)
                                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nlabel_nombreUsuario)
                                    .addComponent(txt_nombreUsuario)
                                    .addComponent(nlabel_contraseña)
                                    .addComponent(txt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelLoginLayout.createSequentialGroup()
                                .addComponent(tip_ClienteNuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_Registrate)))
                        .addGap(48, 48, 48)))
                .addGap(45, 45, 45))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tip_ClienteNuevo)
                    .addComponent(label_Registrate))
                .addGap(38, 38, 38)
                .addComponent(nlabel_nombreUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nlabel_contraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chk_mantenerSesion)
                .addGap(24, 24, 24)
                .addComponent(btn_iniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(separador_Login_Recuperar, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tip_OlvidasteContraseña)
                    .addComponent(label_RecuperarCuenta))
                .addGap(105, 105, 105))
        );

        getContentPane().add(panelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 450, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_iniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciarSesionActionPerformed
        String nombreUsuario = txt_nombreUsuario.getText();
        String pass = String.valueOf(txt_contraseña.getPassword());
        
        try {
            Autenticacion.iniciarSesion(nombreUsuario, pass);
            Usuario user = Autenticacion.obtenerUsuario();
            this.setVisible(false);
            if (user.getNivelPermisos() == 1){
                /* Si el nivel de permisos es 1, quiere decir que es un cliente */
                /* Por ende, llamamos FrmPrincipal, que es la de clientes */
                FrmClientes menu = FrmClientes.getInstance();
                menu.setVisible(true);
            }
            
            if (user.getNivelPermisos() == 10){
                /* Si el nivel de permisos es 10, quiere decir que es un empleado */
                /* Por ende, lpermilamamos FrmSecundario, que es de empleados */
                FrmEmpleado menu = FrmEmpleado.getInstance();
                menu.setVisible(true);
            }
            
            if (user.getNivelPermisos() == 20){
                FrmAdministrador menu = FrmAdministrador.getInstance();
                menu.setVisible(true);
            }
            
            this.dispose();
        } catch (InvalidKeySpecException | NoSuchAlgorithmException | NullPointerException e){
            JOptionPane.showMessageDialog(this, "Autenticación: Ha ocurrido un problema grave. Por favor, cierra el programa y vuelve a intentarlo.", "Un problema ha ocurrido...", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e){
            JOptionPane.showMessageDialog(this, e.getMessage(), "Un problema ha ocurrido...", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        } catch (SQLException e){
            JOptionPane.showMessageDialog(this, "Autenticación: Ha ocurrido un problema mientras nos conectabamos a la BD. Por favor, cierra el programa y vuelve a intentarlo.", "Un problema ha ocurrido...", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn_iniciarSesionActionPerformed

    private void label_RegistrateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_RegistrateMouseClicked
        this.setVisible(false);
        Registro reg = Registro.getInstance("login");
        reg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_label_RegistrateMouseClicked

    private void label_RegistrateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_RegistrateMouseEntered
        evt.getComponent().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_label_RegistrateMouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    public static Login getInstance(){
        if (form == null) form = new Login();
        return form;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_iniciarSesion;
    private javax.swing.JCheckBox chk_mantenerSesion;
    private javax.swing.JLabel label_RecuperarCuenta;
    private javax.swing.JLabel label_Registrate;
    private javax.swing.JLabel logo_Eureka;
    private javax.swing.JLabel nlabel_contraseña;
    private javax.swing.JLabel nlabel_nombreUsuario;
    private javax.swing.JLabel nombre_Euireka;
    private javax.swing.JPanel panelInfo;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JSeparator separador_Login_Recuperar;
    private javax.swing.JLabel slogan_Eureka;
    private javax.swing.JLabel tip_ClienteNuevo;
    private javax.swing.JLabel tip_OlvidasteContraseña;
    private javax.swing.JPasswordField txt_contraseña;
    private javax.swing.JTextField txt_nombreUsuario;
    // End of variables declaration//GEN-END:variables
}