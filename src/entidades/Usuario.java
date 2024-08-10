package entidades;

public class Usuario {
    private String codigo = null;
    private String clave = null;
    private int nivelPermisos = -1;

    public Usuario(){
        this(null, null, -1);
    }

    public Usuario(String codigo, String clave, int nivelPermisos) {
        this.codigo = codigo;
        this.clave = clave;
        this.nivelPermisos = nivelPermisos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getNivelPermisos(){
        return nivelPermisos;
    }

    public void setNivelPermisos(int nivelPermisos){
        this.nivelPermisos = nivelPermisos;
    }
}
