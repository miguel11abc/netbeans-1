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
public class NoMasLimiteClientesException extends CapacidadArrayException {

    public NoMasLimiteClientesException() {
        super("SE HA CUBIERTO EL LÍMITE MAXIMO DE CLIENTES EN EL VIDEOCLUB");
    }

    public NoMasLimiteClientesException(String s) {
        super(s);
    }
    
}
