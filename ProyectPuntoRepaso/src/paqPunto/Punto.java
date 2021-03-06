/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqPunto;

/**
 *
 * @author isabel
 */
public class Punto {
    private int x,y;

    //PATRÓN
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Constructor sobrecargado, sin datos de entrada, se suele llamar por defecto
    public Punto(){
      //this.x=this.y=0;
     // this(0,0);
     this(0);
    }
    
    //Constructor sobrecargado, con un dato de entrada, un valor entero
    public Punto(int x){
        //this.x=this.y=x;
        this(x,x);        
    }
    
    //Constructor sobrecargado, con un dato de entrada, un Punto
    public Punto(Punto other){
       /* this.x=other.x;
        this.y=other.y;
       */
       this(other.x, other.y);
    }
    
    
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Punto ptoOpuesto()
    {
        /*
        int x=-this.x;
        int y=-this.y;
        */
        /*
        Punto t=new Punto(-this.x,-this.y);
        return t;
        */
        return new Punto().ptoResta(this);
    }
    
    public boolean equals(Punto other){
        /*
        boolean iguales;
        if (this.x==other.x && this.y==other.y) 
            iguales=true;
        else
            iguales=false;
        return iguales;
        */
        return this.equals(other.x, other.y);
    }
    
    //Método equals sobrecargado. Con dos datos de entrada de tipo entero
    //PATRÓN
    public boolean equals(int x, int y){
        boolean iguales;
        if (this.x==x && this.y==y)
            iguales=true;
        else
            iguales=false;
        return iguales;
    }
    
    
    
    public Punto ptoSuma(Punto other){
        /*int x= this.x + other.x;
        int y= this.y + other.y;
        */
        /*
        Punto t=new Punto(this.x+other.x, this.y+other.y);
        return t;
        */
        return this.ptoSuma(other.x, other.y);
    }
    
    //método sobrecargado de ptoSuma, datos de entrada = 2 valores enteros, x e y
    //PATRÓN
    public Punto ptoSuma(int x, int y){
        Punto t=new Punto(this.x + x, this.y + y);
        return t;
    }
    
    //PATRÓN
    public Punto ptoIntermedio(Punto other){
       return new Punto((this.x+other.x)/2, (this.y+other.y)/2);       
    }
    //método sobrecargado de ptoIntermedio, datos de entrada enteros x e y
    public Punto ptoIntermedio(int x, int y){
       //return new Punto((this.x+ x)/2, (this.y+ y)/2); 
       return this.ptoIntermedio(new Punto(x,y));
    }
 
    
    //PATRÓN
    public double distancia(Punto other){
       int cateto1=this.y - other.y;
       int cateto2=this.x - other.x;
       double d=Math.sqrt(cateto1 * cateto1 + cateto2*cateto2);
       return d;       
    }
    //método sobrecargado distancia
    public double distancia(int x, int y){
       /*int cateto1=this.y - y;
       int cateto2=this.x - x;
       double d=Math.sqrt(cateto1 * cateto1 + cateto2*cateto2);
       return d;  
       */
       return this.distancia(new Punto(x,y));
    }
    
    //PATRÓN
    public Punto ptoResta(Punto other){
       return new Punto(this.x-other.x, this.y-other.y);    
    }
    
    public Punto ptoResta(int x, int y){
        return this.ptoResta(new Punto(x,y));
    }
    
    
    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ')';
    }
    
    public Punto clone(){
        Punto nuevo=new Punto(this);
        return nuevo;
    }
        
}
