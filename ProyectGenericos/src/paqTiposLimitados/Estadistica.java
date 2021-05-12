/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqTiposLimitados;

/**
 *
 * @author Profesor
 */
public class Estadistica<T extends Number> {
    T numeros[];

    public Estadistica(T[] numeros) {
        this.numeros = numeros;
    }
    
    public double media(){
        double suma=0.0;
        for (int i = 0; i < numeros.length; i++) {
            suma+=numeros[i].doubleValue();
        }
        return suma/numeros.length;
    }
}
