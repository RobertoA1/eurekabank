package entidades;

public class CargoMantenimiento {
    
    private String codigoMoneda;
    private float montoMaximo;
    private float importe;
    
    public CargoMantenimiento() {
        this("00", 0.0f, 0.0f);
    }
    
    public CargoMantenimiento(String codigoMoneda, float montoMaximo, float importe) {
        this.codigoMoneda = codigoMoneda;
        this.montoMaximo = montoMaximo;
        this.importe = importe;
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

}
