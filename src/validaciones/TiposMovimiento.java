package validaciones;
import java.sql.SQLException;
import java.util.ArrayList;

import entidades.TipoMovimiento;
import listas.DBTiposMovimiento;

public class TiposMovimiento {
    private static String err = "Error en TiposMovimiento: ";

    public static void validarCodigo(String codigo) throws IllegalArgumentException{
        if (codigo == null) throw new IllegalArgumentException(err + "El código es inválido.");
        if (codigo.length() != 3) throw new IllegalArgumentException(err + "El código es inválido.");
    }

    public static boolean existe(String codigo) throws SQLException{
        validarCodigo(codigo);
        return DBTiposMovimiento.existe(codigo);
    }

    public static TipoMovimiento obtener(String codigo) throws SQLException{
        if (!existe(codigo)) throw new IllegalArgumentException(err + "El código no está asignado a un tipo de movimiento.");
        return DBTiposMovimiento.obtener(codigo);
    }
    
    public static void agregar(String codigo, String descripcion, String accion) throws SQLException{
        validarCodigo(codigo);
        if (existe(codigo)) throw new IllegalArgumentException(err + "El código ya está asignado a un tipo de movimiento.");
        DBTiposMovimiento.agregar(new TipoMovimiento(codigo, descripcion, accion, 1));
    }
    
    public static void remover(String codigoTipoMov) throws SQLException {
        validarCodigo(codigoTipoMov);
        DBTiposMovimiento.remover(codigoTipoMov);
    }
    
    public static ArrayList<TipoMovimiento> listar() throws SQLException{
        return DBTiposMovimiento.listar();
    }
}
