/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Base.*;
import Equipo.*;
import Profesores.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;


//import java.sql.Connection;
//import javax.swing.JOptionPane;

/**
 *
 * @author lzuniga
 */
public class Main {
    public static void main(String [] args){
        
       
       
               Profesor eq = new Profesores.Profesor("Luis Miguel", "Zuñiga", "Cervantes", 301, "hashmiguel@gmail.com","ZUCL850305743","ZUCLdsdr13rqd23d");
               eq.toString();
               System.out.println(eq.toString());
               System.out.println(eq.getApellidomaterno());
                        Calendar c1 = GregorianCalendar.getInstance();
                        Calendar c2 = Calendar.getInstance();
       System.out.println("Fecha actual: "+c1.getTime().toLocaleString());
       	System.out.println(c1.getFirstDayOfWeek());
	       System.out.println(c2.getMinimalDaysInFirstWeek() );
		//System.out.println("Esto es una prueba de compilación con ANT");
		GestionProfesor gs = new GestionProfesor();
          //      gs.insertarProfesor(eq);
                //gs.borraProfesorNumEmpleado(301);
                // gs.insertarProfesor(eq);
//                gs.borraProfesor(eq.getNumempleado());
               
                   gs.buscaNombreProfesor("Luis");
                  // System.out.println(gs.tamanoColumnas());
                  // System.out.println(gs.tamanoFila("Luis"));
                   //System.out.println(gs.tamanoFila("Luis"));
    }


    }
