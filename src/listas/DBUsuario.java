package listas;

import java.sql.*;
import conexion.ConexionDB;
import entidades.Usuario;
import java.util.*;

public class DBUsuario {
    private static Connection db = ConexionDB.obtenerDB();

    public static boolean existe(String codigo) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_usuario_existe(?)");
        cs.setString(1, codigo);

        ResultSet rs = cs.executeQuery();
        if (rs.next()){
            if (rs.getInt(1) == 1) return true;
        }
        return false;
    }

    public static void insertarUsuario(Usuario usuario) throws SQLException{
        String sql = "call sp_insertar_usuario(?, ?, ?)";
        CallableStatement cs = db.prepareCall(sql);
        cs.setString(1,usuario.getCodigo());
        cs.setString(2,usuario.getClave());
        cs.setInt(3, usuario.getNivelPermisos());
        cs.executeUpdate();
    }

    public static boolean buscarUsuario(String codigo) throws SQLException{
        String sql = "{call sp_buscar_usuario(?)}";
        CallableStatement cs = db.prepareCall(sql);
        cs.setString(1, codigo);
        ResultSet rs = cs.executeQuery();
        if (!rs.next()) return false;
        if (!rs.getString(1).trim().equalsIgnoreCase(codigo)) return false;
       return true;
    }

    public static Usuario obtenerUsuario(String codigo) throws SQLException{
        String sql = "{call sp_buscar_usuario(?)}";
        CallableStatement cs = db.prepareCall(sql);
        cs.setString(1, codigo);
        ResultSet rs = cs.executeQuery();
        if (rs.next()){
            Usuario usuario = new Usuario();
            usuario.setCodigo(rs.getString(1));
            usuario.setClave(rs.getString(2));
            usuario.setNivelPermisos(rs.getInt(3));
            return usuario;
        }
        return null;
    }

    public static void modificarUsuario(String codigo, String nuevaClave) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_modificar_usuario(?, ?)");
        cs.setString(1, codigo);
        cs.setString(2, nuevaClave);
        cs.executeQuery();
    }

    public static ArrayList<Usuario> listarUsuarios() throws SQLException{
        String sql = "{CALL sp_listar_usuarios()}";
        CallableStatement cs = db.prepareCall(sql);
        ResultSet rs = cs.executeQuery(sql);
        if (rs.next()) {
            ArrayList<Usuario> usuarios = new ArrayList<>();
            usuarios.add(new Usuario(rs.getString(1), rs.getString(2), rs.getInt(3)));
            return usuarios;
        }
        return null;
    }
    
}
