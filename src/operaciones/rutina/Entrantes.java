/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones.rutina;

import entidades.Cuenta;
import entidades.Empleado;
import java.sql.Date;
import static operaciones.rutina.Cobros.calcularCobroMantenimiento;
import validaciones.Cuentas;
import validaciones.Empleados;
import validaciones.Monedas;
import validaciones.Movimientos;
import java.sql.SQLException;

/**
 *
 * @author Roberto
 */
public class Entrantes {
    /* Codigos de movimientos */
    private final static String CODIGO_INTERES_MENSUAL = "010";
    
    /* Tasas de ganancia por moneda de cuenta */
    private final static float TASA_INTERES_SOLES = 0.07f;
    private final static float TASA_INTERES_DOLARES = 0.06f;
    
    private static Date obtenerFechaActual(){
        return new Date(System.currentTimeMillis());
    }
    
    /* Cálculo de pagos a favor del cliente */ 
    public static float calcularInteresCuenta(float saldo, String moneda){
        float ganancia = 0;
        if (moneda.equalsIgnoreCase("Sol Peruano")){
            ganancia = TASA_INTERES_SOLES*saldo;
        } else if (moneda.equalsIgnoreCase("dolar")){
            ganancia = TASA_INTERES_DOLARES*saldo;
        }
        return ganancia;
    }
    
    /* Realización de pagos */
    public static void realizarPagoInteresCuenta(String codigoCuenta, String codigoEmpleado) throws IllegalArgumentException, SQLException{
        Empleado empleado = Empleados.obtener(codigoEmpleado);
        Cuenta cuenta = Cuentas.obtener(codigoCuenta);
        float ganancia = calcularInteresCuenta(cuenta.getSaldo(), Monedas.obtener(cuenta.getCodigoMoneda()).getDescripcion());
        Cuentas.modificar_saldo(codigoCuenta, cuenta.getSaldo() + ganancia);
        Movimientos.agregar(codigoCuenta, Movimientos.generarCodigo(), obtenerFechaActual(), codigoEmpleado, 
                CODIGO_INTERES_MENSUAL, ganancia, "");
    }
}
