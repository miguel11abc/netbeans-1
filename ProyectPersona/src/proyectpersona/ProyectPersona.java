
import paqClases.Nie;
import paqClases.Nif;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Profesor
 */
public class ProyectPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Nif nif1=null;
     
     try{   
        nif1=new Nif("1R");
     }
     catch(NumberFormatException x)
     {
         System.out.println(x.getMessage());
     }
     catch(IllegalArgumentException e)
     {
         System.out.println(e.getMessage());
     }
       
     System.out.println("nif1="+nif1);
      Nie nie1=new Nie("X0000001R");
    System.out.println("nie1="+nie1);

    }
    
   }
