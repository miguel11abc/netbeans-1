/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqEj1;

import java.util.NoSuchElementException;

/**
 *
 * @author Profesor
 */
public interface ColeccionInterfaz {
   public boolean estaVacia();
   public Object extraer() throws NoSuchElementException;
   public Object primero() throws NoSuchElementException;
   public boolean aniadir(Object objeto);  
}
