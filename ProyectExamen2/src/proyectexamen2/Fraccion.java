/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectexamen2;

/**
 *
 * @author Profesor
 */
public class Fraccion {
    private int num,den;
    
    //Constructor Patrón
    public Fraccion(int num, int den)throws IllegalArgumentException
    {
       if (den==0)
            throw new IllegalArgumentException("Error, División by zero");
       this.num=num;
       this.den=den;
       this.reducir();
    }
    
    public Fraccion()
    {
        this(1,1);
        /*this.num=1;
        this.den=1;
        */
    }
    
    public Fraccion(Fraccion other){
        this(other.num, other.den);
    }
    
    public Fraccion(int n, Fraccion other){
        this(n*other.den+other.num,other.den);
    }
    
    public Fraccion(int n, int num, int den)
    {
        this(n, new Fraccion(num, den));
    }
    
    //Métodos de acceso

    public int getNum() {
        return num;
    }

    public int getDen() {
        return den;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setDen(int den)throws IllegalArgumentException 
    {
        if (den ==0) throw new IllegalArgumentException("Error, División by zero");
        this.den = den;
    }
    
    //Método toString

    @Override
    public String toString() {
        return "[" + this.num + "/" + this.den + ']';
    }
    
    //Métodos sumaFracciones, restaFracciones, productoFracciones, cocienteFracciones
    //Método patrón - sumaFracciones
    public Fraccion sumaFracciones(int num, int den){
        Fraccion nueva=new Fraccion();
        nueva.num=(this.num*den + this.den*num);
        nueva.den=this.den *den;
        nueva.reducir();
        return nueva;
    }
    
    public Fraccion sumaFracciones(Fraccion other)
    {
        return this.sumaFracciones(other.num, other.den);
    }
    
    //Método patrón
    public Fraccion restaFracciones(Fraccion other)
    {
       Fraccion nueva=new Fraccion();
       nueva.num=this.num*other.den - this.den*other.num;
       nueva.den=this.den*other.den;
       nueva.reducir();
       return nueva;
    }
    
    public Fraccion restaFracciones(int num, int den)
    {
        return this.restaFracciones(new Fraccion(num, den));
    }
    
    public Fraccion productoFracciones(int num, int den){
        Fraccion nueva=new Fraccion();
        nueva.num=(this.num*num);
        nueva.den=this.den *den;
        nueva.reducir();
        return nueva;
    }
    
    public Fraccion productoFracciones(Fraccion other)
    {
        return this.productoFracciones(other.num, other.den);
    }
    
    //Método patrón
    public Fraccion cocienteFracciones(Fraccion other)
    {
       Fraccion nueva=new Fraccion();
       nueva.num=this.num*other.den;
       nueva.den=this.den*other.num;
       nueva.reducir();
       return nueva;
    }
    
    public Fraccion cocienteFracciones(int num, int den)
    {
        return this.cocienteFracciones(new Fraccion(num, den));
    }
 
    
    public void reducir()
    {
        int min=(this.num<this.den)?this.num:this.den;
        int mcd=1;
        for(int i=2; i<=min; i++)
            if (this.num%i==0 && this.den%i==0)
                mcd=i;
        
        this.num/=mcd;
        this.den/=mcd;
    }
}
