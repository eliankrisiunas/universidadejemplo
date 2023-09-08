/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo.AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Leo
 */
public class Conexion {
    private static final String URL="jdbc:mariadb://localhost:3306/";
    private static final String DB= "universidadulp";
    private static final String USUARIO = "root";
    private static String PASSWORD = "";
    

    private static Connection connection;

    public Conexion() {
        
    }
    
    
    public static Connection getConexion(){
    
    if(connection == null){
        
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            connection = DriverManager.getConnection(URL+DB,USUARIO, PASSWORD);
        } catch (ClassNotFoundException  ex) {
           JOptionPane.showMessageDialog(null,"Error al conectarse a la BD: "+ ex.getMessage());
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error al cargar el driver: "+ ex.getMessage());
        }
    
    }
    
    return connection;
    
    }

//    public static Connection getConexion() {
//        try {
//            Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/universidadulp","root","");
//            Class.forName("org.mariadb.jdbc.Driver");
//        } catch (ClassNotFoundException ex) {
//            JOptionPane.showMessageDialog(null, "error al cargar el driver " + ex.getMessage());
//        } catch (SQLException ex) {
//            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return connection;
//    }

}
