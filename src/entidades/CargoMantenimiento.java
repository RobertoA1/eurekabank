package entidades;

public class CargoMantenimiento implements OperacionFinanciera {
    
    private String codigoMoneda = null;
    private float montoMaximo = -1; // 3500 soles, 1200 dolares
    private float importe = -1;  //7.00 soles, 2.50 dolares
    private float cuenSaldo =-1;
    
    public CargoMantenimiento() {

    }    

   
    
    public CargoMantenimiento(String codigoMoneda, float montoMaximo, float importe, float cuenSaldo) {
        this.codigoMoneda = codigoMoneda;
        this.montoMaximo = montoMaximo;
        this.importe = importe;
        this.cuenSaldo = cuenSaldo;
    }
    
    public String getCodigoMoneda() {
        return codigoMoneda;
    }
    public void setCodigoMoneda(String codigoMoneda) {
        this.codigoMoneda = codigoMoneda;
    }
    public float getMontoMaximo() {
        return montoMaximo;
    }
    public void setMontoMaximo(float montoMaximo) {
        this.montoMaximo = montoMaximo;
    }
    public float getImporte() {
        return importe;
    }
    public void setImporte(float importe) {
        this.importe = importe;
    }

    public float getCuenSaldo() {
        return cuenSaldo;
    }

    public void setCuenSaldo(float cuenSaldo) {
        this.cuenSaldo = cuenSaldo;
    }
    
    @Override
    public float calcularCosto() {
        if(getCuenSaldo() <= getMontoMaximo())
            return 0;
        return getImporte();
    }

}
