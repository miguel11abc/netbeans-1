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
public class NoMasLimiteProductosException extends CapacidadArrayExcetion{

    public NoMasLimiteProductosException() {
        System.out.println("SE HA SUPERADO EL LÍMITE DE PRODUCTOS EN EL VIDEOCLUB");
    }

    public NoMasLimiteProductosException(String s) {
        super(s);
    }
    
}
