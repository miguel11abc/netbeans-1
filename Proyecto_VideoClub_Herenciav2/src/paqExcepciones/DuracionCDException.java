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
public class DuracionCDException extends DuracionProductosException {

    public DuracionCDException() {
        super("Duración de CD incorrecta");
    }

    public DuracionCDException(String s) {
        super(s);
    }
    
}
