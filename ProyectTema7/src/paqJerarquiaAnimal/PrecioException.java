/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqJerarquiaAnimal;

/**
 *
 * @author Profesor
 */
public class PrecioException extends IllegalArgumentException{

    public PrecioException() {
        super("Error, precio incorrecto");
    }

    public PrecioException(String s) {
        super(s);
    }
    
}
