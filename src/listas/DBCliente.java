package listas;

import java.sql.*;
import java.util.ArrayList;

import entidades.Cliente;
import entidades.Cuenta;
import conexion.ConexionDB;

public class DBCliente{
    private static Connection db = ConexionDB.obtenerDB();

    public static String generarCodigo() throws SQLException{
        int siguienteId = 0;
        CallableStatement cs = db.prepareCall("CALL sp_cantidad_clientes()");
        ResultSet rs = cs.executeQuery();
        if (rs.next()) siguienteId = rs.getInt(1) + 1;
        
        StringBuilder codigoBuilder = new StringBuilder();
        String tempCodigo = String.valueOf(siguienteId);
        for (int i = tempCodigo.length(); i < 5; i++){
            codigoBuilder.append("0");
        }
        
        codigoBuilder.append(tempCodigo);
        return codigoBuilder.toString();
    }
    
    public static boolean existe(String codigo) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_cliente_obtenerEstado(?)");
        cs.setString(1,codigo);

        ResultSet rs = cs.executeQuery();

        if (!rs.next()) return false;
        if (rs.getInt(1)==0) return false;
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
        CallableStatement cs = db.prepareCall("CALL sp_cliente_buscar(?)");
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
    
    public static Cliente obtenerClientePorNombreUsuario(String usuario) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_BuscarCodigoPorUsuario(?)");
        cs.setString(1, usuario);

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

    public static ArrayList<Cuenta> listarCuentas(String codigoCliente) throws SQLException{
        ArrayList<Cuenta> arr = new ArrayList<>();

        CallableStatement cs = db.prepareCall("CALL sp_cliente_obtenerCuentas(?)");
        cs.setString(1, codigoCliente);

        ResultSet rs = cs.executeQuery();
        
        while (rs.next()){
            Cuenta cuenta = Cuenta.builder()
                .codigo(rs.getString(1))
                .codigoMoneda(rs.getString(2))
                .codigoSucursal(rs.getString(3))
                .codigoCliente(rs.getString(4))
                .saldo(rs.getFloat(6))
                .fechaCreacion(rs.getDate(7))
                .cantidadMovimientos(rs.getInt(8))
                .clave(rs.getString(9))
                .build();
            arr.add(cuenta);
        }
        return arr;
    }
    
    public static boolean buscar(String codigo) throws SQLException {
        String sql = "{call sp_buscar_cliente(?)}";
        CallableStatement cs = db.prepareCall(sql);
        cs.setString(1, codigo);
        ResultSet rs = cs.executeQuery();
        if (!rs.next()) return false;
        if (!rs.getString(1).trim().equalsIgnoreCase(codigo)) return false;
       return true;
    }
    
    
}