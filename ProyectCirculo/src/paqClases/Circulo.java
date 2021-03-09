package paqClases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Profesor
 */
public class Circulo {
    private Punto centro;
    private int radio;

    //PATRÓN
    public Circulo(Punto centro, int radio)throws IllegalArgumentException
    {
        if (radio<0)
            throw new IllegalArgumentException("Error, radio negativo");
        this.centro = centro;
        this.radio = radio;
    }

    //Constructor por defecto
    public Circulo()
    {
      this.centro=new Punto();
      this.radio=0;
    }
    
    //Constructor centro=(0,0) y radio int
    public Circulo(int radio) throws IllegalArgumentException
    {
        this(new Punto(),radio);
        /*
        if (radio < 0)
            throw new IllegalArgumentException("Error, radio negativo");
        this.centro=new Punto();
        this.radio=radio;
        */
    }

    
    public Punto getCentro() {
        return this.centro;
    }

    public int getRadio() {
        return this.radio;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }
    
    public void setCentro(int x, int y)
    {
        this.centro=new Punto(x,y);
    }
    

    public void setRadio(int radio) throws IllegalArgumentException
    {
        if (radio<0)
            throw new IllegalArgumentException("Error, radio negativo");
        this.radio = radio;
    }
           
    @Override
    public String toString() {
        return "{" + "Centro=" + this.centro.toString() + "\t Radio=" + this.radio + '}';
    }
    
    public double area()
    {
        return Math.PI*this.radio*this.radio;
    }
    
    public double longitud()
    {
        return 2*Math.PI*this.radio;
    }
    
    public double distancia(Circulo other)
    {
        double d;
        d=this.centro.distancia(other.centro);
        return d;
    }
    
    //Patrón para distancia(int x,int y)
    public double distancia(Punto otherPunto)
    {
        return this.centro.distancia(otherPunto);
    }
    
    public double distancia(int x,int y)
    {
        return this.distancia(new Punto(x,y));
    }
    
    public boolean equals(Circulo other)
    {
        if (this.centro.equals(other.centro) && this.radio==other.radio)
            return true;
        else
            return false;
    }
    
    public boolean equals(Punto other, int radio)
    {
        /*
        if (this.centro.equals(other) && this.radio==radio)
            return true;
        else
            return false;
        */
        return this.equals(new Circulo(other,radio));
    }
    
    public boolean equals(int x, int y, int radio)
    {
        return this.equals(new Punto(x,y), radio);
    }
}
