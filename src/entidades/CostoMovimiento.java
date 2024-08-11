package entidades;

public class CostoMovimiento implements OperacionFinanciera {
    private String codigo = null;
    private float importe = -1;
    private int numMovimientos = - 1;

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public float getImporte() {
        return importe;
    }
    public void setImporte(float importe) {
        this.importe = importe;
    }

    public CostoMovimiento(String codigo, float importe) {
        this.codigo = codigo;
        this.importe = importe;
    }

    public CostoMovimiento(float importe){
        this.importe = importe;
    }

    public int getNumMovimientos() {
        return numMovimientos;
    }

    public void setNumMoviminetos(int numMovimientos) {
        this.numMovimientos = numMovimientos;
    }
    
    

    public CostoMovimiento(){}
    
    @Override
    public float calcularCosto() {
        if (getNumMovimientos() > 15) {
            return (getNumMovimientos() - 15) * getImporte();
        }
        return 0;
    }
}
