/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqEjecutable;

import paqInterfaces.Alquilable;
import paqInterfaces.Retirable;

/**
 *
 * @author Profesor
 */
public abstract class Producto implements Alquilable, Retirable{
    protected int id;
    protected String nombre;
    protected double precio;
    protected static int contProductos=0;
    protected boolean retirado=false, alquilado=false;
    
    public Producto(String nombre)
    {
      this.nombre=nombre.trim().toUpperCase();
      Producto.contProductos++;
      this.id=Producto.contProductos;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double getPrecio();
    
    public static int getContProductos() {
        return contProductos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.trim().toUpperCase();
    }

    @Override
    public String toString() {
        return "Producto{" + "Id=" + id + " Nombre=" + nombre + " Precio=" + precio + '}';
    }
    
    //Métodos de la interface Alquilable
    //El método alquilar NO se implementa
    @Override
    public boolean isAlquilado(){
        return this.alquilado;        
    }
    
    @Override
    public void devolver(){
        this.alquilado=false;
        System.out.println(this.id+" devuelto");
    }
    
    public static void soyEstatico(){
        System.out.println("soy el método soyEstatico en Producto");
    }
    //Métodos de la interface Retirable
    @Override
    public void retirar(){
       if (!this.alquilado && !this.retirado){
           this.retirado=true;
           System.out.println(this.id+" retirado");
       }
       else if (this.alquilado){
           System.out.println("Producto con id: "+this.id+" ya alquilado, no se puede retirar");
       }
       else System.out.println("Producto con id: "+this.id+" YA retirado");
    }
    
    @Override
    public boolean isRetirado(){
        return this.retirado;
    }

}
