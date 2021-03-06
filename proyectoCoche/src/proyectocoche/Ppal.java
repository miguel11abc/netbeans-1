/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocoche;

/**
 *
 * @author Alumno
 */
public class Ppal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Coche c1;
       try{
          c1=new Coche(4,10000,"   toyota","YARIS","ROJO","    gasolina   ","MANUAL");
       }
       catch(IllegalArgumentException ex)
       {
           System.out.println("ERROR "+ex.getMessage());
           c1=new Coche(); //c1 tiene 3 puertas, 0€ precio, color "BLANCO"...
       }
       
       System.out.println("Coche c1= "+c1);
       
       c1.setNumPuertas(3);
       System.out.println("Coche c1= "+c1);
      
       
       
      try{ 
        c1.setNumPuertas(70);
        System.out.println("Coche c1= "+c1);
      }
      catch(IllegalArgumentException ex)
      {
          System.out.println("ERROR "+ex.getMessage());          
      }
             
      
       Coche c2=new Coche();
       Coche c3=new Coche(c1);
       
        System.out.println("Coche c1= "+c1);
        System.out.println("Coche c2= "+c2);
        System.out.println("Coche c3= "+c3);
       
      c3.setCambio("autOMATICO   ");
        System.out.println("Coche c3= "+c3);
      
     try{   
      c2.setCombustible("GAS LICUADO");
     }catch(IllegalArgumentException ex)
     {
         System.out.println("ERROR "+ex.getMessage());
     }    
    }
}
