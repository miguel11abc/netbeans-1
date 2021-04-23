/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_videoclub_herencia;

import paqEnumeraciones.GeneroPelis;

/**
 *
 * @author Profesor
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeneroPelis g1;
        g1=GeneroPelis.DRAMA;
        System.out.println("g1="+g1.toString());
        
        switch(g1)
        {
            case ACCION: break;
            case FICCION: break;
        }
        
        String nombre=g1.name();
        System.out.println("Género de g1="+nombre);
        
        System.out.println("índice que ocupa la constante ="+g1.ordinal());
        
        GeneroPelis g2=GeneroPelis.DRAMA;
        int comp=g1.compareTo(g2);
        System.out.println("comp"+comp);
        
        System.out.println("DISTINTOS GÉNEROS:");
        for(GeneroPelis p:GeneroPelis.values())
            System.out.println("-"+p);
        
        GeneroPelis g3=GeneroPelis.valueOf("INFANTIL");
        GeneroPelis g4=GeneroPelis.INFANTIL;
        
        
        }
        
    }
    

