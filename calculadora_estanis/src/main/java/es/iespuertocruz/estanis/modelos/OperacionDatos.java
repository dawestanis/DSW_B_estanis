/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertocruz.estanis.modelos;

import static es.iespuertocruz.estanis.modelos.ConexionInicioBBDD.conn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Estanislao Sánchez Martín
 */
public class OperacionDatos {
    
    public static void insertar(double primernumero, double segundonumero, char operador, double resultado){
        
        String sql = "INSERT INTO registro (primernumero, segundonumero, operador, resultado) VALUES(?,?,?,?)";
        try{
            Connection conn = ConexionInicioBBDD.openConnectSQLite();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setDouble(1, primernumero);
            pstmt.setDouble(2, segundonumero);
            pstmt.setString(3, String.valueOf(operador));
            pstmt.setDouble(4, resultado);
            pstmt.executeUpdate();
        }catch(SQLException e){
            System.out.println("Se ha producido un error almacenando en la BBDD:" + e.getMessage());
            System.out.println("Estoy aqui colega!");
        }finally{
            ConexionInicioBBDD.closeConnectSQLite();
        }
    }
}
