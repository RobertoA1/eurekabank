package listas;

import java.sql.*;
import entidades.Empleado;
import conexion.ConexionDB;

public class DBEmpleado {
    private static Connection db = ConexionDB.obtenerDB();

    public static Empleado obtener(String codigo) throws SQLException{
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

        cs.executeQuery();
    }

    public static void modificarApellidoPaterno(String codigo, String nuevoApellido) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_modEmpleado_apPaterno(?, ?)");
        cs.setString(1, codigo);
        cs.setString(2, nuevoApellido);

        cs.executeQuery();
    }

    public static void modificarApellidoMaterno(String codigo, String nuevoApellido) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_modEmpleado_apMaterno(?, ?)");
        cs.setString(1, codigo);
        cs.setString(2, nuevoApellido);

        cs.executeQuery();
    }

    public static void modificarCiudad(String codigo, String nuevaCiudad) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_modEmpleado_ciudad(?, ?)");
        cs.setString(1, codigo);
        cs.setString(2, nuevaCiudad);

        cs.executeQuery();
    }

    public static void modificarDireccion(String codigo, String nuevaDireccion) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_modEmpleado_direccion(?, ?)");
        cs.setString(1, codigo);
        cs.setString(2, nuevaDireccion);

        cs.executeQuery();
    }
}
