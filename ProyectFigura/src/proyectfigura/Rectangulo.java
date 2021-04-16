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
public class Rectangulo extends Figura{
    protected int altura;

    public Rectangulo(int altura, int base) {
        super(base);
        this.altura = altura;
    }
    
    @Override
    public double area(){
        return this.altura*this.base;
    }
}
