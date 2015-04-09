/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;

//import com.sun.org.apache.xpath.internal.XPathAPI;
import java.sql.*;

/**
 *
 * @author lzuniga
 */
public class Conexion {

    private Connection conexion = null;
    private String servidor = "localhost";
    private String database = "hash_inventario";
    private String usuario = "hash";
    private String password = "hashrk12";
    private String url = "jdbc:mysql://localhost:3306/";

        public void Conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url + database, usuario, password);

            if (conexion != null) {
                
            //   Statement estatuto = conexion.createStatement();
            //String ls;
           // estatuto.executeUpdate("INSERT INTO hash_inventario.profesores (nombre, apellido_paterno, apellido_materno, numero_empleado, correo_electronico, curp, rfc, id, tiempo) VALUES ('nombre', 'apellido_paterno', 'apellido_materno', 6, correo_electronico, curp, rfc,  NULL, CURRENT_TIMESTAMP)");
           // estatuto.executeUpdate("INSERT INTO hash_inventario.profesores (nombre, apellido_paterno, apellido_materno, numero_empleado, correo_electronico, curp, rfc, id, tiempo) VALUES ("+this.nombre+", "+this.apellidopaterno+", "+this.apellidomaterno+", "+this.numempleado+", "+this.correoelectronico+", "+this.curp+", "+this.rfc+",  NULL, CURRENT_TIMESTAMP)" );
           // estatuto.executeUpdate(ls); 
                //System.out.println("Conexión a base de datos " + database + " ...OK\n");
//                Statement nose = conexion.createStatement();
//                Statement nose2 = conexion.createStatement();
//                ResultSet rs = nose.executeQuery("SELECT * FROM profesores LIMIT 0 , 30");
//                ResultSet tamano = nose2.executeQuery("select count(*) from hash_inventario.profesores");
//                
//                
//                
//                while (tamano.next()) {
//                    String ll = tamano.getString(1);
//                System.out.println("el tamaño de la tabla es ? " + ll);
//                }
//                
//                while (rs.next()) {
//                    String nombre = rs.getString(1);
//                    System.out.print(nombre + " ");
//
//                    String apellidoMaterno = rs.getString(2);
//                    System.out.print(apellidoMaterno + " ");
//
//                    String apellidoPaterno = rs.getString(3);
//                    System.out.print(apellidoPaterno + " ");
//
//                    String numeroEmpleado = rs.getString(4);
//                    System.out.print(numeroEmpleado + " ");
//
//                    String correoElectronico = rs.getString(5);
//
//                    System.out.print(correoElectronico + " ");
//
//                    String curp = rs.getString(6);
//
//                    System.out.print(curp + " ");
//
//                    String rfc = rs.getString(6);
//
//                    System.out.println(rfc + " ");
//
//                }
            }

        } catch (SQLException e) {
            System.err.println(e);
        } catch (ClassNotFoundException e) {
            System.err.println(e);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

   

    public Connection getConnection() {
        return conexion;
    }

    public void desconectar() {
        conexion = null;
    }

}
