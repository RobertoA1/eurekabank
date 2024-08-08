package seguridad;

import java.sql.*;
import conexion.ConexionDB;

public class Sesiones {
    private static Sesion sesion = null;
    private static Connection db = ConexionDB.obtenerDB();

    static void iniciarSesion(String userCodigo) throws IllegalStateException, SQLException{
        String err = "Autenticación | No se puede iniciar sesión: ";

        if (verificarSesionActiva()) throw new IllegalStateException(err + "Ya existe una sesión iniciada.");
        if (sesion == null) sesion = new Sesion();

        String token = FabricaToken.generarToken();
        sesion.setUserCodigo(userCodigo);
        sesion.setTokenAcceso(token);

        CallableStatement cs = db.prepareCall("CALL sp_sesion_iniciar(?, ?)"); // (usercodigo, token)
        cs.setString(1, userCodigo);
        cs.setString(2, token);
        cs.executeUpdate();
    }

    static void cerrarSesion() throws IllegalStateException, SQLException, UnknownError{
        String err = "Autenticación | No se puede cerrar sesión: ";

        Sesion s = Sesiones.obtenerSesion();
        if (!verificarSesionActiva()) throw new IllegalStateException(err + "La sesión no está iniciada.");
        
        CallableStatement cs = db.prepareCall("CALL sp_sesion_cerrar(?, ?)"); // (usercodigo, token)
        cs.setString(1, s.getUserCodigo());
        cs.setString(2, s.getTokenAcceso());
        ResultSet rs = cs.executeQuery();

        if (!rs.next()) throw new UnknownError(err + "Ocurrió un problema desconocido.");;
        if (rs.getInt(1) == 1) throw new UnknownError(err + "Ocurrió un problema desconocido.");

        sesion = null;
    }

    public static Sesion obtenerSesion() throws IllegalStateException, SQLException{
        if (!verificarSesionActiva()) throw new IllegalStateException("Autenticación | No se puede obtener la sesión actual: No se ha iniciado sesión.");
        Sesion s = new Sesion();
        s.setTokenAcceso(s.getTokenAcceso());
        s.setUserCodigo(s.getUserCodigo());
        return s;
    }

    public static boolean verificarSesionActiva() throws SQLException{
        if (sesion == null) return false;
        Sesion s = Sesiones.obtenerSesion();

        CallableStatement cs = db.prepareCall("CALL sp_sesion_coincide(?, ?)"); // (usercodigo, supuesto token)
        cs.setString(1, s.getUserCodigo());
        cs.setString(2, s.getTokenAcceso());

        ResultSet rs = cs.executeQuery(); // Devuelve estado si es que es correcto.
        if (rs.next()){
            if (rs.getInt(1) == 1) return true;
        }
        return false;
    }
}

class Sesion {
    private String tokenAcceso = null;
    private String userCodigo = null;

    public String getTokenAcceso() {
        return tokenAcceso;
    }

    public void setTokenAcceso(String tokenAcceso) {
        this.tokenAcceso = tokenAcceso;
    }

    public String getUserCodigo() {
        return userCodigo;
    }

    public void setUserCodigo(String userCodigo) {
        this.userCodigo = userCodigo;
    }
}
