package entidades;

public class Empleado {
    private String codigo = null;
    private String nombre = null;
    private String apellidoPaterno = null;
    private String apellidoMaterno = null;
    private String ciudad = null;
    private String direccion = null;
    private String idUsuario = null;
    
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    public Empleado(String codigo, String nombre, String apellidoPaterno, String apellidoMaterno, String ciudad,
            String direccion, String idUsuario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.idUsuario = idUsuario;
    }

    public Empleado(String nombre, String apellidoPaterno, String apellidoMaterno, String ciudad, String direccion,
            String idUsuario) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.idUsuario = idUsuario;
    }

    public Empleado() {}
}
