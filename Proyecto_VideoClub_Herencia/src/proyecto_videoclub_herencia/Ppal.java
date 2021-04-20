/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_videoclub_herencia;

import java.util.ArrayList;
import paqEjecutable.*;
import paqSubClases.*;

/**
 *
 * @author Profesor
 */
public class Ppal {

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
        Pelicula p1=new Pelicula("ESPAÑOL", 200, "FICCION","EL SEÑOR DE LOS ANILLOS");
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
        v.addProducto(p1);
        v.addProducto(p2);
        v.addProducto(p3);
        v.addProducto(p4);
        v.addProducto(p5);
        v.addProducto(cd1);
        v.addProducto(cd2);
        v.addProducto(j1);
        v.addProducto(j2);
        v.addProducto(j3);
        //7 El cliente c1 ('Francisco') alquila la película p1: 'El Señor de los Anillos' y p2:'The Hobbit' desde el v
        v.alquilarProducto(c1, p1); //Francisco - El señor de 
        v.alquilarProducto(c1, p2); //Francisco - Hobbit
        //8 --- Mostrar el número de Películas del VideoClub
        ArrayList <Producto> productosVideoMax=v.getListaProductos();
        int contP=0;
        for(Producto t: productosVideoMax)
        {
            if (t instanceof Pelicula) contP++;
        }
        System.out.println("Hay en "+v.getNombre()+" "+contP+" películas");
        
        /*
        contP=0; 
        for(Producto t: productosVideoMax)
        {
            if (t instanceof Pelicula) 
            {
              contP=Pelicula.getContPeliculas();
              break;
            }  
        }
        
        System.out.println("Hay en "+v.getNombre()+" "+contP+" películas");
        */
        //9 ---Mostrar el número de clientes
        System.out.println("En "+v.getNombre()+" hay "+v.numClientes());
        //10
        v.alquilarProducto(c2, p3);
        //11 Obtener la lista de clientes registrados en el videoClub v
        // Por cada cliente, mostrar las películas alquiladas
        ArrayList <Cliente> clientesVideoMax=v.getListaClientes();
        System.out.println("\n\n---LISTADO DE CLIENTES DE "+v.getNombre());
        for(Cliente c: clientesVideoMax){
            System.out.println("\nCliente:"+c);
            System.out.println("\t--PRODUCTOS ALQUILADOS POR "+c.getNombre());
            ArrayList<Producto> productosAlquiladosC=c.getProductosAlquilados();
            if (productosAlquiladosC.isEmpty())
                System.out.println("No tiene productos alquilados");
            else{
                for(Producto t: productosAlquiladosC)
                 System.out.println(t);
            }
        }
        //12 Obtener la lista de productos registrados en el videoClub v.
        productosVideoMax=v.getListaProductos();
        if (!productosVideoMax.isEmpty())
          for(Producto t: productosVideoMax){
            System.out.println(t);
          }
        else System.out.println(v.getNombre()+" No tiene todavía productos");
        //13
        // Obtener la lista de productos alquilados por el cliente c1: 'Francisco' (id y nombre)
        clientesVideoMax=v.getListaClientes();
        for(Cliente c: clientesVideoMax){
            if (c.getId()==c2.getId())
            {
                System.out.println("\t--PRODUCTOS ALQUILADOS POR "+c.getNombre());
                ArrayList<Producto> productosAlquiladosC=c.getProductosAlquilados();
                if (productosAlquiladosC.isEmpty())
                   System.out.println("No tiene productos alquilados");
                else{
                 for(Producto t: productosAlquiladosC)
                 System.out.println(t.getId()+" "+t.getNombre());
            }
          }
        }   
        //14
        Pelicula p6=new Pelicula(p3);
        System.out.println("p6="+p6);
        //15
        //16
        //Se desea mostrar el género de todas las películas con id comprendido entre 3 y 5 que tiene el
        //videoClub v.
        productosVideoMax=v.getListaProductos();
        System.out.println("---LISTA DE PELÍCULAS -GÉNERO- CON ID>=3 Y id<=50");
        for(Producto t:productosVideoMax)
        {
            if (t instanceof Pelicula)
                if (t.getId()>=3 && t.getId()<=5)
                    System.out.println(((Pelicula) t).getGenero());
        }
        //17
        //Se desea mostrar la id y nombre de aquellos CD del videoClub v cuyo género contenga la palabra
        //"ROCK"
        System.out.println("--LISTA DE CD'S QUE SEAN ROCK DE "+v.getNombre());
        for(Producto t: productosVideoMax){
            if (t instanceof CD)
                if (((CD)t).getGenero().contains("ROCK"))
                    System.out.println("-"+t.getNombre());
        }   
        //18
        for(Cliente c: clientesVideoMax){
            if (c.getId()==c2.getId())
            {
                System.out.println("\t--PELÍCULAS ALQUILADAS POR "+c.getNombre());
                ArrayList<Producto> productosAlquiladosC=c.getProductosAlquilados();
                if (productosAlquiladosC.isEmpty())
                   System.out.println("No tiene productos alquilados");
                else{
                 for(Producto t: productosAlquiladosC)
                     if (t instanceof Pelicula){
                         System.out.println(t.getNombre()+" "+((Pelicula)t).getIdioma());
                     }                 
                }
            }
        } 
        //19
        
}
}
 
