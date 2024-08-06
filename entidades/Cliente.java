package entidades;

public class Cliente{
    private String codigo = null;
    private String apellidoPaterno = null;
    private String apellidoMaterno = null;
    private String nombre = null;
    private String dni = null;
    private String ciudad = null;
    private String direccion = null;
    private String telefono = null;
    private String email = null;
    private String idUsuario = null;

    public Cliente(String codigo, String nombre, String apellidoPaterno, String apellidoMaterno,String dni, String ciudad,String direccion,String telefono,String email, String idUsuario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.dni = dni;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.idUsuario = idUsuario;
    }

    public Cliente(String nombre, String apellidoPaterno, String apellidoMaterno,String dni, String ciudad,String direccion,String telefono,String email, String idUsuario) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.dni = dni;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.idUsuario = idUsuario;
    }

    public Cliente (){}

    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo=codigo;
    }
    public String getApellidoPaterno(){
        return apellidoPaterno;
    }
    public void setApellidoPaterno(String apellidoPaterno){
        this.apellidoPaterno=apellidoPaterno;
    }
    public String getApellidoMaterno(){
        return apellidoMaterno;
    }
    public void setApellidoMaterno(String apellidoMaterno){
        this.apellidoMaterno=apellidoMaterno;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getDni(){
        return dni;
    }
    public void setDni(String dni){
        this.dni=dni;
    }
    public String getCiudad(){
        return ciudad;
    }
    public void setCiudad(String ciudad){
        this.ciudad=ciudad;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    public String getTelefono(){
        return telefono;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getIdUsuario(){
        return idUsuario;
    }
    public void setIdUsuario(String idUsuario){
        this.idUsuario=idUsuario;
    }


}