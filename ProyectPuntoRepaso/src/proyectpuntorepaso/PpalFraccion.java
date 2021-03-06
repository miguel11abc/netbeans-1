/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectpuntorepaso;

import paqPunto.*;

/**
 *
 * @author isabel
 */
public class PpalFraccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Fraccion f=new Fraccion(22,10);
       Fraccion g=new Fraccion(88,8);
       
       
       System.out.println("f="+f);
       System.out.println("g="+g);
       
       int x=Fraccion.mcd(22, 10);
       System.out.println("mcd(22,10)="+x);
        
    }
    
}
