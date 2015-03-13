/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Profesores;

import Base.Conexion;


/**
 *
 * @author lzuniga
 */
public class Profesor {

    private String nombre;
    private String apellidopaterno;
    private String apellidomaterno;
    private int numempleado;
    private String correoelectronico;
    private String curp;
    private String rfc;

    public Profesor(String nombre, String apellidopaterno, String apellidomaterno, int numempleado, String correoelectronico, String curp, String rfc) {
        this.nombre = nombre;
        this.apellidopaterno = apellidopaterno;
        this.apellidomaterno = apellidomaterno;
        this.numempleado = numempleado;
        this.correoelectronico = correoelectronico;
        this.curp = curp;
        this.rfc = rfc;
    }

 

    /**
     *
     * @return nombre del profesor
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @return
     */
    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidomaterno() {
        return apellidomaterno;
    }

    public void setApellidomaterno(String apellidomaterno) {
        this.apellidomaterno = apellidomaterno;
    }

    public String getApellidopaterno() {
        return apellidopaterno;
    }

    public void setApellidopaterno(String apellidopaterno) {
        this.apellidopaterno = apellidopaterno;
    }

    public int getNumempleado() {
        return numempleado;
    }

    public void setNumempleado(int numempleado) {
        this.numempleado = numempleado;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    
    public String toString() {
        return "Profesor{" + "nombre=" + nombre + ", apellidopaterno=" + apellidopaterno + ", apellidomaterno=" + apellidomaterno + ", numempleado=" + numempleado + ", correoelectronico=" + correoelectronico + ", curp=" + curp + ", rfc=" + rfc + '}';
    }

    //public void insertarProfesor(String nombre, String apellidopaterno, String apellidomaterno, int numempleado, String correoelectronico, String curp, String rfc) {
    
//
//	public void buscarProfesor(){
//		Conexion con = new Conexion();
//		
//
//		try {
//		Statement estatuto = con.getConnection().createStatement();
//		
//	} catch (SQLException e) {
//		System.err.println(e);
//	} catch (Exception e) {
//		System.err.println(e);
//	}
//	
//   }
    
    
    
    
}

    


