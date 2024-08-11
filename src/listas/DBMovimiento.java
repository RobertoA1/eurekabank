package listas;
import java.sql.*;

import entidades.Movimiento;
import conexion.ConexionDB;
import java.util.ArrayList;

public class DBMovimiento {

    private static ResultSet rs = null;
    private static CallableStatement cs = null;

    private static Connection db = ConexionDB.obtenerDB();

    public static boolean existe(long numero) throws SQLException{
        cs = db.prepareCall("CALL sp_movimiento_obtenerEstado(?)");
        cs.setLong(1, numero);
        rs = cs.executeQuery();

        if (!rs.next()) return false;
        if (rs.getInt(1) == 0) return false;
        return true;
    }

    public static void agregar(Movimiento movimiento) throws SQLException {
        cs = db.prepareCall("CALL sp_agregarMovimiento(?, ?, ?, ?, ?, ?, ?)");


        cs.setString(1,movimiento.getCuencodigo());
        cs.setLong(2, movimiento.getMovinumero());
        cs.setDate(3, movimiento.getFecha());
        cs.setString(4, movimiento.getEmplcodigo());
        cs.setString(5, movimiento.getTipoCodigo());
        cs.setFloat(6, movimiento.getImporte());
        cs.setString(7, movimiento.getCuenReferencia());

        cs.executeUpdate();
    }
    
    public static Movimiento obtener(long numero) throws SQLException{
        cs = db.prepareCall("CALL sp_BuscarMovimiento(?)");
        cs.setLong(1, numero);
        rs = cs.executeQuery();

        if (rs.next()){
            Movimiento m = new Movimiento();
            m.setCuencodigo(rs.getString(1));
            m.setMovinumero(rs.getLong(2));
            m.setFecha(rs.getDate(3));
            m.setEmplcodigo(rs.getString(4));
            m.setTipoCodigo(rs.getString(5));
            m.setImporte(rs.getFloat(6));
            m.setCuenReferencia(rs.getString(7));
            return m;
        }
        return null;
    }
    
    public static void modificarImporte(long moviNumero, float nuevoImporte) throws SQLException{
        cs = db.prepareCall("CALL sp_modMovimiento_importe(?, ?)");
        cs.setLong(1, moviNumero);
        cs.setFloat(2, nuevoImporte);

        cs.executeUpdate();
    }
    
    public static void modificarFecha(long moviNumero, Date nuevaFecha) throws SQLException {
        cs = db.prepareCall("CALL sp_modMovimiento_fecha(?, ?)");
        cs.setLong(1, moviNumero);
        cs.setDate(2, nuevaFecha);

        cs.executeUpdate();
    }
    
    public static void modificarCuenReferencia(long moviNumero, String nuevaReferencia) throws SQLException {
        cs = db.prepareCall("CALL sp_modMovimiento_cuenReferencia(?, ?)");
        cs.setLong(1, moviNumero);
        cs.setString(2, nuevaReferencia);

        cs.executeUpdate();
    }
    

    public static void remover(long numero) throws SQLException{
        cs = db.prepareCall("CALL sp_remMovimiento(?)");
        cs.setLong(1, numero);

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
                rs.getLong(2),      
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

    public static boolean buscar(long numero) throws SQLException {
        String sql = "{call sp_BuscarMovimiento(?)}";
        CallableStatement cs = db.prepareCall(sql);
        cs.setLong(1, numero);
        ResultSet rs = cs.executeQuery();
        if (!rs.next()) return false;
        if (rs.getLong(2) != numero) return false;
       return true;
    }
    public static ArrayList<Movimiento> obtenerMovPorNumCuenta(String cuencodigo) throws SQLException{
        ArrayList<Movimiento> arr = new ArrayList<>();
        cs = db.prepareCall("CALL sp_obtenerMovimientoPorCuenta(?)");
        cs.setString(1, cuencodigo);
        rs = cs.executeQuery();

        while (rs.next()){
            Movimiento m = new Movimiento();
            m.setCuencodigo(rs.getString(1));
            m.setMovinumero(rs.getInt(2));
            m.setFecha(rs.getDate(3));
            m.setEmplcodigo(rs.getString(4));
            m.setTipoCodigo(rs.getString(5));
            m.setImporte(rs.getFloat(6));
            m.setCuenReferencia(rs.getString(7));
            arr.add(m);
            return arr;
        }
        return null;
    }
}
