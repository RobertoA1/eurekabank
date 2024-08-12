package listas;

import java.sql.*;
import java.util.ArrayList;

import entidades.Empleado;
import conexion.ConexionDB;

public class DBEmpleado implements DBAdapter {
    private static Connection db = ConexionDB.obtenerDB();

    public boolean existe(String codigo) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_empleado_obtenerEstado(?)");
        cs.setString(1, codigo);
        ResultSet rs = cs.executeQuery();

        if (!rs.next()) return false;
        if (rs.getInt(1) == 0) return false;
        return true;
    }

    public static void agregar(Empleado empleado) throws SQLException {
        CallableStatement cs = db.prepareCall("CALL sp_agregarEmpleado(?, ?, ?, ?, ?, ?, ?)");
        cs.setString(1, empleado.getCodigo());
        cs.setString(2, empleado.getApellidoPaterno());
        cs.setString(3, empleado.getApellidoMaterno());
        cs.setString(4, empleado.getNombre());
        cs.setString(5, empleado.getCiudad());
        cs.setString(6, empleado.getDireccion());
        cs.setString(7, empleado.getIdUsuario());

        cs.executeUpdate();
    }
    
    public void agregar(Object o) throws SQLException{
        Empleado e = (Empleado)o;
        agregar(e);
    }

    public Empleado obtener(String codigo) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_BuscarEmpleado(?)");
        cs.setString(1, codigo);

        ResultSet rs = cs.executeQuery();

        if (rs.next()){
            Empleado e = new Empleado();
            e.setCodigo(rs.getString(1));
            e.setApellidoPaterno(rs.getString(2));
            e.setApellidoMaterno(rs.getString(3));
            e.setNombre(rs.getString(4));
            e.setCiudad(rs.getString(5));
            e.setDireccion(rs.getString(6));
            e.setIdUsuario(rs.getString(7));
            return e;
        }
        return null;
    }

    public static void modificarNombre(String codigo, String nuevoNombre) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_modEmpleado_nombre(?, ?)");
        cs.setString(1, codigo);
        cs.setString(2, nuevoNombre);

        cs.executeUpdate();
    }

    public static void modificarApellidoPaterno(String codigo, String nuevoApellido) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_modEmpleado_apPaterno(?, ?)");
        cs.setString(1, codigo);
        cs.setString(2, nuevoApellido);

        cs.executeUpdate();
    }

    public static void modificarApellidoMaterno(String codigo, String nuevoApellido) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_modEmpleado_apMaterno(?, ?)");
        cs.setString(1, codigo);
        cs.setString(2, nuevoApellido);

        cs.executeUpdate();
    }

    public static void modificarCiudad(String codigo, String nuevaCiudad) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_modEmpleado_ciudad(?, ?)");
        cs.setString(1, codigo);
        cs.setString(2, nuevaCiudad);

        cs.executeUpdate();
    }

    public static void modificarDireccion(String codigo, String nuevaDireccion) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_modEmpleado_direccion(?, ?)");
        cs.setString(1, codigo);
        cs.setString(2, nuevaDireccion);

        cs.executeUpdate();
    }

    public static void remover(String codigo) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_remEmpleado(?)");
        cs.setString(1, codigo);
        
        cs.executeUpdate();
    }

    public static ArrayList<Empleado> listar() throws SQLException{
        ArrayList<Empleado> arr = new ArrayList<>();
        CallableStatement cs = db.prepareCall("CALL sp_listarEmpleados()");
        ResultSet rs = cs.executeQuery();

        while (rs.next()){
            Empleado e = new Empleado();
            e.setCodigo(rs.getString(1));
            e.setApellidoPaterno(rs.getString(2));
            e.setApellidoMaterno(rs.getString(3));
            e.setNombre(rs.getString(4));
            e.setCiudad(rs.getString(5));
            e.setDireccion(rs.getString(6));
            e.setIdUsuario(rs.getString(7));
            arr.add(e);
        }

        return arr;
    }
}
