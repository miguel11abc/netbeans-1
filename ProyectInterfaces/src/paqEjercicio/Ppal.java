/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqEjercicio;

import java.util.ArrayList;

/**
 *
 * @author Profesor
 */
public class Ppal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ropa r1=new Ropa("Pantalón",50);
        Ropa r2=new Ropa("Camisa",20);
        Ropa r3=new Ropa("Vestido",35);
        
        ArrayList <Producto> listaProduc=new ArrayList();
        listaProduc.add(r1);
        listaProduc.add(r2);
        listaProduc.add(r3);
        
        Alimentacion a1=new Alimentacion("Leche",1);
        Alimentacion a2=new Alimentacion("Cocholate",2);
        listaProduc.add(a1);
        listaProduc.add(a2);
        
        System.out.println("Lista de Productos - Alimentación como la Ropa");
        for(Producto p: listaProduc)
        {
            System.out.println("-"+p);
        }
        
        Viaje v1=new Viaje("Murcia","Moratalla",5,100);
        Viaje v2=new Viaje("Murcia","Cehegín",2,50);
        ArrayList <Viaje> listaViajes=new ArrayList();
        listaViajes.add(v1);
        listaViajes.add(v2);
        System.out.println("Lista de Viajes");
        for(Viaje p: listaViajes)
        {
            System.out.println("-"+p);
        }
        
        double precioProductos=0;
        for(Producto p: listaProduc)
        {
            precioProductos+=p.precioIva();
        }
        double precioViajes=0;
        for(Viaje p: listaViajes)
        {
            precioViajes+=p.precioIva();
        }
        System.out.println("Total ="+(precioProductos+precioViajes));
        
        //Otra forma de hacerlo: Diseñar un ArrayList de interface
        ArrayList <Vendible> listaCompra=new ArrayList();
        listaCompra.add(r1);  //Vendible e=r1
        listaCompra.add(r2);  //Vendible e=r2 
        listaCompra.add(r3);  //Vendible e=r3
        listaCompra.add(a1);  //
        listaCompra.add(a2);  //
        listaCompra.add(v1);
        listaCompra.add(v2);
        System.out.println("Lista de la Compra");
        for(Vendible p: listaCompra)
        {
            System.out.println("-"+p.toString());
        }
        double precioTotal=0;
        for(Vendible p: listaCompra)
        {
            precioTotal+=p.precioIva();
        }
        System.out.println("Total ="+precioTotal);
        
        System.out.println("Listado del Destino de los viajes de la Lista de Compra");
        for(Vendible p: listaCompra)
        {
           if (p instanceof Viaje){
               System.out.println("-"+((Viaje) p).getDestino());
           }
               
        }
        
        
        
    }
    
}
