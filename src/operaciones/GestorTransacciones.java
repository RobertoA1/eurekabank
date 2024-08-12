/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

import entidades.Cuenta;
import entidades.Empleado;
import java.sql.SQLException;
import operaciones.basicas.*;
import operaciones.rutina.*;
import validaciones.Cuentas;
import validaciones.Empleados;
import validaciones.Monedas;
import validaciones.Movimientos;

public class GestorTransacciones {
    
    private final static String err = "Error en el Gestor de Transacciones: ";
    
    public static void depositar(String codigoCuenta, float cantidad, String codigoEmpleado) throws IllegalArgumentException, SQLException{
        Cuenta cuenta = Cuentas.obtener(codigoCuenta);
        Empleado empleado = Empleados.obtener(codigoCuenta);
        
        if (cantidad < 0) throw new IllegalArgumentException(err + "La cantidad a depositar no puede ser negativa.");
        
        Depositos.depositar(codigoCuenta, cantidad, codigoEmpleado);
        Cobros.realizarCobroMovimiento(codigoCuenta, codigoEmpleado);
    }
    
    public static void transferir(String codigoCuentaEmisora, String codigoCuentaReceptora, float cantidad, String codigoEmpleado) throws IllegalArgumentException, SQLException{
        Cuenta cuentaEmisora = Cuentas.obtener(codigoCuentaEmisora);
        Cuenta cuentaReceptora = Cuentas.obtener(codigoCuentaReceptora);
        Empleado empleado = Empleados.obtener(codigoEmpleado);
        
        if (cantidad < 0) throw new IllegalArgumentException(err + "La cantidad a transferir no puede ser negativa.");
        if (cantidad > cuentaEmisora.getSaldo()) throw new IllegalArgumentException(err + "La cantidad a transferir no puede ser mayor al saldo disponible en la cuenta emisora.");
        
        float cantidadDescontada = cantidad - Cobros.calcularCobroMovimiento(cuentaEmisora.getCantidadMovimientos(), Monedas.obtener(cuentaEmisora.getCodigoMoneda()).getDescripcion());
        Transferencias.transferir(codigoCuentaEmisora, codigoCuentaReceptora, cantidadDescontada, codigoEmpleado);
        Cobros.realizarCobroMovimiento(codigoCuentaEmisora, codigoEmpleado);
        Cobros.realizarCobroImpuestoITF(codigoCuentaReceptora, codigoEmpleado, cantidad);
    }
    
    public static void retirar(String codigoCuenta, float cantidad, String codigoEmpleado) throws IllegalArgumentException, SQLException{
        Cuenta cuenta = Cuentas.obtener(codigoCuenta);
        Empleado empleado = Empleados.obtener(codigoCuenta);
        
        if (cantidad < 0) throw new IllegalArgumentException(err + "La cantidad a retirar no puede ser negativa.");
        if (cantidad > cuenta.getSaldo()) throw new IllegalArgumentException(err + "La cantidad a retirar no puede ser mayor al saldo disponible en la cuenta.");
        
        Retiros.retirar(codigoCuenta, cantidad, codigoEmpleado);
    }
    
}
