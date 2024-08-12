/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones.rutina;

import entidades.Cuenta;
import entidades.Empleado;
import validaciones.Cuentas;
import validaciones.Monedas;
import java.sql.SQLException;
import validaciones.Movimientos;
import java.sql.Date;
import validaciones.Empleados;

/**
 *
 * @author Roberto
 */
public class Cobros {
    
    /* ESPECIAL: Código de Empleado para identificar operaciones por Intenet */
    private final static String CODIGO_EMPLEADO_INTERNET = "9999";
    
    /* Códigos de las operaciones */
    private final static String CODIGO_CARGO_MANTENIMIENTO = "020";
    private final static String CODIGO_CARGO_MOVIMIENTO = "021";
    private final static String CODIGO_CARGO_ITF = "022";
    
    /* Cargos por mantenimiento */
    private final static float CARGO_MANTENIMIENTO_DOLARES = 2.50f;
    private final static float CARGO_MANTENIMIENTO_SOLES = 7;
    
    /* Cargos por movimiento */
    private final static float CARGO_MOVIMIENTO_SOLES = 2;
    private final static float CARGO_MOVIMIENTO_DOLARES = 0.60f;
    
    /* Tasa del impuesto ITF */
    private final static float TASA_IMPUESTO_ITF = 0.0008f;
    
    private static Date obtenerFechaActual(){
        return new Date(System.currentTimeMillis());
    }
    
    /* Cálculo de la cantidad a cobrar */
    public static float calcularCobroMantenimiento(float saldo, String moneda){
        float descuento = 0;
        if (saldo <= 3500 && moneda.equalsIgnoreCase("Sol Peruano")){
            descuento = CARGO_MANTENIMIENTO_SOLES;
        } else if (saldo <= 1200 && moneda.equalsIgnoreCase("dolar")){
            descuento = CARGO_MANTENIMIENTO_DOLARES;
        }
        return descuento;
    }
    
    public static float calcularCobroMovimiento(int cantidadMovimientos, String moneda){
        float descuento = 0;
        if (cantidadMovimientos > 15 && moneda.equalsIgnoreCase("Sol Peruano")) descuento = CARGO_MOVIMIENTO_SOLES;
        if (cantidadMovimientos > 15 && moneda.equalsIgnoreCase("Dolar")) descuento = CARGO_MOVIMIENTO_DOLARES;
        return descuento;
    }
    
    public static float calcularCobroImpuestoITF(float monto){
        return TASA_IMPUESTO_ITF*monto;
    }
    
    /* Métodos encargados de cobrar los montos */
    public static void realizarCobroMantenimiento(String codigoCuenta, String codigoEmpleado) throws SQLException{
        Empleado empleado = Empleados.obtener(codigoEmpleado);
        Cuenta cuenta = Cuentas.obtener(codigoCuenta);
        float descuento = calcularCobroMantenimiento(cuenta.getSaldo(), Monedas.obtener(cuenta.getCodigoMoneda()).getDescripcion());
        
        Cuentas.modificar_saldo(codigoCuenta, cuenta.getSaldo() - descuento);
        Movimientos.agregar(codigoCuenta, Movimientos.generarCodigo(), obtenerFechaActual(), codigoEmpleado, 
                CODIGO_CARGO_MANTENIMIENTO, descuento, "");
    }
    
    public static void realizarCobroMovimiento(String codigoCuenta, String codigoEmpleado) throws SQLException{
        Empleado empleado = Empleados.obtener(codigoEmpleado);
        Cuenta cuenta = Cuentas.obtener(codigoCuenta);
        float descuento = calcularCobroMovimiento(cuenta.getCantidadMovimientos(), Monedas.obtener(cuenta.getCodigoMoneda()).getDescripcion());
        
        /* En caso de que sea una operación por internet */
        if (codigoEmpleado.equalsIgnoreCase(CODIGO_EMPLEADO_INTERNET)) descuento = 0;
        
        Cuentas.modificar_saldo(codigoCuenta, cuenta.getSaldo() - descuento);
        Movimientos.agregar(codigoCuenta, Movimientos.generarCodigo(), obtenerFechaActual(), codigoEmpleado, 
                CODIGO_CARGO_MOVIMIENTO, descuento, "");
    }
    
    public static void realizarCobroImpuestoITF(String codigoCuenta, String codigoEmpleado, float montoMovimiento) throws SQLException {
        Empleado empleado = Empleados.obtener(codigoEmpleado);
        Cuenta cuenta = Cuentas.obtener(codigoCuenta);
        float descuento = calcularCobroImpuestoITF(montoMovimiento);
        Cuentas.modificar_saldo(codigoCuenta, cuenta.getSaldo() - descuento);
        Movimientos.agregar(codigoCuenta, Movimientos.generarCodigo(), obtenerFechaActual(), codigoEmpleado, 
                CODIGO_CARGO_ITF, descuento, "");
    }
   
}
