package listas;

import java.sql.*;
import static javax.swing.JOptionPane.showMessageDialog;
import conexion.ConexionDB;
import entidades.Usuario;
import java.util.*;


public class DBUsuario {
    private static ResultSet rs = null;
    private static CallableStatement cs = null;

    private static Connection db = ConexionDB.obtenerDB();

    public static String insertarUsuario(Usuario usuario){
        String mensaje=null, sql;
        try {
            sql = "{call sp_insertar_usuario(?,?)}";
            cs = db.prepareCall(sql);
            cs.setString(1,usuario.getCodigo());
            cs.setString(2,usuario.getClave());
            cs.executeUpdate();
        } catch (SQLException ex) {
            mensaje = ex.getMessage();
        } finally {
            try {
                cs.close();
            } catch (SQLException ex) {
                mensaje = ex.getMessage();
            }
        }
        return null;
    }

    public static String buscarUsuario(String codigo){
        String sql;
        try {
            sql = "{call sp_buscar_usuario(?)}";
            cs = db.prepareCall(sql);
            cs.setString(1, codigo);
            rs = cs.executeQuery();
            while(rs.next()){
                return rs.getString("usercodigo");
            }
        } catch (SQLException ex){
            showMessageDialog(null, ex.getMessage(), "Error", 0);
        } finally {
            try {
                cs.close();
                rs.close();
            } catch(SQLException ex){
                showMessageDialog(null, ex.getMessage(), "Error", 0);
            }
        }
        return null;
    }

    public static Usuario obtenerUsuario(String codigo){
        Usuario usuario = new Usuario();
        try {
            String sql = "{call sp_buscar_usuario(?)}";
            cs = db.prepareCall(sql);
            cs.setString(1, codigo);
            rs = cs.executeQuery();
            while (rs.next()){
                usuario.setCodigo(rs.getString(1));
                usuario.setClave(rs.getString(2));
            }
        } catch (SQLException ex) {
            showMessageDialog(null, ex.getMessage(), "Error", 0);
        } finally {
            try {
                rs.close();
                cs.close();
            } catch (SQLException e) {
                showMessageDialog(null, e.getMessage(), "Error", 0);
            }
        }
        return usuario;
    }

    public static void modificarUsuario(String codigo, String nuevaClave) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_modificar_usuario(?, ?)");
        cs.setString(1, codigo);
        cs.setString(2, nuevaClave);
        cs.executeQuery();
    }

    public static ArrayList<Usuario> listarUsuarios(){
        String sql;
        ArrayList<Usuario> usuarios = new ArrayList<>();
        try {
            sql = "{CALL sp_listar_usuarios()}";
            cs = db.prepareCall(sql);
            rs = cs.executeQuery(sql);
            while(rs.next()) {
                usuarios.add(new Usuario(rs.getString(1), rs.getString(2)));
            }
        }catch(SQLException ex) {
            showMessageDialog(null, ex.getMessage(), "Error", 0);
        } finally {
            try {
                rs.close();
                cs.close();
            } catch(SQLException ex) {
                showMessageDialog(null, ex.getMessage(), "Error", 0);
            }
        }
        return usuarios;
    }
    
}
