/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqSubClases;

import paqEjecutable.Producto;
import paqEnumeraciones.GeneroPelis;
import paqExcepciones.*;
import paqInterfaces.Vendible;

/**
 *
 * @author Profesor
 */
public class Pelicula extends Producto implements Vendible{
    protected String idioma;
    protected int duracion;
    protected GeneroPelis genero;
    protected static int contPeliculas=0;
    protected final static String IDIOMAS="ESPAÑOLFRANCÉSALEMÁNINGLÉSCHINO";
    protected boolean vendido=false;

    public Pelicula(String idioma, int duracion, GeneroPelis genero, String nombre) {
      this(idioma, duracion, genero.toString(),nombre);  
    }
    
    public Pelicula(String idioma, int duracion, String genero, String nombre) throws IdiomaPeliculaException, DuracionPeliculaException, IllegalArgumentException {
        super(nombre);
        idioma=idioma.trim().toUpperCase();
        if (!Pelicula.IDIOMAS.contains(idioma))
            throw new IdiomaPeliculaException("Idioma Incorrecto");
        this.idioma = idioma;
        if (duracion <= 0)
            throw new DuracionPeliculaException("Duración Incorrecta");
        this.duracion = duracion;
        genero=genero.trim().toUpperCase();
        try {
             this.genero = GeneroPelis.valueOf(genero);
        }catch(IllegalArgumentException t)
        {
            throw new IllegalArgumentException("Error, "+genero+" NO es válido");
        }
        this.precio=2;
        Pelicula.contPeliculas++;
    }
    
    public Pelicula(Pelicula other){
        this(other.idioma, other.duracion, other.genero, other.nombre);
    }

    public String getIdioma() {
        return idioma;
    }

    public int getDuracion() {
        return duracion;
    }

    public GeneroPelis getGenero() {
        return genero;
    }

    public static int getContPeliculas() {
        return contPeliculas;
    }

    @Override
    public double getPrecio() {
        return 2;
    }

    public void setIdioma(String idioma) throws IdiomaPeliculaException {
        idioma=idioma.trim().toUpperCase();
        if (!Pelicula.IDIOMAS.contains(idioma))
            throw new IdiomaPeliculaException("Idioma incorrecto");
        this.idioma = idioma;
    }

    public void setDuracion(int duracion) throws DuracionPeliculaException{
        if (duracion<=0)
            throw new DuracionPeliculaException("Duración incorrecta");
        this.duracion = duracion;
    }

    public void setGenero(String genero) {
        try{
         this.genero = GeneroPelis.valueOf(genero);
        }catch(IllegalArgumentException e){
            throw e;
        } 
    }

    @Override
    public String toString() {
        return "Pelicula{" +super.toString()+ "Idioma=" + idioma + " Duracion=" + duracion + " Género=" + genero + '}';
    }
    
    //Métodos de la interface Alquilable     
    // public boolean isAlquilado()-se hereda
    // public void devolver()-se hereda 
    
    //El método alquilar AHORA SE implementa
    @Override
    public void alquilar() throws AlquilarException{
        if (!this.alquilado && !this.retirado && !this.vendido){
           this.alquilado=true;
           System.out.println(this.id+" alquilada");
       }
       else if (this.alquilado){
            throw new AlquilarException("La película "+this+" ya está alquilada");            
       }
       else if (this.vendido){
            System.out.println("La película "+this+" YA está vendida, no se puede alquilar");
       }
       else System.out.println(this+" ya está retirada, por lo que, no se puede retirar");

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
        System.out.println("La película "+this.id+" No se puede retirar porque está vendida");
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
           System.out.println(this.id+" vendido");
       }
       else if (this.alquilado){
            throw new AlquilarException("La película "+this.id+" ya está alquilada");            
       }
       else if (this.vendido){
            System.out.println("La película "+this.id+" YA está vendida, no se puede alquilar");
       }
       else System.out.println(this.id+" ya está retirada, por lo que, no se puede retirar");

    }   
}
