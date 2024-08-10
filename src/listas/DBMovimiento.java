package listas;
import java.sql.*;

import entidades.Movimiento;
import conexion.ConexionDB;
import java.util.ArrayList;

public class DBMovimiento {

    private static ResultSet rs = null;
    private static CallableStatement cs = null;

    private static Connection db = ConexionDB.obtenerDB();

    public static boolean existe(int numero) throws SQLException{
        cs = db.prepareCall("CALL sp_movimiento_obtenerEstado(?)");
        cs.setInt(1, numero);
        rs = cs.executeQuery();

        if (!rs.next()) return false;
        if (rs.getInt(1) == 0) return false;
        return true;
    }

    public static void agregar(Movimiento movimiento) throws SQLException {
        cs = db.prepareCall("CALL sp_agregarMovimiento(?, ?, ?, ?, ?, ?, ?)");


        cs.setString(1,movimiento.getCuencodigo());
        cs.setInt(2, movimiento.getMovinumero());
        cs.setDate(3, movimiento.getFecha());
        cs.setString(4, movimiento.getEmplcodigo());
        cs.setString(5, movimiento.getTipoCodigo());
        cs.setFloat(6, movimiento.getImporte());
        cs.setString(7, movimiento.getCuenReferencia());

        cs.executeUpdate();
    }
    
    public static Movimiento obtener(int numero) throws SQLException{
        cs = db.prepareCall("CALL sp_BuscarMovimiento(?)");
        cs.setInt(1, numero);
        rs = cs.executeQuery();

        if (rs.next()){
            Movimiento m = new Movimiento();
            m.setCuencodigo(rs.getString(1));
            m.setMovinumero(rs.getInt(2));
            m.setFecha(rs.getDate(3));
            m.setEmplcodigo(rs.getString(4));
            m.setTipoCodigo(rs.getString(5));
            m.setImporte(rs.getFloat(6));
            m.setCuenReferencia(rs.getString(7));
            return m;
        }
        return null;
    }
    
    public static void modificarImporte(int moviNumero, float nuevoImporte) throws SQLException{
        cs = db.prepareCall("CALL sp_modMovimiento_importe(?, ?)");
        cs.setInt(1, moviNumero);
        cs.setFloat(2, nuevoImporte);

        cs.executeUpdate();
    }

    public static void remover(int numero) throws SQLException{
        cs = db.prepareCall("CALL sp_remMovimiento(?)");
        cs.setInt(1, numero);

        cs.executeUpdate();
    }
    
    public static ArrayList<Movimiento> listar() throws SQLException {
        String sql = "{CALL sp_listar_movimientos()}";
        CallableStatement cs = db.prepareCall(sql);
        ResultSet rs = cs.executeQuery();
        ArrayList<Movimiento> movs = new ArrayList<>();

        while (rs.next()) {
            movs.add(new Movimiento(
                rs.getString(1),   
                rs.getInt(2),      
                rs.getDate(3),     
                rs.getString(4),   
                rs.getString(5), 
                rs.getFloat(6),    
                rs.getString(7) 
            ));
        }

        rs.close();
        cs.close();

        return movs;
    }

    
}
