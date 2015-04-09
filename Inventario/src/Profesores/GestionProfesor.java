package Profesores;

import Base.*;
import Equipo.*;
import Profesores.*;
import Base.Conexion;
import java.sql.*;
import java.util.ArrayList;
import Profesores.Profesor;

public class GestionProfesor<E> {

    private int numfila;

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
    public int tamanoColumnas() {
        Conexion con = new Conexion();
        con.Conectar();
        int i=0;
        try {
            
            Statement estatuto = con.getConnection().createStatement();
            ResultSet rs = estatuto.executeQuery("SELECT count(*) FROM information_schema.`COLUMNS` C WHERE table_name = 'profesores' AND TABLE_SCHEMA = 'hash_inventario'");

            while (rs.next()) {
                String uno = rs.getString(1);
                i = Integer.parseInt(uno);
                //Integer.parseInt(enteroString);
            }
            estatuto.close();
            con.desconectar();

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
            return i;
    }
    
    /**
     * 
     * @param busqueda
     * @return 
     */

    public int tamanoFila(String busqueda) {
        Conexion con = new Conexion();
        con.Conectar();
        int i = 0;

        try {
            Statement estatuto = con.getConnection().createStatement();
            ResultSet rs = estatuto.executeQuery("SELECT COUNT(*) FROM `profesores` WHERE `nombre` LIKE '%" + busqueda + "%'");

            while (rs.next()) {
                String uno = rs.getString(1);
                i = Integer.parseInt(uno);
                //Integer.parseInt(enteroString);

            }

            estatuto.close();
            con.desconectar();

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return i;
        //System.out.println(i);
    }

    public void buscaNombreProfesor(String busqueda) {
        Conexion con = new Conexion();
        con.Conectar();
        int TOTAL = 0;
        try {
            Statement estatuto = con.getConnection().createStatement();

            ResultSet columna = estatuto.executeQuery("SELECT * FROM profesores WHERE `nombre` LIKE '%" + busqueda + "%'");
            ResultSet rs = estatuto.executeQuery("SELECT * FROM profesores WHERE `nombre` LIKE '%" + busqueda + "%'");
            
            //for (int i = 0; i >= tamanoColumnas(); i++) {
            int j = tamanoColumnas();
                while (rs.next()) {
                   for (int i = 0; i == 36; i++){                    
                    String i = rs.getString(j);
                    System.out.println(uno + "la"+j);
                   }

               
            }
//            System.out.println(tamanoFila(busqueda));

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
