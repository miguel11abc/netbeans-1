/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectvideoclub;

import java.util.ArrayList;

/**
 *
 * @author Profesor
 */
public class VideoClub {
    private String nombre;
    private ArrayList <Producto> productos=new ArrayList();
    private ArrayList <Cliente> clientes=new ArrayList();

    public VideoClub(String nombre) {
        this.nombre = nombre.trim();
    }

    public String getNombre() {
        return this.nombre;
    }

    public ArrayList<Producto> getProductos() {
        return this.productos;
    }

    public ArrayList<Cliente> getClientes() {
        return this.clientes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.trim();
    }
    
    public void addProducto(Producto p)
    {
        if (this.productos.contains(p))
            System.out.println("Ese producto está dado de alta");
        else
            this.productos.add(p);
    }
    
    public void addCliente(Cliente c)
    {
        if (this.clientes.contains(c))
            System.out.println("Ese cliente está dado de alta");
        else
            this.clientes.add(c);
    }

    public int getNumProductos()
    {
        return this.productos.size();
    }
    
    public int getNumClientes()
    {
        return this.clientes.size();
    }
    
    public void alquilar(Cliente c, Producto p)
    {
        c.alquilarProducto(p);
    }

    @Override
    public String toString() {
        String cadena="\n--------------- Nombre =" + this.nombre+"\n";
        if (!this.productos.isEmpty())        
        {
            cadena+="---PRODUCTOS---";
            for(Producto p: this.productos)
                cadena+="\n\t"+p;
        }
        if (!this.clientes.isEmpty())        
        {
            cadena+="\n---CLIENTES---";
            for(Cliente c: this.clientes)
                cadena+="\n\t"+c;
        }
        return cadena;
    }
    
    
}
