/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqIntroduccion;

/**
 *
 * @author Profesor
 */
public class Generica<T>{
    T objeto;

    public Generica(T objeto) {
        this.objeto = objeto;
    }

    public T getObjeto() {
        return objeto;
    }

    @Override
    public String toString() {
        return "{" + "Objeto=" + objeto + " Tipo= "+objeto.getClass().getName()+'}';
    }    
}
