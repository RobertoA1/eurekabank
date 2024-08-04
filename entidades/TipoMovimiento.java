package entidades;

public class TipoMovimiento {
    private String codigo = null;
    private String descripcion = null;
    private String accion = null; 
    private String estado = null; 

    public TipoMovimiento(String codigo, String descripcion, String accion, String estado) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.accion = accion;
        this.estado = estado;
    }

    public TipoMovimiento() {
    }

    public TipoMovimiento(String descripcion, String accion, String estado) {
        this.descripcion = descripcion;
        this.accion = accion;
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
