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
    private String nombre;
    private ArrayList <Producto> productosAlquilados=new ArrayList();
    private static int contClientes=0;
        
    public Cliente(String nombre) {        
        this.nombre = nombre.trim();
        Cliente.contClientes++;
        this.id = Cliente.contClientes;
    }

    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public ArrayList<Producto> getProductosAlquilados() {
        return this.productosAlquilados;
    }

    public static int getContClientes() {
        return Cliente.contClientes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.trim();
    }
   
    public void alquilarProducto(Producto p)
    {
      if (this.productosAlquilados.contains(p))
          System.out.println("Ya tiene "+p+" alquilado");
      else 
          this.productosAlquilados.add(p);        
    }
    
    public boolean devolverProducto(Producto p)
    {
       if (this.productosAlquilados.contains(p))
       {
           this.productosAlquilados.remove(p);
           return true;
       }
       else return false;
    }
    
    public boolean contieneProducto(Producto p)
    {
        if (this.productosAlquilados.contains(p))       
           return true;
        else
            return false;
    }
    @Override
    public String toString() {
        String cadena="[ Id=" + this.id + " Nombre=" + this.nombre; 
        if (this.productosAlquilados.isEmpty()) cadena+=']';
        else
        {
            cadena+="---PRODUCTOS ALQUILADOS---";
            for(Producto p: this.productosAlquilados)
                cadena+="\n\t\t"+p;
        }
        return cadena;
    }
    
    
}
