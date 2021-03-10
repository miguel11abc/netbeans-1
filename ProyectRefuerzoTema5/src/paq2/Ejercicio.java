/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paq2;

/**
 *
 * @author Profesor
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Clase1 obj1=new Clase1(3,2);
        System.out.println("obj1.p1="+obj1.p1);
        System.out.println("obj1.p2="+obj1.p2);
        
       Clase1 obj2=new Clase1(100,222);
        System.out.println("obj2.p1="+obj2.p1);
        System.out.println("obj2.p2="+obj2.p2);
       
       //obj2=obj1;
       /*
       System.out.println("obj1.p1="+obj1.p1);
       System.out.println("obj1.p2="+obj1.p2);
       System.out.println("obj2.p1="+obj2.p1);
       System.out.println("obj2.p2="+obj2.p2);
       
       obj1.p1=1234;
       System.out.println("obj2.p1="+obj2.p1);
       obj2.p2=999;
       System.out.println("obj1.p2="+obj1.p2);
     
       
       */
       //obj1=3,2    obj2=100,222
       obj1.modificar(obj2);
       System.out.println("obj1.p1="+obj1.p1);
       System.out.println("obj1.p2="+obj1.p2);
       System.out.println("obj2.p1="+obj2.p1);
       System.out.println("obj2.p2="+obj2.p2);

       
    }
    
}
