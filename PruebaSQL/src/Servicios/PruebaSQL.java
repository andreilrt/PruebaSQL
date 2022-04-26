package Servicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PruebaSQL {
    
    public static void main(String[] args) {
        String driver = "com.mysql.cj.jdbc.Driver";
        String URL_bd = "jdbc:mysql://localhost:3306/ActividadBD";
        String usuario = "root";
        String clave = "";
        Connection con = null;
        Statement comando = null;
        ResultSet registros = null;
        String sql;
        int filas_afectadas;
        try {
            con = DriverManager.getConnection(URL_bd, usuario, clave);
            if (con != null) {
                System.out.println("Conexión exitosa");
                comando = con.createStatement();
                con.close();
            } else {
                System.out.println("Conexión NO exitosa");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PruebaSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
