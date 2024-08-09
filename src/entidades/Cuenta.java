package entidades;

import java.sql.Date;

public class Cuenta {
    private final String codigo;
    private final String codigoMoneda;
    private final String codigoSucursal;
    private final String codigoCliente;
    private final float saldo;
    private final Date fechaCreacion;
    private final int cantidadMovimientos;
    private final String clave;

    private Cuenta(CuentaBuilder builder){
        this.codigo = builder.codigo;
        this.codigoMoneda = builder.codigoMoneda;
        this.codigoSucursal = builder.codigoSucursal;
        this.codigoCliente = builder.codigoCliente;
        this.saldo = builder.saldo;
        this.fechaCreacion = builder.fechaCreacion;
        this.cantidadMovimientos = builder.cantidadMovimientos;
        this.clave = builder.clave;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCodigoMoneda() {
        return codigoMoneda;
    }

    public String getCodigoSucursal() {
        return codigoSucursal;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public int getCantidadMovimientos() {
        return cantidadMovimientos;
    }

    public String getClaveCuenta() {
        return clave;
    }

    public static CuentaBuilder builder(){
        return new CuentaBuilder();
    }

    public static class CuentaBuilder {
        private String codigo;
        private String codigoMoneda;
        private String codigoSucursal;
        private String codigoCliente;
        private float saldo;
        private Date fechaCreacion;
        private int cantidadMovimientos;
        private String clave;
        
        public CuentaBuilder codigo(String codigo){
            this.codigo = codigo;
            return this;
        }

        public CuentaBuilder codigoMoneda(String codigoMoneda){
            this.codigoMoneda = codigoMoneda;
            return this;
        }
        
        public CuentaBuilder codigoSucursal(String codigoSucursal){
            this.codigoSucursal = codigoSucursal;
            return this;
        }

        public CuentaBuilder codigoCliente(String codigoCliente){
            this.codigoCliente = codigoCliente;
            return this;
        }

        public CuentaBuilder saldo(float saldo){
            this.saldo = saldo;
            return this;
        }

        public CuentaBuilder fechaCreacion(Date fechaCreacion){
            this.fechaCreacion = fechaCreacion;
            return this;
        }

        public CuentaBuilder cantidadMovimientos(int cantidadMovimientos){
            this.cantidadMovimientos = cantidadMovimientos;
            return this;
        }

        public CuentaBuilder clave(String clave){
            this.clave = clave;
            return this;
        }

        public CuentaBuilder reiniciar(){
            return new CuentaBuilder();
        }

        public Cuenta build(){
            return new Cuenta(this);
        }
    }
}
