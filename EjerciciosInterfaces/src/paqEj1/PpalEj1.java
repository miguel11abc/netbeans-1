/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqEj1;

/**
 *
 * @author Profesor
 */
public class PpalEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila pilita=new Pila(5);
        //Voy a rellenar 5 elementos de tipo Object
        String jesus="Jesús Sánchez";
        Integer x=9;
        
        pilita.aniadir(jesus);
        pilita.aniadir(x);
        
        System.out.println("Pilita ="+pilita);
        
        Object obj=pilita.extraer();
        System.out.println("obj="+obj);
        System.out.println("Pilita ="+pilita);          
    }
}    
