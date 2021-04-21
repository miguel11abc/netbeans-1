/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqExcepciones;

/**
 *
 * @author Profesor
 */
public class CapacidadArrayExcetion extends VideoClubException{

    public CapacidadArrayExcetion() {
        System.out.println("Error en el límite de los Arrays");
    }

    public CapacidadArrayExcetion(String s) {
        super(s);
    }
    
}
