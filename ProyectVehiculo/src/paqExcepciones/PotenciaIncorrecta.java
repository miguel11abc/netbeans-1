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
public class PotenciaIncorrecta extends IllegalArgumentException{

    public PotenciaIncorrecta() {
        super("Error, potencia incorrecta");
    }

    public PotenciaIncorrecta(String s) {
        super(s);
    }
    
}
