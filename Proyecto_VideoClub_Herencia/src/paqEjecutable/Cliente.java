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
   private ArrayList <Producto> productosAlquilados=new ArrayList();

    public Cliente(String nombre) {
        this.nombre = nombre;
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
        this.nombre = nombre;
    }
    
    public void alquilarProducto(Producto pt)
    {
        if (this.productosAlquilados.contains(pt))
            System.out.println(pt+" está ya alquilado");
        else 
            this.productosAlquilados.add(pt);
    }

    @Override
    public String toString() {
        return "Cliente{" + "Id=" + id + " Nombre=" + nombre + '}';
    }
   
       
   
}
