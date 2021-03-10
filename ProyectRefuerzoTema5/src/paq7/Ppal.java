/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paq7;

import java.util.ArrayList;

/**
 *
 * @author Profesor
 */
public class Ppal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Triangulo> triangulos=new ArrayList();
        Triangulo t1=new Triangulo(2,3.4);
        Triangulo t2=new Triangulo(1,3.4);
        Triangulo t3=new Triangulo(3,3.4);
        Triangulo t4=new Triangulo(4,3.4);
        Triangulo t5=new Triangulo(12,3.4);
        Triangulo t6=new Triangulo(5,3.4);
        Triangulo t7=new Triangulo(6,3.4);
        Triangulo t8=new Triangulo(7,3.4);
        Triangulo t9=new Triangulo(8,3.4);
        Triangulo t10=new Triangulo(9,3.4);
        
        triangulos.add(t1);
        triangulos.add(t2);
        triangulos.add(t3);
        triangulos.add(t4);
        triangulos.add(t5);
        triangulos.add(t6);
        triangulos.add(t7);
        triangulos.add(t8);
        triangulos.add(t9);
        triangulos.add(t10);
        
        System.out.println("----LISTADO DE TRIÁNGULOS----");
        for(Triangulo t : triangulos)
            System.out.println(t+" con área: "+t.area());
        
        System.out.println("------LISTADO CON FOR(INT I)----");
        for (int i = 0; i < triangulos.size(); i++) {
            System.out.println((i+1)+"- "+triangulos.get(i)+"  con área: "+triangulos.get(i).area());
        }
        
        double mayorArea=0.0f;
        
    }
    
}
