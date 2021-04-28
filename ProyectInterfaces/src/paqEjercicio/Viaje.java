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
public class Viaje implements Vendible{
    private String origen, destino;
    private int ndias;
    private double precio;
    private static double iva=0.21;

    public Viaje(String origen, String destino, int ndias, double precio) {
        this.origen = origen;
        this.destino = destino;
        this.ndias = ndias;
        this.precio = precio;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public int getNdias() {
        return ndias;
    }

    public double getPrecio() {
        return precio;
    }

    public static double getIva() {
        return iva;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setNdias(int ndias) {
        this.ndias = ndias;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    
    
}
