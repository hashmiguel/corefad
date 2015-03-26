package Profesores;

import Base.*;
import Equipo.*;
import Profesores.*;
import Base.Conexion;
import java.sql.*;
import java.util.ArrayList;
import Profesores.Profesor;

public class GestionProfesor<E> {

    public void noSe(Profesor prof) {

        System.err.println(prof.getApellidomaterno());

    }

    /**
     *
     * @param profesor
     */
    public void insertarProfesor(Profesor profesor) {
        Conexion con = new Conexion();
        con.Conectar();

        try {
            Statement estatuto = con.getConnection().createStatement();
            estatuto.executeUpdate("INSERT INTO hash_inventario.profesores (nombre, apellido_paterno, apellido_materno, numero_empleado, correo_electronico, curp, rfc, id, tiempo) VALUES ('" + profesor.getNombre() + "', '" + profesor.getApellidopaterno() + "', '" + profesor.getApellidomaterno() + "', '" + profesor.getNumempleado() + "', '" + profesor.getCorreoelectronico() + "', '" + profesor.getCurp() + "', '" + profesor.getRfc() + "', NULL, CURRENT_TIMESTAMP )");
            estatuto.close();
            con.desconectar();

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     *
     * @param busqueda
     */
//    private int filaNumero(){
//        
//    }
    
    
    public void buscaNombreProfesor(String busqueda) {
        Conexion con = new Conexion();
        con.Conectar();
        int TOTAL = 0;
        try {
            Statement estatuto = con.getConnection().createStatement();

            ResultSet fila = estatuto.executeQuery("SELECT COUNT(*) FROM `profesores` WHERE `nombre` LIKE '%" + busqueda + "%'");
            ResultSet columna = estatuto.executeQuery("SELECT * FROM profesores WHERE `nombre` LIKE '%" + busqueda + "%'");
            ResultSet rs = estatuto.executeQuery("SELECT * FROM profesores WHERE `nombre` LIKE '%" + busqueda + "%'");
            //int foo = Integer.parseInt(fila.toString());
            fila.toString();
            //System.out.println(foo);
           
            while (fila.next()) {
                String uno = rs.getString(10);
                System.out.print(uno + " ");
                  
                
            }
            
            

                        //System.out.println(rs.next());
//            while (rs.next()) {
//
////                for(int i=0;i<=fila ;i++){
////                    
////                 System.out.print()   
////                }
//                String nombre = rs.getString(1);
//                System.out.print(nombre + " ");
//
//                String apellidoMaterno = rs.getString(2);
//                System.out.print(apellidoMaterno + " ");
//
//                String apellidoPaterno = rs.getString(3);
//                System.out.print(apellidoPaterno + " ");
//
//                String numeroEmpleado = rs.getString(4);
//                System.out.print(numeroEmpleado + " ");
//
//                System.out.println();
//
//            }
            estatuto.close();
            con.desconectar();

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    /**
     *
     * @param nombre
     */
    public void borraProfesorRfc(String rfc) {
        Conexion con = new Conexion();
        con.Conectar();

        try {

            Statement estatuto = con.getConnection().createStatement();
            estatuto.executeUpdate("DELETE FROM hash_inventario.profesores WHERE profesores.rfc = " + rfc);
            estatuto.close();
            con.desconectar();

        } catch (SQLException e) {

            System.out.println(e);

        } catch (Exception e) {

            System.out.println(e);

        }

    }

    /**
     *
     * @param numempleado
     */
    public void borraProfesorNumEmpleado(int numempleado) {

        Conexion con = new Conexion();
        con.Conectar();

        try {

            Statement estatuto = con.getConnection().createStatement();
            estatuto.executeUpdate("DELETE FROM hash_inventario.profesores WHERE profesores.numero_empleado = " + numempleado);
            estatuto.close();
            con.desconectar();

        } catch (SQLException e) {

            System.out.println(e);

        } catch (Exception e) {

            System.out.println(e);

        }

    }

    public void borrarProfesorId(String id) {
        Conexion con = new Conexion();
        con.Conectar();

        try {

            Statement estatuto = con.getConnection().createStatement();
            estatuto.executeUpdate("DELETE FROM hash_inventario.profesores WHERE profesores.id = " + id);
            estatuto.close();
            con.desconectar();

        } catch (SQLException e) {

            System.out.println(e);

        } catch (Exception e) {

            System.out.println(e);

        }

    }

}
