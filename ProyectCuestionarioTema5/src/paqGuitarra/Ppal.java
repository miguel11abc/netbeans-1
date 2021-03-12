/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqGuitarra;

/**
 *
 * @author Profesor
 */
public class Ppal {
  public static void main(String args[])
  {
    Guitarra jesusita=null;  
    try{  
      jesusita=new Guitarra(6,"EBANO","ELECTRICA");
      System.out.println("La guitarra de Jesús="+jesusita);
    }
    catch(IllegalArgumentException e)
    {
        System.out.println("Error producido en número de cuerdas");
    }
     
      System.out.println("jesusita ="+jesusita);
    
  }
}
