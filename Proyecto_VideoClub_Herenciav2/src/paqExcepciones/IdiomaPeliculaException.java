/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqExcepciones;

/**
 *
 * @author isabel
 */
public class IdiomaPeliculaException extends ProductosException{

    public IdiomaPeliculaException() {
        super("Idioma de Película incorrecto");
    }

    public IdiomaPeliculaException(String s) {
        super(s);
    }
    
}
