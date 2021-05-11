/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqIntroduccion;

/**
 *
 * @author Profesor
 */
public class DemoIntroduccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Generica<String> str=new Generica<>("Ruben");
        String v=str.getObjeto();
        System.out.println("v= "+v);
        System.out.println("str ="+str);
        
        Generica<Integer> n=new Generica<Integer>(34);
        System.out.println(n.getObjeto());
        System.out.println("n= "+n);
        
      //  str=n; No se pueden referenciar porque son de distinto tipo
        
        Caja cajita=new Caja(6,6,6);
        Generica<Caja> genCaja=new Generica<Caja>(cajita);
        System.out.println(genCaja.getObjeto());
        System.out.println("genCaja= "+genCaja);      
    }
    
}
