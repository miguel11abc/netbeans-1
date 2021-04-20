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

    public VideoClub(String nombre) {
        this.nombre = nombre;
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
        this.nombre = nombre;
    }
   
    public int numProductos()
    {
        return this.listaProductos.size();
    }        
    
    public int numClientes()
    {
        return this.listaClientes.size();
    }
    
    public void addProducto(Producto t){
        if (this.listaProductos.contains(t))
            System.out.println(t+" está ya dado de alta");
        else
            this.listaProductos.add(t);
    }
    
    public void addCliente(Cliente c){
        if (this.listaClientes.contains(c))
            System.out.println(c+" está ya dado de alta");
        else
            this.listaClientes.add(c);
    }
    
    public void alquilarProducto(Cliente c, Producto t){
        c.alquilarProducto(t);
    }

    @Override
    public String toString() {
        return "VideoClub{" + "Nombre=" + nombre + '}';
    }
    
    
}
