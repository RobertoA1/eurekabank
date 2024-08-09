package validaciones;

import java.sql.SQLException;
import java.util.ArrayList;

import entidades.Usuario;
import listas.DBUsuario;

public class Usuarios {
    private static String errMsg = "Error en usuarios: ";

    private static void validarCodigo(String codigo) throws IllegalArgumentException,SQLException {
        if (codigo.length() != 8) throw new IllegalArgumentException(errMsg + "El código es demasiado largo (Debe ser de 8 caracteres).");
        if (codigo.isBlank()) throw new IllegalArgumentException(errMsg + "El código introducido es inválido.");
    }

    public static void insertarUsuario(String codigo, String clave) throws IllegalArgumentException, SQLException{
        validarCodigo(codigo);
        // String err = errMsg + "Creación | ";
        // if(buscarUsuario(codigo)) throw new IllegalArgumentException(err + "El codigo ya existe en otro usuario.");

        DBUsuario.insertarUsuario(new Usuario(codigo,clave));
    }

    public static boolean buscarUsuario(String codigo) throws SQLException {
        if(codigo.trim().length()==8)
            return DBUsuario.buscarUsuario(codigo.trim());
        return false;
    }

    public static Usuario obtenerUsuario(String codigo) throws IllegalArgumentException, SQLException{
        validarCodigo(codigo);
        return DBUsuario.obtenerUsuario(codigo);
    }

    public static void modificarUsuario(String codigo, String nuevaClave) throws IllegalArgumentException, SQLException{
        validarCodigo(codigo);
        if(!DBUsuario.buscarUsuario(codigo)) throw new IllegalArgumentException(errMsg + "El codigo introducido no se encuentra vinculado a ningun usuario");
        if (nuevaClave.isBlank()) throw new IllegalArgumentException(errMsg + "La nueva clave no puede estar vacía.");
        if (nuevaClave.length() != 8) throw new IllegalArgumentException(errMsg + "La clave es inválida (Debe ser de 8 caracteres).");
        DBUsuario.modificarUsuario(codigo, nuevaClave.trim());
    }

    public static ArrayList<Usuario> listarUsuarios() throws SQLException{
        return DBUsuario.listarUsuarios();
    }

}
