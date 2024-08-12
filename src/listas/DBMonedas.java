package listas;

import entidades.*;
import conexion.ConexionDB;
import java.sql.*;
import java.util.ArrayList;

public class DBMonedas implements DBAdapter {

    private static Connection db = ConexionDB.obtenerDB();

    public boolean existe(String codigo) throws SQLException {
        CallableStatement cs = db.prepareCall("CALL sp_buscar_moneda(?)");
        cs.setString(1, codigo);

        ResultSet rs = cs.executeQuery();
        if (rs.next()){
            if (rs.getInt(3) == 1) return true;
        }

        return false;
    }

    public static void agregar(Moneda moneda) throws SQLException{
        CallableStatement cs = db.prepareCall("CALL sp_insertar_moneda(?, ?)");
        cs.setString(1, moneda.getCodigo());
        cs.setString(2, moneda.getDescripcion());

        cs.executeUpdate();
    }
    
    public void agregar(Object o) throws SQLException {
        Moneda m = (Moneda)o;
        agregar(m);
    }


    public Moneda obtener(String codigo) throws SQLException {
        CallableStatement cs = db.prepareCall("CALL sp_buscar_moneda(?)");
        cs.setString(1, codigo);

        ResultSet rs = cs.executeQuery();
        if (rs.next()) {
            Moneda moneda = new Moneda();
            moneda.setCodigo(rs.getString(1));
            moneda.setDescripcion(rs.getString(2));
            moneda.setEstado(rs.getInt(3));
            return moneda;
        }

        return null;
    }

    public static void actualizarDescripcion(String codigo, String nuevaDescripcion) throws SQLException {
        CallableStatement cs = db.prepareCall("CALL sp_actualizar_moneda_descripcion(?, ?)");
        cs.setString(1, codigo);
        cs.setString(2, nuevaDescripcion);
        cs.executeUpdate();
    }

    public static void eliminar(String codigo) throws SQLException {
        CallableStatement cs = db.prepareCall("CALL sp_eliminar_moneda(?)");
        cs.setString(1, codigo);
        cs.executeUpdate();
    }

    public static ArrayList<Moneda> listarMonedas() throws SQLException {
        ArrayList<Moneda> arr = new ArrayList<>();
        CallableStatement cs = db.prepareCall("CALL sp_listar_monedas()");
        ResultSet rs = cs.executeQuery();

        while (rs.next()){
            Moneda m = new Moneda();
            m.setCodigo(rs.getString(1));
            m.setDescripcion(rs.getString(2));
        }
        
        return arr;
    }
}
