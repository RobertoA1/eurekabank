/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones.basicas;

import entidades.Cuenta;
import entidades.Empleado;
import java.sql.Date;
import validaciones.Cuentas;
import validaciones.Empleados;
import validaciones.Movimientos;
import java.sql.SQLException;

/**
 *
 * @author Roberto
 */
public class Retiros {
    /* ESPECIAL: Código de Empleado para identificar operaciones por Intenet */
    private final static String CODIGO_EMPLEADO_INTERNET = "9999";
    
    /* Codigo de operación de depósito */
    private final static String CODIGO_RETIRO = "002";
    
    private static Date obtenerFechaActual(){
        return new Date(System.currentTimeMillis());
    }
    
    public static void retirar(String codigoCuenta, float cantidad, String codigoEmpleado) throws IllegalArgumentException, SQLException{
        Cuenta cuenta = Cuentas.obtener(codigoCuenta);
        Empleado empleado = Empleados.obtener(codigoCuenta);
        
        Cuentas.modificar_saldo(codigoCuenta, cuenta.getSaldo() + cantidad);
        Movimientos.agregar(codigoCuenta, Movimientos.generarCodigo(), obtenerFechaActual(), codigoEmpleado, 
                CODIGO_RETIRO, cantidad, "");
    }
}
