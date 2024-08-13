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
public class Retiros implements Transaccion{
    /* ESPECIAL: Código de Empleado para identificar operaciones por Intenet */
    private final static String CODIGO_EMPLEADO_INTERNET = "9999";
    
    /* Codigo de operación de depósito */
    private final static String CODIGO_RETIRO = "002";
    
    private Cuenta cuenta = null;
    private Empleado empleado = null;
    private float cantidad = 0;
    
    private static Date obtenerFechaActual(){
        return new Date(System.currentTimeMillis());
    }
    
    public void preparar(String codigoCuenta, float cantidad, String codigoEmpleado) throws IllegalArgumentException, SQLException{
        cuenta = Cuentas.obtener(codigoCuenta);
        empleado = Empleados.obtener(codigoEmpleado);
        this.cantidad = cantidad;
    }
    
    public void ejecutar() throws IllegalArgumentException, SQLException{
        Cuentas.modificar_saldo(cuenta.getCodigo(), cuenta.getSaldo() - cantidad);
        Movimientos.agregar(cuenta.getCodigo(), Movimientos.generarCodigo(), obtenerFechaActual(), empleado.getCodigo(), 
                CODIGO_RETIRO, cantidad, "");
    }
    
    public void restablecer(){
        cuenta = null;
        empleado = null;
        cantidad = 0;
    }
}
