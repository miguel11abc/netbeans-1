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
public class Cuadrado extends Figura{

    public Cuadrado(int base) {
        super(base);
    }
    
    @Override
    public double area(){
       return this.base*this.base;
    }
    
    public void muestraBase()
    {
        System.out.println("La base del cuadrado es "+this.base);
    }
}
