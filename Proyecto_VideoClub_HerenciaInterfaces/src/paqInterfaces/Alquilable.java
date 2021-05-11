/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqInterfaces;

import paqExcepciones.AlquilarException;

/**
 *
 * @author Profesor
 */
public interface Alquilable {
    public void alquilar() throws AlquilarException;
    public void devolver();
    public boolean isAlquilado();
    public default void nuevometodo(){
        metodoPrivado();
        System.out.println("nuevo Método");
    }
    private void metodoPrivado(){
        System.out.println("Mi uso es solo conocido en la interface Alquilable");
    }  
    public static void soyEstatico(){
        System.out.println("Soy un método estático de Alquilable");
    } 
}
