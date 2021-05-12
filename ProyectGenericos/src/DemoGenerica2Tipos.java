
import paqIntroduccion.Caja;

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
        String strObjecto1=strInt.getObjeto1();
        System.out.println("Get1 "+strObjecto1);
        int v=strInt.getObjeto2();
        System.out.println("Get2 "+strInt.getObjeto2());
        System.out.println("Objeto strInt ="+strInt);
        
        Caja cajita=new Caja(2,2,2);
        Generica2Tipos<Caja, Double> cjDouble=new Generica2Tipos<Caja,Double>(cajita,12.3);
        System.out.println("cjDouble= "+cjDouble);
        Caja c1=cjDouble.getObjeto1();
        double d=cjDouble.getObjeto2();
        
        
        Generica2Tipos<Integer, Double> num=new Generica2Tipos<Integer,Double>(2,3.5);
        System.out.println("Get1 "+num.getObjeto1());
        System.out.println("Get2 "+num.getObjeto2());
        System.out.println("Objeto num ="+num);
        
        Generica2Tipos<Double, Double> dobleDouble=new Generica2Tipos<Double,Double>(2.4,3.5);
        System.out.println("Get1 "+dobleDouble.getObjeto1());
        System.out.println("Get2 "+dobleDouble.getObjeto2());
        System.out.println("Objeto dobleDouble ="+dobleDouble);

    }
    
}
