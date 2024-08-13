/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones.basicas;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import operaciones.basicas.Transaccion;

/**
 *
 * @author Roberto
 */
public class ListaTransacciones {
    private ArrayList<Transaccion> lista = new ArrayList<>();
    
    public void añadir(Transaccion t){
        lista.add(t);
    }
    
    public void ejecutar() throws IllegalArgumentException, SQLException{
        Iterator<Transaccion> iterador = lista.iterator();
        while (iterador.hasNext()){
            Transaccion t = iterador.next();
            t.ejecutar();
        }
    }
    
    public void restablecer(Transaccion t){
        lista = new ArrayList<>();
    }
}
