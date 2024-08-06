package validaciones;

import entidades.*;
import listas.DBSucursales;

import java.sql.SQLException;
import java.util.ArrayList;

public class Sucursales {
    private static Sucursal sucursal;
    private static String errMsg = "Error en sucursales: ";
    
    private static void validarCodigo(String codigo) throws IllegalArgumentException {
        if (codigo.length() != 3) throw new IllegalArgumentException(errMsg + "El código debe tener exactamente 3 caracteres.");
        if (codigo.isBlank()) throw new IllegalArgumentException(errMsg + "El código introducido es inválido.");
    }

    private static void validarEstado(String codigo) throws IllegalArgumentException, SQLException {
        int estado = obtenerEstadoSucursal(codigo);
        if (estado != 1) throw new IllegalArgumentException(errMsg + "La sucursal solicitada no existe");
    }

    public static void insertar(String codigo, String nombre, String ciudad, String direccion, int contCuenta) throws IllegalArgumentException, SQLException {
        validarCodigo(codigo);
        if (nombre == null || nombre.trim().length() <= 0 || nombre.trim().length() > 50) {
            throw new IllegalArgumentException("Nombre no válido");
        }
        if (ciudad == null || ciudad.trim().length() <= 0 || ciudad.trim().length() > 30) {
            throw new IllegalArgumentException("Ciudad no válida");
        }
        if (direccion == null || direccion.trim().length() <= 0 || direccion.trim().length() > 50) {
            throw new IllegalArgumentException("Dirección no válida");
        }
        if (contCuenta < 0) {
            throw new IllegalArgumentException("El número de cuentas no puede ser negativo.");
        }

        if (buscar(codigo) == -1) {
            sucursal = new Sucursal(codigo, nombre, ciudad, direccion, contCuenta);
            DBSucursales.insertar(sucursal);
        } else {
            throw new IllegalArgumentException("Código ya existe");
        }
    }

    public static int buscar(String codigo) throws IllegalArgumentException, SQLException {
        validarCodigo(codigo);
        return DBSucursales.buscar(codigo);
    }

    public static ArrayList<Sucursal> listarSucursales() throws IllegalArgumentException, SQLException {
        return DBSucursales.listarSucursales();
    }

    public static void actualizarNombre(String codigo, String nuevoNombre) throws IllegalArgumentException, SQLException {
        validarCodigo(codigo);
        validarEstado(codigo);
        if (nuevoNombre.isBlank()) throw new IllegalArgumentException(errMsg + "El nuevo nombre no puede estar vacío.");
        if (nuevoNombre.length() > 50) throw new IllegalArgumentException(errMsg + "El nuevo nombre es demasiado largo (máx. 50 caracteres).");
        DBSucursales.actualizarNombre(codigo, nuevoNombre.trim());
    }

    public static void actualizarCiudad(String codigo, String nuevaCiudad) throws IllegalArgumentException, SQLException {
        validarCodigo(codigo);
        validarEstado(codigo);
        if (nuevaCiudad.isBlank()) throw new IllegalArgumentException(errMsg + "La nueva ciudad no puede estar vacía.");
        if (nuevaCiudad.length() > 30) throw new IllegalArgumentException(errMsg + "El nombre de la nueva ciudad es demasiado largo (máx. 30 caracteres).");
        DBSucursales.actualizarCiudad(codigo, nuevaCiudad.trim());
    }

    public static void actualizarDireccion(String codigo, String nuevaDireccion) throws IllegalArgumentException, SQLException {
        validarCodigo(codigo);
        validarEstado(codigo);
        if (nuevaDireccion.isBlank()) throw new IllegalArgumentException(errMsg + "La nueva dirección no puede estar vacía.");
        if (nuevaDireccion.length() > 50) throw new IllegalArgumentException(errMsg + "La nueva dirección es demasiado larga (máx. 50 caracteres).");
        DBSucursales.actualizarDireccion(codigo, nuevaDireccion.trim());
    }
    
    public static void actualizarContCuenta(String codigo, int nuevoContCuenta) throws IllegalArgumentException, SQLException {
        validarCodigo(codigo);
        validarEstado(codigo);
        if (nuevoContCuenta < 0) throw new IllegalArgumentException(errMsg + "El número de cuentas no puede ser negativo.");
        DBSucursales.actualizarContCuenta(codigo, nuevoContCuenta);
    }

    public static Sucursal obtener(String codigo) throws IllegalArgumentException, SQLException {
        validarCodigo(codigo);
        validarEstado(codigo);
        return DBSucursales.obtener(codigo);
    }

    public static void eliminar(String codigo) throws IllegalArgumentException, SQLException {
        validarCodigo(codigo);
        validarEstado(codigo);
        DBSucursales.eliminar(codigo);
    }

    private static int obtenerEstadoSucursal(String codigo) throws SQLException {
        int estado = DBSucursales.buscar(codigo);
        return estado;
    }
}
