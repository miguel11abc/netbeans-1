/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqEjecutable;

import java.util.ArrayList;

/**
 *
 * @author Profesor
 */
public class Cliente {
   private int id;
   private static int contClientes=0;
   private String nombre;
   private ArrayList <Producto> productosAlquilados=new ArrayList <Producto>();
   private final static int MAX_PRODUCTOS_ALQUILADOS=5;
   
    public Cliente(String nombre) {
        this.nombre = nombre.trim().toUpperCase();
        Cliente.contClientes++;
        this.id=Cliente.contClientes;
    }

    public int getId() {
        return id;
    }

    public static int getContClientes() {
        return contClientes;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Producto> getProductosAlquilados() {
        return productosAlquilados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.trim().toUpperCase();
    }
    
    public void alquilarProducto(Producto pt) throws IllegalArgumentException //pt=p  pt=cd pt=j
    {
        if (this.productosAlquilados.size()==Cliente.MAX_PRODUCTOS_ALQUILADOS)
            throw new IllegalArgumentException("El cliente "+this.nombre+" ya tiene "+Cliente.MAX_PRODUCTOS_ALQUILADOS +" productos alquilados");
        if (this.productosAlquilados.contains(pt))
            throw new IllegalArgumentException(pt+" está ya alquilado por "+this.nombre);
        else 
            this.productosAlquilados.add(pt);
    }

    @Override
    public String toString() {
        String cadena="Cliente{" + "Id=" + id + " Nombre=" + nombre + '}';
        if (this.productosAlquilados.isEmpty())
            cadena+="no tiene productos alquilados";
        else{
            for(Producto t: this.productosAlquilados)
                cadena+=t;
           }
        return cadena;
    }
   
       
   
}
