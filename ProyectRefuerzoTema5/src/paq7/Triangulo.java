/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paq7;

/**
 *
 * @author Profesor
 */
public class Triangulo {
    private double base,altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "{" + "Base=" + this.base + "\tAltura=" + this.altura + '}';
    }
    
    public double area()
    {
        return (this.base*this.altura)/2;
    }
        
    public double perimetro()
    {
       return this.base+(this.altura*2);    
    }
}
