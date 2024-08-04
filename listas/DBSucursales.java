package listas;

import entidades.*;
import conexion.ConexionDB;
import java.sql.*;
import java.util.ArrayList;
import static javax.swing.JOptionPane.showMessageDialog;

public class DBSucursales {

    private static Connection cn;
    private static CallableStatement cs;
    private static ResultSet rs;

    public static String insertarSucursal(Sucursal sucursal) {
        String mensaje = null, sql;
        try {
            cn = ConexionDB.realizarConexion();
            sql = "{call sp_insertar_sucursal(?, ?, ?, ?, ?)}";   
            cs = cn.prepareCall(sql);
            cs.setString(1, sucursal.getCodigo());
            cs.setString(2, sucursal.getNombre());
            cs.setString(3, sucursal.getCiudad());
            cs.setString(4, sucursal.getDireccion());
            cs.setInt(5, sucursal.getContCuenta());
            cs.executeUpdate();            
        } catch(ClassNotFoundException | SQLException ex) {
            mensaje = ex.getMessage();
        } finally {
            try {
                cs.close();
                cn.close();
            } catch(SQLException ex) {
                mensaje = ex.getMessage();
            }
        }
        return mensaje;
    }

    public static String buscarSucursal(String codigo) {
        String sql;
        try {
            cn = ConexionDB.realizarConexion();
            sql = "{call sp_buscar_sucursal(?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, codigo);
            rs = cs.executeQuery();
            while(rs.next()) {
                return rs.getString("sucucodigo");
            }
        } catch(ClassNotFoundException | SQLException ex) {
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

    public static ArrayList<Sucursal> listarSucursales() {
        String sql;
        ArrayList<Sucursal> sucursales = new ArrayList<>();
        try {
            cn = ConexionDB.realizarConexion();
            sql = "{call sp_listar_sucursales()}";
            cs = cn.prepareCall(sql);
            rs = cs.executeQuery(sql);
            while(rs.next()) {
                Sucursal sucursal = new Sucursal();
                sucursal.setCodigo(rs.getString(1));
                sucursal.setNombre(rs.getString(2));
                sucursal.setCiudad(rs.getString(3));
                sucursal.setDireccion(rs.getString(4));
                sucursal.setContCuenta(rs.getInt(5));
                sucursales.add(sucursal);
            }
        } catch(ClassNotFoundException | SQLException ex) {
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
        return sucursales;
    }

    public static String actualizarSucursal(Sucursal sucursal) {
        String mensaje = null;
        try {
            cn = ConexionDB.realizarConexion();
            String sql = "{call sp_actualizar_sucursal(?, ?, ?, ?, ?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, sucursal.getCodigo());
            cs.setString(2, sucursal.getNombre());
            cs.setString(3, sucursal.getCiudad());
            cs.setString(4, sucursal.getDireccion());
            cs.setInt(5, sucursal.getContCuenta());
            cs.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
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

    public static Sucursal obtenerSucursal(String codigo) {
        Sucursal sucursal = new Sucursal();
        try {
            cn = ConexionDB.realizarConexion();
            String sql = "{call sp_buscar_sucursal(?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, codigo);
            rs = cs.executeQuery();
            while (rs.next()) {
                sucursal.setCodigo(rs.getString(1));
                sucursal.setNombre(rs.getString(2));
                sucursal.setCiudad(rs.getString(3));
                sucursal.setDireccion(rs.getString(4));
                sucursal.setContCuenta(rs.getInt(5));
            }
        } catch (ClassNotFoundException | SQLException ex) {
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
        return sucursal;
    }

    public static String eliminarSucursal(String codigo) {
        String mensaje = null;
        try {
            cn = ConexionDB.realizarConexion();
            String sql = "{call sp_eliminar_sucursal(?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, codigo);
            cs.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
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
