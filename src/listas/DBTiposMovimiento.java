/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas;

import conexion.ConexionDB;
import entidades.TipoMovimiento;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Roberto
 */
public class DBTiposMovimiento {
    private static Connection db = ConexionDB.obtenerDB();

    public static boolean existe(String codigo) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_tipomovimiento_existe(?)");
        cs.setString(1, codigo);
        ResultSet rs = cs.executeQuery();
        if (rs.next()){
            if (rs.getInt(1) == 1) return true;
        }
        return false;
    }

    public static TipoMovimiento obtener(String codigo) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_tipomovimiento_buscar(?)");
        cs.setString(1, codigo);

        ResultSet rs = cs.executeQuery();
        if (rs.next()){
            TipoMovimiento tm = new TipoMovimiento();
            tm.setCodigo(rs.getString(1));
            tm.setDescripcion(rs.getString(2));
            tm.setAccion(rs.getString(3));
            tm.setEstado(rs.getInt(4));
            return tm;
        }
        return null;
    }
    
    public static void agregar(TipoMovimiento tm) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_tipomovimiento_agregar(?, ?, ?, ?)");
        cs.setString(1, tm.getCodigo());
        cs.setString(2, tm.getDescripcion());
        cs.setString(3, tm.getAccion());
        cs.setInt(4, tm.getEstado());
        cs.executeUpdate();
    }
    
    public static void remover(String codigoTipoMov) throws SQLException {
        CallableStatement cs = db.prepareCall("CALL sp_tipomovimiento_remover(?)");
        cs.setString(1, codigoTipoMov);
        cs.executeUpdate();
    }
    
    public static ArrayList<TipoMovimiento> listar() throws SQLException{
        ArrayList<TipoMovimiento> arr = new ArrayList<>();
        CallableStatement cs = db.prepareCall("CALL sp_tipomovimiento_listar()");

        ResultSet rs = cs.executeQuery();

        while (rs.next()){
            TipoMovimiento tm = new TipoMovimiento();
            tm.setCodigo(rs.getString(1));
            tm.setDescripcion(rs.getString(2));
            tm.setAccion(rs.getString(3));
            tm.setEstado(rs.getInt(4));
            arr.add(tm);
        }

        return arr;
    }
}
