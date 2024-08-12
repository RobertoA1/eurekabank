package listas;

import entidades.*;
import conexion.ConexionDB;
import java.sql.*;
import java.util.ArrayList;

public class DBSucursales implements DBAdapter{

    private static Connection db = ConexionDB.obtenerDB();

    public static void insertar(Sucursal sucursal) throws SQLException {
        CallableStatement cs = db.prepareCall("CALL sp_insertar_sucursal(?, ?, ?, ?, ?)");
        cs.setString(1, sucursal.getCodigo());
        cs.setString(2, sucursal.getNombre());
        cs.setString(3, sucursal.getCiudad());
        cs.setString(4, sucursal.getDireccion());
        cs.setInt(5, sucursal.getContCuenta());
        cs.executeUpdate();
    }
    
    public void agregar(Object o) throws SQLException{
        Sucursal s = (Sucursal)o;
        insertar(s);
    }

    public boolean existe(String codigo) throws SQLException {
        CallableStatement cs = db.prepareCall("CALL sp_buscar_sucursal(?)");
        cs.setString(1, codigo);
        ResultSet rs = cs.executeQuery();

        if (rs.next()) {
            //if (rs.getInt(3) == 1) return true;
            //validamos si la columna "1" es igual a string
            //La columna 1 segun el sp sp_buscar_sucursal es sucucodigo
            if ("1".equals(rs.getString(1))) return false;
        }
        return true;
    }   

    public static ArrayList<Sucursal> listarSucursales() throws SQLException {
        ArrayList<Sucursal> sucursales = new ArrayList<>();
        CallableStatement cs = db.prepareCall("CALL sp_listar_sucursales()");
        ResultSet rs = cs.executeQuery();

        while (rs.next()) {
            Sucursal sucursal = new Sucursal();
            sucursal.setCodigo(rs.getString(1));
            sucursal.setNombre(rs.getString(2));
            sucursal.setCiudad(rs.getString(3));
            sucursal.setDireccion(rs.getString(4));
            sucursal.setContCuenta(rs.getInt(5));
            sucursales.add(sucursal);
        }

        return sucursales;
    }

    public static void actualizarNombre(String codigo, String nuevoNombre) throws SQLException {
        CallableStatement cs = db.prepareCall("{call sp_actualizar_sucursal_nombre(?, ?)}");
        cs.setString(1, codigo);
        cs.setString(2, nuevoNombre);
        cs.executeUpdate();
        
    }

    public static void actualizarCiudad(String codigo, String nuevaCiudad) throws SQLException {
        CallableStatement cs = db.prepareCall("{call sp_actualizar_sucursal_ciudad(?, ?)}");
        cs.setString(1, codigo);
        cs.setString(2, nuevaCiudad);
        cs.executeUpdate();
        
    }

    public static void actualizarDireccion(String codigo, String nuevaDireccion) throws SQLException {
        CallableStatement cs = db.prepareCall("{call sp_actualizar_sucursal_direccion(?, ?)}");
        cs.setString(1, codigo);
        cs.setString(2, nuevaDireccion);
        cs.executeUpdate();
        
    }

    public static void actualizarContCuenta(String codigo, int nuevaContCuenta) throws SQLException {
        CallableStatement cs = db.prepareCall("{call sp_actualizar_sucursal_contcuenta(?, ?)}");
        cs.setString(1, codigo);
        cs.setInt(2, nuevaContCuenta);
        cs.executeUpdate();
        
    }


    public Sucursal obtener(String codigo) throws SQLException {
        Sucursal sucursal = new Sucursal();
        CallableStatement cs = db.prepareCall("{call sp_buscar_sucursal(?)}");
        cs.setString(1, codigo);
        ResultSet rs = cs.executeQuery();

        if (rs.next()) {
            sucursal.setCodigo(rs.getString(1));
            sucursal.setNombre(rs.getString(2));
            sucursal.setCiudad(rs.getString(3));
            sucursal.setDireccion(rs.getString(4));
            sucursal.setContCuenta(rs.getInt(5));
            sucursal.setEstado(rs.getInt(6));
            return sucursal;
        }

        
        
        return null;
    }

    public static void eliminar(String codigo) throws SQLException {
        CallableStatement cs = db.prepareCall("{call sp_eliminar_sucursal(?)}");
        cs.setString(1, codigo);
        cs.executeUpdate();
        
    }
}
