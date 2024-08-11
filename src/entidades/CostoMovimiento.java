package entidades;

public class CostoMovimiento {
    private String codigo = null;
    private float importe = -1;

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

    public CostoMovimiento(){}
}
