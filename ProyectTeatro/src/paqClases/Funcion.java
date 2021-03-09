/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqClases;

/**
 *
 * @author Profesor
 */
public class Funcion {
    private String nombre;
    private double precio;

    //CONSTRUCTOR PATRÓN
    public Funcion(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Funcion()
    {
        this("",0.0f);
    }
    
    public Funcion(Funcion other)
    {
        this(other.nombre, other.precio);    
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    @Override
    public String toString() {
        return "[" + "Nombre=" + this.nombre + "\tPrecio=" + this.precio + ']';
    }
    
    public boolean equals(Funcion other)
    {
        if (this.nombre==other.nombre && this.precio==other.precio)
            return true;
        else
            return false;
    }
    
}
