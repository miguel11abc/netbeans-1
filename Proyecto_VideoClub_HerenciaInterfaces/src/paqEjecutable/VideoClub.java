/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqEjecutable;

import java.util.ArrayList;
import paqExcepciones.AlquilarException;
import paqExcepciones.NoMasLimiteClientesException;
import paqExcepciones.NoMasLimiteProductosException;
import paqExcepciones.NoMasProductosAlquiladosPorClienteException;
import paqSubClases.CD;
import paqSubClases.Juego;
import paqSubClases.Pelicula;

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
    
    public void addProducto(Producto t)throws NoMasLimiteProductosException, IllegalArgumentException
    {
        if (this.listaProductos.size()==VideoClub.MAX_PRODUCTOS)
            throw new NoMasLimiteProductosException("Ya no se admiten más productos en "+this.nombre);
        if (this.listaProductos.contains(t))
            throw new IllegalArgumentException(t+" está ya dado de alta en "+this.nombre);
        else
            this.listaProductos.add(t);
    }
    
    public void addCliente(Cliente c)throws NoMasLimiteClientesException, IllegalArgumentException{
        if (this.listaClientes.size()==VideoClub.MAX_CLIENTES)
            throw new NoMasLimiteClientesException("Ya no se admiten más clientes en "+this.nombre);
        if (this.listaClientes.contains(c))
            throw new IllegalArgumentException(c+" está ya dado de alta en "+this.nombre);
        
        this.listaClientes.add(c);
    }
    
    public void devolverProducto(Cliente c, Producto t){
        c.devolverProducto(t);
    }
    
    public void alquilarProducto(Cliente c, Producto t)throws AlquilarException {
        c.alquilarProducto(t);
    }
    
    public void retirar(Producto t){
        t.retirar();       
    }
    
    
    @Override
    public String toString() {
        return "VideoClub{" + "Nombre=" + nombre + '}';
    }   
    
    //Método: mostrarProductosAgrupadosPorTipo(), Mostrar la lista de productos, en primer lugar todas las películas, luego los CDs y en último lugar los juegos.
    public void mostrarProductosAgrupadosPorTipo(){
        System.out.println("-------PELÍCULAS-------");
        //SELECT * FROM this.listaProductos WHERE producto es de tipo Pelicula
        for(Producto t: this.listaProductos )
        {
            if (t instanceof Pelicula){
                System.out.println("-"+t);
            }
        }
        System.out.println("\n-------CDS-------");
        //SELECT * FROM this.listaProductos WHERE producto es de tipo CD
        for(Producto t: this.listaProductos )
        {
            if (t instanceof CD){
                System.out.println("-"+t);
            }
        }
        System.out.println("\n-------JUEGOS-------");
        //SELECT * FROM this.listaProductos WHERE producto es de tipo Juego
        for(Producto t: this.listaProductos )
        {
            if (t instanceof Juego){
                System.out.println("-"+t);
            }
        }        
    }    
          
    //Método: obtenerPrecioTotalProductosAlquilados(), devuelve un int. Devuelve el precio total de todos los productos alquilados en el VideoClub
    public double obtenerPrecioTotalProductosAlquilados(){
        double total=0.0;
        for(Producto t: this.listaProductos){
            if (t.isAlquilado())
                total+=t.getPrecio();
        }
        return total;
    }
    
    //Método: mostrarPrecioProductosAlquiladosPorClientes(), muestra por cada cliente del videoclub el precio total de todos los productos que un Cliente c cliente tiene
    //alquilados.
    public double obtenerPrecioTotalProductosAlquilados(Cliente c){
        return c.obtenerPrecioTotalProductosAlquilados();         
    }
    
    //Método: mostrarDuracionPeliculasIdioma(String idioma), tal que dado un idioma, devuleve la duración de todas aquellas películas en la lista de productos con
    //de un idioma determinado.
    public void mostrarDuracionPeliculasIdioma(String idioma){        
        System.out.println("-------PELÍCULAS en :"+idioma+"-------");
        //SELECT duracion FROM this.listaProductos WHERE producto es Pelicula and Pelicula.idioma=idioma
        for(Producto t: this.listaProductos )
        {
            if (t instanceof Pelicula && ((Pelicula)t).getIdioma().equals(idioma)){
                System.out.println("-"+((Pelicula) t).getDuracion());
            }
        } 
    }
    
    //Método: mostrarGeneroPeliculasAlquiladasPor(Cliente c). Muestra el género de todas las películas que el cliente c del videoClub tiene alquiladas
    public void mostrarGeneroPeliculasAlquiladasPor(Cliente c){
        c.mostrarGeneroPeliculasAlquiladas();        
    }
    
    //Métodos añadidos para main()
    //Comprueba si el cliente cuyo nombre: nombre está en el videoclub
    public Cliente compruebaCliente(String nombre){
        nombre=nombre.trim().toUpperCase();
        Cliente c=null;
        boolean encontrado=false;
        for(Cliente t: this.listaClientes){
            if (t.getNombre().equals(nombre)){
                c=t;
                encontrado=true;
                break;
            }
        }
        return c;
    }
    
    //Comprueba si la película cuyo nombre: nombre está en el videoclub
    public Pelicula compruebaPelicula(String nombre){
        nombre=nombre.trim().toUpperCase();
        Pelicula c=null;
        boolean encontrado=false;
        for(Producto t: this.listaProductos){
            if (t instanceof Pelicula && t.getNombre().equals(nombre)){
                c=(Pelicula)t;
                encontrado=true;
                break;
            }
        }
        return c;
    }
    
    public void vender(Producto t, double precio){
        if (t instanceof Pelicula)
            ((Pelicula)t).vender(precio);   
        else if (t instanceof Juego)
            ((Juego)t).vender(precio); 
        else 
            System.out.println("Un CD no se puede vender");
    }
}
