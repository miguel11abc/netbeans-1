/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqSubClases;

import paqEjecutable.Producto;

/**
 *
 * @author Profesor
 */
public class Pelicula extends Producto{
    protected String idioma;
    protected int duracion;
    protected String genero;
    protected static int contPeliculas=0;

    public Pelicula(String idioma, int duracion, String genero, String nombre) {
        super(nombre);
        this.idioma = idioma;
        this.duracion = duracion;
        this.genero = genero;
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

    public String getGenero() {
        return genero;
    }

    public static int getContPeliculas() {
        return contPeliculas;
    }

    @Override
    public double getPrecio() {
        return 2;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Pelicula{" +super.toString()+ "Idioma=" + idioma + " Duracion=" + duracion + " Género=" + genero + '}';
    }
    
    
    
}
