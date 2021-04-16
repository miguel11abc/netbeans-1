/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectfigura;

/**
 *
 * @author Profesor
 */
public abstract class Figura {
   protected int base;

    public Figura(int base) {
        this.base = base;
    }
      
   public abstract double area();
   
}
