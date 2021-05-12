/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqTiposLimitados;

/**
 *
 * @author Profesor
 */
public class DemoTiposLimitados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer n1=45;
        Integer n2=46;
        Integer numInt[]={40,41,42,43,44};
        Estadistica<Integer> objInt=new Estadistica<Integer>(numInt);
        double m=objInt.media();
        System.out.println("La media de objInt es "+m);
        
        
        
        
        
    }
    
}
