/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqSeguridad;

/**
 *
 * @author Profesor
 */
public class NoGenerica {
   Object objeto;

    public NoGenerica(Object objeto) {
        this.objeto = objeto;
    }

    public Object getObjeto() {
        return objeto;
    }

    @Override
    public String toString() {
        return "{Objeto=" + objeto + "Tipo ="+objeto.getClass().getName()+'}';
    } 
   
}
