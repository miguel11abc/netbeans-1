/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqWildCard;

/**
 *
 * @author Profesor
 */
public class SerVivo {
    protected String nombre;

    public SerVivo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "SerVivo{" + "nombre=" + nombre + '}';
    }    
    
}
