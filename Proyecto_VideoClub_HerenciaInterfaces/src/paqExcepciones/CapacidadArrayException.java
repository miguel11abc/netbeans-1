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
public class CapacidadArrayException extends VideoClubException{

    public CapacidadArrayException() {
        super("Error en el límite de los Arrays");
    }

    public CapacidadArrayException(String s) {
        super(s);
    }
    
}
