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
public class DuracionPeliculaException extends ProductosException{

    public DuracionPeliculaException() {
        super("Duración de Película incorrecta");
    }

    public DuracionPeliculaException(String s) {
        super(s);
    }
    
}
