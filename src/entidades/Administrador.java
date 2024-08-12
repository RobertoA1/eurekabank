/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Jorge
 */
public class Administrador {
    private String idAdministrador =null;
    private String idUsuario =null;

    public Administrador(String idAdministrador, String idUsuario) {
        this.idAdministrador = idAdministrador;
        this.idUsuario = idUsuario;
    }

    public Administrador(){
        this(null,null);
    }

    public String getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(String idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    
    
    
    
}
