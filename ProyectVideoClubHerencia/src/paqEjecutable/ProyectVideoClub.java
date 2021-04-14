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
public class ProyectVideoClub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* 
       Producto p1=new Producto("Star Wars I",23,1.21,"INGLES");
       System.out.println("p1= "+p1);
       Producto p2=new Producto("Star Wars II",13,1.6,"ESPAÑOL");
       System.out.println("p2="+p2);
       
       Producto p3=new Producto(p1);
       System.out.println("p3="+p3);
       
       Cliente c1=new Cliente("Miguel");
        System.out.println("c1="+c1);
       c1.alquilarProducto(p3);
       c1.alquilarProducto(p1);
       c1.alquilarProducto(p1);
       System.out.println("c1="+c1);
       */
       
       //1 
       VideoClub v=new VideoClub("VideoMax");
        System.out.println("Video Club v="+v);
       //2 Crear 4 clientes: Francisco Javier Paco Antonio
       Cliente c1=new Cliente("Francisco");
       Cliente c2=new Cliente("Javier");
       Cliente c3=new Cliente("Paco");
       Cliente c4=new Cliente("Antonio");
       System.out.println("c4="+c4);
       //3
       Producto p1=new Producto("Star Wars III",2.3,1.23,"ESPAÑOL");
       Producto p2=new Producto("El señor de los anillos",2.3,1.23,"ESPAÑOL");
       Producto p3=new Producto("Shrek",2.3,1.23,"ESPAÑOL");
       Producto p4=new Producto("Hobbit",2.3,1.23,"ESPAÑOL");
       Producto p5=new Producto("El discurso del Rey",2.3,1.23,"ESPAÑOL");
       //4
       v.addCliente(c1);
       v.addCliente(c2);
       v.addCliente(c3);
       v.addCliente(c4);
       v.addProducto(p1);
       v.addProducto(p2);
       v.addProducto(p3);
       v.addProducto(p4);
       v.addProducto(p5);
       System.out.println("Video Club v="+v);
       //5
       v.alquilar(c1, p2);
       v.alquilar(c1, p4);
       System.out.println("\n\nVideo Club v="+v);
       //6 ¿Cuántos productos tiene el videoclub?
        System.out.println("Número de productos "+v.getNumProductos());
       //7 ¿Cuántos clientes tiene el videoclub?
       System.out.println("Número de clientes "+v.getNumClientes());
       //8 El cliente: 'Javier' alquila la película: 'Star Wars III'.
       v.alquilar(c2, p1);
       System.out.println("\n\nVideo Club v="+v);
       //9 Obtener la lista de clientes registrados.
       ArrayList <Cliente> listaC=v.getClientes();
       System.out.println("--------------LISTA DE CLIENTES DE VIDEOMAX-------");
       for(Cliente c: listaC)
            System.out.println("---"+c);
       //10 Obtener la lista de productos registrados.
       ArrayList<Producto> listaP=v.getProductos();
       System.out.println("--------------LISTA DE PRODUCTOS DE VIDEOMAX-------");
       for(Producto p: listaP)
            System.out.println("---"+p);
       //11 Obtener la lista de productos alquilados por el cliente: 'Francisco'.
       System.out.println("--------------LISTA DE PRODUCTOS ALQUILADOS POR FRANCISCO-------");
       for(Cliente c: listaC)
       {   
           if (c.getNombre()=="Francisco")
               System.out.println("---"+c);
       } 
       
    }
    
}
