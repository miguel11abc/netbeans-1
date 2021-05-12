/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqSeguridad;

/**
 *
 * @author Profesor
 */
public class DemoNoGenerica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NoGenerica str=new NoGenerica("Rubén");
        System.out.println(str);
        String cadena=(String)str.getObjeto();
        System.out.println(cadena);
        
        NoGenerica n=new NoGenerica(7);
        System.out.println(n);
        int v=(Integer)n.getObjeto();
        System.out.println((Integer)n.getObjeto());
        
        n=str;
        System.out.println("n= "+n);
    }
    
}
