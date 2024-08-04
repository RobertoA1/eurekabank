package entidades;

public class InteresMensual {
    
    private String codigoMoneda;
    private float importe;
    
    public InteresMensual() {
        this("00", 0.0f);
    }

    public InteresMensual(String codigoMoneda, float importe) {
        this.codigoMoneda = codigoMoneda;
        this.importe = importe;
    }


    public String getCodigoMoneda() {
        return codigoMoneda;
    }

    public void setCodigoMoneda(String codigoMoneda) {
        this.codigoMoneda = codigoMoneda;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }



    

}
