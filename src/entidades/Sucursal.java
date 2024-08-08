package entidades;

public class Sucursal{

    private String codigo = null;
    private String nombre = null;
    private String ciudad = null;
    private String direccion = null;
    private int contCuenta = 0;
    private int estado = 1;

    public Sucursal(){
    }

    public Sucursal(String codigo, String nombre, String ciudad, String direccion, int contCuenta) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.contCuenta = contCuenta;
    }

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

    public int getContCuenta() {
        return contCuenta;
    }

    public void setContCuenta(int contCuenta) {
        this.contCuenta = contCuenta;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
 
}