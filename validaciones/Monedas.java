package validaciones;

import java.sql.SQLException;

import listas.DBMonedas;
import entidades.Moneda;

public class Monedas {
    private static String errMsg = "Error en monedas: ";

    private static void validarCodigo(String codigo) throws IllegalArgumentException {
        if (codigo.length() != 2) throw new IllegalArgumentException(errMsg + "El código debe tener exactamente 2 caracteres.");
        if (codigo.isBlank()) throw new IllegalArgumentException(errMsg + "El código introducido es inválido.");
    }

    private static void validarEstado(String codigo) throws IllegalArgumentException, SQLException {
        int estado = obtenerEstadoMoneda(codigo);
        if (estado != 1) throw new IllegalArgumentException(errMsg + "La moneda solicitada no existe");
    }

    public static int buscar(String codigo) throws IllegalArgumentException, SQLException {
        validarCodigo(codigo);
        validarEstado(codigo);
        return DBMonedas.buscar(codigo);
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

    private static int obtenerEstadoMoneda(String codigo) throws SQLException {
        int estado = DBMonedas.buscar(codigo);
        return estado;
    }
}
