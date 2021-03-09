/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqClases;

/**
 *
 * @author Profesor
 */
public class Persona {
    private String nombre;
    private Nif nif=null;
    private Nie nie=null;

   /* 
    public Persona(String nombre, Nif nif) {
        this.nombre = nombre;
        this.nif = nif;
      //  this.nie=null;
    }

    public Persona(String nombre, Nie nie) {
        this.nombre = nombre;
        //this.nif=null;
        this.nie = nie;
    }
    */
    public Persona(String nombre, Object objeto)throws IllegalArgumentException
    {
        if (objeto instanceof Nif)// he metido un Nif
        {
            this.nie=null;
            this.nif=(Nif)objeto;
        }
        else if (objeto instanceof Nie)//he metido un Nie
        {
            this.nif=null;
            this.nie=(Nie)objeto;
        }    
        else throw new IllegalArgumentException("Error, no es NIF ni NIE");
        
        this.nombre=nombre;
    }
   
    @Override
    public String toString() {
     if (this.nif!=null)
      return "[" + "Nombre=" + this.nombre + "\tNif=" + this.nif+ ']';
     else
      return "[" + "Nombre=" + this.nombre + "\tNie=" + this.nie+ ']';    
    }
    
    
    
}
