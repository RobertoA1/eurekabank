
package listas;

import java.sql.SQLException;


public interface DBAdapter {
    boolean existe(String c) throws SQLException;
    void agregar(Object o) throws SQLException;
    Object obtener(String c) throws SQLException;
}
