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
public class DuracionProductosException extends ProductosException{

    public DuracionProductosException() {
        super("Duración incorrecta en Productos");
    }

    public DuracionProductosException(String s) {
        super(s);
    }
    
}
