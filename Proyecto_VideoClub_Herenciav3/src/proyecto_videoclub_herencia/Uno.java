/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_videoclub_herencia;

/**
 *
 * @author Profesor
 */
public class Uno {
   private static int metodo(){
       int valor=0;
       try{
           valor++;
           valor+=Integer.parseInt("42");
           valor++;
           return valor;
           //System.out.println("valor después de try "+valor);
       }catch(NumberFormatException n)
       {
           valor+=Integer.parseInt("42");
           System.out.println("valor al final de catch "+valor);
       }
       finally{
           valor++;
           System.out.println("En finally "+valor);
       }
       
       valor++;
       System.out.println("valor antes de return "+valor);
       return valor;
   } 
   
   
   public static void main(String args[]){
       try{
           metodo();
       }catch(NumberFormatException c){
           c.printStackTrace();
       }
   } 
}
