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
}
