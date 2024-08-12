package validaciones;

import java.sql.*;
import java.util.ArrayList;

import listas.DBCliente;
import entidades.Cliente;
import entidades.Cuenta;
import listas.DBAdapter;

public class Clientes {
    private static String errMsg = "Error en clientes: ";
    private static DBAdapter clientes = new DBCliente();
    
    public static String generarCodigo() throws SQLException{
        return DBCliente.generarCodigo();
    }
    
    private static void validarCodigo(String codigo) throws IllegalArgumentException {
        if (codigo.length() > 5) throw new IllegalArgumentException(errMsg + "El código es demasiado largo (máx. 5 caracteres).");
        if (codigo.isBlank()) throw new IllegalArgumentException(errMsg + "El código introducido es inválido.");
    }

    public static boolean existe(String codigo) throws IllegalArgumentException, SQLException{
        validarCodigo(codigo);
        return clientes.existe(codigo);
//        return DBCliente.existe(codigo);
    }

    public static void agregar(String codigo, String nombre, String apPaterno, String apMaterno,String dni, String ciudad, String direccion, String telefono, String email, String idUsuario) throws IllegalArgumentException, SQLException {
        String err = errMsg + "Creación | ";
        
        if (codigo.length() > 5) throw new IllegalArgumentException(err + "El código es demasiado largo (máx. 5 caracteres).");
        if (codigo.isBlank()) throw new IllegalArgumentException(err + "El código introducido es inválido.");
        if (existe(codigo)) throw new IllegalArgumentException(err + "El código introducido ya está vinculado a un cliente.");
        
        if (nombre.length() > 30) throw new IllegalArgumentException(err + "El nombre introducido es demasiado largo. (máx. 30 caracteres)");
        if (apPaterno.length() > 25) throw new IllegalArgumentException(err + "El apellido paterno es demasiado largo. (máx. 25 caracteres)");
        if (apMaterno.length() > 25) throw new IllegalArgumentException(err + "El apellido materno es demasiado largo. (máx. 25 caracteres)");
        if (dni.length() != 8) throw new IllegalArgumentException(err + "El dni no es valido. (8 caracteres necesarios)");
        if (ciudad.length() > 30) throw new IllegalArgumentException(err + "El nombre de la ciudad es demasiado largo (máx. 30 caracteres)");
        if (direccion.length() > 50) throw new IllegalArgumentException(err + "La dirección es demasiado larga (máx. 50 caracteres)");
        if (telefono.length() > 20) throw new IllegalArgumentException(err + "El telefono es demasiado largo. (máx. 20 caracteres)");
        if (email.length() > 50) throw new IllegalArgumentException(err + "El email es demasiado largo. (máx. 50 caracteres)");
        if (idUsuario.length() != 8) throw new IllegalArgumentException(err + "El nombre de usuario debe tener 8 caracteres.");
        
        clientes.agregar(new Cliente(codigo, nombre, apPaterno, apMaterno,dni, ciudad, direccion,telefono, email, idUsuario));
        //DBCliente.agregar(new Cliente(codigo, nombre, apPaterno, apMaterno,dni, ciudad, direccion,telefono, email, idUsuario));
    }

    public static Cliente obtener(String codigo) throws IllegalArgumentException, SQLException{
        validarCodigo(codigo);
        return (Cliente)clientes.obtener(codigo);
//        return DBCliente.obtener(codigo);
    }
    
    public static Cliente obtenerPorIdUsuario(String usuario) throws SQLException{
        return DBCliente.obtenerPorIdUsuario(usuario);
    }
    public static Cliente obtenerClientePorUsuario(String usuario) throws IllegalArgumentException, SQLException{
        //validarCodigo(codigo);
        return DBCliente.obtenerClientePorNombreUsuario(usuario);
    }
    
    /*
    public static Cliente obtenerPorIdUsuario(String usuario) throws SQLException{
        return DBCliente.obtenerPorIdUsuario(usuario);
    }
    */
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
        if (nuevoDni.length() != 8) throw new IllegalArgumentException(errMsg + "El nuevo DNI es invalido (8 caracteres necesarios)");
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

    public static void remover(String codigo) throws SQLException{
        validarCodigo(codigo);
        DBCliente.remover(codigo);
    }

    public static ArrayList<Cuenta> listarCuentas(String codigoCliente) throws SQLException{
        validarCodigo(codigoCliente);
        return DBCliente.listarCuentas(codigoCliente);
    }
    
    public static boolean buscar(String codigo) throws SQLException {
        if(codigo.trim().length()==5)
            return DBCliente.buscar(codigo.trim());
        return false;
    }
    
}
