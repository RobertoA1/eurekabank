package listas;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;

import conexion.ConexionDB;
import entidades.Cuenta;
import java.util.ArrayList;

public class DBCuentas implements DBAdapter {
    private static Connection db = ConexionDB.obtenerDB();

    public boolean existe(String codigoCuenta) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_cuenta_existe(?)");
        cs.setString(1, codigoCuenta);

        ResultSet rs = cs.executeQuery();

        if (rs.next()){
            int estado = rs.getInt(1);
            if (estado == 1) return true;
        }

        return false;
    }

    public Cuenta obtener(String codigo) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_cuenta_buscar(?)");
        cs.setString(1, codigo);

        ResultSet rs = cs.executeQuery();
        if (rs.next()){
            Cuenta c = Cuenta.builder()
                        .codigo(rs.getString(1))
                        .codigoMoneda(rs.getString(2))
                        .codigoSucursal(rs.getString(3))
                        .codigoCliente(rs.getString(4))
                        .codigoUsuario(rs.getString(5))
                        .saldo(rs.getFloat(6))
                        .fechaCreacion(rs.getDate(7))
                        .cantidadMovimientos(rs.getInt(8))
                        .clave(rs.getString(9))
                        .build();
            return c;
        }
        return null;
    }

    public static void agregar(Cuenta cuenta) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_cuenta_agregar(?, ?, ?, ?, ?, ?, ?, ?, ?)");
        cs.setString(1, cuenta.getCodigo());
        cs.setString(2, cuenta.getCodigoMoneda());
        cs.setString(3, cuenta.getCodigoSucursal());
        cs.setString(4, cuenta.getCodigoCliente());
        cs.setString(5, cuenta.getCodigoUsuario());
        cs.setFloat(6, cuenta.getSaldo());
        cs.setDate(7, cuenta.getFechaCreacion());
        cs.setInt(8, cuenta.getCantidadMovimientos());
        cs.setString(9, cuenta.getClaveCuenta());
        cs.executeUpdate();
    }
    
    public void agregar(Object o) throws SQLException{
        Cuenta c = (Cuenta)o;
        agregar(c);
    }

    public static void remover(String codigoCuenta) throws SQLException {
        CallableStatement cs = db.prepareCall("CALL sp_cuenta_remover(?)");
        cs.setString(1, codigoCuenta);

        cs.executeUpdate();
    }

    public static void modificar_fechaCreacion(String codigoCuenta, Date fechaCreacion) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_cuenta_modificar_fechaCreacion(?, ?)");
        cs.setString(1, codigoCuenta);
        cs.setDate(2, fechaCreacion);

        cs.executeUpdate();
    }    

    public static ArrayList<Cuenta> listar(String codigoCliente) throws SQLException{
        ArrayList<Cuenta> arr = new ArrayList<>();
        CallableStatement cs = db.prepareCall("CALL sp_cuenta_listar(?)");
        cs.setString(1, codigoCliente);

        ResultSet rs = cs.executeQuery();

        while (rs.next()){
            Cuenta c = Cuenta.builder()
                        .codigo(rs.getString(1))
                        .codigoMoneda(rs.getString(2))
                        .codigoSucursal(rs.getString(3))
                        .codigoCliente(rs.getString(4))
                        .saldo(rs.getFloat(5))
                        .fechaCreacion(rs.getDate(6))
                        .cantidadMovimientos(rs.getInt(7))
                        .clave(rs.getString(8))
                        .build();
            arr.add(c);
        }

        return arr;
    }

    public static float obtenerSaldo(String codigo) throws SQLException {
        Cuenta c = obtener(codigo);
        return c.getSaldo();
    }
    

    public static ArrayList<Cuenta> listar(String codigoCliente) throws SQLException{
        ArrayList<Cuenta> arr = new ArrayList<>();
        CallableStatement cs = db.prepareCall("CALL sp_cuenta_listar(?)");
        cs.setString(1, codigoCliente);

        ResultSet rs = cs.executeQuery();

        while (rs.next()){
            Cuenta c = Cuenta.builder()
                        .codigo(rs.getString(1))
                        .codigoMoneda(rs.getString(2))
                        .codigoSucursal(rs.getString(3))
                        .codigoCliente(rs.getString(4))
                        .saldo(rs.getFloat(5))
                        .fechaCreacion(rs.getDate(6))
                        .cantidadMovimientos(rs.getInt(7))
                        .clave(rs.getString(8))
                        .build();
            arr.add(c);
        }

        return arr;
    }
}
