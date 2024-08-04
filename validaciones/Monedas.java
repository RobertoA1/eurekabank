package validaciones;

import entidades.Moneda;
import listas.DBMonedas;

public class Monedas {

    private static Moneda moneda;

    public static String buscarMoneda(String codigo) {
        if(codigo.trim().length()==2)
            return DBMonedas.buscarMoneda(codigo);
        else
            return null;
    }


    public static Moneda obtenerMoneda(String codigo) {
        if(codigo.trim().length()==2) {
            moneda = DBMonedas.obtenerMoneda(codigo);
            return moneda;
        } else
            return null;
    }

    public static String actualizarMoneda(String codigo, String descripcion) {
        String mensaje;
        if(descripcion.trim().length()>1 && descripcion.trim().length()<=20) {
            moneda = new Moneda(codigo, descripcion);
            mensaje = DBMonedas.actualizarMoneda(moneda);
            if(mensaje == null)
                mensaje = "Registro actualizado";                
        } else
            mensaje = "Descripción no válida";
        return mensaje;        
    }


}
