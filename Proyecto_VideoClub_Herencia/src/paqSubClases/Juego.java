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
public class Juego extends Producto{
    protected String plataforma,genero;
    protected static int contJuegos=0;

    public Juego(String plataforma, String genero, String nombre) {
        super(nombre);
        this.plataforma = plataforma;
        this.genero = genero;
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
        this.plataforma = plataforma;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Juego{" +super.toString()+ " Plataforma=" + plataforma + " Género=" + genero + '}';
    }
    
    
    
    
}
