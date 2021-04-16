/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectfigura;

/**
 *
 * @author Profesor
 */
public class ProyectFigura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figura f=null;//new Figura(3); 
        //Figura es una clase abstracta, por lo que NO se puede 
        //aplicar el operador new
        // Es decir, instanciar ningún objeto de la clase Figura
        // o crear objetos de clase Figura
       // System.out.println("área de f es ="+f.area());
        
        Cuadrado c=new Cuadrado(3);
        System.out.println("área de c es ="+c.area());
        
        Triangulo t=new Triangulo(2,3);
        System.out.println("área de t es ="+t.area());
        
        Figura g=c; //g apunta a c que es un cuadrado
        System.out.println("g apunta al cuadrado c");
        System.out.println("área de la Figura g es ="+g.area());
        ((Cuadrado)g).muestraBase();
        
        g=t;
        System.out.println("g apunta al triángulo t");
        System.out.println("área de la Figura g es ="+g.area());
        
        Rectangulo r=new Rectangulo(6,9);
        g=r;
        System.out.println("g apunta al rectángulo r");
        System.out.println("área de la Figura g es ="+g.area());
        
    }
    
}
