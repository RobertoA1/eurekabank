package entidades;

public class Usuario {
    private String codigo;
    private String clave;

    public Usuario(){
        this(null, null);
    }


    public Usuario(String codigo, String clave) {
        this.codigo = codigo;
        this.clave = clave;
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

    
}
