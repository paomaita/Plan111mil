/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class ConexionBase {
    Connection conn=null;
    Statement st= null;
  
private static final String driver="com.mysql.jdbc.Driver";
private static final String user="programadoresisi";
private static final String password= "isi111mil";
private static final String url="jdbc:mysql://db4free.net:3306/bdcolegio";

public ConexionBase () {

        try {
            Class.forName(driver);
           
                conn=DriverManager.getConnection(url,user,password);
           
      
            if(conn!=null){
                
                JOptionPane.showMessageDialog(null, "Conexion establecida");
            }   } catch (ClassNotFoundException |SQLException ex) {
            JOptionPane.showMessageDialog( null,"error" +ex);
        }
}
public Connection getConection (){
    return conn;   
}

public void desconectar(){ 
conn= null;
    if(conn==null){
        JOptionPane.showInternalMessageDialog(null, "Conexion terminada" );
    }
}

}
