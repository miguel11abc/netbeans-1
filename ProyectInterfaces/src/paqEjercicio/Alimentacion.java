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
public class Alimentacion extends Producto{
    private static double iva=0.04;

    public Alimentacion(String nombre, double precio) {
        super(nombre, precio);
    }

    public static double getIva() {
        return iva;
    }

    @Override
    public String toString() {
        return "Alimentacion{" +super.toString()+ '}';
    }
    
    @Override
    public double precioIva(){
        return this.precio+this.precio*Alimentacion.iva;
    }
    
    @Override
    public void advertencia(String s){
        System.out.println("Método advertencia de interfaceEjemplo "+s);
    }
}
