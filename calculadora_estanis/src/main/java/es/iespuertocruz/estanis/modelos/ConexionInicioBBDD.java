/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertocruz.estanis.modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Estanislao Sánchez Martín
 */
public class ConexionInicioBBDD {
    static Connection conn = null;

    /**
     * Metodo que realiza la coneccion con la BBDD
     */
    public static Connection openConnectSQLite() {
        try {
            if (conn != null && !conn.isClosed()) {
                return conn;
            }
            String url = "jdbc:sqlite::memory:";
            conn = DriverManager.getConnection(url);

            System.out.println("Se ha establecido la conexion con la BBDD correctamente");
            crearTabla();

        } catch (Exception exception) {
            System.out.println("Se ha producido un error realizando la coneccion con la BBDD:" +exception.getMessage());
        }
        return conn;
    }

    /**
     * Metodo que finaliza la coneccion con la BBDD
     */
    public static void closeConnectSQLite() {

        try {
            if (conn != null) {
                conn.close();
            }
        } catch (Exception exception) {
            System.out.println("Se ha producido un error cerrando la conexion con la BBDD:" +exception.getMessage());

        }
        
    }
    public static void crearTabla() {

        String sql = "CREATE TABLE IF NOT EXISTS registro (\n"
                + " id integer PRIMARY KEY,\n"
                + " numero1 DOUBLE NOT NULL,\n"
                + " numero2 DOUBLE NOT NULL,\n"
                + " operador VARCHAR(1) NOT NULL,\n"
                + " resultado DOUBLE NOT NULL\n"
                + ");";

        try{
            Connection conn = openConnectSQLite();
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            closeConnectSQLite();
        }
    }
}
