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
public class AlquilarException extends VideoClubException{

    public AlquilarException() {
        super("El producto YA está alquilado");
    }

    public AlquilarException(String s) {
        super(s);
    }
    
}
