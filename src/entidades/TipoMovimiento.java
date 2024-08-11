package entidades;

public class TipoMovimiento {
    private String codigo = null;
    private String descripcion = null;
    private String accion = null; 
    private int estado = 1;

    public TipoMovimiento(String codigo, String descripcion, String accion, int estado) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.accion = accion;
        this.estado = estado;
    }

    public TipoMovimiento() {
    }

    public TipoMovimiento(String descripcion, String accion, int estado) {
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

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
