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
public class NoMasProductosAlquiladosPorClienteException extends CapacidadArrayException {

    public NoMasProductosAlquiladosPorClienteException() {
        super("NO más productos alquilados");
    }

    public NoMasProductosAlquiladosPorClienteException(String s) {
        super(s);
    }
    
}
