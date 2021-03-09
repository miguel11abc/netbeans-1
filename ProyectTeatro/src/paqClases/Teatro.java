/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqClases;

import java.util.ArrayList;

/**
 *
 * @author Profesor
 */
public class Teatro {
   private String nombre;
   private ArrayList <Funcion> listaFunciones;

    public Teatro(String nombre) {
        this.nombre = nombre;
        this.listaFunciones=new ArrayList();
    }

    public String getNombre() {
        return this.nombre;
    }

    public ArrayList<Funcion> getListaFunciones() {
        return this.listaFunciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setListaFunciones(ArrayList<Funcion> listaFunciones) {
        this.listaFunciones = listaFunciones;
    }
   
    
    public void addFuncion(Funcion f)
    {
        this.listaFunciones.add(f);
    }
    
    public boolean eliminarFuncion(Funcion f){
        if (this.listaFunciones.contains(f))
        {   
           this.listaFunciones.remove(f);
           return true;
        }   
        else
            return false;
    }
    
    public boolean contieneFuncion(Funcion f)
    {
        if (this.listaFunciones.contains(f))
            return true;
        else
            return false;
    }
    
    
    @Override
    public String toString() {
        String cadena="\nNombre=" + this.nombre;
        if (this.listaFunciones.isEmpty())
            cadena+="\nNo tiene funciones todavía";
        else
        {
            for(Funcion f : this.listaFunciones)
                cadena+="\n"+f;
        }
        return cadena;         
    }
   
    
   
}
