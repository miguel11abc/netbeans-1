/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_videoclub_herencia;

import java.util.ArrayList;
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
        System.out.println("Duración de pt="+((CD)pt).getDuracion());
        
        Juego j=new Juego("XBox","EDUCACION","MARIO Y LAS MATEMÁTICAS");
        System.out.println("Juego j="+j);
        
        Cliente paco=new Cliente("Fco Fdez");
        paco.setNombre("Francisco Fdez");
        paco.alquilarProducto(p); //pt=p;
        paco.alquilarProducto(cd); //pt=cd;
        //paco.alquilarProducto(p);
        paco.alquilarProducto(j);
        
        ArrayList <Producto> listaProductos=paco.getProductosAlquilados();
        System.out.println("---LISTADO DE PRODUCTOS ALQUILADOS DE "+paco.getNombre());
        for(Producto t : listaProductos){
            System.out.println("-"+t);
        }
        System.out.println("\n\n----LISTADO DE PRODUCTOS ALQUILADOS -NOMBRE- CUYO PRECIO=1 DE: "+paco.getNombre());
        for(Producto t : listaProductos){
            if (t.getPrecio()==1)
              System.out.println("-"+t.getNombre());
        }
        
        System.out.println("\n\n----LISTADO DE PELÍCULAS ALQUILADAS -GENERO- DE: "+paco.getNombre());
        for(Producto t : listaProductos){
            if (t instanceof Pelicula && (t.getId()>=1 && t.getId()<=5))
              System.out.println("-"+((Pelicula)t).getGenero());
        }
      
        System.out.println("\n\n--- LISTADO DE JUEGOS ALQUILADOS POR "+paco.getNombre());
        for(Producto t: listaProductos)
        {
            if (t instanceof Juego)
                System.out.println("- Nombre: "+t.getNombre()+"  "+((Juego) t).getPlataforma());
            
        }
        
        Pelicula p1=new Pelicula("ESPAÑOL",120,"FICCION","SCARFACE");
        Pelicula p2=new Pelicula("FRANCÉS",14,"DRAMA","ROUGE");
        paco.alquilarProducto(p1);
        paco.alquilarProducto(p2);
        
        //Contar el número de películas alquiladas por Paco que están en ESPAÑOL
        System.out.print("\n\n---PELÍCULAS ALQUILADAS EN ESPAÑOL POR "+paco.getNombre());
        int cont=0;
        for(Producto t: listaProductos)
        {
            if (t instanceof Pelicula)
                if (((Pelicula) t).getIdioma().equals("ESPAÑOL"))
                    cont++;            
        }
        System.out.println(cont);
        
        //Las películas alquiladas (nombre, género) por Paco que estén en ESPAÑOL
        System.out.println("\n\nNOMBRE Y GÉNERO DE LAS PELÍCULAS ALQUILADAS EN ESPAÑOL POR "+paco.getNombre());
        for(Producto t:listaProductos){
            if (t instanceof Pelicula)
                if (((Pelicula) t).getIdioma().equals("ESPAÑOL"))
                    System.out.println("-Nombre: "+t.getNombre()+" Género: "+((Pelicula) t).getGenero());
        }
        
        
    }
    
}
