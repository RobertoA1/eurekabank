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
public class Transferencias implements Transaccion{
    /* ESPECIAL: Código de Empleado para identificar operaciones por Intenet */
    private final static String CODIGO_EMPLEADO_INTERNET = "9999";
    
    /* Codigo de operación de depósito */
    private final static String CODIGO_TRANSFERENCIA_ENTRANTE = "003";
    private final static String CODIGO_TRANSFERENCIA_SALIENTE = "004";
    
    private Cuenta cuentaEmisora = null;
    private Cuenta cuentaReceptora = null;
    private Empleado empleado = null;
    private float cantidad = 0;
    
    private static Date obtenerFechaActual(){
        return new Date(System.currentTimeMillis());
    }
    
    public void preparar(String codigoCuentaEmisora, String codigoCuentaReceptora, float cantidad, String codigoEmpleado) throws IllegalArgumentException, SQLException{
        cuentaEmisora = Cuentas.obtener(codigoCuentaEmisora);
        cuentaReceptora = Cuentas.obtener(codigoCuentaReceptora);
        empleado = Empleados.obtener(codigoEmpleado);
        this.cantidad = cantidad;
    }
    
    public void ejecutar() throws IllegalArgumentException, SQLException{
        Cuentas.modificar_saldo(cuentaEmisora.getCodigo(), cuentaEmisora.getSaldo() - cantidad);
        Cuentas.modificar_saldo(cuentaReceptora.getCodigo(), cuentaReceptora.getSaldo() + cantidad);
        Movimientos.agregar(cuentaEmisora.getCodigo(), Movimientos.generarCodigo(), obtenerFechaActual(), empleado.getCodigo(), 
                CODIGO_TRANSFERENCIA_SALIENTE, cantidad, cuentaReceptora.getCodigo());
        Movimientos.agregar(cuentaReceptora.getCodigo(), Movimientos.generarCodigo(), obtenerFechaActual(), empleado.getCodigo(), 
                CODIGO_TRANSFERENCIA_ENTRANTE, cantidad, cuentaEmisora.getCodigo());
    }
    
    public void restablecer(){
        cuentaEmisora = null;
        cuentaReceptora = null;
        empleado = null;
        cantidad = 0;
    }
}
