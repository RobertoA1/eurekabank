package seguridad;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.sql.*;
import java.util.Base64;

import conexion.ConexionDB;
import entidades.Usuario;
import validaciones.Usuarios;

public class Autenticacion {
    private static Connection db = ConexionDB.obtenerDB();

    public static void registrar(String user, String pass, int nivelPermisos) throws InvalidKeySpecException, NoSuchAlgorithmException, NullPointerException, IllegalArgumentException, SQLException{
        String err = "Autenticación | No se puede registrar: ";
        if (Usuarios.buscarUsuario(user)) throw new IllegalArgumentException(err + "Ya existe un usuario con ese nombre.");
        if (pass.length() < 8) throw new IllegalArgumentException(err + "La contraseña debe ser de mínimo 8 caracteres.");

        String key = Contrasenas.generarKey(pass);
        Usuarios.insertarUsuario(user, key, nivelPermisos);
    }

    public static void iniciarSesion(String user, String pass) throws InvalidKeySpecException, NoSuchAlgorithmException, NullPointerException, IllegalArgumentException, SQLException{
        String err = "Autenticación | No se puede iniciar sesión: ";
        if (!Usuarios.buscarUsuario(user)) throw new IllegalArgumentException(err + "El usuario no existe o la contraseña es inválida.");
        if (!esContrasenaValida(user, pass)) throw new IllegalArgumentException(err + "El usuario no existe o la contraseña es inválida.");

        Sesiones.iniciarSesion(user);
    }

    public static void cerrarSesion() throws SQLException{
        Sesiones.cerrarSesion();
    }

    public static Usuario obtenerUsuario() throws IllegalStateException, SQLException{
        Sesion s = Sesiones.obtenerSesion();
        return Usuarios.obtenerUsuario(s.getUserCodigo());
    }

    public static boolean esContrasenaValida(String user, String pass) throws InvalidKeySpecException, NoSuchAlgorithmException, NullPointerException, IllegalArgumentException, SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_usuario_obtenerKey(?)");
        cs.setString(1, user);
        ResultSet rs = cs.executeQuery();
        if (!rs.next()) return false;

        String key = rs.getString(1);
        String saltStr = key.substring(0, 32);
        String hashStr = key.substring(32);

        byte[] salt = Base64.getDecoder().decode(saltStr);

        if (Contrasenas.generarHash(pass, salt).equals(hashStr)) return true;
        return false;
    }
}
