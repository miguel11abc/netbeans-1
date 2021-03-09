/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqPpal;

import paqClases.*;

/**
 *
 * @author Profesor
 */
public class Ppal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Punto p=new Punto(3,4);
       Circulo c1=new Circulo(p,1);
       
       p.setX(56);
       System.out.println("c1= "+c1);
       
       
       Circulo c2=null;
       try{
           c2=new Circulo(p,-2);
       }
       catch(IllegalArgumentException e)
       {
           System.out.println(e.getMessage());
           c2=new Circulo();
       }
       
       System.out.println("c2="+c2);
       
       //¿Coordenada x del centro del círculo c2?
       System.out.println(c2.getCentro().getX());
     
       //Cambia las coordenadas del centro del círculo c2 a 20,13
       c2.setCentro(20, 13);
       c2.setCentro(new Punto(20,13));
       
       //área del círculo c1
       System.out.println("Área de c1="+c1.area());
       
       //Calcular la distancia entre el círculo c1 y c2
       System.out.println("distancia c1 y c2 ="+c1.distancia(c2));
       
       //Comprobar si c1 es igual a c2
       if (c1.equals(c2))
            System.out.println("c1 y c2 son iguales");
       else
            System.out.println("c1 y c2 son distintos");
    }
    
}
