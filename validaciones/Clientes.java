package validaciones;

import java.sql.*;

import listas.DBCliente;
import entidades.Cliente;

public class Clientes {
    private static String errMsg = "Error en clientes: ";

    private static void validarCodigo(String codigo) throws IllegalArgumentException {
        if (codigo.length() > 5) throw new IllegalArgumentException(errMsg + "El código es demasiado largo (máx. 5 caracteres).");
        if (codigo.isBlank()) throw new IllegalArgumentException(errMsg + "El código introducido es inválido.");
    }

    public static Cliente obtener(String codigo) throws IllegalArgumentException, SQLException{
        validarCodigo(codigo);
        return DBCliente.obtener(codigo);
    }

    public static void modificarNombre(String codigo, String nuevoNombre) throws IllegalArgumentException, SQLException{
        validarCodigo(codigo);
        if (nuevoNombre.isBlank()) throw new IllegalArgumentException(errMsg + "El nuevo nombre no puede estar vacío.");
        if (nuevoNombre.length() > 30) throw new IllegalArgumentException(errMsg + "El nuevo nombre es demasiado largo (máx. 30 caracteres)");
        DBCliente.modificarNombre(codigo, nuevoNombre.trim());
    }

    public static void modificarApellidoPaterno(String codigo, String nuevoApellido) throws IllegalArgumentException, SQLException{
        validarCodigo(codigo);
        if (nuevoApellido.isBlank()) throw new IllegalArgumentException(errMsg + "El nuevo apellido paterno no puede estar vacío.");
        if (nuevoApellido.length() > 25) throw new IllegalArgumentException(errMsg + "El nuevo apellido paterno es demasiado largo (máx. 25 caracteres)");
        DBCliente.modificarApellidoPaterno(codigo, nuevoApellido.trim());
    }

    public static void modificarApellidoMaterno(String codigo, String nuevoApellido) throws IllegalArgumentException, SQLException{
        validarCodigo(codigo);
        if (nuevoApellido.isBlank()) throw new IllegalArgumentException(errMsg + "El nuevo apellido materno no puede estar vacío.");
        if (nuevoApellido.length() > 25) throw new IllegalArgumentException(errMsg + "El nuevo apellido materno es demasiado largo (máx. 25 caracteres)");
        DBCliente.modificarApellidoPaterno(codigo, nuevoApellido.trim());
    }

    public static void modificarDni(String codigo, String nuevoDni) throws IllegalArgumentException, SQLException{
        validarCodigo(codigo);
        if (nuevoDni.isBlank()) throw new IllegalArgumentException(errMsg + "El nuevo DNI no puede estar vacía.");
        if (nuevoDNI.length() =! 8) throw new IllegalArgumentException(errMsg + "El nuevo DNI es invalido (8 caracteres necesarios)");
        DBCliente.modificarDni(codigo, nuevoDni.trim());
    }

    public static void modificarCiudad(String codigo, String nuevaCiudad) throws IllegalArgumentException, SQLException{
        validarCodigo(codigo);
        if (nuevaCiudad.isBlank()) throw new IllegalArgumentException(errMsg + "La nueva ciudad no puede estar vacía.");
        if (nuevaCiudad.length() > 30) throw new IllegalArgumentException(errMsg + "El nombre de la nueva ciudad es demasiado larga (máx. 30 caracteres)");
        DBCliente.modificarCiudad(codigo, nuevaCiudad.trim());
    }

    public static void modificarDireccion(String codigo, String nuevaDireccion) throws IllegalArgumentException, SQLException{
        validarCodigo(codigo);
        if (nuevaDireccion.isBlank()) throw new IllegalArgumentException(errMsg + "La nueva dirección no puede estar vacía.");
        if (nuevaDireccion.length() > 30) throw new IllegalArgumentException(errMsg + "La nueva dirección es demasiado larga (máx. 50 caracteres)");
        DBCliente.modificarDireccion(codigo, nuevaDireccion.trim());
    }

    public static void modificarTelefono(String codigo, String nuevaTelefono) throws IllegalArgumentException, SQLException{
        validarCodigo(codigo);
        if (nuevaTelefono.isBlank()) throw new IllegalArgumentException(errMsg + "El nuevo telefono no puede estar vacía.");
        if (nuevaTelefono.length() > 20) throw new IllegalArgumentException(errMsg + "El nuevo telefono es demasiado largo (máx. 20 caracteres)");
        DBCliente.modificarTelefono(codigo, nuevaTelefono.trim());
    }

    public static void modificarEmail(String codigo, String nuevaEmail) throws IllegalArgumentException, SQLException{
        validarCodigo(codigo);
        if (nuevaEmail.isBlank()) throw new IllegalArgumentException(errMsg + "El nuevo Email no puede estar vacía.");
        if (nuevaEmail.length() > 50) throw new IllegalArgumentException(errMsg + "El nuevo Email es demasiado largo (máx. 50 caracteres)");
        DBCliente.modificarEmail(codigo, nuevaEmail.trim());
    }

}