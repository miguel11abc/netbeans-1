/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Profesor
 */
public class DemoGenerica2Tipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Generica2Tipos<String,Integer> strInt=new Generica2Tipos<String,Integer>("Cintia", 23);
        System.out.println("Get1 "+strInt.getObjeto1());
        System.out.println("Get2 "+strInt.getObjeto2());
        System.out.println("Objeto strInt ="+strInt);
        
        Generica2Tipos<Integer, Double> num=new Generica2Tipos<Integer,Double>(2,3.5);
        System.out.println("Get1 "+num.getObjeto1());
        System.out.println("Get2 "+num.getObjeto2());
        System.out.println("Objeto num ="+num);
  
    }
    
}
