/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Equipo;

/**
 *
 * @author lzuniga
 */
public class Equipo {
    private int id;
    private int numinv;
    private boolean estado;

    public Equipo(int id, int numinv , boolean  estado) {
        this.id = id;
        this.numinv = numinv;
        this.estado = estado;
    }

       public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNuminv() {
        return numinv;
    }
    
    public boolean setEstado(boolean estado){
        return this.estado;
    }

    public void setNuminv(int numinv) {
        this.numinv = numinv;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public String toString() {
        return "Equipo{" + "id=" + id + ", numinv=" + numinv + '}';
    }

   
    
    
    
}
