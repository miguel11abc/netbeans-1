/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_videoclub_herencia;

import paqEjecutable.Cliente;
import paqEjecutable.VideoClub;
import paqExcepciones.NoMasLimiteClientesException;
import paqSubClases.CD;
import paqSubClases.Juego;
import paqSubClases.Pelicula;

/**
 *
 * @author Profesor
 */
public class ProgFuncional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1.
        VideoClub v=new VideoClub("VideoMax");
        //2.
        Cliente c1=new Cliente("FRANCISCO");
        Cliente c2=new Cliente("JAVIER");
        Cliente c3=new Cliente("PACO");
        Cliente c4=new Cliente("ANTONIO");
        Cliente c5=new Cliente("MIGUEL");
        //3.
        try{
            Pelicula p=new Pelicula("EEE",-10, "Ficcion","La armada invencible");
        }
        catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        //4
        System.out.println("Número de Productos en "+v.getNombre()+" = "+v.numProductos());
        //5
        Pelicula p1=new Pelicula("ESPAÑOL", 200,"FICCION","EL SEÑOR DE LOS ANILLOS");        
        Pelicula p2=new Pelicula("INGLÉS", 45, "Ficcion","The Hobbit");
        Pelicula p3=new Pelicula("INGLÉS",89,"Ficcion","Star Wars III");
        Pelicula p4=new Pelicula("ESPAÑOL",78,"COMEDIA","El discurso del Rey");
        Pelicula p5=new Pelicula("FRANCÉS", 123,"INFANTIL","Shrek");
        //6
        CD cd1=new CD(6,"ROCK","U2 Boy in 1980");
        CD cd2=new CD(8,"HARD ROCK","Queen Don’t stop now");
        //7
        Juego j1=new Juego("Play Station 4","EDUCATIVO","Simpsons Game");
        Juego j2=new Juego("Wii","VIOLENTO","Zelda");
        Juego j3=new Juego("Nintendo DS","ENTRETENIMIENTO","Mario Car");
        //8-6        
        v.addCliente(c1);
        v.addCliente(c2);
        v.addCliente(c3);
        v.addCliente(c4);
        try{
            v.addCliente(c5);
        }
        catch(NoMasLimiteClientesException e)
        {
            System.out.println("Error: "+e.getMessage());
            System.out.println("Estoy en el métod addCliente");
        }        
        catch(IllegalArgumentException ex)
        {
            System.out.println(ex.getMessage());
        }
        catch(Exception p)
        {
            System.out.println("Error desconocido...");
        }
        finally {
            System.out.println("HOLA");
        }
        try{
           v.addProducto(p1);
        }
        catch(Exception t)
        {
            System.out.println("");
        }
        v.addProducto(p2);
        v.addProducto(p3);
        v.addProducto(p4);
        v.addProducto(p5);
        v.addProducto(cd1);
        v.addProducto(cd2);
        v.addProducto(j1);
        v.addProducto(j2);
        v.addProducto(j3);
        try{
            v.addProducto(cd2);
        }catch(IllegalArgumentException ex)
        {
            System.out.println(ex.getMessage());
        }
        //9 Muestra el videoclub
        System.out.println("VideoClub "+v);
        //10 Muestra el número de productos que hay en el video club
        System.out.println("En el video club "+v.getNombre()+" hay "+v.numProductos()+" productos");
        //11 El cliente c1 ('Francisco') alquila la película p1: 'El Señor de los Anillos' y p2:'The Hobbit' desde el v            
        v.alquilarProducto(c1, p1); //Francisco - El señor de 
        v.alquilarProducto(c1, p2); //Francisco - Hobbit
        try {
             v.alquilarProducto(c1, p1);
        }catch(IllegalArgumentException ex)
        {
            System.out.println(ex.getMessage());
        }
        //11 El cliente c1 ('Francisco') alquila el juego j1:'Simpson Game' desde el v            
        v.alquilarProducto(c1, j1); //Francisco - Simpson Game
  
        c1.mostrarGeneroPeliculasAlquiladas();
    }
    
}
