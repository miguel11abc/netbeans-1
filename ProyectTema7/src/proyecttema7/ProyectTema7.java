
import paqSubClases.A;
import paqSubClases.B;
import paqSubClases.C;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Profesor
 */
public class ProyectTema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       A a=new A(12,22);
       System.out.println("a de tipo A="+a);
       System.out.println("Suma de i y j de a ="+a.sumaIJ()); 
       
       B b=new B(9,10,100);
       System.out.println("b= "+b);
       System.out.println("Suma de i,j y k de b="+b.sumaIJK());
       System.out.println("Suma de i, j de b= "+b.sumaIJ());
        
       C c=new C(30,3); //c.i=30, c.j=3
       System.out.println("suma de i y j de c="+c.sumaIJ());
       System.out.println("muestra c="+c);
       c.visualizaIJ();
         
       
       
    }
    
}
