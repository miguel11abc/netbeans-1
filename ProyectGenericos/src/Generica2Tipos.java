/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Profesor
 */
public class Generica2Tipos<T,V> {
    T objeto1;
    V objeto2;

    public Generica2Tipos(T objeto1, V objeto2) {
        this.objeto1 = objeto1;
        this.objeto2 = objeto2;
    }

    public T getObjeto1() {
        return objeto1;
    }

    public V getObjeto2() {
        return objeto2;
    }

    @Override
    public String toString() {
        return "{" + "objeto1=" + objeto1 + ", objeto2=" + objeto2 + '}';
    }
    
    
}
