package listas;

import entidades.*;

import conexion.ConexionDB;

import java.sql.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class DBMonedas {

    private static Connection cn = null;
    private static ResultSet rs = null;
    private static CallableStatement cs = null;


    
    public static String buscarMoneda(String codigo) {
        String sql;
        try {
            cn = ConexionDB.obtenerDB();
            sql = "{call sp_buscar_moneda(?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, codigo);
            rs = cs.executeQuery();
            while(rs.next()) {
                return rs.getString("monecodigo");
            }
        } catch(SQLException ex) {
            showMessageDialog(null, ex.getMessage(), "Error", 0);
        } finally {
            try {
                rs.close();
                cs.close();
                cn.close();
            } catch(SQLException ex) {
                showMessageDialog(null, ex.getMessage(), "Error", 0);
            }
        }
        return null;
    }

    public static Moneda obtenerMoneda(String codigo) {
        Moneda moneda = new Moneda();
        try {
            cn = ConexionDB.obtenerDB();
            String sql = "{call sp_buscar_moneda(?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, codigo);
            rs = cs.executeQuery();
            while (rs.next()) {
                moneda.setCodigo(rs.getString(1));
                moneda.setDescripcion(rs.getString(2));
            }
        } catch (SQLException ex) {
            showMessageDialog(null, ex.getMessage(), "Error", 0);
        } finally {
            try {
                rs.close();
                cs.close();
                cn.close();
            } catch (SQLException ex) {
                showMessageDialog(null, ex.getMessage(), "Error", 0);
            }
        }
        return moneda;
    }

    public static String actualizarMoneda(Moneda moneda) {
        String mensaje = null;
        try {
            cn = ConexionDB.obtenerDB();
            String sql = "{call sp_actualizar_moneda(?, ?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, moneda.getCodigo());
            cs.setString(2, moneda.getDescripcion());
            cs.executeUpdate();
        } catch (SQLException ex) {
            mensaje = ex.getMessage();
        } finally {
            try {
                cs.close();
                cn.close();
            } catch (SQLException ex) {
                mensaje = ex.getMessage();
            }
        }
        return mensaje;        
    }



}
