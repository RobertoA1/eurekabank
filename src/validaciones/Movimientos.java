package validaciones;

import java.sql.*;

import listas.*;
import entidades.*;
import java.util.ArrayList;

public class Movimientos {
    private static String errMsg = "Error en movimiento: ";
    private static DBAdapter cuentas = new DBCuentas();
    private static DBAdapter movimientos = new DBMovimiento();
    
    private static void validarMovNumero(int numero) throws IllegalArgumentException {
        if (numero <= 0) throw new IllegalArgumentException(errMsg + "El número debe ser mayor que cero.");
    }

    private static boolean validarSaldo(String cuencodigo,float moviimporte, String tipocodigo) throws IllegalArgumentException, SQLException{
        
//        float cuensaldo = DBCuentas.obtenerSaldo(cuencodigo);
        Cuenta cuenta = (Cuenta)cuentas.obtener(cuencodigo);
        float cuensaldo = cuenta.getSaldo();
        if(tipocodigo.equalsIgnoreCase( "002") || tipocodigo.equalsIgnoreCase("004") ||
        tipocodigo.equalsIgnoreCase("006") || tipocodigo.equalsIgnoreCase("007") ||
        tipocodigo.equalsIgnoreCase("009") || tipocodigo.equalsIgnoreCase("010")  ){
            if(cuensaldo<moviimporte) throw new IllegalArgumentException("No hay suficiente saldo en la cuenta para realizar el movimiento");
        } 
        return true;
    }

    public static void agregar(String cuencodigo, int movinumero, Date fecha, String emplcodigo, String tipoCodigo, float importe, String cuenReferencia) throws IllegalArgumentException, SQLException {
        validarMovNumero(movinumero);
        String err = errMsg + "Creación | ";

        if (cuencodigo.length() > 8) throw new IllegalArgumentException(err + "El código de cuenta es demasiado largo (máx. 8 caracteres).");
        if (cuencodigo.isBlank()) throw new IllegalArgumentException(err + "El código de cuenta no puede estar vacío.");
        if (movinumero <= 0) throw new IllegalArgumentException(err + "El número de movimiento debe ser mayor que cero.");
        if (fecha == null) throw new IllegalArgumentException(errMsg + "La fecha no puede ser nula.");
        if (emplcodigo.length() > 4) throw new IllegalArgumentException(errMsg + "El ID del empleado es demasiado largo (máx. 4 caracteres).");
        if (emplcodigo.isBlank()) throw new IllegalArgumentException(errMsg + "El ID del empleado no puede estar vacío.");
        if (tipoCodigo.length() > 3) throw new IllegalArgumentException(errMsg + "El ID del tipo de movimiento es demasiado largo (máx. 3 caracteres).");
        if (tipoCodigo.isBlank()) throw new IllegalArgumentException(errMsg + "El ID del tipo de movimiento no puede estar vacío.");
        if (importe < 0) throw new IllegalArgumentException(errMsg + "El importe no puede ser negativo.");
        if (cuenReferencia.length() > 8) throw new IllegalArgumentException(errMsg + "La referencia de cuenta es demasiado larga (máx. 8 caracteres).");
        if (cuenReferencia.isBlank()) throw new IllegalArgumentException(errMsg + "La referencia de cuenta no puede estar vacía.");

        if(validarSaldo(cuencodigo, importe, tipoCodigo))
            movimientos.agregar(new Movimiento(cuencodigo, movinumero, fecha, emplcodigo, tipoCodigo, importe, cuenReferencia));
//            DBMovimiento.agregar(new Movimiento(cuencodigo, movinumero, fecha, emplcodigo, tipoCodigo, importe, cuenReferencia));
        
    }

    public static Movimiento obtener(int numero) throws IllegalArgumentException, SQLException{
        validarMovNumero(numero);
        return DBMovimiento.obtener(numero);
    }
    
    public static ArrayList<Movimiento> obtenerMovPorNumCuenta(String cuencodigo) throws IllegalArgumentException, SQLException{
        return (ArrayList<Movimiento>)movimientos.obtener(cuencodigo);
//        return DBMovimiento.obtenerMovPorNumCuenta(cuencodigo);
    }

    public static void modificarImporte(int moviNumero, float nuevoImporte) throws IllegalArgumentException, SQLException{
        validarMovNumero(moviNumero);
        if (nuevoImporte <= 0) throw new IllegalArgumentException(errMsg + "El nuevo importe debe ser mayor que cero.");
        DBMovimiento.modificarImporte( moviNumero,nuevoImporte);
    }

    public static void remover(int numero) throws SQLException{
        validarMovNumero(numero);
        DBMovimiento.remover(numero);
    }
    
    public static ArrayList<Movimiento> listar() throws SQLException{
        return DBMovimiento.listar();
    }
    
}
