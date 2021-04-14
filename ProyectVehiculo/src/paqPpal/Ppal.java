/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqPpal;

import paqExcepciones.PotenciaIncorrecta;
import paqExcepciones.PrecioIncorrecto;
import paqVehiculo.Vehiculo;

/**
 *
 * @author Profesor
 */
public class Ppal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo v=new Vehiculo(800, 19,"SEAT IBIZA");
        System.out.println("Vehículo v="+v);
        
        try{
           v.setPrecio(-1);
        }
        catch(PrecioIncorrecto e)
        {
            System.out.println(e.getMessage());   
        }
        
        System.out.println("Vehículo v="+v);
        
        Vehiculo x=null;
        try{
            x=new Vehiculo(9,-20,"MERCEDES");
        }                 
        catch(PotenciaIncorrecta | PrecioIncorrecto px)
        {
            System.out.println(px.getMessage());
            x=new Vehiculo(0,20,"SEAT IBIZA");
        }
        catch(IllegalArgumentException t)
        {
            System.out.println(t.getMessage());
            x=new Vehiculo(0,0,"SEAT IBIZA");
        }
        catch(Exception ecp)
        {
            System.out.println("Error desconocido");
        }
        
        
        System.out.println("Vehiculo x="+x);
       // x.precio=90;
        
        
    }
    
}
