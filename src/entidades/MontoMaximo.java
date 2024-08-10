package entidades;

public class MontoMaximo {
    
    private String codigo = null;
    private int importe = -1;

    public MontoMaximo() {
    }

    public MontoMaximo(String codigo, int importe){
        this.codigo = codigo;
        this.importe = importe;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }
    
    
    
    
    
}
