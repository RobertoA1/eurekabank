package validaciones;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.sql.Date;
import java.sql.SQLException;

import entidades.Cuenta;
import listas.DBCuentas;
import seguridad.Contrasenas;

public class Cuentas {
    private static String errMsg = "Error en Cuentas: ";

    private static boolean esCodigoValido(String codigoCuenta) throws SQLException{
        if (codigoCuenta == null) return false;
        if (codigoCuenta.isBlank()) return false;
        if (codigoCuenta.length() != 8) return false;
        return true;
    }

    private static void validarCodigoExistente(String codigo, String tipo) throws IllegalArgumentException, SQLException{
        /* Este método tirará errores si es que detecta que no existe alguno
        de los códigos establecidos. Si todos los códigos existen, no lanzará ningún problema.
        Existen 4 tipos: Cuenta, Moneda, Sucursal y Cliente */

        if (tipo.equalsIgnoreCase("cuenta")){
            if (!Cuentas.existe(codigo)) throw new IllegalArgumentException(errMsg + "El código de la cuenta es inválido.");
        } else if (tipo.equalsIgnoreCase("moneda")){
            if (!Monedas.existe(codigo)) throw new IllegalArgumentException(errMsg + "El código de la moneda es inválido.");
        } else if (tipo.equalsIgnoreCase("sucursal")){
            if (!Sucursales.existe(codigo)) throw new IllegalArgumentException(errMsg + "El código de la sucursal es inválido.");
        } else if (tipo.equalsIgnoreCase("cliente")){
            if (!Clientes.existe(codigo)) throw new IllegalArgumentException(errMsg + "El código del cliente es inválido.");
        } else {
            throw new IllegalArgumentException(errMsg + "El tipo de validación solicitada no existe.");
        }
    }

    public static boolean existe(String codigoCuenta) throws IllegalArgumentException, SQLException{
        if (!esCodigoValido(codigoCuenta)) return false;
        if (!DBCuentas.existe(codigoCuenta)) return false;
        return true;
    }

    public static void agregar(String codigo, String codigoMoneda, String codigoSucursal, String codigoCliente, String clave) throws InvalidKeySpecException, NoSuchAlgorithmException, NullPointerException, SQLException{
        String errMsg = "Ocurrió un problema mientras creábamos la cuenta: ";
        validarCodigoExistente(codigo, "cuenta");
        validarCodigoExistente(codigoMoneda, "moneda");
        validarCodigoExistente(codigoSucursal, "sucursal");
        validarCodigoExistente(codigoCliente, "cliente");

        if (clave.length() != 6) throw new IllegalArgumentException(errMsg + "La clave tiene que ser de seis dígitos.");

        String key = Contrasenas.generarKey(clave);

        Cuenta cuenta = Cuenta.builder()
                    .codigo(codigo)
                    .codigoMoneda(codigoMoneda)
                    .codigoSucursal(codigoSucursal)
                    .codigoCliente(codigoCliente)
                    .saldo(0)
                    .fechaCreacion(new Date(System.currentTimeMillis()))
                    .cantidadMovimientos(0)
                    .clave(key)
                    .build();

        DBCuentas.agregar(cuenta);
    }

    public static void remover(String codigoCuenta) throws SQLException {
        validarCodigoExistente(codigoCuenta, "cuenta");
        DBCuentas.remover(codigoCuenta);
    }

    public static void modificar_fechaCreacion(String codigoCuenta, Date fechaCreacion) throws SQLException{
        validarCodigoExistente(codigoCuenta, "cuenta");
        DBCuentas.modificar_fechaCreacion(codigoCuenta, fechaCreacion);
    }
}