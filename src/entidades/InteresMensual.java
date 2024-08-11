package entidades;

public class InteresMensual implements OperacionFinanciera{
    
    private String codigoMoneda = null;
    private float tasaInteres = -1;//0.70% soles,  0.60% dolares
    private float cuenSaldo = -1;
    
    public InteresMensual() {
    }

    public InteresMensual(String codigoMoneda, float tasaInteres, float cuenSaldo) {
        this.codigoMoneda = codigoMoneda;
        this.tasaInteres = tasaInteres;
        this.cuenSaldo = cuenSaldo;
    }


    public String getCodigoMoneda() {
        return codigoMoneda;
    }

    public void setCodigoMoneda(String codigoMoneda) {
        this.codigoMoneda = codigoMoneda;
    }

    public float getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(float tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public float getCuenSaldo() {
        return cuenSaldo;
    }

    public void setCuenSaldo(float cuenSaldo) {
        this.cuenSaldo = cuenSaldo;
    }
    
    
    @Override
    public float calcularCosto() {
        return getCuenSaldo() * getTasaInteres();
    }

}
