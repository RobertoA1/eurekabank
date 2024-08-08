package listas;

import java.sql.*;
import entidades.Cliente;
import conexion.ConexionDB;

public class DBCliente{
    private static Connection db = ConexionDB.obtenerDB();

    public static boolean existe(String codigo) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_cliente_obtenerEstado(?)");
        cs.setString(1,codigo);

        ResultSet rs = cs.executeQuery();

        if(!rs.next()) return false;
        if(rs.getInt(1)==0) return false;
        return true;
    }

    public static void agregar(Cliente cliente) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_agregarCliente(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        cs.setString(1, cliente.getCodigo());
        cs.setString(2, cliente.getApellidoPaterno());
        cs.setString(3, cliente.getApellidoMaterno());
        cs.setString(4, cliente.getNombre());
        cs.setString(5, cliente.getDni());
        cs.setString(6, cliente.getCiudad());
        cs.setString(7, cliente.getDireccion());
        cs.setString(8, cliente.getTelefono());
        cs.setString(9, cliente.getEmail());
        cs.setString(10, cliente.getIdUsuario());

        cs.executeUpdate();
    }

    public static Cliente obtener(String codigo) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_BuscarCliente(?)");
        cs.setString(1, codigo);

        ResultSet rs = cs.executeQuery();

        if (rs.next()){
            Cliente c = new Cliente();
            c.setCodigo(rs.getString(1));
            c.setApellidoPaterno(rs.getString(2));
            c.setApellidoMaterno(rs.getString(3));
            c.setNombre(rs.getString(4));
            c.setDni(rs.getString(5));
            c.setCiudad(rs.getString(6));
            c.setDireccion(rs.getString(7));
            c.setTelefono(rs.getString(8));
            c.setEmail(rs.getString(9));
            c.setIdUsuario(rs.getString(10));
            return c;
        }
        return null;
    }

    public static void modificarNombre(String codigo, String nuevoNombre) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_modCliente_nombre(?, ?)");
        cs.setString(1, codigo);
        cs.setString(2, nuevoNombre);

        cs.executeQuery();
    }

    public static void modificarApellidoPaterno(String codigo, String nuevoApellido) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_modCliente_apPaterno(?, ?)");
        cs.setString(1, codigo);
        cs.setString(2, nuevoApellido);

        cs.executeQuery();
    }

    public static void modificarApellidoMaterno(String codigo, String nuevoApellido) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_modCliente_apMaterno(?, ?)");
        cs.setString(1, codigo);
        cs.setString(2, nuevoApellido);

        cs.executeQuery();
    }

    public static void modificarDni(String codigo, String nuevoDni) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_modCliente_dni(?, ?)");
        cs.setString(1, codigo);
        cs.setString(2, nuevoDni);

        cs.executeQuery();
    }

    public static void modificarCiudad(String codigo, String nuevaCiudad) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_modCliente_ciudad(?, ?)");
        cs.setString(1, codigo);
        cs.setString(2, nuevaCiudad);

        cs.executeQuery();
    }

    public static void modificarDireccion(String codigo, String nuevaDireccion) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_modCliente_direccion(?, ?)");
        cs.setString(1, codigo);
        cs.setString(2, nuevaDireccion);

        cs.executeQuery();
    }

    public static void modificarTelefono(String codigo, String nuevoTelefono) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_modCliente_telefono(?, ?)");
        cs.setString(1, codigo);
        cs.setString(2, nuevoTelefono);

        cs.executeQuery();
    }

    public static void modificarEmail(String codigo, String nuevoEmail) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_modCliente_email(?, ?)");
        cs.setString(1, codigo);
        cs.setString(2, nuevoEmail);

        cs.executeQuery();
    }

    public static void remover(String codigo) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_remCliente(?)");
        cs.setString(1, codigo);
        
        cs.executeUpdate();
    }
}