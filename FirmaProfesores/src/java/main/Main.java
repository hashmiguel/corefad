/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package main;

import Mysql.ConexionBase;
import javax.swing.JOptionPane;
/**
 *
 * @author lzuniga
 */
public class Main {
    public static void main(String args[]){
        
        ConexionBase miConexion = new ConexionBase();
        
     
        if(miConexion!=null)
        {
            JOptionPane.showMessageDialog(null, "Conexión Realizada Correctamente");
        }
        
        
    }
    
}
