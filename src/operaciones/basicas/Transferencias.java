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
public class Transferencias {
    /* ESPECIAL: Código de Empleado para identificar operaciones por Intenet */
    private final static String CODIGO_EMPLEADO_INTERNET = "9999";
    
    /* Codigo de operación de depósito */
    private final static String CODIGO_TRANSFERENCIA_ENTRANTE = "003";
    private final static String CODIGO_TRANSFERENCIA_SALIENTE = "004";
    
    private static Date obtenerFechaActual(){
        return new Date(System.currentTimeMillis());
    }
    
    public static void transferir(String codigoCuentaEmisora, String codigoCuentaReceptora, float cantidad, String codigoEmpleado) throws IllegalArgumentException, SQLException{
        Cuenta cuentaEmisora = Cuentas.obtener(codigoCuentaEmisora);
        Cuenta cuentaReceptora = Cuentas.obtener(codigoCuentaReceptora);
        Empleado empleado = Empleados.obtener(codigoEmpleado);
        
        Cuentas.modificar_saldo(codigoCuentaEmisora, cuentaEmisora.getSaldo() - cantidad);
        Cuentas.modificar_saldo(codigoCuentaReceptora, cuentaReceptora.getSaldo() + cantidad);
        Movimientos.agregar(codigoCuentaEmisora, Movimientos.generarCodigo(), obtenerFechaActual(), codigoEmpleado, 
                CODIGO_TRANSFERENCIA_SALIENTE, cantidad, codigoCuentaReceptora);
        Movimientos.agregar(codigoCuentaReceptora, Movimientos.generarCodigo(), obtenerFechaActual(), codigoEmpleado, 
                CODIGO_TRANSFERENCIA_ENTRANTE, cantidad, codigoCuentaEmisora);
    }
}
