/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion.login;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.sql.SQLException;
import seguridad.Autenticacion;
import javax.swing.JOptionPane;

/**
 *
 * @author Roberto
 */
public class Pruebas {
    public static void main(String[] args) {
        try {
            Autenticacion.registrar("adminusr", "12345678");
            System.out.println("registrado correctamente");
        } catch (InvalidKeySpecException | NoSuchAlgorithmException | NullPointerException e){
            JOptionPane.showMessageDialog(null, "Autenticación: Ha ocurrido un problema grave. Por favor, cierra el programa y vuelve a intentarlo.", "Un problema ha ocurrido...", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
        } catch (IllegalArgumentException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Un problema ha ocurrido...", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Autenticación: Ha ocurrido un problema mientras nos conectabamos a la BD. Por favor, cierra el programa y vuelve a intentarlo.", "Un problema ha ocurrido...", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
            System.out.println(e.getErrorCode());
            System.out.println(e.getSQLState());
        }
    }
}
