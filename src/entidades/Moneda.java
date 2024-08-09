package entidades;

public class Moneda {
    
    private String codigo = null;
    private String descripcion = null;
    private int estado = 1;

    public Moneda() {
    }

    public Moneda(String codigo, String descripcion){
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    

}
