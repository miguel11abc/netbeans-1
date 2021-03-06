/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocoche;

/**
 *
 * @author Alumno
 */
public class Coche {
    private int numPuertas, precio;
    private String marca, modelo, color, combustible, cambio;

    public Coche(int numPuertas, int precio, String marca, String modelo, String color, String combustible, String cambio) throws IllegalArgumentException
    {
       if (numPuertas <3 || numPuertas>5)
       {
           IllegalArgumentException ex=new IllegalArgumentException("Número de Puertas Incorrecto");
           throw ex;
       }   
       else
        this.numPuertas = numPuertas;
        
       if (precio <0)
           throw new IllegalArgumentException("Precio negativo");
       else 
           this.precio = precio;
        
        this.marca = marca.trim().toUpperCase();
        this.modelo = modelo.trim().toUpperCase();
        this.color = color.trim().toUpperCase();
       
       combustible=combustible.trim().toUpperCase();
       if (!combustible.equals("DIESEL") && combustible.equals("GASOLINA")==false)
            throw new IllegalArgumentException("Combustible incorrecto");
       else
        this.combustible = combustible;
       
       cambio=cambio.trim().toUpperCase();
       if (!(cambio.equals("MANUAL") || cambio.equals("AUTOMATICO")))
            throw new IllegalArgumentException("Cambio incorrecto");
       else    
        this.cambio = cambio;
    }
    
    public Coche()
    {
        this(3,0,"","","BLANCO","GASOLINA","MANUAL");
    }
    
    public Coche(Coche otro)
    {
        this(otro.numPuertas,otro.precio,otro.marca,otro.modelo,otro.color, otro.combustible,otro.cambio);
    }

    @Override
    public String toString() {
        return "{" + "numPuertas=" + numPuertas + ", precio=" + precio + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", combustible=" + combustible + ", cambio=" + cambio + '}';
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public int getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getCombustible() {
        return combustible;
    }

    public String getCambio() {
        return cambio;
    }

    public void setNumPuertas(int numPuertas) throws IllegalArgumentException {
        if (numPuertas <3 || numPuertas > 5)
            throw new IllegalArgumentException("Número de Puertas Incorrecto");
        
        this.numPuertas = numPuertas;
    }

    public void setPrecio(int precio) throws IllegalArgumentException {
      if (precio < 0)
            throw new IllegalArgumentException("Precio Incorrecto");
      
        this.precio = precio;
    }

    public void setMarca(String marca) {        
        this.marca = marca.trim().toUpperCase();
    }

    public void setModelo(String modelo) {
        this.modelo = modelo.toUpperCase().trim();
    }

    public void setColor(String color) {
        this.color = color.toUpperCase().trim();
    }

    public void setCombustible(String combustible) {
        combustible=combustible.trim().toUpperCase();
        if (!combustible.equals("DIESEL") && !combustible.equals("GASOLINA"))
            throw new IllegalArgumentException("Combustible Incorrecto");
        
        this.combustible = combustible;
    }

    public void setCambio(String cambio) {
        cambio=cambio.trim().toUpperCase();
        
        if (!(cambio.equals("MANUAL")  || cambio.equals("AUTOMATICO")))
            throw new IllegalArgumentException("Cambio Incorrecto");
        
        this.cambio = cambio;
    }
    
    @Override
    public Coche clone()
    {
        return new Coche(this);
    }
    
    @Override
    public void finalize()
    {
        System.out.println("Se libera memoria de Un coche");
    }
    
    public boolean equals(int np, int precio, String marca, String modelo, String color, String combustible, String cambio)
    {
        marca=marca.trim().toUpperCase();
        modelo=modelo.trim().toUpperCase();
        color=color.trim().toUpperCase();
        combustible=combustible.trim().toUpperCase();
        cambio=cambio.trim().toUpperCase();
        
        if (np==this.numPuertas && precio==this.precio && this.marca.equals(marca) && this.modelo.equals(modelo) && this.color.equals(color)  && this.combustible.equals(combustible)  && this.cambio.equals(cambio)  )
            return true;
        else return false;             
    }        
    
    public boolean equals(Coche otro)
    {
        return this.equals(otro.numPuertas, otro.precio, otro.marca, otro.modelo, otro.color, otro.combustible, otro.cambio);
    }
    
    public void setCoche(int np, int precio, String marca, String modelo, String color, String combustible, String cambio) throws IllegalArgumentException
    {
      try{  
        this.setNumPuertas(np);
        this.setPrecio(precio);
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setColor(color);
        this.setCombustible(combustible);
        this.setCambio(cambio);
      }
      catch(IllegalArgumentException ex)
      {
          throw ex;
      }
    }
    
    
    public void setCoche(Coche otro)
    {
        this.setCoche(otro.numPuertas, otro.precio, otro.marca, otro.modelo, otro.color, otro.combustible, otro.cambio);
    }
}
