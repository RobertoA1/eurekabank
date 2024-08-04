package listas;
import java.sql.*;
import entidades.Movimiento;
import conexion.ConexionDB;

public class DBMovimiento {

    private static ResultSet rs = null;
    private static CallableStatement cs = null;

    private static Connection db = ConexionDB.obtenerDB();
    
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

        cs.executeQuery();
    }
}
