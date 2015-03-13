/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;

import java.sql.*;
/**
 *
 * @author lzuniga
 */
public class Conexion {
    private Connection conexion=null;
    private String servidor="localhost";
    private String database="Inventario";
    private String usuario="root";
    private String password="hashrk12";
    private String url="jdbc:mysql://localhost/"+database;
    
    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, password);
            
            if (conexion!=null){
                System.out.println("Conexión a base de datos "+database+" ...OK\n");
            }
        }
         catch (SQLException e){
             System.out.println(e);
         }
        catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    
    public Connection getConnection(){
        return conexion;
    }
    
    public void desconectar(){
        conexion = null;
    }
         
    
    
    
}
