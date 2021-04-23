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
public class ProductosException extends VideoClubException {

    public ProductosException() {
        super("Error en Productos");
    }

    public ProductosException(String s) {
        super(s);
    }
    
}
