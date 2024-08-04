package validaciones;

import java.sql.*;

import listas.DBEmpleado;
import entidades.Empleado;

public class Empleados {
    private static String errMsg = "Error en empleados: ";

    private static void validarCodigo(String codigo) throws IllegalArgumentException {
        if (codigo.length() > 4) throw new IllegalArgumentException(errMsg + "El código es demasiado largo (máx. 4 caracteres).");
        if (codigo.isBlank()) throw new IllegalArgumentException(errMsg + "El código introducido es inválido.");
    }

    public static Empleado obtener(String codigo) throws IllegalArgumentException, SQLException{
        validarCodigo(codigo);
        return DBEmpleado.obtener(codigo);
    }

    public static void modificarNombre(String codigo, String nuevoNombre) throws IllegalArgumentException, SQLException{
        validarCodigo(codigo);
        if (nuevoNombre.isBlank()) throw new IllegalArgumentException(errMsg + "El nuevo nombre no puede estar vacío.");
        if (nuevoNombre.length() > 30) throw new IllegalArgumentException(errMsg + "El nuevo nombre es demasiado largo (máx. 30 caracteres)");
        DBEmpleado.modificarNombre(codigo, nuevoNombre.trim());
    }

    public static void modificarApellidoPaterno(String codigo, String nuevoApellido) throws IllegalArgumentException, SQLException{
        validarCodigo(codigo);
        if (nuevoApellido.isBlank()) throw new IllegalArgumentException(errMsg + "El nuevo apellido paterno no puede estar vacío.");
        if (nuevoApellido.length() > 25) throw new IllegalArgumentException(errMsg + "El nuevo apellido paterno es demasiado largo (máx. 25 caracteres)");
        DBEmpleado.modificarApellidoPaterno(codigo, nuevoApellido.trim());
    }

    public static void modificarApellidoMaterno(String codigo, String nuevoApellido) throws IllegalArgumentException, SQLException{
        validarCodigo(codigo);
        if (nuevoApellido.isBlank()) throw new IllegalArgumentException(errMsg + "El nuevo apellido materno no puede estar vacío.");
        if (nuevoApellido.length() > 25) throw new IllegalArgumentException(errMsg + "El nuevo apellido materno es demasiado largo (máx. 25 caracteres)");
        DBEmpleado.modificarApellidoPaterno(codigo, nuevoApellido.trim());
    }

    public static void modificarCiudad(String codigo, String nuevaCiudad) throws IllegalArgumentException, SQLException{
        validarCodigo(codigo);
        if (nuevaCiudad.isBlank()) throw new IllegalArgumentException(errMsg + "La nueva ciudad no puede estar vacía.");
        if (nuevaCiudad.length() > 30) throw new IllegalArgumentException(errMsg + "El nombre de la nueva ciudad es demasiado larga (máx. 30 caracteres)");
        DBEmpleado.modificarApellidoPaterno(codigo, nuevaCiudad.trim());
    }

    public static void modificarDireccion(String codigo, String nuevaDireccion) throws IllegalArgumentException, SQLException{
        validarCodigo(codigo);
        if (nuevaDireccion.isBlank()) throw new IllegalArgumentException(errMsg + "La nueva dirección no puede estar vacía.");
        if (nuevaDireccion.length() > 30) throw new IllegalArgumentException(errMsg + "La nueva dirección es demasiado larga (máx. 50 caracteres)");
        DBEmpleado.modificarApellidoPaterno(codigo, nuevaDireccion.trim());
    }
}
