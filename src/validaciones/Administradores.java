/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validaciones;

import entidades.Administrador;
import java.sql.SQLException;
import listas.DBAdministrador;

/**
 *
 * @author Jorge
 */
public class Administradores {
    private static String errMsg = "Error en administrador: ";
    
    private static void validarCodigo(String codigo) throws IllegalArgumentException, SQLException {
        if (codigo == null) throw new IllegalArgumentException(errMsg + "El código introducido es inválido.");
        if (codigo.length() > 8) throw new IllegalArgumentException(errMsg + "El código es demasiado largo (máx. 8 caracteres).");
        if (codigo.isBlank()) throw new IllegalArgumentException(errMsg + "El código introducido es inválido.");
        if (!DBAdministrador.existe(codigo)) throw new IllegalArgumentException(errMsg + "El código introducido no está vinculado a ningún administrador.");
    }
    
    public static Administrador obtener(String codigo) throws IllegalArgumentException, SQLException{
        validarCodigo(codigo);
        return DBAdministrador.obtener(codigo);
    }
    
    public static void remover(String codigo) throws SQLException{
        validarCodigo(codigo);
        DBAdministrador.remover(codigo);
    }
}
