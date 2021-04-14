/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqEjecutable;

/**
 *
 * @author Profesor
 */
public class Producto {
    private int id;
    private String nombre;
    private double precio,duracion;
    private String idioma;
    private static int contProductos=0;
    private final static String idiomas[]={"ESPAÑOL", "INGLES", "FRANCES" , "CHINO", "ALEMAN"};

    public Producto(String nombre, double precio, double duracion, String idioma) throws IllegalArgumentException
    {
        this.nombre=nombre.trim().toUpperCase();
        if (precio < 0)
            throw new IllegalArgumentException("Error, precio negativo");
        if (duracion <= 0)
            throw new IllegalArgumentException("Error, duración negativa");
        idioma=idioma.trim().toUpperCase();
        boolean esta=false;
        for (int i = 0; i < Producto.idiomas.length && !esta; i++) {
            if (Producto.idiomas[i]==idioma)
                esta=true;
        }
        
        if (!esta) 
            throw new IllegalArgumentException("Error, idioma incorrecto");
        this.precio=precio;
        this.duracion=duracion;
        this.idioma = idioma;
        Producto.contProductos++;
        this.id = Producto.contProductos;       
    }

    public Producto(Producto other)
    {
      this(other.nombre, other.precio,other.duracion,other.idioma);    
    }

    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public double getDuracion() {
        return this.duracion;
    }

    public String getIdioma() {
        return this.idioma;
    }

    public static int getContProductos() {
        return Producto.contProductos;
    }
    
    public static String[] getIdiomas() {
        return Producto.idiomas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.trim().toUpperCase();
    }

    public void setPrecio(double precio) throws IllegalArgumentException {
        if (precio < 0)
            throw new IllegalArgumentException("Error, precio negativo");
        this.precio = precio;
    }

    public void setDuracion(double duracion) throws IllegalArgumentException  
    {
       if (duracion <= 0)
            throw new IllegalArgumentException("Error, duración negativa");
         
        this.duracion = duracion;
    }

    public void setIdioma(String idioma) throws IllegalArgumentException  
    {
        idioma=idioma.trim().toUpperCase();
        boolean esta=false;
        for (int i = 0; i < Producto.idiomas.length && !esta; i++) {
            if (Producto.idiomas[i]==idioma)
                esta=true;
        }
        
        if (!esta) 
            throw new IllegalArgumentException("Error, idioma incorrecto");
        this.idioma = idioma;
    }

    
    
    @Override
    public String toString() {
        return "[" + "Id=" + this.id + " Nombre=" + this.nombre + " Precio=" + this.precio + " Duración=" + this.duracion + " Idioma=" + this.idioma + ']';
    }
    
    
    
    
}
