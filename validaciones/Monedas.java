package validaciones;

import java.sql.*;

import listas.DBMonedas;
import entidades.Moneda;

public class Monedas {
    private static String errMsg = "Error en monedas: ";

    private static void validarCodigo(String codigo) throws IllegalArgumentException {
        if (codigo.length() != 2) throw new IllegalArgumentException(errMsg + "El código debe tener exactamente 2 caracteres.");
        if (codigo.isBlank()) throw new IllegalArgumentException(errMsg + "El código introducido es inválido.");
    }

    public static String buscar(String codigo) throws IllegalArgumentException, SQLException {
        validarCodigo(codigo);
        return DBMonedas.buscar(codigo);
    }

    public static Moneda obtener(String codigo) throws IllegalArgumentException, SQLException {
        validarCodigo(codigo);
        return DBMonedas.obtener(codigo);
    }

    public static void actualizarDescripcion(String codigo, String descripcion) throws IllegalArgumentException, SQLException {
        validarCodigo(codigo);
        if (descripcion.isBlank()) throw new IllegalArgumentException(errMsg + "La descripción no puede estar vacía.");
        if (descripcion.length() > 20) throw new IllegalArgumentException(errMsg + "La descripción es demasiado larga (máx. 20 caracteres).");
        DBMonedas.actualizarDescripcion(codigo, descripcion.trim());
    }
}
