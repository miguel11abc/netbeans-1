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
public class PrecioIncorrecto extends IllegalArgumentException{

    public PrecioIncorrecto() {
        super("Error, precio incorrecto");
    }

    public PrecioIncorrecto(String s) {
        super(s);
    }
    
}
