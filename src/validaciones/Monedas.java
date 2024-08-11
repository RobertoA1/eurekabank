package validaciones;

import java.sql.SQLException;
import java.util.ArrayList;

import listas.DBMonedas;
import entidades.Moneda;

public class Monedas {
    private static String errMsg = "Error en monedas: ";

    private static void validarCodigo(String codigo) throws IllegalArgumentException {
        if (codigo == null) throw new IllegalArgumentException(errMsg + "El código introducido es inválido.");
        if (codigo.length() != 2) throw new IllegalArgumentException(errMsg + "El código debe tener exactamente 2 caracteres.");
        if (codigo.isBlank()) throw new IllegalArgumentException(errMsg + "El código introducido es inválido.");
    }

    public static boolean existe(String codigo) throws IllegalArgumentException, SQLException {
        validarCodigo(codigo);
        return DBMonedas.existe(codigo);
    }

    public static Moneda obtener(String codigo) throws IllegalArgumentException, SQLException {
        validarCodigo(codigo);
        validarEstado(codigo);
        return DBMonedas.obtener(codigo);
    }

    public static void actualizarDescripcion(String codigo, String descripcion) throws IllegalArgumentException, SQLException {
        validarCodigo(codigo);
        validarEstado(codigo);
        if (descripcion.isBlank()) throw new IllegalArgumentException(errMsg + "La descripción no puede estar vacía.");
        if (descripcion.length() > 20) throw new IllegalArgumentException(errMsg + "La descripción es demasiado larga (máx. 20 caracteres).");
        DBMonedas.actualizarDescripcion(codigo, descripcion.trim());
    }

    public static void eliminar(String codigo) throws IllegalArgumentException, SQLException {
        validarCodigo(codigo);
        validarEstado(codigo);
        DBMonedas.eliminar(codigo);
    }

    private static void validarEstado(String codigo) throws IllegalArgumentException, SQLException {
        if (!DBMonedas.existe(codigo)) throw new IllegalArgumentException("La moneda solicitada no existe.");
    }

    public static void insertar(String codigo, String descripcion) throws SQLException{
        validarCodigo(codigo);
        if (DBMonedas.existe(codigo)) throw new IllegalArgumentException(errMsg + "El código especificado ya está vinculado a otra moneda.");
        if (descripcion.isBlank()) throw new IllegalArgumentException(errMsg + "La descripción no puede estar vacía.");
        if (descripcion.length() > 20) throw new IllegalArgumentException(errMsg + "La descripción es demasiado larga (máx. 20 caracteres).");
        DBMonedas.insertar(new Moneda(codigo, descripcion));
    }

    public static ArrayList<Moneda> listarMonedas() throws SQLException {
        return DBMonedas.listarMonedas();
    }

    
}
