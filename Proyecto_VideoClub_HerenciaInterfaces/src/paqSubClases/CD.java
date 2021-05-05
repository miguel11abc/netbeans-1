/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqSubClases;

import paqEjecutable.Producto;
import paqExcepciones.AlquilarException;
import paqExcepciones.DuracionCDException;

/**
 *
 * @author Profesor
 */
public class CD extends Producto{
    protected int duracion;
    protected String genero;
    protected static int contCD=0;

    public CD(int duracion, String genero, String nombre)throws DuracionCDException {
        super(nombre);
        if (duracion <= 0)
            throw new DuracionCDException("Duración incorrecta");
        this.duracion = duracion;
        this.genero = genero.trim().toUpperCase();
        super.precio=1;
        CD.contCD++;
    }
    
    public CD(CD other){
        this(other.duracion, other.genero, other.nombre);
    }

    public int getDuracion() {
        return duracion;
    }

    public String getGenero() {
        return genero;
    }

    public static int getContCD() {
        return contCD;
    }

    @Override
    public double getPrecio() {
        return 1;
    }

    public void setDuracion(int duracion) throws DuracionCDException{
        if (duracion <= 0)
            throw new DuracionCDException("Duración incorrecta");
        this.duracion = duracion;
    }

    public void setGenero(String genero) {
        this.genero = genero.trim().toUpperCase();
    }

    @Override
    public String toString() {
        return "CD{" +super.toString()+ " Duración=" + duracion + " Género=" + genero + '}';
    }
    
    //Métodos de la interface Alquilable     
    // public boolean isAlquilado()-se hereda
    // public void devolver()-se hereda 
    
    //El método alquilar AHORA SE implementa
    @Override
    public void alquilar(){
        if (!this.alquilado && !this.retirado){
           this.alquilado=true;
       }
       else if (this.alquilado){
            throw new AlquilarException("El CD "+this+" ya está alquilado");            
       }
       else System.out.println(this+" ya está retirado, por lo que, no se puede retirar");
    }
    //Métodos de la interface Retirable     
    // public boolean isRetirado()-se hereda        
    // public void retirar() -se hereda    
}
