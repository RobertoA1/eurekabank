/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

import operaciones.basicas.ListaTransacciones;
import entidades.Cuenta;
import entidades.Empleado;
import java.sql.SQLException;
import operaciones.basicas.*;
import operaciones.rutina.*;
import validaciones.Cuentas;
import validaciones.Empleados;
import validaciones.Monedas;

public class GestorTransacciones {
    
    private final static String err = "Error en el Gestor de Transacciones: ";
    
    public static void depositar(String codigoCuenta, float cantidad, String codigoEmpleado) throws IllegalArgumentException, SQLException{
        Cuenta cuenta = Cuentas.obtener(codigoCuenta);
        Empleado empleado = Empleados.obtener(codigoEmpleado);
        
        if (cantidad < 0) throw new IllegalArgumentException(err + "La cantidad a depositar no puede ser negativa.");
        
        ListaTransacciones lista = new ListaTransacciones();
        Depositos deposito = new Depositos();
        deposito.preparar(codigoCuenta, cantidad, codigoEmpleado);
        lista.añadir(deposito);
        lista.ejecutar();
        
        Cobros.realizarCobroMovimiento(codigoCuenta, codigoEmpleado);
    }
    
    public static void transferir(String codigoCuentaEmisora, String codigoCuentaReceptora, float cantidad, String codigoEmpleado) throws IllegalArgumentException, SQLException{
        Cuenta cuentaEmisora = Cuentas.obtener(codigoCuentaEmisora);
        Cuenta cuentaReceptora = Cuentas.obtener(codigoCuentaReceptora);
        Empleado empleado = Empleados.obtener(codigoEmpleado);
        
        if (cantidad < 0) throw new IllegalArgumentException(err + "La cantidad a transferir no puede ser negativa.");
        if (cantidad > cuentaEmisora.getSaldo()) throw new IllegalArgumentException(err + "La cantidad a transferir no puede ser mayor al saldo disponible en la cuenta emisora.");
        
        float cantidadDescontada;
        if (codigoEmpleado.equals("9999")) cantidadDescontada = cantidad;
        else cantidadDescontada = cantidad - Cobros.calcularCobroMovimiento(cuentaEmisora.getCantidadMovimientos(), Monedas.obtener(cuentaEmisora.getCodigoMoneda()).getDescripcion());
        
        ListaTransacciones lista = new ListaTransacciones();
        Transferencias transferencia = new Transferencias();
        transferencia.preparar(codigoCuentaEmisora, codigoCuentaReceptora, cantidadDescontada, codigoEmpleado);
        lista.añadir(transferencia);
        lista.ejecutar();
        
        Cobros.realizarCobroMovimiento(codigoCuentaEmisora, codigoEmpleado);
        Cobros.realizarCobroImpuestoITF(codigoCuentaReceptora, codigoEmpleado, cantidad);
    }
    
    public static void retirar(String codigoCuenta, float cantidad, String codigoEmpleado) throws IllegalArgumentException, SQLException{
        Cuenta cuenta = Cuentas.obtener(codigoCuenta);
        Empleado empleado = Empleados.obtener(codigoEmpleado);
        
        if (cantidad < 0) throw new IllegalArgumentException(err + "La cantidad a retirar no puede ser negativa.");
        if (cantidad > cuenta.getSaldo()) throw new IllegalArgumentException(err + "La cantidad a retirar no puede ser mayor al saldo disponible en la cuenta.");
        
        ListaTransacciones lista = new ListaTransacciones();
        Retiros retiro = new Retiros();
        retiro.preparar(codigoCuenta, cantidad, codigoEmpleado);
        lista.añadir(retiro);
        lista.ejecutar();
        
        Cobros.realizarCobroMovimiento(codigoCuenta, codigoEmpleado);
    }
    
}
