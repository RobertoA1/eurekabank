package listas;

import entidades.*;
import conexion.ConexionDB;
import java.sql.*;

public class DBMonedas {

    private static Connection db = ConexionDB.obtenerDB();

    public static String buscar(String codigo) throws SQLException {
        CallableStatement cs = db.prepareCall("{call sp_buscar_moneda(?)}");
        cs.setString(1, codigo);

        ResultSet rs = cs.executeQuery();
        String resultado = null;

        if (rs.next()) {
            resultado = rs.getString("monecodigo");
        }
        rs.close();
        cs.close();

        return resultado;
    }

    public static Moneda obtener(String codigo) throws SQLException {
        CallableStatement cs = db.prepareCall("CALL sp_buscar_moneda(?)");
        cs.setString(1, codigo);

        ResultSet rs = cs.executeQuery();
        if (rs.next()) {
            Moneda moneda = new Moneda();
            moneda.setCodigo(rs.getString(1));
            moneda.setDescripcion(rs.getString(2));
            return moneda;
        }
        rs.close();
        cs.close();
        return null;
    }

    public static void actualizarDescripcion(String codigo, String nuevaDescripcion) throws SQLException {
        CallableStatement cs = db.prepareCall("{call sp_actualizar_moneda_descripcion(?, ?)}");
        cs.setString(1, codigo);
        cs.setString(2, nuevaDescripcion);

        cs.executeUpdate();
        cs.close();
    }



}
