/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package operaciones.basicas;

import java.sql.SQLException;

/**
 *
 * @author Roberto
 */
public interface Transaccion {  
    public void ejecutar() throws IllegalArgumentException, SQLException;
    
    public void restablecer();
}
