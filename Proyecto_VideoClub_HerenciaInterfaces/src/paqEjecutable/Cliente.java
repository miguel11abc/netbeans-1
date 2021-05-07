/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqEjecutable;

import java.util.ArrayList;
import paqExcepciones.AlquilarException;
import paqExcepciones.NoMasProductosAlquiladosPorClienteException;
import paqSubClases.Pelicula;

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
    
    public void alquilarProducto(Producto pt) throws NoMasProductosAlquiladosPorClienteException, AlquilarException
    {
        if (this.productosAlquilados.size()==Cliente.MAX_PRODUCTOS_ALQUILADOS)
            throw new NoMasProductosAlquiladosPorClienteException("El cliente "+this.nombre+" ya tiene "+Cliente.MAX_PRODUCTOS_ALQUILADOS +" productos alquilados");
        if (this.productosAlquilados.contains(pt))
            throw new AlquilarException(pt+" está ya alquilado por "+this.nombre);
        else {  
             pt.alquilar();        
             this.productosAlquilados.add(pt);
        }
    }
    
    public void devolverProducto(Producto pt) throws IllegalArgumentException
    {
        if (!this.productosAlquilados.contains(pt))
             throw new IllegalArgumentException(pt+" NO está ya alquilado por "+this.nombre);
        else {
             this.productosAlquilados.remove(pt);
             pt.alquilado=false;
        }
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
    
    //Métodos llamados por VideoClub
    public double obtenerPrecioTotalProductosAlquilados(){
        double total=0.0;
       /*
       for(Producto t: this.productosAlquilados){
       if (t.isAlquilado())
       total+=t.getPrecio();
       }
        */
       //SELECT SUM(precio) FROM productosAlquilados WHERE isAlquilado
       total = this.productosAlquilados.stream() //tabla
                   .filter((t) -> (t.isAlquilado())) //where
                   .map((t) -> t.getPrecio())//select precio
                   .reduce(total, (accumulator, _item) -> accumulator + _item);
        return total;
    }    
    
    public void mostrarGeneroPeliculasAlquiladas(){
        System.out.println("----PELÍCULAS ALQUILADAS POR "+this.nombre+"-----");
//SELECT genero FROM productosAlquilados WHERE es Pelicula 
/*
        for(Producto t: this.productosAlquilados){
            if (t instanceof Pelicula)
                System.out.println("-"+((Pelicula)t).getGenero());
        }   
*/
//Programación Funcional
     this.productosAlquilados.stream()
           .filter(t -> t instanceof Pelicula)
           .map(t -> ((Pelicula)t).getGenero())
           .forEach(t -> System.out.println("-"+t));
             
    }
    
}
