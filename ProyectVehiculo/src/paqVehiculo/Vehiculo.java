/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqVehiculo;

import paqExcepciones.PotenciaIncorrecta;
import paqExcepciones.PrecioIncorrecto;

/**
 *
 * @author Profesor
 */
public class Vehiculo {
    protected double precio;
    protected int potencia;
    protected String modelo;
        
    public Vehiculo(double precio, int potencia, String modelo) throws PrecioIncorrecto, PotenciaIncorrecta, IllegalArgumentException{
        if (precio < 0)
            throw new PrecioIncorrecto("No puedo crear coche con precio negativo");
        if (potencia < 0)
            throw new PotenciaIncorrecta("No puedo crear coche sin potencia");
        modelo=modelo.trim().toUpperCase();
        if (modelo != "SEAT IBIZA")
            throw new IllegalArgumentException("No es SEAT IBIZA");
        this.precio=precio;
        this.potencia=potencia;
        this.modelo=modelo;
    }
    
    
    public void setPotencia(int potencia)throws PotenciaIncorrecta
    {
        if (potencia < 0)
            throw new PotenciaIncorrecta();
        this.potencia=potencia;
    }
    
    public void setPrecio(double precio)throws PrecioIncorrecto
    {
        if (precio < 0)
            throw new PrecioIncorrecto();
        this.precio=precio;
    }

    
    @Override
    public String toString() {
        return "Vehiculo{" + "precio=" + this.precio +" Potencia= "+this.potencia+" Modelo = "+this.modelo+'}';
    }
    
    
}
