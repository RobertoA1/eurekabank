package listas;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;

import conexion.ConexionDB;
import entidades.Cuenta;
import java.util.ArrayList;

public class DBCuentas {
    private static Connection db = ConexionDB.obtenerDB();

    public static boolean existe(String codigoCuenta) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_cuenta_existe(?)");
        cs.setString(1, codigoCuenta);

        ResultSet rs = cs.executeQuery();

        if (rs.next()){
            int estado = rs.getInt(1);
            if (estado == 1) return true;
        }

        return false;
    }

    public static Cuenta obtener(String codigo) throws SQLException{
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
    
    public static void modificar_clave(String codigoCuenta, String claveNueva) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_modificarClave(?, ?)");
        cs.setString(1, codigoCuenta);
        cs.setString(2, claveNueva);

        cs.executeUpdate();
    }
    
    public static boolean validarClaveActual(String codigoCuenta, String claveActual) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_validarClaveActual(?, ?)");
        cs.setString(1, codigoCuenta);
        cs.setString(2, claveActual);

        ResultSet rs = cs.executeQuery();

        if (rs.next()){
            int valida = rs.getInt("valida");
            return valida == 1;
        }

        return false;
    }
    
    public static float obtenerSaldo(String codigoCuenta) throws SQLException {
        CallableStatement cs = db.prepareCall("CALL sp_cuenta_obtenerSaldo(?)");
        cs.setString(1, codigoCuenta);

        ResultSet rs = cs.executeQuery();

        if (rs.next()) {
            return rs.getFloat("saldo");
        }

        throw new SQLException("No se pudo obtener el saldo de la cuenta.");
    }
}
