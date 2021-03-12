/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectcuestionariotema5;

/**
 *
 * @author Profesor
 */
public class Ejemplo {
    int x;

    public Ejemplo(int x) {
        this.x = x;
    }

    public Ejemplo()
    {
      this(0);
    }
    
    
    @Override
    public String toString() {
        return "{" + "x=" + this.x + '}';
    }
    
}
