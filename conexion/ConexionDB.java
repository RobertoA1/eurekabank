package conexion;

import java.sql.*;
import java.util.*;

import javax.swing.JOptionPane;

public class ConexionDB {
    private static boolean conexionEstablecida = false;
    private static Connection sqlDB;
    
    public static Connection obtenerDB(){
        try {
            if (conexionEstablecida == false){
                Connection db = ConexionDB.realizarConexion();
                conexionEstablecida = true;
                sqlDB = db;
            }

            return sqlDB;
        } catch (ClassNotFoundException e){
            conexionEstablecida = false;
            JOptionPane.showMessageDialog(null, "No se puede conectar a DB: No se encontró el driver JDBC.", "Un error grave ha ocurrido...", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e){
            conexionEstablecida = false;
            JOptionPane.showMessageDialog(null, "No se puede conectar a DB: Código " + e.getErrorCode() + " | " + e.getSQLState(), "Un error grave ha ocurrido...", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public static Connection realizarConexion() throws ClassNotFoundException, SQLException {
        String url;
        Properties propiedades;
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        url = "jdbc:mysql://localhost:3306/eurekabank";
        propiedades = new Properties();
        propiedades.put("user", "admin");
        propiedades.put("password", "12345");
        
        return DriverManager.getConnection(url, propiedades);
    }
    
}
