/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paq4;

/**
 *
 * @author Profesor
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
      Clase1 obj1= new Clase1(7);
      Clase1 obj2= new Clase1(9);
      obj2=obj1;
      
      System.out.print(obj1.getProp()+" ");
      System.out.print(obj2.getProp()+" "); 
    }
    
}
