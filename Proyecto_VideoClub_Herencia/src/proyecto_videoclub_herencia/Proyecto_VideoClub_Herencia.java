/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_videoclub_herencia;

import paqEjecutable.Cliente;
import paqEjecutable.Producto;
import paqSubClases.CD;
import paqSubClases.Juego;
import paqSubClases.Pelicula;

/**
 *
 * @author Profesor
 */
public class Proyecto_VideoClub_Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Producto pt=new Producto("NOMBRE DEL PRODUCTO");
        
        Pelicula p=new Pelicula("ESPAÑOL",120,"DRAMA","MAR ADENTRO");
        System.out.println("Película p="+p);
        System.out.println("Precio de la película p="+p.getPrecio()+"€");
        System.out.println("Género de la película p="+p.getGenero());
        
        Producto pt;
        pt=p; //pt es un producto y p es una película
        pt.setNombre("LO QUE EL VIENTO SE LLEVÓ");
        System.out.println("Película p="+p);
        System.out.println("Producto pt="+pt);
        System.out.println("Género del producto pt ="+ ((Pelicula)pt).getGenero());
        
        CD cd=new CD(20,"ROCK","1982");
        cd.setGenero("FOLK");
        System.out.println("CD cd="+cd);
        pt=cd;
        System.out.println("Producto pt="+pt);
        
        Juego j=new Juego("XBox","EDUCACION","MARIO Y LAS MATEMÁTICAS");
        System.out.println("Juego j="+j);
        
        Cliente paco=new Cliente("Fco Fdez");
        paco.setNombre("Francisco Fdez");
        paco.alquilarProducto(p); //pt=p;
        paco.alquilarProducto(cd); //pt=cd;
        paco.alquilarProducto(p);
        
    }
    
}
