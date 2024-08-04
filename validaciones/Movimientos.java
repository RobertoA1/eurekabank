package validaciones;

import java.sql.*;

import listas.*;
import entidades.*;

public class Movimientos {
    private static String errMsg = "Error en movimiento: ";

    private static void validarMovNumero(int numero) throws IllegalArgumentException {
        if (numero <= 0) throw new IllegalArgumentException(errMsg + "El número debe ser mayor que cero.");
    }

    public static Movimiento obtener(int numero) throws IllegalArgumentException, SQLException{
        validarMovNumero(numero);
        return DBMovimiento.obtener(numero);
    }

    public static void modificarImporte(int moviNumero, float nuevoImporte) throws IllegalArgumentException, SQLException{
        validarMovNumero(moviNumero);
        if (nuevoImporte <= 0) throw new IllegalArgumentException(errMsg + "El nuevo importe debe ser mayor que cero.");
        DBMovimiento.modificarImporte( moviNumero,nuevoImporte);
    }
}
