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
public class VideoClub {
   private String nombre;
   private ArrayList <Cliente> listaClientes=new ArrayList<Cliente>();
   private ArrayList <Producto> listaProductos=new ArrayList<Producto>();
   private static int MAX_CLIENTES=20;
   private static int MAX_PRODUCTOS=50;
   
    public VideoClub(String nombre) {
        this.nombre = nombre.trim().toUpperCase();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.trim().toUpperCase();
    }
   
    public int numProductos()
    {
        return this.listaProductos.size();
    }        
    
    public int numClientes()
    {
        return this.listaClientes.size();
    }
    
    public void addProducto(Producto t)throws IllegalArgumentException
    {
        if (this.listaProductos.size()==VideoClub.MAX_PRODUCTOS)
            throw new IllegalArgumentException("Ya no se admiten más productos en "+this.nombre);
        if (this.listaProductos.contains(t))
            throw new IllegalArgumentException(t+" está ya dado de alta en "+this.nombre);
        else
            this.listaProductos.add(t);
    }
    
    public void addCliente(Cliente c)throws IllegalArgumentException{
        if (this.listaClientes.size()==VideoClub.MAX_CLIENTES)
            throw new IllegalArgumentException("Ya no se admiten más clientes en "+this.nombre);
        if (this.listaClientes.contains(c))
            throw new IllegalArgumentException(c+" está ya dado de alta en "+this.nombre);
        else
            this.listaClientes.add(c);
    }
    
    public void alquilarProducto(Cliente c, Producto t) throws IllegalArgumentException{
        c.alquilarProducto(t);
    }

    @Override
    public String toString() {
        return "VideoClub{" + "Nombre=" + nombre + '}';
    }
    
    
}
