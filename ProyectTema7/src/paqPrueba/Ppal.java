/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqPrueba;

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
        // TODO code application logic here
        Prueba p=new Prueba();
        Prueba q=new Prueba();
        ArrayList <String> lista=p.getProfesoras();
        for(String t: lista)
            System.out.println(t);
    }
    
}
