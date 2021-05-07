/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqSubClases;

import paqEjecutable.Producto;
import paqExcepciones.AlquilarException;
import paqInterfaces.Vendible;

/**
 *
 * @author Profesor
 */
public class Juego extends Producto implements Vendible{
    protected String plataforma,genero;
    protected static int contJuegos=0;
    protected boolean vendido=false;

    public Juego(String plataforma, String genero, String nombre) {
        super(nombre);
        this.plataforma = plataforma.trim().toUpperCase();
        this.genero = genero.trim().toUpperCase();
        super.precio=3;
        Juego.contJuegos++;
    }
    
    public Juego(Juego other)
    {
        this(other.plataforma, other.genero, other.nombre);
    }

    public String getPlataforma() {
        return plataforma;
    }

    public String getGenero() {
        return genero;
    }

    public static int getContJuegos() {
        return contJuegos;
    }

    @Override
    public double getPrecio() {
        return 3;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma.trim().toUpperCase();
    }

    public void setGenero(String genero) {
        this.genero = genero.trim().toUpperCase();
    }

    @Override
    public String toString() {
        return "Juego{" +super.toString()+ " Plataforma=" + plataforma + " Género=" + genero + '}';
    }
    
    //Métodos de la interface Alquilable     
    // public boolean isAlquilado()-se hereda
    // public void devolver()-se hereda 
    
    //El método alquilar AHORA SE implementa
    @Override
    public void alquilar()throws AlquilarException{
        if (!this.alquilado && !this.retirado && !this.vendido){
           this.alquilado=true;
           System.out.println(this.id+" alquilado");
       }
       else if (this.alquilado){
            throw new AlquilarException("El juego "+this.id+" ya está alquilado");            
       }
       else if (this.vendido){
            System.out.println("El juego "+this.id+" YA está vendido, no se puede alquilar");
       }
       else System.out.println(this.id+" ya está retirado, por lo que, no se puede retirar");

    }
    
    //Métodos de la interface Retirable     
    // public boolean isRetirado()-se hereda
        
    //El método retirar se Redefine o sobreescribe
    @Override
    public void retirar(){
        if (!this.vendido){
               super.retirar();
        }
        else {
            System.out.println("El juego "+this+" No se puede retirar porque está vendido");
        }
    }
    
    //Métodos de la interface Vendible
    // public boolean isVendido()
    // public void vender()
    @Override
    public boolean isVendido(){
        return this.vendido;
    }
    @Override
    public void vender(double precio){
         if (!this.alquilado && !this.retirado && !this.vendido){
           this.vendido=true;
           this.precio=precio;           
       }
       else if (this.alquilado){
            throw new AlquilarException("El juego "+this+" ya está alquilado");            
       }
       else if (this.vendido){
            System.out.println("El juego "+this+" YA está vendido, no se puede alquilar");
       }
       else System.out.println(this+" ya está retirado, por lo que, no se puede retirar");
    }   
    
    
}
