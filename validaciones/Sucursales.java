package validaciones;

import entidades.*;
import listas.DBSucursales;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;


public class Sucursales {
    private static Sucursal sucursal;
    
    public static int insertarSucursal(String codigo, String nombre, String ciudad, String direccion, int contCuenta) {
        String mensaje;
        if(codigo.trim().length() == 3 && nombre.trim().length() > 0 && nombre.trim().length() <= 50 &&
           ciudad.trim().length() > 0 && ciudad.trim().length() <= 30 &&
           direccion.trim().length() > 0 && direccion.trim().length() <= 50) {
            
            if(buscarSucursal(codigo) == null) {                
                sucursal = new Sucursal(codigo, nombre, ciudad, direccion, contCuenta);
                mensaje = DBSucursales.insertarSucursal(sucursal);
                if(mensaje == null) {
                    showMessageDialog(null, "Registro insertado", "Resultado", 1);
                    return 0;
                } else {
                    showMessageDialog(null, mensaje, "Error", 0);
                    return 1;
                }
            } else {
                showMessageDialog(null, "Codigo ya existe", "Error", 0);
                return 2;
            }
        } else {
            showMessageDialog(null, "Datos no validos", "Error", 0);
            return 3;
        }
    }
    
    public static String buscarSucursal(String codigo) {
        if(codigo.trim().length() == 3)
            return DBSucursales.buscarSucursal(codigo);
        else
            return null;
    }
    
    public static ArrayList<Sucursal> listarSucursales() {
        return DBSucursales.listarSucursales();
    }
    
    public static String actualizarSucursal(String codigo, String nombre, String ciudad, String direccion, int contCuenta) {
        String mensaje;
        if(nombre.trim().length() > 0 && nombre.trim().length() <= 50 &&
           ciudad.trim().length() > 0 && ciudad.trim().length() <= 30 &&
           direccion.trim().length() > 0 && direccion.trim().length() <= 50) {
            
            sucursal = new Sucursal(codigo, nombre, ciudad, direccion, contCuenta);
            mensaje = DBSucursales.actualizarSucursal(sucursal);
            if(mensaje == null)
                mensaje = "Registro actualizado";                
        } else
            mensaje = "Datos no válidos";
        return mensaje;        
    }
    
    public static Sucursal obtenerSucursal(String codigo) {
        if(codigo.trim().length() == 3) {
            sucursal = DBSucursales.obtenerSucursal(codigo);
            return sucursal;
        } else
            return null;
    }
    
    public static String eliminarSucursal(String codigo){
        String mensaje;
        mensaje = DBSucursales.eliminarSucursal(codigo);
        if(mensaje == null)
            mensaje = "Registro eliminado";
        return mensaje;      
    }
}
