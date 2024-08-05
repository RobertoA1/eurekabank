package validaciones;

import java.sql.SQLException;
import entidades.Usuario;
import listas.DBUsuario;
import static javax.swing.JOptionPane.showMessageDialog;

public class Usuarios {
    private static String errMsg = "Error en usuarios: ";
    private static Usuario usuario;

    private static void validarCodigo(String codigo) throws IllegalArgumentException {
        if (codigo.length() != 8) throw new IllegalArgumentException(errMsg + "El código es demasiado largo (Debe ser de 8 caracteres).");
        if (codigo.isBlank()) throw new IllegalArgumentException(errMsg + "El código introducido es inválido.");
    }

    public static void insertarUsuario(String codigo, String clave) throws IllegalArgumentException{
        validarCodigo(codigo);
        validarCodigo(clave);
        String mensaje;
        if(buscarUsuario(codigo) == null) {                
                usuario = new Usuario(codigo,clave);
                mensaje = DBUsuario.insertarUsuario(usuario);
                if(mensaje == null) {
                    showMessageDialog(null, "Registro insertado", "Resultado", 1);
                } else {
                    showMessageDialog(null, mensaje, "Error", 0);
                    
                }
            } else {
                showMessageDialog(null, "Codigo ya existe", "Error", 0);
                
            }
    }

    public static String buscarUsuario(String codigo) {
        if(codigo.trim().length()==8)
            return DBUsuario.buscarUsuario(codigo.trim());
        else
            return null;
    }

    public static Usuario obtenerUsuario(String codigo) throws IllegalArgumentException, SQLException{
        validarCodigo(codigo);
        return DBUsuario.obtenerUsuario(codigo);
    }

    public static void modificarUsuario(String codigo, String nuevaClave) throws IllegalArgumentException, SQLException{
        validarCodigo(codigo);
        if (nuevaClave.isBlank()) throw new IllegalArgumentException(errMsg + "El nuevo nombre no puede estar vacío.");
        if (nuevaClave.length() != 8) throw new IllegalArgumentException(errMsg + "El código es inválido (Debe ser de 8 caracteres).");
        DBUsuario.modificarUsuario(codigo, nuevaClave.trim());
    }

    public static void listarUsuarios(){
        DBUsuario.listarUsuarios();
    }

}
