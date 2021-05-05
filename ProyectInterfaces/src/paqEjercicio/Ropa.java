/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqEjercicio;

/**
 *
 * @author Profesor
 */
public class Ropa extends Producto{
    private static double iva=0.10;

    public Ropa(String nombre, double precio) {
        super(nombre, precio);
    }

    public static double getIva() {
        return iva;
    }

    @Override
    public String toString() {
        return "Ropa{" +super.toString()+ '}';
    }
    
    @Override //Vendible
    public double precioIva(){
        return this.precio+this.precio*Ropa.iva;
    }
    
    
    @Override
    public void advertencia(String s){
        System.out.println("Advertencia: "+s);        
    }

}
