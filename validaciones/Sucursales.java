package validaciones;

import entidades.*;
import listas.DBSucursales;
import java.util.*;

public class Sucursales {
    private static Sucursal sucursal;
    
    public static void insertarSucursal(String codigo, String nombre, String ciudad, String direccion, int contCuenta) {
        if (codigo == null || codigo.trim().length() != 3) {
            throw new IllegalArgumentException("Código no válido");
        }
        if (nombre == null || nombre.trim().length() <= 0 || nombre.trim().length() > 50) {
            throw new IllegalArgumentException("Nombre no válido");
        }
        if (ciudad == null || ciudad.trim().length() <= 0 || ciudad.trim().length() > 30) {
            throw new IllegalArgumentException("Ciudad no válida");
        }
        if (direccion == null || direccion.trim().length() <= 0 || direccion.trim().length() > 50) {
            throw new IllegalArgumentException("Dirección no válida");
        }
        if (contCuenta <= 0) {
            throw new IllegalArgumentException("Cantidad de cuentas debe ser mayor que 0");
        }    

        if (buscarSucursal(codigo) == null) {                
            sucursal = new Sucursal(codigo, nombre, ciudad, direccion, contCuenta);
            String mensaje = DBSucursales.insertarSucursal(sucursal);
            if (mensaje != null) {
                throw new IllegalArgumentException(mensaje);
            }
        } else {
            throw new IllegalArgumentException("Código ya existe");
        }
    }
    
    public static String buscarSucursal(String codigo) {
        if (codigo == null || codigo.trim().length() != 3) {
            throw new IllegalArgumentException("Código no válido");
        }
        return DBSucursales.buscarSucursal(codigo);
    }
    
    public static ArrayList<Sucursal> listarSucursales() {
        return DBSucursales.listarSucursales();
    }
    
    public static void actualizarSucursal(String codigo, String nombre, String ciudad, String direccion, int contCuenta) {
        if (nombre == null || nombre.trim().length() <= 0 || nombre.trim().length() > 50) {
            throw new IllegalArgumentException("Nombre no válido");
        }
        if (ciudad == null || ciudad.trim().length() <= 0 || ciudad.trim().length() > 30) {
            throw new IllegalArgumentException("Ciudad no válida");
        }
        if (direccion == null || direccion.trim().length() <= 0 || direccion.trim().length() > 50) {
            throw new IllegalArgumentException("Dirección no válida");
        }

        sucursal = new Sucursal(codigo, nombre, ciudad, direccion, contCuenta);
        String mensaje = DBSucursales.actualizarSucursal(sucursal);
        if (mensaje != null) {
            throw new IllegalArgumentException(mensaje);
        }
    }
    
    public static Sucursal obtenerSucursal(String codigo) {
        if (codigo == null || codigo.trim().length() != 3) {
            throw new IllegalArgumentException("Código no válido");
        }
        return DBSucursales.obtenerSucursal(codigo);
    }
    
    public static void eliminarSucursal(String codigo) {
        String mensaje = DBSucursales.eliminarSucursal(codigo);
        if (mensaje != null) {
            throw new IllegalArgumentException(mensaje);
        }
    }
}