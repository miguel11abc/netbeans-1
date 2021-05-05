/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_videoclub_herencia;

import java.util.ArrayList;
import paqEjecutable.*;
import paqEnumeraciones.GeneroPelis;
import paqExcepciones.AlquilarException;
import paqExcepciones.CapacidadArrayException;
import paqExcepciones.NoMasLimiteClientesException;
import paqExcepciones.NoMasProductosAlquiladosPorClienteException;
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
        //12 Mostrar el número de clientes de VideoClub v
        int numClientesVideoMax=v.numClientes();
        System.out.println("El videoClub "+v.getNombre()+" tiene "+numClientesVideoMax+" clientes");
        //13 Muestra por pantalla los productos alquilador por el cliente: Francisco c1
        //- Creo un método en VideoClub para que devuelva un Cliente cuyo nombre sea xxx
        Cliente cl=v.compruebaCliente("FRANCISCO");
        if (cl==null){
            System.out.println("El videoClub no tiene ese cliente");
        }
        else{
        System.out.println("---LISTADO DE PRODUCTOS ALQUILADOS POR FRANCISCO ---");
        for(Producto t: cl.getProductosAlquilados())
            System.out.println("-"+t);
        }
        //14 El cliente: ‘Francisco’ quiere alquilar la película: ‘The Hobbit’
        try{
            v.alquilarProducto(c1, p2); //Francisco - Hobbit
        }catch(AlquilarException | NoMasProductosAlquiladosPorClienteException e){
            System.out.println(e.getMessage());
        }  
        catch(IllegalArgumentException p){
            System.out.println("Error desconocido");
        }
        
        //15 --- Mostrar el número de Películas del VideoClub
        ArrayList <Producto> productosVideoMax=v.getListaProductos();
        int contP=0;
        for(Producto t: productosVideoMax)
        {
            if (t instanceof Pelicula) contP++;
        }
        System.out.println("Hay en "+v.getNombre()+" "+contP+" películas");
        
        //Otra forma---
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
        
        //16 El cliente: 'Javier' alquila la película: 'Star Wars III'. //desde el objeto videoclub        
        v.alquilarProducto(c2, p3);
        
        //17 Obtener la lista de clientes registrados en el videoClub v
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
        
        //18 Obtener la lista de productos registrados en el videoClub v.
        productosVideoMax=v.getListaProductos();
        if (!productosVideoMax.isEmpty())
          for(Producto t: productosVideoMax){
            System.out.println(t);
          }
        else System.out.println(v.getNombre()+" No tiene todavía productos");
        
        //19
        // Obtener la lista de productos alquilados por el cliente c1: 'Francisco' (id y nombre)
        cl=v.compruebaCliente("FRANCISCO");
        if (cl==null){
            System.out.println("El videoClub no tiene ese cliente");
        }
        else{
        System.out.println("---LISTADO DE PRODUCTOS ALQUILADOS POR FRANCISCO ---");
        for(Producto t: cl.getProductosAlquilados())
            System.out.println("- Id: "+t.getId()+" Nombre: "+t.getNombre());
        }   
        //20 El cliente: ‘Francisco’ quiere devolver la película: ‘El Señor de los Anillos’.
        c1.devolverProducto(p1);         
        //21 Se pide retirar por defectuosa la película: ‘The Hobbit’
        //- Creo un método en VideoClub para que devuelva una Pelicula cuyo nombre sea xxx
        Pelicula pl=v.compruebaPelicula("The Hobbit");
        v.retirar(pl);
        
        //22 Se pide retirar por defectuosa la película: ‘Shrek’
        //- Creo un método en VideoClub para que devuelva una Pelicula cuyo nombre sea xxx
        pl=v.compruebaPelicula("Shrek");
        v.retirar(pl);
        
        //23 La película ‘El Señor de los Anillos’ se vende por 4€.
        pl=v.compruebaPelicula("El Señor de los Anillos");
        v.vender(pl,4);
        
        //24 Crea una película p6 que posea las mismas características que p3: 'Star Wars III', evidentemente con otro id.
        Pelicula p6=new Pelicula(p3);
        System.out.println("p6="+p6);
        
        
        //25 Se desea tener una lista completa de los productos del videoClub v que esté organizada por tipo
        // de producto, es decir, que aparezcan en primer lugar toda la información de Películas, después de
        // CD y en último lugar los Juegos
        System.out.println("---LISTADO DE PELÍCULAS DE "+v.getNombre());
        for(Producto t: productosVideoMax){
            if (t instanceof Pelicula)
                System.out.println("-"+t);
        }
        System.out.println("---LISTADO DE CD'S DE "+v.getNombre());
        for (int i = 0; i < productosVideoMax.size(); i++) {
            if (productosVideoMax.get(i) instanceof CD)
                System.out.println(productosVideoMax.get(i));
        }
        System.out.println("---LISTADO DE JUEGOS DE "+v.getNombre());
        for(Producto t: productosVideoMax){
            if (t instanceof Juego)
                System.out.println("-"+t);
        }
        
        //26
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
        
        //27
        //Se desea mostrar la id y nombre de aquellos CD del videoClub v cuyo género contenga la palabra
        //"ROCK"
        System.out.println("--LISTA DE CD'S QUE SEAN ROCK DE "+v.getNombre());
        for(Producto t: productosVideoMax){
            if (t instanceof CD)
                if (((CD)t).getGenero().contains("ROCK"))
                    System.out.println("-"+t.getNombre());
        }
        
        //28
        cl=v.compruebaCliente("JAVIER");        
        ArrayList<Producto> productosAlquiladosC=cl.getProductosAlquilados();
        if (productosAlquiladosC.isEmpty())
                   System.out.println("No tiene productos alquilados");
        else{
            System.out.println("\t--PELÍCULAS ALQUILADAS POR "+cl.getNombre());
            for(Producto t: productosAlquiladosC)
                     if (t instanceof Pelicula){
                         System.out.println(t.getNombre()+" "+((Pelicula)t).getIdioma());
                     }                 
            }
         
        //29 Se desea saber el número de películas que están alquiladas por c1: “Francisco” están en el
        //idioma: “ESPAÑOL” 
        c1=v.compruebaCliente("Francisco");
        productosAlquiladosC=cl.getProductosAlquilados();                
        if (productosAlquiladosC.isEmpty())
            System.out.println("No tiene productos alquilados");
        else{
            System.out.print("\t--Número de Películas alquiladas en ESPAÑOL por "+cl.getNombre());   
            int contPeliculasC1=0;   
            for(Producto t: productosAlquiladosC){
                if (t instanceof Pelicula){
                    if (((Pelicula) t).getIdioma().equals("ESPAÑOL")) 
                         contPeliculasC1++;
                }  
            }
            System.out.println(contPeliculasC1);
        }
        
        //30 Obtener el precio de los productos alquilados por cada cliente
        for(Cliente c: v.getListaClientes())
        {
            double precioProductos=0.0f;
            for(Producto t: c.getProductosAlquilados()){
                precioProductos+=t.getPrecio();
            }
            System.out.println("El cliente "+c.getNombre()+" con id: "+c.getId()+" tiene alquilados productos por "+precioProductos+"€");
        }
        
        //31 Obtener el precio total de todos los productos alquilados
        double precioTotal=0.0f;
        for(Cliente c: v.getListaClientes())
        {            
            for(Producto t: c.getProductosAlquilados()){
                precioTotal+=t.getPrecio();
            }            
        }
        System.out.println("El coste de todos los productos alquilados es "+precioTotal+"€");
        
        //32 Se desea saber la duración de las películas del videoClub cuyo idioma sea uno introducido por teclado
        String nombreIntro="ESPAÑOL";
        System.out.println("----DURACIÓN DE LAS PELÍCULAS EN "+nombreIntro+"---------");
        for(Producto t: v.getListaProductos()){
            if (t instanceof Pelicula){
                System.out.println("Duración de "+t.getNombre()+" tiene una duración es "+((Pelicula) t).getIdioma()+" minutos");
            }
        }
        
        //33 Indicad qué género poseen las películas que tiene alquiladas el cliente c1."FRANCISCO"
        cl=v.compruebaCliente("Francisco");
        // Género:
        System.out.println("Géneros de películas alquiladas por Francisco");
        for(GeneroPelis gp: GeneroPelis.values()){           
            for(Producto t: cl.getProductosAlquilados()){
                if (t instanceof Pelicula){
                    if (((Pelicula)t).getGenero().equals(gp)){
                        System.out.println("Género: "+gp.name());
                        break;
                    }
                }
            }            
        }
        
       
    }
}
 
