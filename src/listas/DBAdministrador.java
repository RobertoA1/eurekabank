/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas;

import conexion.ConexionDB;
import entidades.Administrador;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Jorge
 */
public class DBAdministrador {
    private static Connection db = ConexionDB.obtenerDB();
    
    public static boolean existe(String codigo) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_administrador_obtenerEstado(?)");
        cs.setString(1, codigo);
        ResultSet rs = cs.executeQuery();

        if (!rs.next()) return false;
        if (rs.getInt(1) == 0) return false;
        return true;
    }
    
    public static Administrador obtener(String codigo) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_BuscarAdministrador(?)");
        cs.setString(1, codigo);

        ResultSet rs = cs.executeQuery();

        if (rs.next()){
            Administrador a = new Administrador();
            a.setIdAdministrador(rs.getString(1));
            a.setIdUsuario(rs.getString(2));
            return a;
        }
        return null;
    }
    
    public static void remover(String codigo) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_remAdministrador(?)");
        cs.setString(1, codigo);
        
        cs.executeUpdate();
    }
}
