package validaciones;

import entidades.Moneda;
import listas.DBMonedas;

public class Monedas {

    private static Moneda moneda;

    public static String buscarMoneda(String codigo) {
        if (codigo == null || codigo.trim().length() != 2) {
            throw new IllegalArgumentException("Código no válido");
        }
        return DBMonedas.buscarMoneda(codigo);
    }

    public static Moneda obtenerMoneda(String codigo) {
        if (codigo == null || codigo.trim().length() != 2) {
            throw new IllegalArgumentException("Código no válido");
        }
        return DBMonedas.obtenerMoneda(codigo);
    }

    public static void actualizarMoneda(String codigo, String descripcion) {
        if (descripcion == null || descripcion.trim().length() <= 1 || descripcion.trim().length() > 20) {
            throw new IllegalArgumentException("Descripción no válida");
        }
        moneda = new Moneda(codigo, descripcion);
        String mensaje = DBMonedas.actualizarMoneda(moneda);
        if (mensaje == null) {
            mensaje = "Registro actualizado";
        }
    }


}
